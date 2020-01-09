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
	"net/http"

	"github.com/gin-gonic/gin"
)

// OnboardWorkerToTrust - 
func OnboardWorkerToTrust(c *gin.Context) {
	c.JSON(http.StatusOK, gin.H{})
}
