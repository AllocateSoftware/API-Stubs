/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.2).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.allocate.vms.api;

import com.allocate.vms.api.model.DutyRequest;
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
@Api(value = "bookings", description = "the bookings API")
public interface BookingsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "cancelBooking", notes = "Cancel a duty booking previously accepted. This does not cancel any outstanding booking requests or duty cascades.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "bookings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully deleted booking"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "No such booking exists") })
    @RequestMapping(value = "/bookings/{bookingId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> cancelBooking(@ApiParam(value = "ID of the booking to cancel.",required=true) @PathVariable("bookingId") String bookingId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getBooking", notes = "Query a duty booking by id", response = DutyRequest.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "bookings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request OK", response = DutyRequest.class),
        @ApiResponse(code = 400, message = "Invalid input parameter"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "No such booking exists") })
    @RequestMapping(value = "/bookings/{bookingId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<DutyRequest> getBooking(@ApiParam(value = "ID of the duty booking",required=true) @PathVariable("bookingId") String bookingId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"workerId\" : \"workerId\", \"duty\" : { \"requirements\" : { \"specialty\" : \"Speciality\", \"fallbackSpeciality\" : \"Fallback speciality\", \"skill\" : \"Skill\", \"fallbackSkill\" : \"Fallback skill\" }, \"clientDeptId\" : \"TrustA.667899\", \"agency\" : \"Liberty Resourcing Admin\", \"subDiscipline\" : \"TrustA.1323\", \"grade\" : \"TrustA.77889\", \"fallbackGrade\" : \"TrustA.9989\", \"where\" : { \"name\" : \"name\", \"id\" : \"id\" }, \"id\" : \"ABD.1210\", \"uniqueNumber\" : 112233, \"when\" : { \"date\" : \"2018-07-29T00:00:00.000+0000\", \"breakDuration\" : 30, \"startTime\" : \"12:40\", \"endTime\" : \"01:25\" }, \"vacancyReason\" : \"TrustA.12\", \"poNumber\" : 0 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}