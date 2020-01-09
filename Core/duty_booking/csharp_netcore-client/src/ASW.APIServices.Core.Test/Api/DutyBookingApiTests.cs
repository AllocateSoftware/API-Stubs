/* 
 * Duty Booking API and Events
 *
 * ## Duty Booking API and events and Events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
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
    ///  Class for testing DutyBookingApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class DutyBookingApiTests : IDisposable
    {
        private DutyBookingApi instance;

        public DutyBookingApiTests()
        {
            instance = new DutyBookingApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of DutyBookingApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' DutyBookingApi
            //Assert.IsType(typeof(DutyBookingApi), instance, "instance is a DutyBookingApi");
        }

        
        /// <summary>
        /// Test CancelProposal
        /// </summary>
        [Fact]
        public void CancelProposalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //instance.CancelProposal(id);
            
        }
        
        /// <summary>
        /// Test CreateProposal
        /// </summary>
        [Fact]
        public void CreateProposalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string vacancyId = null;
            //ProposalDetails proposalDetails = null;
            //var response = instance.CreateProposal(vacancyId, proposalDetails);
            //Assert.IsType<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test UpdateProposal
        /// </summary>
        [Fact]
        public void UpdateProposalTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //ProposalDetails proposalDetails = null;
            //instance.UpdateProposal(id, proposalDetails);
            
        }
        
    }

}
