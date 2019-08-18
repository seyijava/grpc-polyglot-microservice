package main

import (
	"flag"
	"fmt"
	"net"
	"strconv"
	"time"

	"github.com/bigdataconcept/account-service/common"
	"github.com/bigdataconcept/account-service/domain"
	infracstructure "github.com/bigdataconcept/account-service/infracstructure"
	"github.com/bigdataconcept/account-service/service"
	pb "github.com/bigdataconcept/account-service/stub/proto"
	"github.com/grpc-ecosystem/grpc-opentracing/go/otgrpc"
	log "github.com/sirupsen/logrus"
	"github.com/tkanos/gonfig"
	wonaming "github.com/wothing/wonaming/consul"
	"google.golang.org/grpc"
)

/* Configuration that model the configuration detail from json file*/
type Configuration struct {
	ServicePort       int
	ConsulUrl         string
	ServiceHost       string
	JargerEndPointUrl string
	DBUrl             string
	ServiceUrl        string
}

var (
	serv = flag.String("service", "trader-account-service", "Trader Account Service")
)

func main() {

	configuration := Configuration{}

	err := gonfig.GetConf("config.json", &configuration)

	if err != nil {
		panic(err)
	}

	log.Println("Starting Trader Account Service at " + configuration.JargerEndPointUrl)

	tracer, closer := infracstructure.InitJaeger("account-service", configuration.JargerEndPointUrl)

	defer closer.Close()

	log.Println("Starting Trader Account Service at " + strconv.Itoa(configuration.ServicePort))

	flag.Parse()

	MigrateDBSchemaUpdate(configuration)

	lis, err := net.Listen("tcp", fmt.Sprintf(configuration.ServiceUrl, configuration.ServicePort))
	if err != nil {
		panic(err)
	}

	err = wonaming.Register(*serv, configuration.ServiceHost, configuration.ServicePort, configuration.ConsulUrl, time.Second*10, 15)
	if err != nil {
		panic(err)
	}

	s := grpc.NewServer(grpc.UnaryInterceptor(otgrpc.OpenTracingServerInterceptor(tracer)))
	pb.RegisterAccountRpcServiceServer(s, &service.AccountServiceGrpc{Tracer: tracer})
	err = s.Serve(lis)
	if err != nil {
		panic(err)
	}

}

func MigrateDBSchemaUpdate(configuration Configuration) {
	common.InitDB(configuration.DBUrl)
	db := common.DB
	domain.AutoMigrate()
	defer db.Close()

}
