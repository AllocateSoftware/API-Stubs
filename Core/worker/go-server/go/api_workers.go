/*
 * Workers
 *
 * ## Workers and events 
 *
 * API version: 1.0.0
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

// A WorkersApiController binds http requests to an api service and writes the service results to the http response
type WorkersApiController struct {
	service WorkersApiServicer
}

// NewWorkersApiController creates a default api controller
func NewWorkersApiController(s WorkersApiServicer) Router {
	return &WorkersApiController{ service: s }
}

// Routes returns all of the api route for the WorkersApiController
func (c *WorkersApiController) Routes() Routes {
	return Routes{ 
		{
			"RegisterWorker",
			strings.ToUpper("Post"),
			"/api/worker/v1/workers",
			c.RegisterWorker,
		},
		{
			"SubmitAnnualLeaveClaim",
			strings.ToUpper("Post"),
			"/api/worker/v1/worker/{id}/leave",
			c.SubmitAnnualLeaveClaim,
		},
	}
}

// RegisterWorker - 
func (c *WorkersApiController) RegisterWorker(w http.ResponseWriter, r *http.Request) { 
	person := &Person{}
	if err := json.NewDecoder(r.Body).Decode(&person); err != nil {
		w.WriteHeader(500)
		return
	}
	
	result, err := c.service.RegisterWorker(*person)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// SubmitAnnualLeaveClaim - 
func (c *WorkersApiController) SubmitAnnualLeaveClaim(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	id := params["id"]
	leaveClaim := &LeaveClaim{}
	if err := json.NewDecoder(r.Body).Decode(&leaveClaim); err != nil {
		w.WriteHeader(500)
		return
	}
	
	result, err := c.service.SubmitAnnualLeaveClaim(id, *leaveClaim)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}