package api

import (
	"shut-api/api/interfaceApi"
	"shut-api/api/userApi"
)

type Api struct {
	UserApi      userApi.UserApi
	InterfaceApi interfaceApi.InterfaceApi
}

var RootApi = new(Api)
