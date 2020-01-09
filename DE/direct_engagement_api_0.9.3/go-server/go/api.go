/*
 * DE Provider Direct Engagement API
 *
 * description
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

import (
	"net/http"
	"time"
)


// DutyApiRouter defines the required methods for binding the api requests to a responses for the DutyApi
// The DutyApiRouter implementation should parse necessary information from the http request, 
// pass the data to a DutyApiServicer to perform the required actions, then write the service results to the http response.
type DutyApiRouter interface { 
	CancelDuty(http.ResponseWriter, *http.Request)
	FillDuty(http.ResponseWriter, *http.Request)
	GetDutyDetails(http.ResponseWriter, *http.Request)
	GetSingleDutyDetails(http.ResponseWriter, *http.Request)
	UpdateContractStatus(http.ResponseWriter, *http.Request)
	UpdateTimesheets(http.ResponseWriter, *http.Request)
}
// EventApiRouter defines the required methods for binding the api requests to a responses for the EventApi
// The EventApiRouter implementation should parse necessary information from the http request, 
// pass the data to a EventApiServicer to perform the required actions, then write the service results to the http response.
type EventApiRouter interface { 
	GetEvents(http.ResponseWriter, *http.Request)
}
// ReferenceDataApiRouter defines the required methods for binding the api requests to a responses for the ReferenceDataApi
// The ReferenceDataApiRouter implementation should parse necessary information from the http request, 
// pass the data to a ReferenceDataApiServicer to perform the required actions, then write the service results to the http response.
type ReferenceDataApiRouter interface { 
	GetAgenciesByIds(http.ResponseWriter, *http.Request)
	GetAllAgencies(http.ResponseWriter, *http.Request)
	GetAllContractStatuses(http.ResponseWriter, *http.Request)
	GetAllGrades(http.ResponseWriter, *http.Request)
	GetAllReasonsForVacancy(http.ResponseWriter, *http.Request)
	GetAllStaffGroups(http.ResponseWriter, *http.Request)
	GetAllUnits(http.ResponseWriter, *http.Request)
	GetContractStatusesByIds(http.ResponseWriter, *http.Request)
	GetGradesByIds(http.ResponseWriter, *http.Request)
	GetReasonsForVacancyByIds(http.ResponseWriter, *http.Request)
	GetStaffGroupsByIds(http.ResponseWriter, *http.Request)
	GetUnitsByIds(http.ResponseWriter, *http.Request)
}


// DutyApiServicer defines the api actions for the DutyApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type DutyApiServicer interface { 
	CancelDuty(string, string, int32) (interface{}, error)
	FillDuty(string, string, int32, BookingInfo) (interface{}, error)
	GetDutyDetails(string, string, []int32, int32, int32) (interface{}, error)
	GetSingleDutyDetails(string, string, int32, int32, int32) (interface{}, error)
	UpdateContractStatus(string, string, int32, string, ContractStatus) (interface{}, error)
	UpdateTimesheets(string, string, int32, InlineObject) (interface{}, error)
}


// EventApiServicer defines the api actions for the EventApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type EventApiServicer interface { 
	GetEvents(string, string, time.Time, int32, int32) (interface{}, error)
}


// ReferenceDataApiServicer defines the api actions for the ReferenceDataApi service
// This interface intended to stay up to date with the openapi yaml used to generate it, 
// while the service implementation can ignored with the .openapi-generator-ignore file 
// and updated with the logic required for the API.
type ReferenceDataApiServicer interface { 
	GetAgenciesByIds(string, string, []int32, int32, int32) (interface{}, error)
	GetAllAgencies(string, string, int32, int32) (interface{}, error)
	GetAllContractStatuses(string, string, int32, int32) (interface{}, error)
	GetAllGrades(string, string, int32, int32) (interface{}, error)
	GetAllReasonsForVacancy(string, string, int32, int32) (interface{}, error)
	GetAllStaffGroups(string, string, int32, int32) (interface{}, error)
	GetAllUnits(string, string, int32, int32) (interface{}, error)
	GetContractStatusesByIds(string, string, []string, int32, int32) (interface{}, error)
	GetGradesByIds(string, string, []int32, int32, int32) (interface{}, error)
	GetReasonsForVacancyByIds(string, string, []int32, int32, int32) (interface{}, error)
	GetStaffGroupsByIds(string, string, []int32, int32, int32) (interface{}, error)
	GetUnitsByIds(string, string, []int32, int32, int32) (interface{}, error)
}
