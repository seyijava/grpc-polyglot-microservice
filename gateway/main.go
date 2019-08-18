package main

import (
	"fmt"

	gateway "github.com/bigdataconcept/gateway/proxy"
)

func main() {

	startServer()
	fmt.Println("Server started:")
}

func startServer() {
	serviceUrl := gateway.ServiceUrl{
		AccountUrl:   "127.0.0.1:5050",
		QuoteUrl:     "127.0.0.1:5050",
		PortfolioUrl: "127.0.0.1:5050",
	}

	gateway.StartAPIGateway(9090, "127.0.0.1", "127.0.0.1:9080", &serviceUrl)

}
