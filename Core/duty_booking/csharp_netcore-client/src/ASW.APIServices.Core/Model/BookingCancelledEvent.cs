/* 
 * Duty Booking API and Events
 *
 * ## Duty Booking API and events and Events 
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
    /// A booking has been cancelled
    /// </summary>
    [DataContract]
    public partial class BookingCancelledEvent :  IEquatable<BookingCancelledEvent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BookingCancelledEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BookingCancelledEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BookingCancelledEvent" /> class.
        /// </summary>
        /// <param name="proposalId">The ID of the booking (required).</param>
        /// <param name="vacancyId">The ID of the vacancy.</param>
        public BookingCancelledEvent(string proposalId = default(string), string vacancyId = default(string))
        {
            // to ensure "proposalId" is required (not null)
            if (proposalId == null)
            {
                throw new InvalidDataException("proposalId is a required property for BookingCancelledEvent and cannot be null");
            }
            else
            {
                this.ProposalId = proposalId;
            }

            this.VacancyId = vacancyId;
        }
        
        /// <summary>
        /// The ID of the booking
        /// </summary>
        /// <value>The ID of the booking</value>
        [DataMember(Name="proposalId", EmitDefaultValue=false)]
        public string ProposalId { get; set; }

        /// <summary>
        /// The ID of the vacancy
        /// </summary>
        /// <value>The ID of the vacancy</value>
        [DataMember(Name="vacancyId", EmitDefaultValue=false)]
        public string VacancyId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BookingCancelledEvent {\n");
            sb.Append("  ProposalId: ").Append(ProposalId).Append("\n");
            sb.Append("  VacancyId: ").Append(VacancyId).Append("\n");
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
            return this.Equals(input as BookingCancelledEvent);
        }

        /// <summary>
        /// Returns true if BookingCancelledEvent instances are equal
        /// </summary>
        /// <param name="input">Instance of BookingCancelledEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BookingCancelledEvent input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ProposalId == input.ProposalId ||
                    (this.ProposalId != null &&
                    this.ProposalId.Equals(input.ProposalId))
                ) && 
                (
                    this.VacancyId == input.VacancyId ||
                    (this.VacancyId != null &&
                    this.VacancyId.Equals(input.VacancyId))
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
                if (this.VacancyId != null)
                    hashCode = hashCode * 59 + this.VacancyId.GetHashCode();
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
