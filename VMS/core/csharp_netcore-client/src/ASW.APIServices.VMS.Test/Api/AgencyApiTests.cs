/* 
 * VMS API
 *
 * ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 
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

using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Model;

namespace ASW.APIServices.VMS.Test
{
    /// <summary>
    ///  Class for testing AgencyApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class AgencyApiTests : IDisposable
    {
        private AgencyApi instance;

        public AgencyApiTests()
        {
            instance = new AgencyApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of AgencyApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' AgencyApi
            //Assert.IsType(typeof(AgencyApi), instance, "instance is a AgencyApi");
        }

        
        /// <summary>
        /// Test OfferWorker
        /// </summary>
        [Fact]
        public void OfferWorkerTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string bookingRequestId = null;
            //PersonIdentifier personIdentifier = null;
            //instance.OfferWorker(bookingRequestId, personIdentifier);
            
        }
        
    }

}
