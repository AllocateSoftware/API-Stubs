/*
 * Vacancy Booking API and Events
 *
 *      ## Duty Booking API and events and Events 
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
    public class VacancyApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Offer a worker for filling a duty</remarks>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="proposalDetails">Details of the proposal for filling the vacancy (worker, costs, etc)</param>
        /// <response code="200">Proposal created successfully</response>
        /// <response code="202">The proposal has been accepted and a response will be returned asyncronously.</response>
        /// <response code="400">One or more errors have occurred when attempting to process the provided data</response>
        [HttpPost]
        [Route("/api/v1/vacancies/{vacancyId}/proposals")]
        [Authorize]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(CreateProposalResponse))]
        [ProducesResponseType(statusCode: 202, type: typeof(AsyncResponse))]
        [ProducesResponseType(statusCode: 400, type: typeof(ErrorResponse))]
        public virtual IActionResult CreateProposal([FromRoute][Required]string vacancyId, [FromBody]ProposalDetails proposalDetails)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(CreateProposalResponse));
            //TODO: Uncomment the next line to return response 202 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(202, default(AsyncResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"proposalId\" : \"3B78B5C3-07B3-4DC6-8A2A-7D85153869FC\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CreateProposalResponse>(exampleJson)
            : default(CreateProposalResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Create a new vacancy</remarks>
        /// <param name="vacancy">Details of the vacancy</param>
        /// <response code="403">Forbidden - you do not have the necessary permissions to undertake this action</response>
        /// <response code="200">Vacancy created successfully</response>
        [HttpPost]
        [Route("/api/v1/vacancies")]
        [Authorize]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 403, type: typeof(ErrorResponse))]
        [ProducesResponseType(statusCode: 200, type: typeof(CreateVacancyResponse))]
        public virtual IActionResult CreateVacancy([FromBody]Vacancy vacancy)
        { 

            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(CreateVacancyResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"vacancyId\" : \"3B78B5C3-07B3-4DC6-8A2A-7D85153869FC\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CreateVacancyResponse>(exampleJson)
            : default(CreateVacancyResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Send timesheet information for a completed activity</remarks>
        /// <param name="vacancyId">The ID of the vacancy</param>
        /// <param name="inlineObject"></param>
        /// <response code="200">Timesheet successfully submitted</response>
        [HttpPost]
        [Route("/api/v1/vacancies/{vacancyId}/timesheet")]
        [Authorize]
        [ValidateModelState]
        public virtual IActionResult SubmitTimesheet([FromRoute][Required]string vacancyId, [FromBody]InlineObject inlineObject)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            throw new NotImplementedException();
        }
    }
}
