/*
 * Duties and Events
 *
 * ## Duties and Events 
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

// A BookingsApiController binds http requests to an api service and writes the service results to the http response
type BookingsApiController struct {
	service BookingsApiServicer
}

// NewBookingsApiController creates a default api controller
func NewBookingsApiController(s BookingsApiServicer) Router {
	return &BookingsApiController{ service: s }
}

// Routes returns all of the api route for the BookingsApiController
func (c *BookingsApiController) Routes() Routes {
	return Routes{ 
		{
			"SendDutyCosting",
			strings.ToUpper("Post"),
			"/api/duty/v1/duties/{id}/costing",
			c.SendDutyCosting,
		},
	}
}

// SendDutyCosting - 
func (c *BookingsApiController) SendDutyCosting(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	id := params["id"]
	dutyCostDetails := &DutyCostDetails{}
	if err := json.NewDecoder(r.Body).Decode(&dutyCostDetails); err != nil {
		w.WriteHeader(500)
		return
	}
	
	result, err := c.service.SendDutyCosting(id, *dutyCostDetails)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}
