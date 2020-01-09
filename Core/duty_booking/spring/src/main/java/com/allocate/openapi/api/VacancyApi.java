/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.2).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.allocate.openapi.api;

import com.allocate.openapi.model.AsyncResponse;
import com.allocate.openapi.model.ProposalDetails;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:20.724158Z[Europe/London]")

@Validated
@Api(value = "vacancy", description = "the vacancy API")
public interface VacancyApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "createProposal", notes = "Offer a worker for filling a duty", response = String.class, tags={ "Duty Booking", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Proposal created successfully", response = String.class),
        @ApiResponse(code = 202, message = "The proposal has been accepted and a response will be returned asyncronously.", response = AsyncResponse.class) })
    @RequestMapping(value = "/vacancy/{vacancyId}/proposals",
        produces = { "text/plain", "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<String> createProposal(@ApiParam(value = "The ID of the vacancy",required=true) @PathVariable("vacancyId") String vacancyId,@ApiParam(value = "Details of the proposal for filling the duty (worker)" ,required=true )  @Valid @RequestBody ProposalDetails proposalDetails) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}