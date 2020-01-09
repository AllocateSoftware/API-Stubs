/* 
 * Vacancy Booking API and Events
 *
 *      ## Duty Booking API and events and Events 
 *
 * The version of the OpenAPI document: 1.0.0
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
    /// CreateProposalResponse
    /// </summary>
    [DataContract]
    public partial class CreateProposalResponse :  IEquatable<CreateProposalResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateProposalResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateProposalResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateProposalResponse" /> class.
        /// </summary>
        /// <param name="proposalId">The ID of the proposal created (required).</param>
        public CreateProposalResponse(string proposalId = default(string))
        {
            // to ensure "proposalId" is required (not null)
            if (proposalId == null)
            {
                throw new InvalidDataException("proposalId is a required property for CreateProposalResponse and cannot be null");
            }
            else
            {
                this.ProposalId = proposalId;
            }

        }
        
        /// <summary>
        /// The ID of the proposal created
        /// </summary>
        /// <value>The ID of the proposal created</value>
        [DataMember(Name="proposalId", EmitDefaultValue=false)]
        public string ProposalId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateProposalResponse {\n");
            sb.Append("  ProposalId: ").Append(ProposalId).Append("\n");
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
            return this.Equals(input as CreateProposalResponse);
        }

        /// <summary>
        /// Returns true if CreateProposalResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateProposalResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateProposalResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ProposalId == input.ProposalId ||
                    (this.ProposalId != null &&
                    this.ProposalId.Equals(input.ProposalId))
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
                if (this.ProposalId != null)
                    hashCode = hashCode * 59 + this.ProposalId.GetHashCode();
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