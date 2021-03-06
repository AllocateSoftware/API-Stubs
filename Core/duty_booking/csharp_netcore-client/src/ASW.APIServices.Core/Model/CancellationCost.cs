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
    /// CancellationCost
    /// </summary>
    [DataContract]
    public partial class CancellationCost :  IEquatable<CancellationCost>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CancellationCost" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CancellationCost() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CancellationCost" /> class.
        /// </summary>
        /// <param name="afterDate">The date/time after which this cost becomes valid (required).</param>
        /// <param name="amount">The cost of cancellation (required).</param>
        public CancellationCost(DateTime afterDate = default(DateTime), decimal amount = default(decimal))
        {
            // to ensure "afterDate" is required (not null)
            if (afterDate == null)
            {
                throw new InvalidDataException("afterDate is a required property for CancellationCost and cannot be null");
            }
            else
            {
                this.AfterDate = afterDate;
            }

            // to ensure "amount" is required (not null)
            if (amount == null)
            {
                throw new InvalidDataException("amount is a required property for CancellationCost and cannot be null");
            }
            else
            {
                this.Amount = amount;
            }

        }
        
        /// <summary>
        /// The date/time after which this cost becomes valid
        /// </summary>
        /// <value>The date/time after which this cost becomes valid</value>
        [DataMember(Name="afterDate", EmitDefaultValue=false)]
        public DateTime AfterDate { get; set; }

        /// <summary>
        /// The cost of cancellation
        /// </summary>
        /// <value>The cost of cancellation</value>
        [DataMember(Name="amount", EmitDefaultValue=false)]
        public decimal Amount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CancellationCost {\n");
            sb.Append("  AfterDate: ").Append(AfterDate).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
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
            return this.Equals(input as CancellationCost);
        }

        /// <summary>
        /// Returns true if CancellationCost instances are equal
        /// </summary>
        /// <param name="input">Instance of CancellationCost to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CancellationCost input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AfterDate == input.AfterDate ||
                    (this.AfterDate != null &&
                    this.AfterDate.Equals(input.AfterDate))
                ) && 
                (
                    this.Amount == input.Amount ||
                    this.Amount.Equals(input.Amount)
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
                if (this.AfterDate != null)
                    hashCode = hashCode * 59 + this.AfterDate.GetHashCode();
                hashCode = hashCode * 59 + this.Amount.GetHashCode();
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
