/* 
 * VMS Provisioning API
 *
 * ## Description  API to be impemented by 247Time (and, potentially, partners) to enable provisioning of accounts and the org structure 
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
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace ASW.APIServices.VMS.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IProvisioningApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Provision the supplied structure.
        /// </remarks>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the customer to provision</param>
        /// <param name="structureProvision">Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed.</param>
        /// <returns></returns>
        void ProvisionStructure (string id, StructureProvision structureProvision);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Provision the supplied structure.
        /// </remarks>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the customer to provision</param>
        /// <param name="structureProvision">Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> ProvisionStructureWithHttpInfo (string id, StructureProvision structureProvision);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Provision the supplied user.
        /// </remarks>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the user to provision</param>
        /// <param name="userProvision">Structure of the User</param>
        /// <returns></returns>
        void ProvisionUser (string id, UserProvision userProvision);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Provision the supplied user.
        /// </remarks>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the user to provision</param>
        /// <param name="userProvision">Structure of the User</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> ProvisionUserWithHttpInfo (string id, UserProvision userProvision);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IProvisioningApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Provision the supplied structure.
        /// </remarks>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the customer to provision</param>
        /// <param name="structureProvision">Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task ProvisionStructureAsync (string id, StructureProvision structureProvision);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Provision the supplied structure.
        /// </remarks>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the customer to provision</param>
        /// <param name="structureProvision">Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> ProvisionStructureAsyncWithHttpInfo (string id, StructureProvision structureProvision);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Provision the supplied user.
        /// </remarks>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the user to provision</param>
        /// <param name="userProvision">Structure of the User</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task ProvisionUserAsync (string id, UserProvision userProvision);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Provision the supplied user.
        /// </remarks>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the user to provision</param>
        /// <param name="userProvision">Structure of the User</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> ProvisionUserAsyncWithHttpInfo (string id, UserProvision userProvision);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IProvisioningApi : IProvisioningApiSync, IProvisioningApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class ProvisioningApi : IProvisioningApi
    {
        private ASW.APIServices.VMS.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="ProvisioningApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ProvisioningApi() : this((string) null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ProvisioningApi"/> class.
        /// </summary>
        /// <returns></returns>
        public ProvisioningApi(String basePath)
        {
            this.Configuration = ASW.APIServices.VMS.Client.Configuration.MergeConfigurations(
                ASW.APIServices.VMS.Client.GlobalConfiguration.Instance,
                new ASW.APIServices.VMS.Client.Configuration { BasePath = basePath }
            );
            this.Client = new ASW.APIServices.VMS.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new ASW.APIServices.VMS.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = ASW.APIServices.VMS.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ProvisioningApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public ProvisioningApi(ASW.APIServices.VMS.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = ASW.APIServices.VMS.Client.Configuration.MergeConfigurations(
                ASW.APIServices.VMS.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new ASW.APIServices.VMS.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new ASW.APIServices.VMS.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = ASW.APIServices.VMS.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ProvisioningApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public ProvisioningApi(ASW.APIServices.VMS.Client.ISynchronousClient client,ASW.APIServices.VMS.Client.IAsynchronousClient asyncClient, ASW.APIServices.VMS.Client.IReadableConfiguration configuration)
        {
            if(client == null) throw new ArgumentNullException("client");
            if(asyncClient == null) throw new ArgumentNullException("asyncClient");
            if(configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = ASW.APIServices.VMS.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public ASW.APIServices.VMS.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public ASW.APIServices.VMS.Client.ISynchronousClient Client { get; set; }

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
        public ASW.APIServices.VMS.Client.IReadableConfiguration Configuration {get; set;}

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
        ///  Provision the supplied structure.
        /// </summary>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the customer to provision</param>
        /// <param name="structureProvision">Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed.</param>
        /// <returns></returns>
        public void ProvisionStructure (string id, StructureProvision structureProvision)
        {
             ProvisionStructureWithHttpInfo(id, structureProvision);
        }

        /// <summary>
        ///  Provision the supplied structure.
        /// </summary>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the customer to provision</param>
        /// <param name="structureProvision">Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ASW.APIServices.VMS.Client.ApiResponse<Object> ProvisionStructureWithHttpInfo (string id, StructureProvision structureProvision)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ASW.APIServices.VMS.Client.ApiException(400, "Missing required parameter 'id' when calling ProvisioningApi->ProvisionStructure");

            // verify the required parameter 'structureProvision' is set
            if (structureProvision == null)
                throw new ASW.APIServices.VMS.Client.ApiException(400, "Missing required parameter 'structureProvision' when calling ProvisioningApi->ProvisionStructure");

            ASW.APIServices.VMS.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.VMS.Client.RequestOptions();

            String[] _contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
            };

            var localVarContentType = ASW.APIServices.VMS.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = ASW.APIServices.VMS.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (id != null)
                localVarRequestOptions.PathParameters.Add("id", ASW.APIServices.VMS.Client.ClientUtils.ParameterToString(id)); // path parameter
            localVarRequestOptions.Data = structureProvision;


            // make the HTTP request
            var localVarResponse = this.Client.Put<Object>("/provision/customer/{id}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ProvisionStructure", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Provision the supplied structure.
        /// </summary>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the customer to provision</param>
        /// <param name="structureProvision">Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task ProvisionStructureAsync (string id, StructureProvision structureProvision)
        {
             await ProvisionStructureAsyncWithHttpInfo(id, structureProvision);

        }

        /// <summary>
        ///  Provision the supplied structure.
        /// </summary>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the customer to provision</param>
        /// <param name="structureProvision">Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed.</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ASW.APIServices.VMS.Client.ApiResponse<Object>> ProvisionStructureAsyncWithHttpInfo (string id, StructureProvision structureProvision)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ASW.APIServices.VMS.Client.ApiException(400, "Missing required parameter 'id' when calling ProvisioningApi->ProvisionStructure");

            // verify the required parameter 'structureProvision' is set
            if (structureProvision == null)
                throw new ASW.APIServices.VMS.Client.ApiException(400, "Missing required parameter 'structureProvision' when calling ProvisioningApi->ProvisionStructure");


            ASW.APIServices.VMS.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.VMS.Client.RequestOptions();

            String[] _contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
            };
            
            foreach (var _contentType in _contentTypes)
                localVarRequestOptions.HeaderParameters.Add("Content-Type", _contentType);
            
            foreach (var _accept in _accepts)
                localVarRequestOptions.HeaderParameters.Add("Accept", _accept);
            
            if (id != null)
                localVarRequestOptions.PathParameters.Add("id", ASW.APIServices.VMS.Client.ClientUtils.ParameterToString(id)); // path parameter
            localVarRequestOptions.Data = structureProvision;


            // make the HTTP request

            var localVarResponse = await this.AsynchronousClient.PutAsync<Object>("/provision/customer/{id}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ProvisionStructure", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Provision the supplied user.
        /// </summary>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the user to provision</param>
        /// <param name="userProvision">Structure of the User</param>
        /// <returns></returns>
        public void ProvisionUser (string id, UserProvision userProvision)
        {
             ProvisionUserWithHttpInfo(id, userProvision);
        }

        /// <summary>
        ///  Provision the supplied user.
        /// </summary>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the user to provision</param>
        /// <param name="userProvision">Structure of the User</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ASW.APIServices.VMS.Client.ApiResponse<Object> ProvisionUserWithHttpInfo (string id, UserProvision userProvision)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ASW.APIServices.VMS.Client.ApiException(400, "Missing required parameter 'id' when calling ProvisioningApi->ProvisionUser");

            // verify the required parameter 'userProvision' is set
            if (userProvision == null)
                throw new ASW.APIServices.VMS.Client.ApiException(400, "Missing required parameter 'userProvision' when calling ProvisioningApi->ProvisionUser");

            ASW.APIServices.VMS.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.VMS.Client.RequestOptions();

            String[] _contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
            };

            var localVarContentType = ASW.APIServices.VMS.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null) localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);

            var localVarAccept = ASW.APIServices.VMS.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null) localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);

            if (id != null)
                localVarRequestOptions.PathParameters.Add("id", ASW.APIServices.VMS.Client.ClientUtils.ParameterToString(id)); // path parameter
            localVarRequestOptions.Data = userProvision;


            // make the HTTP request
            var localVarResponse = this.Client.Put<Object>("/provision/user/{id}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ProvisionUser", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Provision the supplied user.
        /// </summary>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the user to provision</param>
        /// <param name="userProvision">Structure of the User</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task ProvisionUserAsync (string id, UserProvision userProvision)
        {
             await ProvisionUserAsyncWithHttpInfo(id, userProvision);

        }

        /// <summary>
        ///  Provision the supplied user.
        /// </summary>
        /// <exception cref="ASW.APIServices.VMS.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">ID of the user to provision</param>
        /// <param name="userProvision">Structure of the User</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ASW.APIServices.VMS.Client.ApiResponse<Object>> ProvisionUserAsyncWithHttpInfo (string id, UserProvision userProvision)
        {
            // verify the required parameter 'id' is set
            if (id == null)
                throw new ASW.APIServices.VMS.Client.ApiException(400, "Missing required parameter 'id' when calling ProvisioningApi->ProvisionUser");

            // verify the required parameter 'userProvision' is set
            if (userProvision == null)
                throw new ASW.APIServices.VMS.Client.ApiException(400, "Missing required parameter 'userProvision' when calling ProvisioningApi->ProvisionUser");


            ASW.APIServices.VMS.Client.RequestOptions localVarRequestOptions = new ASW.APIServices.VMS.Client.RequestOptions();

            String[] _contentTypes = new String[] {
                "application/json"
            };

            // to determine the Accept header
            String[] _accepts = new String[] {
            };
            
            foreach (var _contentType in _contentTypes)
                localVarRequestOptions.HeaderParameters.Add("Content-Type", _contentType);
            
            foreach (var _accept in _accepts)
                localVarRequestOptions.HeaderParameters.Add("Accept", _accept);
            
            if (id != null)
                localVarRequestOptions.PathParameters.Add("id", ASW.APIServices.VMS.Client.ClientUtils.ParameterToString(id)); // path parameter
            localVarRequestOptions.Data = userProvision;


            // make the HTTP request

            var localVarResponse = await this.AsynchronousClient.PutAsync<Object>("/provision/user/{id}", localVarRequestOptions, this.Configuration);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("ProvisionUser", localVarResponse);
                if (_exception != null) throw _exception;
            }

            return localVarResponse;
        }

    }
}
