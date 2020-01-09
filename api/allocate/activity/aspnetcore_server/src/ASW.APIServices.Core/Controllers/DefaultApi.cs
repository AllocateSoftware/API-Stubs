/*
 * Activity API
 *
 *      ## API for querying worker activity.      This is an early availabilty API, and is subject to change. 
 *
 * The version of the OpenAPI document: 0.0.1
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
    public class DefaultApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Provide hours and assignment details for workers</remarks>
        /// <param name="customerCode">The code for the customer (trust) for which the activities should be returned</param>
        /// <param name="format">Format for the output. TBD, but may be used to control the scope of information returned.</param>
        /// <response code="200">The worker has been registered successfully</response>
        /// <response code="400">One or more errors have occurred when attempting to process the provided data</response>
        /// <response code="403">Forbidden - you do not have the necessary permissions to undertake this action</response>
        [HttpGet]
        [Route("/api/v1/activities")]
        [Authorize]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<HoursAssignment>))]
        [ProducesResponseType(statusCode: 400, type: typeof(ErrorResponse))]
        [ProducesResponseType(statusCode: 403, type: typeof(ErrorResponse))]
        public virtual IActionResult GetActivities([FromQuery][Required()]string customerCode, [FromQuery]string format)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<HoursAssignment>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"owningUnit\" : {\n    \"externalReference\" : \"externalReference\",\n    \"code\" : \"Opal Ward\",\n    \"shortName\" : \"Opal Ward\",\n    \"longName\" : \"Opal Ward\"\n  },\n  \"actual\" : {\n    \"from\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"to\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"assignment\" : {\n    \"fromRequest\" : true,\n    \"method\" : \"autoroster\"\n  },\n  \"shift\" : {\n    \"name\" : \"early\",\n    \"type\" : \"day\"\n  },\n  \"contractedTime\" : 450,\n  \"payState\" : \"requested\",\n  \"requirement\" : {\n    \"grade\" : {\n      \"externalReference\" : \"externalReference\",\n      \"shortName\" : \"Band 5 RN\",\n      \"longName\" : \"Band 5 RN\"\n    },\n    \"gradeType\" : {\n      \"externalReference\" : \"externalReference\",\n      \"name\" : \"RN\",\n      \"description\" : \"Registered\"\n    },\n    \"gradeTypeCategory\" : {\n      \"name\" : \"Registered\"\n    }\n  },\n  \"posting\" : {\n    \"assignmentNumber\" : \"assignmentNumber\"\n  },\n  \"costCentre\" : {\n    \"code\" : \"code\",\n    \"name\" : \"name\",\n    \"description\" : \"description\"\n  },\n  \"dutyHasWarnings\" : true,\n  \"when\" : \"2000-01-23\",\n  \"workTime\" : 450,\n  \"resourcingUnit\" : {\n    \"externalReference\" : \"externalReference\",\n    \"code\" : \"Opal Ward\",\n    \"shortName\" : \"Opal Ward\",\n    \"longName\" : \"Opal Ward\"\n  },\n  \"additionalDutyReason\" : \"additionalDutyReason\",\n  \"employeeType\" : {\n    \"externalReference\" : \"externalReference\",\n    \"name\" : \"Bank Only\",\n    \"description\" : \"description\"\n  },\n  \"cancellation\" : {\n    \"reason\" : {\n      \"externalReference\" : \"externalReference\",\n      \"name\" : \"Unknown / Other\",\n      \"description\" : \"Unknown Duty Cancel Reason\"\n    }\n  },\n  \"post\" : {\n    \"grade\" : {\n      \"externalReference\" : \"externalReference\",\n      \"shortName\" : \"Band 5 RN\",\n      \"longName\" : \"Band 5 RN\"\n    },\n    \"title\" : \"NHSp Bank Contract - Band 5 RN\"\n  },\n  \"person\" : {\n    \"surname\" : \"Smith\",\n    \"mobileNumber\" : \"mobileNumber\",\n    \"grade\" : {\n      \"externalReference\" : \"externalReference\",\n      \"shortName\" : \"Band 5 RN\",\n      \"longName\" : \"Band 5 RN\"\n    },\n    \"gradeType\" : {\n      \"externalReference\" : \"externalReference\",\n      \"name\" : \"RN\",\n      \"description\" : \"Registered\"\n    },\n    \"WTE\" : 0.9125,\n    \"gradeTypeCategory\" : {\n      \"name\" : \"Registered\"\n    },\n    \"staffNumber\" : \"staffNumber\",\n    \"forenames\" : \"Fred\"\n  },\n  \"duty\" : {\n    \"when\" : {\n      \"from\" : \"01:00\",\n      \"to\" : \"08:30\"\n    }\n  },\n  \"location\" : {\n    \"type\" : \"type\",\n    \"longName\" : \"longName\"\n  },\n  \"id\" : 123523,\n  \"fulfillment\" : {\n    \"type\" : \"local\",\n    \"category\" : \"mandatory\",\n    \"status\" : \"vacant\"\n  },\n  \"inCharge\" : true\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<HoursAssignment>>(exampleJson)
            : default(List<HoursAssignment>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
