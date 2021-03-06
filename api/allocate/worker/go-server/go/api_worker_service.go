/*
 * Worker API and Events
 *
 *      ## API and events for providing workers. 
 *
 * API version: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

import (
	"errors"
)

// WorkerApiService is a service that implents the logic for the WorkerApiServicer
// This service should implement the business logic for every endpoint for the WorkerApi API. 
// Include any external packages or services that will be required by this service.
type WorkerApiService struct {
}

// NewWorkerApiService creates a default api service
func NewWorkerApiService() WorkerApiServicer {
	return &WorkerApiService{}
}

// OnboardWorkerToTrust - 
func (s *WorkerApiService) OnboardWorkerToTrust(id string, inlineObject InlineObject) (interface{}, error) {
	// TODO - update OnboardWorkerToTrust with the required logic for this service method.
	// Add api_worker_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'OnboardWorkerToTrust' not implemented")
}
