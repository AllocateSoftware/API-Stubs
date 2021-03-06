/*
 * VMS API
 *
 * ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 
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
using ASW.APIServices.VMS.Attributes;
using Microsoft.AspNetCore.Authorization;
using ASW.APIServices.VMS.Models;

namespace ASW.APIServices.VMS.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class WorkersApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Get the details of a person (worker) from the VMS</remarks>
        /// <param name="id">ID of the worker within the VMS.</param>
        /// <response code="200">Request OK</response>
        /// <response code="400">Invalid input parameter</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/vms/api/v1/workers/{id}")]
        [Authorize]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(Person))]
        public virtual IActionResult GetWorker([FromRoute][Required]string id)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Person));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"firstName\" : \"Doe\",\n  \"telephoneNumber\" : \"+223504938839\",\n  \"universalId\" : \"QQ123456C\",\n  \"surname\" : \"John\",\n  \"links\" : [ {\n    \"rel\" : \"rel\",\n    \"href\" : \"http://example.com/aeiou\"\n  }, {\n    \"rel\" : \"rel\",\n    \"href\" : \"http://example.com/aeiou\"\n  } ],\n  \"id\" : \"123e4567-e89b-12d3-a456-426655440000\",\n  \"email\" : \"john.doe@mail.com\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Person>(exampleJson)
            : default(Person);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
