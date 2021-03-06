/*
 * Duty Booking API and Events
 *
 * ## Duty Booking API and events and Events 
 *
 * API version: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package main

import (
	"log"
	"net/http"

	allocateApi "github.com/GIT_USER_ID/GIT_REPO_ID/go"
)

func main() {
	log.Printf("Server started")

	DutyBookingApiService := allocateApi.NewDutyBookingApiService()
	DutyBookingApiController := allocateApi.NewDutyBookingApiController(DutyBookingApiService)

	router := allocateApi.NewRouter(DutyBookingApiController)

	log.Fatal(http.ListenAndServe(":8080", router))
}
