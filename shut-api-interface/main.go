package main

import (
	"shut-api-interface/config"
	"shut-api-interface/routes"
)

func main() {
	err := routes.Router.Run(config.Conf.Gin.GetAddr())
	if err != nil {
		return
	}
}
