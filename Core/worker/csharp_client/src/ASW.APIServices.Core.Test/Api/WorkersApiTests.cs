/* 
 * Workers
 *
 * ## Workers and events 
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
    ///  Class for testing WorkersApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class WorkersApiTests
    {
        private WorkersApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new WorkersApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of WorkersApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' WorkersApi
            //Assert.IsInstanceOf(typeof(WorkersApi), instance);
        }

        
        /// <summary>
        /// Test RegisterWorker
        /// </summary>
        [Test]
        public void RegisterWorkerTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Person person = null;
            //var response = instance.RegisterWorker(person);
            //Assert.IsInstanceOf(typeof(WorkerRegistrationResponse), response, "response is WorkerRegistrationResponse");
        }
        
        /// <summary>
        /// Test SubmitAnnualLeaveClaim
        /// </summary>
        [Test]
        public void SubmitAnnualLeaveClaimTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //LeaveClaim leaveClaim = null;
            //var response = instance.SubmitAnnualLeaveClaim(id, leaveClaim);
            //Assert.IsInstanceOf(typeof(AsyncResponse), response, "response is AsyncResponse");
        }
        
    }

}