/* 
 * Activity API
 *
 *      ## API for querying worker activity.      This is an early availabilty API, and is subject to change. 
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: support@allocatesoftware.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace ASW.APIServices.Core.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDefaultApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Provide hours and assignment details for workers
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerCode">The code for the customer (trust) for which the activities should be returned</param>
        /// <param name="format">Format for the output. TBD, but may be used to control the scope of information returned. (optional)</param>
        /// <returns>List&lt;HoursAssignment&gt;</returns>
        List<HoursAssignment> GetActivities (string customerCode, string format = default(string));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Provide hours and assignment details for workers
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerCode">The code for the customer (trust) for which the activities should be returned</param>
        /// <param name="format">Format for the output. TBD, but may be used to control the scope of information returned. (optional)</param>
        /// <returns>ApiResponse of List&lt;HoursAssignment&gt;</returns>
        ApiResponse<List<HoursAssignment>> GetActivitiesWithHttpInfo (string customerCode, string format = default(string));
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Provide hours and assignment details for workers
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerCode">The code for the customer (trust) for which the activities should be returned</param>
        /// <param name="format">Format for the output. TBD, but may be used to control the scope of information returned. (optional)</param>
        /// <returns>Task of List&lt;HoursAssignment&gt;</returns>
        System.Threading.Tasks.Task<List<HoursAssignment>> GetActivitiesAsync (string customerCode, string format = default(string));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Provide hours and assignment details for workers
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerCode">The code for the customer (trust) for which the activities should be returned</param>
        /// <param name="format">Format for the output. TBD, but may be used to control the scope of information returned. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;HoursAssignment&gt;)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<HoursAssignment>>> GetActivitiesAsyncWithHttpInfo (string customerCode, string format = default(string));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class DefaultApi : IDefaultApi
    {
        private ASW.APIServices.Core.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DefaultApi(String basePath)
        {
            this.Configuration = new ASW.APIServices.Core.Client.Configuration { BasePath = basePath };

            ExceptionFactory = ASW.APIServices.Core.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class
        /// </summary>
        /// <returns></returns>
        public DefaultApi()
        {
            this.Configuration = ASW.APIServices.Core.Client.Configuration.Default;

            ExceptionFactory = ASW.APIServices.Core.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DefaultApi(ASW.APIServices.Core.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = ASW.APIServices.Core.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = ASW.APIServices.Core.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public ASW.APIServices.Core.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public ASW.APIServices.Core.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        ///  Provide hours and assignment details for workers
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerCode">The code for the customer (trust) for which the activities should be returned</param>
        /// <param name="format">Format for the output. TBD, but may be used to control the scope of information returned. (optional)</param>
        /// <returns>List&lt;HoursAssignment&gt;</returns>
        public List<HoursAssignment> GetActivities (string customerCode, string format = default(string))
        {
             ApiResponse<List<HoursAssignment>> localVarResponse = GetActivitiesWithHttpInfo(customerCode, format);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Provide hours and assignment details for workers
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerCode">The code for the customer (trust) for which the activities should be returned</param>
        /// <param name="format">Format for the output. TBD, but may be used to control the scope of information returned. (optional)</param>
        /// <returns>ApiResponse of List&lt;HoursAssignment&gt;</returns>
        public ApiResponse<List<HoursAssignment>> GetActivitiesWithHttpInfo (string customerCode, string format = default(string))
        {
            // verify the required parameter 'customerCode' is set
            if (customerCode == null)
                throw new ApiException(400, "Missing required parameter 'customerCode' when calling DefaultApi->GetActivities");

            var localVarPath = "/activities";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (customerCode != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "customerCode", customerCode)); // query parameter
            if (format != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "format", format)); // query parameter

            // authentication (jwt) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarHeaderParams["Authorization"] = "Basic " + ApiClient.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password);
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetActivities", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<HoursAssignment>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<HoursAssignment>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<HoursAssignment>)));
        }

        /// <summary>
        ///  Provide hours and assignment details for workers
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerCode">The code for the customer (trust) for which the activities should be returned</param>
        /// <param name="format">Format for the output. TBD, but may be used to control the scope of information returned. (optional)</param>
        /// <returns>Task of List&lt;HoursAssignment&gt;</returns>
        public async System.Threading.Tasks.Task<List<HoursAssignment>> GetActivitiesAsync (string customerCode, string format = default(string))
        {
             ApiResponse<List<HoursAssignment>> localVarResponse = await GetActivitiesAsyncWithHttpInfo(customerCode, format);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Provide hours and assignment details for workers
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerCode">The code for the customer (trust) for which the activities should be returned</param>
        /// <param name="format">Format for the output. TBD, but may be used to control the scope of information returned. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;HoursAssignment&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<HoursAssignment>>> GetActivitiesAsyncWithHttpInfo (string customerCode, string format = default(string))
        {
            // verify the required parameter 'customerCode' is set
            if (customerCode == null)
                throw new ApiException(400, "Missing required parameter 'customerCode' when calling DefaultApi->GetActivities");

            var localVarPath = "/activities";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (customerCode != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "customerCode", customerCode)); // query parameter
            if (format != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "format", format)); // query parameter

            // authentication (jwt) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarHeaderParams["Authorization"] = "Basic " + ApiClient.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password);
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetActivities", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<HoursAssignment>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (List<HoursAssignment>) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<HoursAssignment>)));
        }

    }
}