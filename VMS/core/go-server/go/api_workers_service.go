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

// WorkersApiService is a service that implents the logic for the WorkersApiServicer
// This service should implement the business logic for every endpoint for the WorkersApi API. 
// Include any external packages or services that will be required by this service.
type WorkersApiService struct {
}

// NewWorkersApiService creates a default api service
func NewWorkersApiService() WorkersApiServicer {
	return &WorkersApiService{}
}

// GetWorker - 
func (s *WorkersApiService) GetWorker(id string) (interface{}, error) {
	// TODO - update GetWorker with the required logic for this service method.
	// Add api_workers_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'GetWorker' not implemented")
}
