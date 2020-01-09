/* 
 * Duties and Events
 *
 * ## Duties and Events 
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
using NUnit.Framework;

using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Model;

namespace ASW.APIServices.Core.Test
{
    /// <summary>
    ///  Class for testing DutiesApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class DutiesApiTests
    {
        private DutiesApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new DutiesApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of DutiesApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' DutiesApi
            //Assert.IsInstanceOf(typeof(DutiesApi), instance);
        }

        
        /// <summary>
        /// Test CancelDuty
        /// </summary>
        [Test]
        public void CancelDutyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //instance.CancelDuty(id);
            
        }
        
        /// <summary>
        /// Test CancelDutyBooking
        /// </summary>
        [Test]
        public void CancelDutyBookingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //instance.CancelDutyBooking(id);
            
        }
        
        /// <summary>
        /// Test CreateDuty
        /// </summary>
        [Test]
        public void CreateDutyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //DutyDetails dutyDetails = null;
            //var response = instance.CreateDuty(dutyDetails);
            //Assert.IsInstanceOf(typeof(string), response, "response is string");
        }
        
        /// <summary>
        /// Test SendDutyCosting
        /// </summary>
        [Test]
        public void SendDutyCostingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //DutyCostDetails dutyCostDetails = null;
            //instance.SendDutyCosting(id, dutyCostDetails);
            
        }
        
        /// <summary>
        /// Test SendDutyForFulfillment
        /// </summary>
        [Test]
        public void SendDutyForFulfillmentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //string destination = null;
            //instance.SendDutyForFulfillment(id, destination);
            
        }
        
    }

}
