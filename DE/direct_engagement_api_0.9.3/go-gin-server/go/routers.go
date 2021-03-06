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

	"github.com/gin-gonic/gin"
)

// Route is the information for every URI.
type Route struct {
	// Name is the name of this Route.
	Name        string
	// Method is the string for the HTTP method. ex) GET, POST etc..
	Method      string
	// Pattern is the pattern of the URI.
	Pattern     string
	// HandlerFunc is the handler function of this route.
	HandlerFunc gin.HandlerFunc
}

// Routes is the list of the generated Route.
type Routes []Route

// NewRouter returns a new router.
func NewRouter() *gin.Engine {
	router := gin.Default()
	for _, route := range routes {
		switch route.Method {
		case http.MethodGet:
			router.GET(route.Pattern, route.HandlerFunc)
		case http.MethodPost:
			router.POST(route.Pattern, route.HandlerFunc)
		case http.MethodPut:
			router.PUT(route.Pattern, route.HandlerFunc)
		case http.MethodDelete:
			router.DELETE(route.Pattern, route.HandlerFunc)
		}
	}

	return router
}

// Index is the index handler.
func Index(c *gin.Context) {
	c.String(http.StatusOK, "Hello World!")
}

var routes = Routes{
	{
		"Index",
		http.MethodGet,
		"/",
		Index,
	},

	{
		"CancelDuty",
		http.MethodPost,
		"/:version/trustcode/:trustCode/duty/:dutyId/cancel",
		CancelDuty,
	},

	{
		"FillDuty",
		http.MethodPost,
		"/:version/trustcode/:trustCode/duty/:dutyId/booking",
		FillDuty,
	},

	{
		"GetDutyDetails",
		http.MethodGet,
		"/:version/trustcode/:trustCode/duty/",
		GetDutyDetails,
	},

	{
		"GetSingleDutyDetails",
		http.MethodGet,
		"/:version/trustcode/:trustCode/duty/:dutyId",
		GetSingleDutyDetails,
	},

	{
		"UpdateContractStatus",
		http.MethodPut,
		"/:version/trustcode/:trustCode/duty/:dutyId/contract/:contractId/status/:statusId",
		UpdateContractStatus,
	},

	{
		"UpdateTimesheets",
		http.MethodPut,
		"/:version/trustcode/:trustCode/duty/:dutyId/timesheet",
		UpdateTimesheets,
	},

	{
		"GetEvents",
		http.MethodGet,
		"/:version/trustcode/:trustCode/event",
		GetEvents,
	},

	{
		"GetAgenciesByIds",
		http.MethodGet,
		"/:version/trustcode/:trustCode/referenceData/agency/",
		GetAgenciesByIds,
	},

	{
		"GetAllAgencies",
		http.MethodGet,
		"/:version/trustcode/:trustCode/referenceData/agency",
		GetAllAgencies,
	},

	{
		"GetAllContractStatuses",
		http.MethodGet,
		"/:version/trustcode/:trustCode/referenceData/contractStatus",
		GetAllContractStatuses,
	},

	{
		"GetAllGrades",
		http.MethodGet,
		"/:version/trustcode/:trustCode/referenceData/grade",
		GetAllGrades,
	},

	{
		"GetAllReasonsForVacancy",
		http.MethodGet,
		"/:version/trustcode/:trustCode/referenceData/reasonForVacancy",
		GetAllReasonsForVacancy,
	},

	{
		"GetAllStaffGroups",
		http.MethodGet,
		"/:version/trustcode/:trustCode/referenceData/staffGroup",
		GetAllStaffGroups,
	},

	{
		"GetAllUnits",
		http.MethodGet,
		"/:version/trustcode/:trustCode/referenceData/unit",
		GetAllUnits,
	},

	{
		"GetContractStatusesByIds",
		http.MethodGet,
		"/:version/trustcode/:trustCode/referenceData/contractStatus/",
		GetContractStatusesByIds,
	},

	{
		"GetGradesByIds",
		http.MethodGet,
		"/:version/trustcode/:trustCode/referenceData/grade/",
		GetGradesByIds,
	},

	{
		"GetReasonsForVacancyByIds",
		http.MethodGet,
		"/:version/trustcode/:trustCode/referenceData/reasonForVacancy/",
		GetReasonsForVacancyByIds,
	},

	{
		"GetStaffGroupsByIds",
		http.MethodGet,
		"/:version/trustcode/:trustCode/referenceData/staffGroup/",
		GetStaffGroupsByIds,
	},

	{
		"GetUnitsByIds",
		http.MethodGet,
		"/:version/trustcode/:trustCode/referenceData/unit/",
		GetUnitsByIds,
	},
}
