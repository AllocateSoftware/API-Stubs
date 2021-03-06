/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.2).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.allocate.vms.api;

import com.allocate.vms.api.model.PersonIdentifier;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

@Validated
@Api(value = "bookingRequests", description = "the bookingRequests API")
public interface BookingRequestsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "acceptAgencyOffer", notes = "Accept an agency offer for a worker.", response = String.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "bookings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Booking request confirmed by VMS.", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "No such booking request exists") })
    @RequestMapping(value = "/bookingRequests/{bookingRequestId}/offers/{offerId}/accept",
        produces = { "text/plain" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<String> acceptAgencyOffer(@ApiParam(value = "ID of the booking request to accept.",required=true) @PathVariable("bookingRequestId") String bookingRequestId,@ApiParam(value = "ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself.",required=true) @PathVariable("offerId") String offerId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "cancelBookingRequest", notes = "Cancel a previously requested booking. If the booking request has resulted in actual bookings, these will also be cancelled.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "bookings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deleted booking request"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "No such booking request exists") })
    @RequestMapping(value = "/bookingRequests/{bookingRequestId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> cancelBookingRequest(@ApiParam(value = "ID of the booking request to cancel.",required=true) @PathVariable("bookingRequestId") String bookingRequestId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "offerWorker", notes = "Offer a worker for a booking", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "agency", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully offered worker"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "No such booking request exists") })
    @RequestMapping(value = "/bookingRequests/{bookingRequestId}/offers",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> offerWorker(@ApiParam(value = "ID of the booking request to offer a worker for.",required=true) @PathVariable("bookingRequestId") String bookingRequestId,@ApiParam(value = "Worker to be offered" ,required=true )  @Valid @RequestBody PersonIdentifier personIdentifier) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
