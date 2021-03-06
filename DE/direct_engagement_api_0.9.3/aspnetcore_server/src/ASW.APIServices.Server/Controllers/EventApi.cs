/*
 * DE Provider Direct Engagement API
 *
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using ASW.APIServices.Server.Attributes;
using Microsoft.AspNetCore.Authorization;
using ASW.APIServices.Server.Models;

namespace ASW.APIServices.Server.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class EventApiController : ControllerBase
    { 
        /// <summary>
        /// Get all events older than input timestamp
        /// </summary>
        /// <remarks>Returns an array of events</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="dateTimeFrom">Timestamp</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/event")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(Duty))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetEvents([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery][Required()]DateTime dateTimeFrom, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Duty));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"date\" : \"2000-01-23\",\n  \"specialty\" : \"Speciality\",\n  \"timeIntervalRates\" : [ {\n    \"rates\" : [ {\n      \"reference\" : \"basic_commission\",\n      \"rate\" : 50.00\n    }, {\n      \"reference\" : \"basic_commission\",\n      \"rate\" : 50.00\n    } ],\n    \"startTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"endTime\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"rates\" : [ {\n      \"reference\" : \"basic_commission\",\n      \"rate\" : 50.00\n    }, {\n      \"reference\" : \"basic_commission\",\n      \"rate\" : 50.00\n    } ],\n    \"startTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"endTime\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ],\n  \"clientDeptId\" : \"TrustA.667899\",\n  \"agency\" : \"TrustA.2209\",\n  \"requestGender\" : \"male\",\n  \"rates\" : [ {\n    \"reference\" : \"basic_commission\",\n    \"rate\" : 50.00\n  }, {\n    \"reference\" : \"basic_commission\",\n    \"rate\" : 50.00\n  } ],\n  \"fallbackGrade\" : \"TrustA.9989\",\n  \"fallbackSkill\" : \"Fallback skill\",\n  \"vacancyReason\" : \"TrustA.12\",\n  \"blockId\" : \"TrustA.77569\",\n  \"fallbackSpeciality\" : \"Fallback speciality\",\n  \"subDiscipline\" : \"TrustA.1323\",\n  \"person\" : {\n    \"allocatePersonId\" : \"TrustA.1123\",\n    \"firstName\" : \"Doe\",\n    \"telephoneNumber\" : \"+223504938839\",\n    \"surname\" : \"John\",\n    \"extSystemId\" : \"123e4567-e89b-12d3-a456-426655440000\",\n    \"personGender\" : \"male\",\n    \"dateOfBirth\" : \"2000-01-23\",\n    \"matchId\" : \"E124RT562.john.doe@mail.com\",\n    \"email\" : \"john.doe@mail.com\"\n  },\n  \"grade\" : \"TrustA.77889\",\n  \"skill\" : \"Skill\",\n  \"breakDuration\" : 30,\n  \"dutyId\" : \"TrustA.11667\",\n  \"startTime\" : \"22:00\",\n  \"endTime\" : \"01:25\",\n  \"uniqueNumber\" : 112233,\n  \"poNumber\" : 0,\n  \"slaveDutyId\" : \"TrustA.77569\",\n  \"status\" : \"active\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Duty>(exampleJson)
            : default(Duty);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
