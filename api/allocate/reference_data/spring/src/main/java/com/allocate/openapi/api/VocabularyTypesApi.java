/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.2).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.allocate.openapi.api;

import com.allocate.openapi.model.VocabularyType;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:47.784750Z[Europe/London]")

@Validated
@Api(value = "vocabularyTypes", description = "the vocabularyTypes API")
public interface VocabularyTypesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "getVocabularyTypeById", notes = "Return a vocabulary type", response = VocabularyType.class, authorizations = {
        @Authorization(value = "jwt")
    }, tags={ "Reference Data", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returning a vocabulary type", response = VocabularyType.class) })
    @RequestMapping(value = "/vocabularyTypes/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<VocabularyType> getVocabularyTypeById(@ApiParam(value = "The ID of the vocabulary type",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"grades\", \"description\" : \"List of grades\", \"id\" : \"D1E3B83E-99A3-4AF3-B95B-3DC2913EDDC2\", \"tags\" : { \"key\" : \"tags\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getVocabularyTypes", notes = "Return a list of vocabularies types that you may query", response = VocabularyType.class, responseContainer = "List", authorizations = {
        @Authorization(value = "jwt")
    }, tags={ "Reference Data", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returning a list of vocabulary types", response = VocabularyType.class, responseContainer = "List") })
    @RequestMapping(value = "/vocabularyTypes",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<VocabularyType>> getVocabularyTypes() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"grades\", \"description\" : \"List of grades\", \"id\" : \"D1E3B83E-99A3-4AF3-B95B-3DC2913EDDC2\", \"tags\" : { \"key\" : \"tags\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}