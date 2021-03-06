/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.2).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.allocate.openapi.api;

import com.allocate.openapi.model.AsyncResponse;
import com.allocate.openapi.model.LeaveClaim;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

@Validated
@Api(value = "worker", description = "the worker API")
public interface WorkerApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "submitAnnualLeaveClaim", notes = "Submit an leave (vacation) claim for a worker", response = AsyncResponse.class, tags={ "Workers","Annual Leave Claims", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "The worker data has been accepted, and will be processed in due course.", response = AsyncResponse.class) })
    @RequestMapping(value = "/worker/{id}/leave",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<AsyncResponse> submitAnnualLeaveClaim(@ApiParam(value = "ID of the worker",required=true) @PathVariable("id") String id,@ApiParam(value = "Leave claim for a worker" ,required=true )  @Valid @RequestBody LeaveClaim leaveClaim) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
