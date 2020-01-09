/*
 * Workers
 *
 * ## Workers and events 
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
    public class WorkerDataApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Provide worker details for inclusion into the Allocate ecosystem. The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier. This may entail an on-boarding process, so the final response may require human interaction before it can be completed.</remarks>
        /// <param name="person">Worker information</param>
        /// <response code="200">The worker has been registered successfully</response>
        /// <response code="400">One or more errors have occurred when attempting to process the provided data</response>
        /// <response code="202">The worker data has been accepted, and will be processed in due course.</response>
        [HttpPost]
        [Route("/api/worker/v1/workers")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(WorkerRegistrationResponse))]
        [ProducesResponseType(statusCode: 400, type: typeof(ErrorResponse))]
        [ProducesResponseType(statusCode: 202, type: typeof(AsyncResponse))]
        public virtual IActionResult RegisterWorker([FromBody]Person person)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(WorkerRegistrationResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 202 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(202, default(AsyncResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"personId\" : \"personId\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<WorkerRegistrationResponse>(exampleJson)
            : default(WorkerRegistrationResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}