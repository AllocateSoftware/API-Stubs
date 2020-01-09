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
    /// ProposalDetails
    /// </summary>
    [DataContract]
    public partial class ProposalDetails :  IEquatable<ProposalDetails>, IValidatableObject
    {
        /// <summary>
        /// The engagement route for this worker
        /// </summary>
        /// <value>The engagement route for this worker</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EngagementRouteEnum
        {
            /// <summary>
            /// Enum Substantive for value: substantive
            /// </summary>
            [EnumMember(Value = "substantive")]
            Substantive = 1,

            /// <summary>
            /// Enum Bank for value: bank
            /// </summary>
            [EnumMember(Value = "bank")]
            Bank = 2,

            /// <summary>
            /// Enum Agency for value: agency
            /// </summary>
            [EnumMember(Value = "agency")]
            Agency = 3,

            /// <summary>
            /// Enum Other for value: other
            /// </summary>
            [EnumMember(Value = "other")]
            Other = 4

        }

        /// <summary>
        /// The engagement route for this worker
        /// </summary>
        /// <value>The engagement route for this worker</value>
        [DataMember(Name="engagementRoute", EmitDefaultValue=false)]
        public EngagementRouteEnum EngagementRoute { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ProposalDetails" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ProposalDetails() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ProposalDetails" /> class.
        /// </summary>
        /// <param name="personId">Allocate PersonID for the person being proposed (required).</param>
        /// <param name="engagementRoute">The engagement route for this worker (required).</param>
        /// <param name="agencyId">The Allocate Agency ID for the agency, if this worker is being provided through an agency engagement.</param>
        /// <param name="cost">cost.</param>
        /// <param name="cancellationCosts">cancellationCosts.</param>
        public ProposalDetails(string personId = default(string), EngagementRouteEnum engagementRoute = default(EngagementRouteEnum), string agencyId = default(string), decimal cost = default(decimal), List<CancellationCost> cancellationCosts = default(List<CancellationCost>))
        {
            // to ensure "personId" is required (not null)
            if (personId == null)
            {
                throw new InvalidDataException("personId is a required property for ProposalDetails and cannot be null");
            }
            else
            {
                this.PersonId = personId;
            }

            this.EngagementRoute = engagementRoute;
            this.AgencyId = agencyId;
            this.Cost = cost;
            this.CancellationCosts = cancellationCosts;
        }
        
        /// <summary>
        /// Allocate PersonID for the person being proposed
        /// </summary>
        /// <value>Allocate PersonID for the person being proposed</value>
        [DataMember(Name="personId", EmitDefaultValue=false)]
        public string PersonId { get; set; }

        /// <summary>
        /// The Allocate Agency ID for the agency, if this worker is being provided through an agency engagement
        /// </summary>
        /// <value>The Allocate Agency ID for the agency, if this worker is being provided through an agency engagement</value>
        [DataMember(Name="agencyId", EmitDefaultValue=false)]
        public string AgencyId { get; set; }

        /// <summary>
        /// Gets or Sets Cost
        /// </summary>
        [DataMember(Name="cost", EmitDefaultValue=false)]
        public decimal Cost { get; set; }

        /// <summary>
        /// Gets or Sets CancellationCosts
        /// </summary>
        [DataMember(Name="cancellationCosts", EmitDefaultValue=false)]
        public List<CancellationCost> CancellationCosts { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProposalDetails {\n");
            sb.Append("  PersonId: ").Append(PersonId).Append("\n");
            sb.Append("  EngagementRoute: ").Append(EngagementRoute).Append("\n");
            sb.Append("  AgencyId: ").Append(AgencyId).Append("\n");
            sb.Append("  Cost: ").Append(Cost).Append("\n");
            sb.Append("  CancellationCosts: ").Append(CancellationCosts).Append("\n");
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
            return this.Equals(input as ProposalDetails);
        }

        /// <summary>
        /// Returns true if ProposalDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of ProposalDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProposalDetails input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PersonId == input.PersonId ||
                    (this.PersonId != null &&
                    this.PersonId.Equals(input.PersonId))
                ) && 
                (
                    this.EngagementRoute == input.EngagementRoute ||
                    this.EngagementRoute.Equals(input.EngagementRoute)
                ) && 
                (
                    this.AgencyId == input.AgencyId ||
                    (this.AgencyId != null &&
                    this.AgencyId.Equals(input.AgencyId))
                ) && 
                (
                    this.Cost == input.Cost ||
                    this.Cost.Equals(input.Cost)
                ) && 
                (
                    this.CancellationCosts == input.CancellationCosts ||
                    this.CancellationCosts != null &&
                    input.CancellationCosts != null &&
                    this.CancellationCosts.SequenceEqual(input.CancellationCosts)
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
                if (this.PersonId != null)
                    hashCode = hashCode * 59 + this.PersonId.GetHashCode();
                hashCode = hashCode * 59 + this.EngagementRoute.GetHashCode();
                if (this.AgencyId != null)
                    hashCode = hashCode * 59 + this.AgencyId.GetHashCode();
                hashCode = hashCode * 59 + this.Cost.GetHashCode();
                if (this.CancellationCosts != null)
                    hashCode = hashCode * 59 + this.CancellationCosts.GetHashCode();
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