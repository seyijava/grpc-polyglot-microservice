package common

import (
	"github.com/jinzhu/gorm"
	_ "github.com/jinzhu/gorm/dialects/postgres"
	log "github.com/sirupsen/logrus"
)

var DB *gorm.DB

// Opening a database and save the reference to `Database` struct.
func InitDB(dbConfiguration string) {
	db, err := gorm.Open("postgres", dbConfiguration) //"host=192.168.2.24 port=5432 user=admindb dbname=accountstoredb password=password")
	if err != nil {
		panic(err)
	}
	db.DB().SetMaxIdleConns(10)
	db.LogMode(true)
	DB = db
	log.Println("Database connection successful.")

}
