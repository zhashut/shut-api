package routes

import (
	"shut-api-interface/api"
	"shut-api-interface/middleware"
)

func addNameRouter() {
	nameRouter := apiGroup.Group("user")
	{
		nameRouter.GET("name", middleware.ValidHeader, api.RootApi.GetUserName)
		nameRouter.GET("get", api.RootApi.GetName)
		nameRouter.POST("post", api.RootApi.PostName)
	}
}
