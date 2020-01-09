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
    public interface ICostingApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the duty</param>
        /// <param name="dutyCostDetails">Costing Information</param>
        /// <returns></returns>
        void SendDutyCosting (string id, DutyCostDetails dutyCostDetails);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the duty</param>
        /// <param name="dutyCostDetails">Costing Information</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> SendDutyCostingWithHttpInfo (string id, DutyCostDetails dutyCostDetails);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICostingApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the duty</param>
        /// <param name="dutyCostDetails">Costing Information</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task SendDutyCostingAsync (string id, DutyCostDetails dutyCostDetails);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the duty</param>
        /// <param name="dutyCostDetails">Costing Information</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> SendDutyCostingAsyncWithHttpInfo (string id, DutyCostDetails dutyCostDetails);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ICostingApi : ICostingApiSync, ICostingApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class CostingApi : ICostingApi
    {
        private ASW.APIServices.Core.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="CostingApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CostingApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CostingApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CostingApi(String basePath)
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
        /// Initializes a new instance of the <see cref="CostingApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public CostingApi(ASW.APIServices.Core.Client.Configuration configuration)
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
        /// Initializes a new instance of the <see cref="CostingApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public CostingApi(ASW.APIServices.Core.Client.ISynchronousClient client,ASW.APIServices.Core.Client.IAsynchronousClient asyncClient, ASW.APIServices.Core.Client.IReadableConfiguration configuration)
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
        ///  
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the duty</param>
        /// <param name="dutyCostDetails">Costing Information</param>
        /// <returns></returns>
        public void SendDutyCosting (string id, DutyCostDetails dutyCostDetails)
        {
             SendDutyCostingWithHttpInfo(id, dutyCostDetails);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the duty</param>
        /// <param name="dutyCostDetails">Costing Information</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ASW.APIServices.Core.Client.ApiResponse<Object> SendDutyCostingWithHttpInfo (string id, DutyCostDetails dutyCostDetails)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'id' when calling CostingApi->SendDutyCosting");

            // verify the required parameter 'dutyCostDetails' is set
            if (dutyCostDetails == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'dutyCostDetails' when calling CostingApi->SendDutyCosting");

            ASW.APIServices.Core.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.Core.Client.RequestOptions();

            String[] _contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
                "application/json"
            };

            var localVarContentType = ASW.APIServices.Core.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = ASW.APIServices.Core.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (id != null)
                localVarRequestOptions.PathParameters.Add("id", ASW.APIServices.Core.Client.ClientUtils.ParameterToString(id)); // path parameter
            localVarRequestOptions.Data = dutyCostDetails;


            // make the HTTP request
            var localVarResponse = this.Client.Post<Object>("/duties/{id}/costing", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("SendDutyCosting", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the duty</param>
        /// <param name="dutyCostDetails">Costing Information</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task SendDutyCostingAsync (string id, DutyCostDetails dutyCostDetails)
        {
             await SendDutyCostingAsyncWithHttpInfo(id, dutyCostDetails);

        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="ASW.APIServices.Core.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the duty</param>
        /// <param name="dutyCostDetails">Costing Information</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ASW.APIServices.Core.Client.ApiResponse<Object>> SendDutyCostingAsyncWithHttpInfo (string id, DutyCostDetails dutyCostDetails)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'id' when calling CostingApi->SendDutyCosting");

            // verify the required parameter 'dutyCostDetails' is set
            if (dutyCostDetails == null)
                throw new ASW.APIServices.Core.Client.ApiException(400, "Missing required parameter 'dutyCostDetails' when calling CostingApi->SendDutyCosting");


            ASW.APIServices.Core.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.Core.Client.RequestOptions();

            String[] _contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
                "application/json"
            };
            
            foreach (var _contentType in _contentTypes)
                localVarRequestOptions.HeaderParameters.Add("Content-Type", _contentType);
            
            foreach (var _accept in _accepts)
                localVarRequestOptions.HeaderParameters.Add("Accept", _accept);
            
            if (id != null)
                localVarRequestOptions.PathParameters.Add("id", ASW.APIServices.Core.Client.ClientUtils.ParameterToString(id)); // path parameter
            localVarRequestOptions.Data = dutyCostDetails;


            // make the HTTP request

            var localVarResponse = await this.AsynchronousClient.PostAsync<Object>("/duties/{id}/costing", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("SendDutyCosting", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}