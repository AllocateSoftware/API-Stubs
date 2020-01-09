/*
 * VMS API
 *
 * ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 
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

// A AgenciesApiController binds http requests to an api service and writes the service results to the http response
type AgenciesApiController struct {
	service AgenciesApiServicer
}

// NewAgenciesApiController creates a default api controller
func NewAgenciesApiController(s AgenciesApiServicer) Router {
	return &AgenciesApiController{ service: s }
}

// Routes returns all of the api route for the AgenciesApiController
func (c *AgenciesApiController) Routes() Routes {
	return Routes{ 
		{
			"GetCostings",
			strings.ToUpper("Post"),
			"/vms/api/v1/agencies/costings",
			c.GetCostings,
		},
		{
			"SendDutyToAgencies",
			strings.ToUpper("Post"),
			"/vms/api/v1/agencies",
			c.SendDutyToAgencies,
		},
		{
			"SendDutyToAgency",
			strings.ToUpper("Post"),
			"/vms/api/v1/agencies/{agencyId}",
			c.SendDutyToAgency,
		},
	}
}

// GetCostings - 
func (c *AgenciesApiController) GetCostings(w http.ResponseWriter, r *http.Request) { 
	duty := &Duty{}
	if err := json.NewDecoder(r.Body).Decode(&duty); err != nil {
		w.WriteHeader(500)
		return
	}
	
	result, err := c.service.GetCostings(*duty)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// SendDutyToAgencies - 
func (c *AgenciesApiController) SendDutyToAgencies(w http.ResponseWriter, r *http.Request) { 
	dutyRequest := &DutyRequest{}
	if err := json.NewDecoder(r.Body).Decode(&dutyRequest); err != nil {
		w.WriteHeader(500)
		return
	}
	
	result, err := c.service.SendDutyToAgencies(*dutyRequest)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// SendDutyToAgency - 
func (c *AgenciesApiController) SendDutyToAgency(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	agencyId := params["agencyId"]
	dutyRequest := &DutyRequest{}
	if err := json.NewDecoder(r.Body).Decode(&dutyRequest); err != nil {
		w.WriteHeader(500)
		return
	}
	
	result, err := c.service.SendDutyToAgency(agencyId, *dutyRequest)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}
