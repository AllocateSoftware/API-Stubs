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
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// A ReferenceDataApiController binds http requests to an api service and writes the service results to the http response
type ReferenceDataApiController struct {
	service ReferenceDataApiServicer
}

// NewReferenceDataApiController creates a default api controller
func NewReferenceDataApiController(s ReferenceDataApiServicer) Router {
	return &ReferenceDataApiController{ service: s }
}

// Routes returns all of the api route for the ReferenceDataApiController
func (c *ReferenceDataApiController) Routes() Routes {
	return Routes{ 
		{
			"CreateVocabularyEntry",
			strings.ToUpper("Post"),
			"/api/v1/vocabularies/{id}/entries",
			c.CreateVocabularyEntry,
		},
		{
			"DeleteVocabularyEntry",
			strings.ToUpper("Delete"),
			"/api/v1/vocabularies/{id}/entries/{elementId}",
			c.DeleteVocabularyEntry,
		},
		{
			"GetVocabularies",
			strings.ToUpper("Get"),
			"/api/v1/vocabularies",
			c.GetVocabularies,
		},
		{
			"GetVocabulary",
			strings.ToUpper("Get"),
			"/api/v1/vocabularies/{id}",
			c.GetVocabulary,
		},
		{
			"GetVocabularyElement",
			strings.ToUpper("Get"),
			"/api/v1/vocabularies/{id}/entries/{elementId}",
			c.GetVocabularyElement,
		},
		{
			"GetVocabularyEntries",
			strings.ToUpper("Get"),
			"/api/v1/vocabularies/{id}/entries",
			c.GetVocabularyEntries,
		},
		{
			"GetVocabularyTypeById",
			strings.ToUpper("Get"),
			"/api/v1/vocabularyTypes/{id}",
			c.GetVocabularyTypeById,
		},
		{
			"GetVocabularyTypes",
			strings.ToUpper("Get"),
			"/api/v1/vocabularyTypes",
			c.GetVocabularyTypes,
		},
		{
			"PutVocabularyEntry",
			strings.ToUpper("Put"),
			"/api/v1/vocabularies/{id}/entries/{elementId}",
			c.PutVocabularyEntry,
		},
	}
}

// CreateVocabularyEntry - 
func (c *ReferenceDataApiController) CreateVocabularyEntry(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	id := params["id"]
	vocabularyEntry := &VocabularyEntry{}
	if err := json.NewDecoder(r.Body).Decode(&vocabularyEntry); err != nil {
		w.WriteHeader(500)
		return
	}
	
	result, err := c.service.CreateVocabularyEntry(id, *vocabularyEntry)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// DeleteVocabularyEntry - 
func (c *ReferenceDataApiController) DeleteVocabularyEntry(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	id := params["id"]
	elementId := params["elementId"]
	result, err := c.service.DeleteVocabularyEntry(id, elementId)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetVocabularies - 
func (c *ReferenceDataApiController) GetVocabularies(w http.ResponseWriter, r *http.Request) { 
	query := r.URL.Query()
	vocabularyTypeId := query.Get("vocabularyTypeId")
	page := query.Get("page")
	pageSize := query.Get("pageSize")
	result, err := c.service.GetVocabularies(vocabularyTypeId, page, pageSize)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetVocabulary - 
func (c *ReferenceDataApiController) GetVocabulary(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	id := params["id"]
	result, err := c.service.GetVocabulary(id)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetVocabularyElement - 
func (c *ReferenceDataApiController) GetVocabularyElement(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	id := params["id"]
	elementId := params["elementId"]
	result, err := c.service.GetVocabularyElement(id, elementId)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetVocabularyEntries - 
func (c *ReferenceDataApiController) GetVocabularyEntries(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	id := params["id"]
	result, err := c.service.GetVocabularyEntries(id)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetVocabularyTypeById - 
func (c *ReferenceDataApiController) GetVocabularyTypeById(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	id := params["id"]
	result, err := c.service.GetVocabularyTypeById(id)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetVocabularyTypes - 
func (c *ReferenceDataApiController) GetVocabularyTypes(w http.ResponseWriter, r *http.Request) { 
	result, err := c.service.GetVocabularyTypes()
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// PutVocabularyEntry - 
func (c *ReferenceDataApiController) PutVocabularyEntry(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	id := params["id"]
	elementId := params["elementId"]
	vocabularyEntry := &VocabularyEntry{}
	if err := json.NewDecoder(r.Body).Decode(&vocabularyEntry); err != nil {
		w.WriteHeader(500)
		return
	}
	
	result, err := c.service.PutVocabularyEntry(id, elementId, *vocabularyEntry)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}
