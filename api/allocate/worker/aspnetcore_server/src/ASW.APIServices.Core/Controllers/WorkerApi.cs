/*
 * Worker API and Events
 *
 *      ## API and events for providing workers. 
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
    public class WorkerApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>On-board a worker to a particular trust. In scenarios where worker data is being provided by a 3rd party Human Resources (or equivalent) system, it may be necessary to &#39;on-board&#39; that worker into a particular trust so that they may be selected. Note that in external bank scenarios this is not required, since the trust on-boarding request is implicit within the worker offer.  </remarks>
        /// <param name="id">The Allocate Worker ID</param>
        /// <param name="inlineObject"></param>
        /// <response code="200">The worker has been on-boarded successfully</response>
        /// <response code="400">One or more errors have occurred when attempting to process the provided data</response>
        /// <response code="403">Forbidden - you do not have the necessary permissions to undertake this action</response>
        /// <response code="202">The request has been accepted, and will be processed in due course.</response>
        [HttpPost]
        [Route("/api/v1/workers/{id}/onboardToTrust")]
        [Authorize]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 400, type: typeof(ErrorResponse))]
        [ProducesResponseType(statusCode: 403, type: typeof(ErrorResponse))]
        [ProducesResponseType(statusCode: 202, type: typeof(AsyncResponse))]
        public virtual IActionResult OnboardWorkerToTrust([FromRoute][Required]string id, [FromBody]InlineObject inlineObject)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 202 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(202, default(AsyncResponse));

            throw new NotImplementedException();
        }
    }
}