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
using System.Net;
using System.Net.Mime;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace ASW.APIServices.Core.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDefaultApiSync : IApiAccessor
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
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDefaultApiAsync : IApiAccessor
    {
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
    public interface IDefaultApi : IDefaultApiSync, IDefaultApiAsync
    {

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
        public DefaultApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DefaultApi(String basePath)
        {
            this.Configuration = ASW.APIServices.Core.Client.Configuration.MergeConfigurations(
                ASW.APIServices.Core.Client.GlobalConfiguration.Instance,
                new ASW.APIServices.Core.Client.Configuration { BasePath = basePath }
            );
            this.Client = new ASW.APIServices.Core.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new ASW.APIServices.Core.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = ASW.APIServices.Core.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DefaultApi(ASW.APIServices.Core.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = ASW.APIServices.Core.Client.Configuration.MergeConfigurations(
                ASW.APIServices.Core.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new ASW.APIServices.Core.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new ASW.APIServices.Core.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = ASW.APIServices.Core.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public DefaultApi(ASW.APIServices.Core.Client.ISynchronousClient client,ASW.APIServices.Core.Client.IAsynchronousClient asyncClient, ASW.APIServices.Core.Client.IReadableConfiguration configuration)
        {
            if(client == null) throw new ArgumentNullException("client");
            if(asyncClient == null) throw new ArgumentNullException("asyncClient");
            if(configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = ASW.APIServices.Core.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public ASW.APIServices.Core.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public ASW.APIServices.Core.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public ASW.APIServices.Core.Client.IReadableConfiguration Configuration {get; set;}

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
        ///  Provide hours and assignment details for workers
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerCode">The code for the customer (trust) for which the activities should be returned</param>
        /// <param name="format">Format for the output. TBD, but may be used to control the scope of information returned. (optional)</param>
        /// <returns>List&lt;HoursAssignment&gt;</returns>
        public List<HoursAssignment> GetActivities (string customerCode, string format = default(string))
        {
             ASW.APIServices.Core.Client.ApiResponse<List<HoursAssignment>> localVarResponse = GetActivitiesWithHttpInfo(customerCode, format);
             return localVarResponse.Data;
        }

        /// <summary>
        ///  Provide hours and assignment details for workers
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerCode">The code for the customer (trust) for which the activities should be returned</param>
        /// <param name="format">Format for the output. TBD, but may be used to control the scope of information returned. (optional)</param>
        /// <returns>ApiResponse of List&lt;HoursAssignment&gt;</returns>
        public ASW.APIServices.Core.Client.ApiResponse< List<HoursAssignment> > GetActivitiesWithHttpInfo (string customerCode, string format = default(string))
        {
            // verify the required parameter 'customerCode' is set
            if (customerCode == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'customerCode' when calling DefaultApi->GetActivities");

            ASW.APIServices.Core.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.Core.Client.RequestOptions();

            String[] _contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
                "application/json"
            };

            var localVarContentType = ASW.APIServices.Core.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = ASW.APIServices.Core.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (customerCode != null)
            {
                foreach (var _kvp in ASW.APIServices.Core.Client.ClientUtils.ParameterToMultiMap("", "customerCode", customerCode))
                {
                    foreach (var _kvpValue in _kvp.Value)
                    {
                        localVarRequestOptions.QueryParameters.Add(_kvp.Key, _kvpValue);
                    }
                }
            }
            if (format != null)
            {
                foreach (var _kvp in ASW.APIServices.Core.Client.ClientUtils.ParameterToMultiMap("", "format", format))
                {
                    foreach (var _kvpValue in _kvp.Value)
                    {
                        localVarRequestOptions.QueryParameters.Add(_kvp.Key, _kvpValue);
                    }
                }
            }

            // authentication (jwt) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + ASW.APIServices.Core.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get< List<HoursAssignment> >("/activities", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetActivities", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
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
             ASW.APIServices.Core.Client.ApiResponse<List<HoursAssignment>> localVarResponse = await GetActivitiesAsyncWithHttpInfo(customerCode, format);
             return localVarResponse.Data;

        }

        /// <summary>
        ///  Provide hours and assignment details for workers
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="customerCode">The code for the customer (trust) for which the activities should be returned</param>
        /// <param name="format">Format for the output. TBD, but may be used to control the scope of information returned. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;HoursAssignment&gt;)</returns>
        public async System.Threading.Tasks.Task<ASW.APIServices.Core.Client.ApiResponse<List<HoursAssignment>>> GetActivitiesAsyncWithHttpInfo (string customerCode, string format = default(string))
        {
            // verify the required parameter 'customerCode' is set
            if (customerCode == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'customerCode' when calling DefaultApi->GetActivities");


            ASW.APIServices.Core.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.Core.Client.RequestOptions();

            String[] _contentTypes = new String[] {
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
                "application/json"
            };
            
            foreach (var _contentType in _contentTypes)
                localVarRequestOptions.HeaderParameters.Add("Content-Type", _contentType);
            
            foreach (var _accept in _accepts)
                localVarRequestOptions.HeaderParameters.Add("Accept", _accept);
            
            if (customerCode != null)
            {
                foreach (var _kvp in ASW.APIServices.Core.Client.ClientUtils.ParameterToMultiMap("", "customerCode", customerCode))
                {
                    foreach (var _kvpValue in _kvp.Value)
                    {
                        localVarRequestOptions.QueryParameters.Add(_kvp.Key, _kvpValue);
                    }
                }
            }
            if (format != null)
            {
                foreach (var _kvp in ASW.APIServices.Core.Client.ClientUtils.ParameterToMultiMap("", "format", format))
                {
                    foreach (var _kvpValue in _kvp.Value)
                    {
                        localVarRequestOptions.QueryParameters.Add(_kvp.Key, _kvpValue);
                    }
                }
            }

            // authentication (jwt) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarRequestOptions.HeaderParameters.Add("Authorization", "Basic " + ASW.APIServices.Core.Client.ClientUtils.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password));
            }

            // make the HTTP request

            var localVarResponse = await this.AsynchronousClient.GetAsync<List<HoursAssignment>>("/activities", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetActivities", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
