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
	"errors"
)

// AgencyApiService is a service that implents the logic for the AgencyApiServicer
// This service should implement the business logic for every endpoint for the AgencyApi API. 
// Include any external packages or services that will be required by this service.
type AgencyApiService struct {
}

// NewAgencyApiService creates a default api service
func NewAgencyApiService() AgencyApiServicer {
	return &AgencyApiService{}
}

// OfferWorker - 
func (s *AgencyApiService) OfferWorker(bookingRequestId string, personIdentifier PersonIdentifier) (interface{}, error) {
	// TODO - update OfferWorker with the required logic for this service method.
	// Add api_agency_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'OfferWorker' not implemented")
}
