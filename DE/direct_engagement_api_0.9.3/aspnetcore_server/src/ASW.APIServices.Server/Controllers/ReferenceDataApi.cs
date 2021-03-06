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
    public class ReferenceDataApiController : ControllerBase
    { 
        /// <summary>
        /// Get agencies
        /// </summary>
        /// <remarks>Returns an array of agencies</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="id">Array of reference data IDs to return</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/referenceData/agency/")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<ReferenceDataResponse>))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetAgenciesByIds([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery][Required()]List<int> id, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ReferenceDataResponse>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"description\" : \"Description\",\n  \"refId\" : \"TrustA.12\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ReferenceDataResponse>>(exampleJson)
            : default(List<ReferenceDataResponse>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all agencies
        /// </summary>
        /// <remarks>Returns an array of agencies</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/referenceData/agency")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<ReferenceDataResponse>))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetAllAgencies([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ReferenceDataResponse>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"description\" : \"Description\",\n  \"refId\" : \"TrustA.12\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ReferenceDataResponse>>(exampleJson)
            : default(List<ReferenceDataResponse>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all contract statuses
        /// </summary>
        /// <remarks>Returns an array of contract statuses.</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/referenceData/contractStatus")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<ReferenceDataResponse>))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetAllContractStatuses([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ReferenceDataResponse>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"description\" : \"Description\",\n  \"refId\" : \"TrustA.12\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ReferenceDataResponse>>(exampleJson)
            : default(List<ReferenceDataResponse>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all grades
        /// </summary>
        /// <remarks>Returns an array of grades</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/referenceData/grade")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<ReferenceDataResponse>))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetAllGrades([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ReferenceDataResponse>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"description\" : \"Description\",\n  \"refId\" : \"TrustA.12\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ReferenceDataResponse>>(exampleJson)
            : default(List<ReferenceDataResponse>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all reasons for vacancy
        /// </summary>
        /// <remarks>Returns an array of reasons for vacancy</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/referenceData/reasonForVacancy")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<ReferenceDataResponse>))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetAllReasonsForVacancy([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ReferenceDataResponse>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"description\" : \"Description\",\n  \"refId\" : \"TrustA.12\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ReferenceDataResponse>>(exampleJson)
            : default(List<ReferenceDataResponse>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all staff groups
        /// </summary>
        /// <remarks>Returns an array of staff groups</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/referenceData/staffGroup")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<ReferenceDataResponse>))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetAllStaffGroups([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ReferenceDataResponse>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"description\" : \"Description\",\n  \"refId\" : \"TrustA.12\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ReferenceDataResponse>>(exampleJson)
            : default(List<ReferenceDataResponse>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all units
        /// </summary>
        /// <remarks>Returns an array of units</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/referenceData/unit")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<UnitReferenceDataResponse>))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetAllUnits([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<UnitReferenceDataResponse>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"unitSite\" : \"Unit site\",\n  \"description\" : \"Description\",\n  \"refId\" : \"TrustA.12\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<UnitReferenceDataResponse>>(exampleJson)
            : default(List<UnitReferenceDataResponse>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get contract statuses
        /// </summary>
        /// <remarks>Returns an array of contract statuses</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="id">Array of reference data IDs to return</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/referenceData/contractStatus/")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<ReferenceDataResponse>))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetContractStatusesByIds([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery][Required()]List<string> id, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ReferenceDataResponse>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"description\" : \"Description\",\n  \"refId\" : \"TrustA.12\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ReferenceDataResponse>>(exampleJson)
            : default(List<ReferenceDataResponse>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get grades
        /// </summary>
        /// <remarks>Returns an array of grades</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="id">Array of reference data IDs to return</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/referenceData/grade/")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<ReferenceDataResponse>))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetGradesByIds([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery][Required()]List<int> id, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ReferenceDataResponse>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"description\" : \"Description\",\n  \"refId\" : \"TrustA.12\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ReferenceDataResponse>>(exampleJson)
            : default(List<ReferenceDataResponse>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get reasons for vacancy
        /// </summary>
        /// <remarks>Returns an array of reasons for vacancy</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="id">Array of reference data IDs to return</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/referenceData/reasonForVacancy/")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<ReferenceDataResponse>))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetReasonsForVacancyByIds([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery][Required()]List<int> id, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ReferenceDataResponse>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"description\" : \"Description\",\n  \"refId\" : \"TrustA.12\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ReferenceDataResponse>>(exampleJson)
            : default(List<ReferenceDataResponse>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get staff groups
        /// </summary>
        /// <remarks>Returns an array of staff groups</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="id">Array of reference data IDs to return</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/referenceData/staffGroup/")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<ReferenceDataResponse>))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetStaffGroupsByIds([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery][Required()]List<int> id, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ReferenceDataResponse>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"description\" : \"Description\",\n  \"refId\" : \"TrustA.12\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ReferenceDataResponse>>(exampleJson)
            : default(List<ReferenceDataResponse>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get units
        /// </summary>
        /// <remarks>Returns an array of units</remarks>
        /// <param name="version">API version</param>
        /// <param name="trustCode">Trust code from BankStaff</param>
        /// <param name="id">Array of reference data IDs to return</param>
        /// <param name="page">Result page</param>
        /// <param name="pageSize">Count of records per page</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad request errors</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="404">Trust not found</response>
        [HttpGet]
        [Route("/{version}/trustcode/{trustCode}/referenceData/unit/")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(List<UnitReferenceDataResponse>))]
        [ProducesResponseType(statusCode: 400, type: typeof(string))]
        public virtual IActionResult GetUnitsByIds([FromRoute][Required]string version, [FromRoute][Required]string trustCode, [FromQuery][Required()]List<int> id, [FromQuery]int page, [FromQuery]int pageSize)
        { 

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<UnitReferenceDataResponse>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"unitSite\" : \"Unit site\",\n  \"description\" : \"Description\",\n  \"refId\" : \"TrustA.12\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<UnitReferenceDataResponse>>(exampleJson)
            : default(List<UnitReferenceDataResponse>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
