/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.2).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.allocate.openapi.api;

import com.allocate.openapi.model.AsyncResponse;
import com.allocate.openapi.model.CreateProposalResponse;
import com.allocate.openapi.model.CreateVacancyResponse;
import com.allocate.openapi.model.ErrorResponse;
import com.allocate.openapi.model.InlineObject;
import com.allocate.openapi.model.ProposalDetails;
import com.allocate.openapi.model.Vacancy;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

@Validated
@Api(value = "vacancies", description = "the vacancies API")
public interface VacanciesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "createProposal", notes = "Offer a worker for filling a duty", response = CreateProposalResponse.class, authorizations = {
        @Authorization(value = "jwt")
    }, tags={ "Vacancy", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Proposal created successfully", response = CreateProposalResponse.class),
        @ApiResponse(code = 202, message = "The proposal has been accepted and a response will be returned asyncronously.", response = AsyncResponse.class),
        @ApiResponse(code = 400, message = "One or more errors have occurred when attempting to process the provided data", response = ErrorResponse.class) })
    @RequestMapping(value = "/vacancies/{vacancyId}/proposals",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<CreateProposalResponse> createProposal(@ApiParam(value = "The ID of the vacancy",required=true) @PathVariable("vacancyId") String vacancyId,@ApiParam(value = "Details of the proposal for filling the vacancy (worker, costs, etc)" ,required=true )  @Valid @RequestBody ProposalDetails proposalDetails) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"proposalId\" : \"3B78B5C3-07B3-4DC6-8A2A-7D85153869FC\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "createVacancy", notes = "Create a new vacancy", response = CreateVacancyResponse.class, authorizations = {
        @Authorization(value = "jwt")
    }, tags={ "Vacancy", })
    @ApiResponses(value = { 
        @ApiResponse(code = 403, message = "Forbidden - you do not have the necessary permissions to undertake this action", response = ErrorResponse.class),
        @ApiResponse(code = 200, message = "Vacancy created successfully", response = CreateVacancyResponse.class) })
    @RequestMapping(value = "/vacancies",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<CreateVacancyResponse> createVacancy(@ApiParam(value = "Details of the vacancy" ,required=true )  @Valid @RequestBody Vacancy vacancy) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"vacancyId\" : \"3B78B5C3-07B3-4DC6-8A2A-7D85153869FC\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "submitTimesheet", notes = "Send timesheet information for a completed activity", authorizations = {
        @Authorization(value = "jwt")
    }, tags={ "Vacancy", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Timesheet successfully submitted") })
    @RequestMapping(value = "/vacancies/{vacancyId}/timesheet",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> submitTimesheet(@ApiParam(value = "The ID of the vacancy",required=true) @PathVariable("vacancyId") String vacancyId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody InlineObject inlineObject) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}