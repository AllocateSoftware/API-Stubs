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
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace ASW.APIServices.VMS.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IWorkersApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Get the details of a person (worker) from the VMS
        /// </remarks>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the worker within the VMS.</param>
        /// <returns>Person</returns>
        Person GetWorker (string id);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Get the details of a person (worker) from the VMS
        /// </remarks>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the worker within the VMS.</param>
        /// <returns>ApiResponse of Person</returns>
        ApiResponse<Person> GetWorkerWithHttpInfo (string id);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Get the details of a person (worker) from the VMS
        /// </remarks>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the worker within the VMS.</param>
        /// <returns>Task of Person</returns>
        System.Threading.Tasks.Task<Person> GetWorkerAsync (string id);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Get the details of a person (worker) from the VMS
        /// </remarks>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the worker within the VMS.</param>
        /// <returns>Task of ApiResponse (Person)</returns>
        System.Threading.Tasks.Task<ApiResponse<Person>> GetWorkerAsyncWithHttpInfo (string id);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class WorkersApi : IWorkersApi
    {
        private ASW.APIServices.VMS.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="WorkersApi"/> class.
        /// </summary>
        /// <returns></returns>
        public WorkersApi(String basePath)
        {
            this.Configuration = new ASW.APIServices.VMS.Client.Configuration { BasePath = basePath };

            ExceptionFactory = ASW.APIServices.VMS.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="WorkersApi"/> class
        /// </summary>
        /// <returns></returns>
        public WorkersApi()
        {
            this.Configuration = ASW.APIServices.VMS.Client.Configuration.Default;

            ExceptionFactory = ASW.APIServices.VMS.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="WorkersApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public WorkersApi(ASW.APIServices.VMS.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = ASW.APIServices.VMS.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = ASW.APIServices.VMS.Client.Configuration.DefaultExceptionFactory;
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
        public ASW.APIServices.VMS.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public ASW.APIServices.VMS.Client.ExceptionFactory ExceptionFactory
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
        ///  Get the details of a person (worker) from the VMS
        /// </summary>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the worker within the VMS.</param>
        /// <returns>Person</returns>
        public Person GetWorker (string id)
        {
             ApiResponse<Person> localVarResponse = GetWorkerWithHttpInfo(id);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Get the details of a person (worker) from the VMS
        /// </summary>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the worker within the VMS.</param>
        /// <returns>ApiResponse of Person</returns>
        public ApiResponse<Person> GetWorkerWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling WorkersApi->GetWorker");

            var localVarPath = "/workers/{id}";
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

            if (id != null) localVarPathParams.Add("id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter

            // authentication (bearerAuth) required
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
                Exception exception = ExceptionFactory("GetWorker", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Person>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Person) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Person)));
        }

        /// <summary>
        ///  Get the details of a person (worker) from the VMS
        /// </summary>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the worker within the VMS.</param>
        /// <returns>Task of Person</returns>
        public async System.Threading.Tasks.Task<Person> GetWorkerAsync (string id)
        {
             ApiResponse<Person> localVarResponse = await GetWorkerAsyncWithHttpInfo(id);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Get the details of a person (worker) from the VMS
        /// </summary>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the worker within the VMS.</param>
        /// <returns>Task of ApiResponse (Person)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Person>> GetWorkerAsyncWithHttpInfo (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ApiException(400, "Missing required parameter 'id' when calling WorkersApi->GetWorker");

            var localVarPath = "/workers/{id}";
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

            if (id != null) localVarPathParams.Add("id", this.Configuration.ApiClient.ParameterToString(id)); // path parameter

            // authentication (bearerAuth) required
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
                Exception exception = ExceptionFactory("GetWorker", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Person>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                (Person) this.Configuration.ApiClient.Deserialize(localVarResponse, typeof(Person)));
        }

    }
}
