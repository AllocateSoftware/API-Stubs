/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.2).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.allocate.openapi.api;

import com.allocate.openapi.model.Vocabulary;
import com.allocate.openapi.model.VocabularyEntry;
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
@Api(value = "vocabularies", description = "the vocabularies API")
public interface VocabulariesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "createVocabularyEntry", notes = "Create a new entry in a vocabulary", response = String.class, authorizations = {
        @Authorization(value = "jwt")
    }, tags={ "Reference Data", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returning a list of vocabularies", response = String.class) })
    @RequestMapping(value = "/vocabularies/{id}/entries",
        produces = { "text/plain" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<String> createVocabularyEntry(@ApiParam(value = "The ID of the vocabulary",required=true) @PathVariable("id") String id,@ApiParam(value = "Details of the vocabulary entry" ,required=true )  @Valid @RequestBody VocabularyEntry vocabularyEntry) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "deleteVocabularyEntry", notes = "Delete a vocabulary entry", authorizations = {
        @Authorization(value = "jwt")
    }, tags={ "Reference Data", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated successfully") })
    @RequestMapping(value = "/vocabularies/{id}/entries/{elementId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteVocabularyEntry(@ApiParam(value = "The ID of the vocabulary",required=true) @PathVariable("id") String id,@ApiParam(value = "The ID of the vocabulary element",required=true) @PathVariable("elementId") String elementId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getVocabularies", notes = "Return a list of vocabularies types that you may query", response = Vocabulary.class, responseContainer = "List", authorizations = {
        @Authorization(value = "jwt")
    }, tags={ "Reference Data", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returning a list of vocabularies", response = Vocabulary.class, responseContainer = "List") })
    @RequestMapping(value = "/vocabularies",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Vocabulary>> getVocabularies(@ApiParam(value = "Limit to vocabulary types") @Valid @RequestParam(value = "vocabularyTypeId", required = false) String vocabularyTypeId,@ApiParam(value = "Return page of results") @Valid @RequestParam(value = "page", required = false) String page,@ApiParam(value = "Records per page") @Valid @RequestParam(value = "pageSize", required = false) String pageSize) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : \"NCUH\", \"description\" : \"List of grades\", \"typeId\" : \"D1E3B83E-99A3-4AF3-B95B-3DC2913EDDC2\", \"id\" : \"DA32F546-E049-49DE-BDDD-EA466597E27E\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getVocabulary", notes = "Return a list of vocabularies that you may query", response = Vocabulary.class, authorizations = {
        @Authorization(value = "jwt")
    }, tags={ "Reference Data", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returning a vocabulary", response = Vocabulary.class) })
    @RequestMapping(value = "/vocabularies/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Vocabulary> getVocabulary(@ApiParam(value = "The ID of the vocabulary",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : \"NCUH\", \"description\" : \"List of grades\", \"typeId\" : \"D1E3B83E-99A3-4AF3-B95B-3DC2913EDDC2\", \"id\" : \"DA32F546-E049-49DE-BDDD-EA466597E27E\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getVocabularyElement", notes = "Return the elements of a vocabulary", response = VocabularyEntry.class, authorizations = {
        @Authorization(value = "jwt")
    }, tags={ "Reference Data", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returning a list of vocabularies", response = VocabularyEntry.class) })
    @RequestMapping(value = "/vocabularies/{id}/entries/{elementId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<VocabularyEntry> getVocabularyElement(@ApiParam(value = "The ID of the vocabulary",required=true) @PathVariable("id") String id,@ApiParam(value = "The ID of the vocabulary element",required=true) @PathVariable("elementId") String elementId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : \"ABCD\", \"title\" : \"ABCD\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "getVocabularyEntries", notes = "Return the elements of a vocabulary", response = VocabularyEntry.class, responseContainer = "List", authorizations = {
        @Authorization(value = "jwt")
    }, tags={ "Reference Data", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returning a list of vocabularies", response = VocabularyEntry.class, responseContainer = "List") })
    @RequestMapping(value = "/vocabularies/{id}/entries",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<VocabularyEntry>> getVocabularyEntries(@ApiParam(value = "The ID of the vocabulary",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : \"ABCD\", \"title\" : \"ABCD\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "putVocabularyEntry", notes = "Create a new entry in a vocabulary", authorizations = {
        @Authorization(value = "jwt")
    }, tags={ "Reference Data", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated successfully") })
    @RequestMapping(value = "/vocabularies/{id}/entries/{elementId}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> putVocabularyEntry(@ApiParam(value = "The ID of the vocabulary",required=true) @PathVariable("id") String id,@ApiParam(value = "The ID of the vocabulary element",required=true) @PathVariable("elementId") String elementId,@ApiParam(value = "Details of the vocabulary entry" ,required=true )  @Valid @RequestBody VocabularyEntry vocabularyEntry) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}