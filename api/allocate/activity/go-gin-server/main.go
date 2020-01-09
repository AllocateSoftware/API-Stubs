/*
 * Activity API
 *
 *      ## API for querying worker activity.      This is an early availabilty API, and is subject to change. 
 *
 * API version: 0.0.1
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package main

import (
	"log"

	// WARNING!
	// Change this to a fully-qualified import path
	// once you place this file into your project.
	// For example,
	//
	//    sw "github.com/myname/myrepo/go"
	//
	sw "./go"
)

func main() {
	log.Printf("Server started")

	router := sw.NewRouter()

	log.Fatal(router.Run(":8080"))
}
