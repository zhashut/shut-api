package routes

import "shut-api-interface/api"

func addSentenceRouter() {
	apiGroup.GET("/sentence", api.RootApi.GetSentence)
}
