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
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = ASW.APIServices.Core.Client.OpenAPIDateConverter;

namespace ASW.APIServices.Core.Model
{
    /// <summary>
    /// Where an API may respond with an asynchronous &#39;Accepted&#39; (HTTP 202) response, it will return an AsyncResponse object. The eventual                 response will be returned by way of an async event, containing the corresponding correlation ID header returned below.                                  The location of the correlation ID will depend upon the eventing transport in use - though typically it will be included as a message header (rather than a payload).             
    /// </summary>
    [DataContract]
    public partial class AsyncResponse :  IEquatable<AsyncResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AsyncResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AsyncResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AsyncResponse" /> class.
        /// </summary>
        /// <param name="id">Correlation Identifier (required).</param>
        public AsyncResponse(string id = default(string))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new InvalidDataException("id is a required property for AsyncResponse and cannot be null");
            }
            else
            {
                this.Id = id;
            }
            
        }
        
        /// <summary>
        /// Correlation Identifier
        /// </summary>
        /// <value>Correlation Identifier</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AsyncResponse {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AsyncResponse);
        }

        /// <summary>
        /// Returns true if AsyncResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of AsyncResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AsyncResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
