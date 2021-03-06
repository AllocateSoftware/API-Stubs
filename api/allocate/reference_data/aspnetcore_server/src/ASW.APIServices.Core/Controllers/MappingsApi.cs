/*
 * Reference data and Mappings API
 *
 *      ## API for accessing reference data and mapping information 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using ASW.APIServices.Core.Attributes;
using Microsoft.AspNetCore.Authorization;
using ASW.APIServices.Core.Models;

namespace ASW.APIServices.Core.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class MappingsApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Create a new entry in a mapping set</remarks>
        /// <param name="setId">The ID of the mapping set</param>
        /// <param name="mapping">Details of the mapping</param>
        /// <response code="200">Successfully created</response>
        [HttpPost]
        [Route("/api/v1/mappingSets/{setId}/mappings")]
        [Authorize]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(string))]
        public virtual IActionResult CreateMapping([FromRoute][Required]string setId, [FromBody]Mapping mapping)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(string));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<string>(exampleJson)
            : default(string);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Delete a vocabulary entry</remarks>
        /// <param name="id">The ID of the vocabulary</param>
        /// <param name="mappingId">The ID of the mapping</param>
        /// <response code="200">Updated successfully</response>
        [HttpDelete]
        [Route("/api/v1/mappingSets/{id}/mappings/{mappingId}")]
        [Authorize]
        [ValidateModelState]
        public virtual IActionResult DeleteMapping([FromRoute][Required]string id, [FromRoute][Required]string mappingId)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Return the mapping</remarks>
        /// <param name="id">The ID of the mapping set</param>
        /// <param name="mappingId">The ID of the mapping set element</param>
        /// <response code="200">Returning a list of vocabularies</response>
        [HttpGet]
        [Route("/api/v1/mappingSets/{id}/mappings/{mappingId}")]
        [Authorize]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(Mapping))]
        public virtual IActionResult GetMapping([FromRoute][Required]string id, [FromRoute][Required]string mappingId)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Mapping));
            string exampleJson = null;
            exampleJson = "{\n  \"mappingSetId\" : \"mappingSetId\",\n  \"from\" : {\n    \"code\" : \"ABCD\",\n    \"title\" : \"ABCD\"\n  },\n  \"id\" : \"id\",\n  \"to\" : {\n    \"code\" : \"ABCD\",\n    \"title\" : \"ABCD\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Mapping>(exampleJson)
            : default(Mapping);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Get a mapping set by ID</remarks>
        /// <param name="setId">The ID of the vocabulary type</param>
        /// <response code="200">Returning a list of mapping sets</response>
        [HttpGet]
        [Route("/api/v1/mappingSets/{setId}")]
        [Authorize]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(MappingSet))]
        public virtual IActionResult GetMappingSetById([FromRoute][Required]string setId)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(MappingSet));
            string exampleJson = null;
            exampleJson = "{\n  \"id\" : \"D1E3B83E-99A3-4AF3-B95B-3DC2913EDDC2\",\n  \"vocabularyType\" : {\n    \"name\" : \"grades\",\n    \"description\" : \"List of grades\",\n    \"id\" : \"D1E3B83E-99A3-4AF3-B95B-3DC2913EDDC2\",\n    \"tags\" : {\n      \"key\" : \"tags\"\n    }\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<MappingSet>(exampleJson)
            : default(MappingSet);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Return a list of mapping sets that you may utilise</remarks>
        /// <response code="200">Returning a list of mapping sets</response>
        [HttpGet]
        [Route("/api/v1/mappingSets")]
        [Authorize]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<MappingSet>))]
        public virtual IActionResult GetMappingSets()
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<MappingSet>));
            string exampleJson = null;
            exampleJson = "{\n  \"id\" : \"D1E3B83E-99A3-4AF3-B95B-3DC2913EDDC2\",\n  \"vocabularyType\" : {\n    \"name\" : \"grades\",\n    \"description\" : \"List of grades\",\n    \"id\" : \"D1E3B83E-99A3-4AF3-B95B-3DC2913EDDC2\",\n    \"tags\" : {\n      \"key\" : \"tags\"\n    }\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<MappingSet>>(exampleJson)
            : default(List<MappingSet>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Return the elements of a mapping set</remarks>
        /// <param name="setId">The ID of the mapping set</param>
        /// <param name="fromCode">Search for a mapping where the from code matches the provided string</param>
        /// <response code="200">Returning a list of mapping set entries</response>
        [HttpGet]
        [Route("/api/v1/mappingSets/{setId}/mappings")]
        [Authorize]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<Mapping>))]
        public virtual IActionResult GetMappings([FromRoute][Required]string setId, [FromQuery]string fromCode)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Mapping>));
            string exampleJson = null;
            exampleJson = "{\n  \"mappingSetId\" : \"mappingSetId\",\n  \"from\" : {\n    \"code\" : \"ABCD\",\n    \"title\" : \"ABCD\"\n  },\n  \"id\" : \"id\",\n  \"to\" : {\n    \"code\" : \"ABCD\",\n    \"title\" : \"ABCD\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Mapping>>(exampleJson)
            : default(List<Mapping>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Update a mapping</remarks>
        /// <param name="id">The ID of the vocabulary</param>
        /// <param name="mappingId">The ID of the vocabulary element</param>
        /// <param name="mapping">Details of the mapping</param>
        /// <response code="200">Updated successfully</response>
        [HttpPut]
        [Route("/api/v1/mappingSets/{id}/mappings/{mappingId}")]
        [Authorize]
        [ValidateModelState]
        public virtual IActionResult PutMapping([FromRoute][Required]string id, [FromRoute][Required]string mappingId, [FromBody]Mapping mapping)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            throw new NotImplementedException();
        }
    }
}
