/*
 * DE Provider Direct Engagement API
 *
 * description
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

type XPaginationHeader struct {

	// Current page of the response
	CurrentPage int32 `json:"currentPage,omitempty"`

	// Number of rows per page
	PageSize int32 `json:"pageSize,omitempty"`

	// Total number of rows in the response
	TotalCount int32 `json:"totalCount,omitempty"`

	// Total number of pages of the response
	TotalPages int32 `json:"totalPages,omitempty"`

	// Input parameter values for getting the previous page of the response
	PreviousPageInputParameters string `json:"previousPageInputParameters,omitempty"`

	// Input parameter values for calling the next page of the response
	NextPageInputParameters string `json:"nextPageInputParameters,omitempty"`
}