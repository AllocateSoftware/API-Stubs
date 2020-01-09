/*
 * Activity API
 *
 *      ## API for querying worker activity.      This is an early availabilty API, and is subject to change. 
 *
 * API version: 0.0.1
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// A DefaultApiController binds http requests to an api service and writes the service results to the http response
type DefaultApiController struct {
	service DefaultApiServicer
}

// NewDefaultApiController creates a default api controller
func NewDefaultApiController(s DefaultApiServicer) Router {
	return &DefaultApiController{ service: s }
}

// Routes returns all of the api route for the DefaultApiController
func (c *DefaultApiController) Routes() Routes {
	return Routes{ 
		{
			"GetActivities",
			strings.ToUpper("Get"),
			"/api/v1/activities",
			c.GetActivities,
		},
	}
}

// GetActivities - 
func (c *DefaultApiController) GetActivities(w http.ResponseWriter, r *http.Request) { 
	query := r.URL.Query()
	customerCode := query.Get("customerCode")
	format := query.Get("format")
	result, err := c.service.GetActivities(customerCode, format)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}