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

// A Class3rdPartyRosteringApiController binds http requests to an api service and writes the service results to the http response
type Class3rdPartyRosteringApiController struct {
	service Class3rdPartyRosteringApiServicer
}

// NewClass3rdPartyRosteringApiController creates a default api controller
func NewClass3rdPartyRosteringApiController(s Class3rdPartyRosteringApiServicer) Router {
	return &Class3rdPartyRosteringApiController{ service: s }
}

// Routes returns all of the api route for the Class3rdPartyRosteringApiController
func (c *Class3rdPartyRosteringApiController) Routes() Routes {
	return Routes{ 
		{
			"CancelDuty",
			strings.ToUpper("Delete"),
			"/api/duty/v1/duties/{id}",
			c.CancelDuty,
		},
		{
			"CancelDutyBooking",
			strings.ToUpper("Delete"),
			"/api/duty/v1/duties/{id}/booking",
			c.CancelDutyBooking,
		},
		{
			"CreateDuty",
			strings.ToUpper("Post"),
			"/api/duty/v1/duties",
			c.CreateDuty,
		},
		{
			"SendDutyForFulfillment",
			strings.ToUpper("Post"),
			"/api/duty/v1/duties/{id}/sendTo/{destination}",
			c.SendDutyForFulfillment,
		},
	}
}

// CancelDuty - 
func (c *Class3rdPartyRosteringApiController) CancelDuty(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	id := params["id"]
	result, err := c.service.CancelDuty(id)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// CancelDutyBooking - 
func (c *Class3rdPartyRosteringApiController) CancelDutyBooking(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	id := params["id"]
	result, err := c.service.CancelDutyBooking(id)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// CreateDuty - 
func (c *Class3rdPartyRosteringApiController) CreateDuty(w http.ResponseWriter, r *http.Request) { 
	dutyDetails := &DutyDetails{}
	if err := json.NewDecoder(r.Body).Decode(&dutyDetails); err != nil {
		w.WriteHeader(500)
		return
	}
	
	result, err := c.service.CreateDuty(*dutyDetails)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// SendDutyForFulfillment - 
func (c *Class3rdPartyRosteringApiController) SendDutyForFulfillment(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	id := params["id"]
	destination := params["destination"]
	result, err := c.service.SendDutyForFulfillment(id, destination)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}
