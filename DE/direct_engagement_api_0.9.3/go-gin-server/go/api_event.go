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

// GetEvents - Get all events older than input timestamp
func GetEvents(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}