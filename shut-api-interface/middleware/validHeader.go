package middleware

import (
	"fmt"
	"github.com/gin-gonic/gin"
	"net/http"
	"shut-api-interface/utils"
)

func ValidHeader(c *gin.Context) {
	header := c.GetHeader("shut")
	fmt.Println("header: ", header)
	if header != "accept" {
		c.JSON(http.StatusForbidden, utils.ResponseError(utils.NoAuth, "非法的访问"))
		c.Abort()
	}
	c.Next()
}
