/*
 * VMS Provisioning API
 *
 * ## Description  API to be impemented by 247Time (and, potentially, partners) to enable provisioning of accounts and the org structure 
 *
 * API version: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

import (
	"errors"
)

// ProvisioningApiService is a service that implents the logic for the ProvisioningApiServicer
// This service should implement the business logic for every endpoint for the ProvisioningApi API. 
// Include any external packages or services that will be required by this service.
type ProvisioningApiService struct {
}

// NewProvisioningApiService creates a default api service
func NewProvisioningApiService() ProvisioningApiServicer {
	return &ProvisioningApiService{}
}

// ProvisionStructure - 
func (s *ProvisioningApiService) ProvisionStructure(id string, structureProvision StructureProvision) (interface{}, error) {
	// TODO - update ProvisionStructure with the required logic for this service method.
	// Add api_provisioning_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'ProvisionStructure' not implemented")
}

// ProvisionUser - 
func (s *ProvisioningApiService) ProvisionUser(id string, userProvision UserProvision) (interface{}, error) {
	// TODO - update ProvisionUser with the required logic for this service method.
	// Add api_provisioning_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'ProvisionUser' not implemented")
}
