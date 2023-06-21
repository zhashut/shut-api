package interfaceApi

import (
	"github.com/gin-gonic/gin"
	"shut-api/model"
	"shut-api/utils"
	"net/http"
)

func (InterfaceApi) GetInterface(c *gin.Context) {
	var interfaceList []model.InterfaceInfo
	db.Find(&interfaceList)
	c.JSON(http.StatusOK, utils.ResponseOK(interfaceList))
}

func (InterfaceApi) GetInterfaceList(c *gin.Context) {
	getInterfaceList(c, true)
}

func (InterfaceApi) GetInterfaceListByUser(c *gin.Context) {
	getInterfaceList(c, false)
}
