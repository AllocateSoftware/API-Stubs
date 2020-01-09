/* 
 * Reference data and Mappings API
 *
 *      ## API for accessing reference data and mapping information 
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
    ///  Class for testing MappingsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class MappingsApiTests : IDisposable
    {
        private MappingsApi instance;

        public MappingsApiTests()
        {
            instance = new MappingsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of MappingsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' MappingsApi
            //Assert.IsType(typeof(MappingsApi), instance, "instance is a MappingsApi");
        }

        
        /// <summary>
        /// Test CreateMapping
        /// </summary>
        [Fact]
        public void CreateMappingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string setId = null;
            //Mapping mapping = null;
            //var response = instance.CreateMapping(setId, mapping);
            //Assert.IsType<string> (response, "response is string");
        }
        
        /// <summary>
        /// Test DeleteMapping
        /// </summary>
        [Fact]
        public void DeleteMappingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //string mappingId = null;
            //instance.DeleteMapping(id, mappingId);
            
        }
        
        /// <summary>
        /// Test GetMapping
        /// </summary>
        [Fact]
        public void GetMappingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //string mappingId = null;
            //var response = instance.GetMapping(id, mappingId);
            //Assert.IsType<Mapping> (response, "response is Mapping");
        }
        
        /// <summary>
        /// Test GetMappingSetById
        /// </summary>
        [Fact]
        public void GetMappingSetByIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string setId = null;
            //var response = instance.GetMappingSetById(setId);
            //Assert.IsType<MappingSet> (response, "response is MappingSet");
        }
        
        /// <summary>
        /// Test GetMappingSets
        /// </summary>
        [Fact]
        public void GetMappingSetsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetMappingSets();
            //Assert.IsType<List<MappingSet>> (response, "response is List<MappingSet>");
        }
        
        /// <summary>
        /// Test GetMappings
        /// </summary>
        [Fact]
        public void GetMappingsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string setId = null;
            //string fromCode = null;
            //var response = instance.GetMappings(setId, fromCode);
            //Assert.IsType<List<Mapping>> (response, "response is List<Mapping>");
        }
        
        /// <summary>
        /// Test PutMapping
        /// </summary>
        [Fact]
        public void PutMappingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string id = null;
            //string mappingId = null;
            //Mapping mapping = null;
            //instance.PutMapping(id, mappingId, mapping);
            
        }
        
    }

}