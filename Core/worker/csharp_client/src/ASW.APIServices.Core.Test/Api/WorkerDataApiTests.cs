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
    ///  Class for testing WorkerDataApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class WorkerDataApiTests
    {
        private WorkerDataApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new WorkerDataApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of WorkerDataApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' WorkerDataApi
            //Assert.IsInstanceOf(typeof(WorkerDataApi), instance);
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
        
    }

}
