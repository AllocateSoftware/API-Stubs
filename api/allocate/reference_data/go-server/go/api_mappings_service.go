/*
 * Reference data and Mappings API
 *
 *      ## API for accessing reference data and mapping information 
 *
 * API version: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

import (
	"errors"
)

// MappingsApiService is a service that implents the logic for the MappingsApiServicer
// This service should implement the business logic for every endpoint for the MappingsApi API. 
// Include any external packages or services that will be required by this service.
type MappingsApiService struct {
}

// NewMappingsApiService creates a default api service
func NewMappingsApiService() MappingsApiServicer {
	return &MappingsApiService{}
}

// CreateMapping - 
func (s *MappingsApiService) CreateMapping(setId string, mapping Mapping) (interface{}, error) {
	// TODO - update CreateMapping with the required logic for this service method.
	// Add api_mappings_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'CreateMapping' not implemented")
}

// DeleteMapping - 
func (s *MappingsApiService) DeleteMapping(id string, mappingId string) (interface{}, error) {
	// TODO - update DeleteMapping with the required logic for this service method.
	// Add api_mappings_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'DeleteMapping' not implemented")
}

// GetMapping - 
func (s *MappingsApiService) GetMapping(id string, mappingId string) (interface{}, error) {
	// TODO - update GetMapping with the required logic for this service method.
	// Add api_mappings_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'GetMapping' not implemented")
}

// GetMappingSetById - 
func (s *MappingsApiService) GetMappingSetById(setId string) (interface{}, error) {
	// TODO - update GetMappingSetById with the required logic for this service method.
	// Add api_mappings_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'GetMappingSetById' not implemented")
}

// GetMappingSets - 
func (s *MappingsApiService) GetMappingSets() (interface{}, error) {
	// TODO - update GetMappingSets with the required logic for this service method.
	// Add api_mappings_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'GetMappingSets' not implemented")
}

// GetMappings - 
func (s *MappingsApiService) GetMappings(setId string, fromCode string) (interface{}, error) {
	// TODO - update GetMappings with the required logic for this service method.
	// Add api_mappings_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'GetMappings' not implemented")
}

// PutMapping - 
func (s *MappingsApiService) PutMapping(id string, mappingId string, mapping Mapping) (interface{}, error) {
	// TODO - update PutMapping with the required logic for this service method.
	// Add api_mappings_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'PutMapping' not implemented")
}
