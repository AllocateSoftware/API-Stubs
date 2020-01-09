/* 
 * DE Provider Direct Engagement API
 *
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Model;

namespace ASW.APIServices.Core.Test
{
    /// <summary>
    ///  Class for testing DutyApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class DutyApiTests : IDisposable
    {
        private DutyApi instance;

        public DutyApiTests()
        {
            instance = new DutyApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of DutyApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' DutyApi
            //Assert.IsType(typeof(DutyApi), instance, "instance is a DutyApi");
        }

        
        /// <summary>
        /// Test CancelDuty
        /// </summary>
        [Fact]
        public void CancelDutyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string version = null;
            //string trustCode = null;
            //int dutyId = null;
            //instance.CancelDuty(version, trustCode, dutyId);
            
        }
        
        /// <summary>
        /// Test FillDuty
        /// </summary>
        [Fact]
        public void FillDutyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string version = null;
            //string trustCode = null;
            //int dutyId = null;
            //BookingInfo bookingInfo = null;
            //var response = instance.FillDuty(version, trustCode, dutyId, bookingInfo);
            //Assert.IsType<BookingResponse> (response, "response is BookingResponse");
        }
        
        /// <summary>
        /// Test GetDutyDetails
        /// </summary>
        [Fact]
        public void GetDutyDetailsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string version = null;
            //string trustCode = null;
            //List<int> id = null;
            //int? page = null;
            //int? pageSize = null;
            //var response = instance.GetDutyDetails(version, trustCode, id, page, pageSize);
            //Assert.IsType<Duty> (response, "response is Duty");
        }
        
        /// <summary>
        /// Test GetSingleDutyDetails
        /// </summary>
        [Fact]
        public void GetSingleDutyDetailsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string version = null;
            //string trustCode = null;
            //int dutyId = null;
            //int? page = null;
            //int? pageSize = null;
            //var response = instance.GetSingleDutyDetails(version, trustCode, dutyId, page, pageSize);
            //Assert.IsType<Duty> (response, "response is Duty");
        }
        
        /// <summary>
        /// Test UpdateContractStatus
        /// </summary>
        [Fact]
        public void UpdateContractStatusTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string version = null;
            //string trustCode = null;
            //int dutyId = null;
            //string contractId = null;
            //ContractStatus statusId = null;
            //instance.UpdateContractStatus(version, trustCode, dutyId, contractId, statusId);
            
        }
        
        /// <summary>
        /// Test UpdateTimesheets
        /// </summary>
        [Fact]
        public void UpdateTimesheetsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string version = null;
            //string trustCode = null;
            //int dutyId = null;
            //InlineObject inlineObject = null;
            //instance.UpdateTimesheets(version, trustCode, dutyId, inlineObject);
            
        }
        
    }

}
