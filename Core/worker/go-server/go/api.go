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
	"net/http"
)


// AnnualLeaveClaimsApiRouter defines the required methods for binding the api requests to a responses for the AnnualLeaveClaimsApi
// The AnnualLeaveClaimsApiRouter implementation should parse necessary information from the http request, 
// pass the data to a AnnualLeaveClaimsApiServicer to perform the required actions, then write the service results to the http response.
type AnnualLeaveClaimsApiRouter interface { 
	SubmitAnnualLeaveClaim(http.ResponseWriter, *http.Request)
}
// WorkerDataApiRouter defines the required methods for binding the api requests to a responses for the WorkerDataApi
// The WorkerDataApiRouter implementation should parse necessary information from the http request, 
// pass the data to a WorkerDataApiServicer to perform the required actions, then write the service results to the http response.
type WorkerDataApiRouter interface { 
	RegisterWorker(http.ResponseWriter, *http.Request)
}
// WorkersApiRouter defines the required methods for binding the api requests to a responses for the WorkersApi
// The WorkersApiRouter implementation should parse necessary information from the http request, 
// pass the data to a WorkersApiServicer to perform the required actions, then write the service results to the http response.
type WorkersApiRouter interface { 
	RegisterWorker(http.ResponseWriter, *http.Request)
	SubmitAnnualLeaveClaim(http.ResponseWriter, *http.Request)
}


// AnnualLeaveClaimsApiServicer defines the api actions for the AnnualLeaveClaimsApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type AnnualLeaveClaimsApiServicer interface { 
	SubmitAnnualLeaveClaim(string, LeaveClaim) (interface{}, error)
}


// WorkerDataApiServicer defines the api actions for the WorkerDataApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type WorkerDataApiServicer interface { 
	RegisterWorker(Person) (interface{}, error)
}


// WorkersApiServicer defines the api actions for the WorkersApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type WorkersApiServicer interface { 
	RegisterWorker(Person) (interface{}, error)
	SubmitAnnualLeaveClaim(string, LeaveClaim) (interface{}, error)
}
