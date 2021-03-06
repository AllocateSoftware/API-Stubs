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

type VocabularyEntry struct {

	// Code for the element. Should be unique within the vocabulary
	Code string `json:"code"`

	// Title for the element
	Title string `json:"title,omitempty"`
}
