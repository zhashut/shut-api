package main

import (
	"shut-api/routes"
	"shut-api/server"
)

func main() {
	// 启动rpc服务器
	server.StartRPC()
	// 启动gin服务器
	routes.StartGin()
}
