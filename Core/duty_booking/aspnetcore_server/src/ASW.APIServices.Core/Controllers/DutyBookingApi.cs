/*
 * Duty Booking API and Events
 *
 * ## Duty Booking API and events and Events 
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
    public class DutyBookingApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Cancel the proposal (and the booking, if it has been accepted)</remarks>
        /// <param name="id">ID of the proposal</param>
        /// <response code="200">Cancelled successfully</response>
        /// <response code="404">The proposal was not found</response>
        /// <response code="202">The request was accepted and will be processed asynchronously</response>
        [HttpDelete]
        [Route("/api/booking/v1/proposals/{id}")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 202, type: typeof(AsyncResponse))]
        public virtual IActionResult CancelProposal([FromRoute][Required]string id)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 202 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(202, default(AsyncResponse));

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Offer a worker for filling a duty</remarks>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <response code="200">Proposal created successfully</response>
        /// <response code="202">The proposal has been accepted and a response will be returned asyncronously.</response>
        [HttpPost]
        [Route("/api/booking/v1/vacancy/{vacancyId}/proposals")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(string))]
        [ProducesResponseType(statusCode: 202, type: typeof(AsyncResponse))]
        public virtual IActionResult CreateProposal([FromRoute][Required]string vacancyId, [FromBody]ProposalDetails proposalDetails)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(string));
            //TODO: Uncomment the next line to return response 202 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(202, default(AsyncResponse));
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
        /// <param name="id">ID of the proposal</param>
        /// <param name="proposalDetails">Details of the proposal for filling the duty (worker)</param>
        /// <response code="200">Duty costing successfully</response>
        /// <response code="404">The proposal was not found</response>
        /// <response code="202">The request was accepted and will be processed asynchronously</response>
        [HttpPut]
        [Route("/api/booking/v1/proposals/{id}")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 202, type: typeof(AsyncResponse))]
        public virtual IActionResult UpdateProposal([FromRoute][Required]string id, [FromBody]ProposalDetails proposalDetails)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 202 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(202, default(AsyncResponse));

            throw new NotImplementedException();
        }
    }
}
