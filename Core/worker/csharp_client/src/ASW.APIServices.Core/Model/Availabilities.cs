/* 
 * Workers
 *
 * ## Workers and events 
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
    /// Availabilities
    /// </summary>
    [DataContract]
    public partial class Availabilities :  IEquatable<Availabilities>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Availabilities" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Availabilities() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Availabilities" /> class.
        /// </summary>
        /// <param name="availability">availability (required).</param>
        /// <param name="noBank">noBank (required).</param>
        public Availabilities(List<AvailabilitiesAvailability> availability = default(List<AvailabilitiesAvailability>), List<AvailabilitiesNoBank> noBank = default(List<AvailabilitiesNoBank>))
        {
            // to ensure "availability" is required (not null)
            if (availability == null)
            {
                throw new InvalidDataException("availability is a required property for Availabilities and cannot be null");
            }
            else
            {
                this.Availability = availability;
            }
            
            // to ensure "noBank" is required (not null)
            if (noBank == null)
            {
                throw new InvalidDataException("noBank is a required property for Availabilities and cannot be null");
            }
            else
            {
                this.NoBank = noBank;
            }
            
        }
        
        /// <summary>
        /// Gets or Sets Availability
        /// </summary>
        [DataMember(Name="Availability", EmitDefaultValue=false)]
        public List<AvailabilitiesAvailability> Availability { get; set; }

        /// <summary>
        /// Gets or Sets NoBank
        /// </summary>
        [DataMember(Name="NoBank", EmitDefaultValue=false)]
        public List<AvailabilitiesNoBank> NoBank { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Availabilities {\n");
            sb.Append("  Availability: ").Append(Availability).Append("\n");
            sb.Append("  NoBank: ").Append(NoBank).Append("\n");
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
            return this.Equals(input as Availabilities);
        }

        /// <summary>
        /// Returns true if Availabilities instances are equal
        /// </summary>
        /// <param name="input">Instance of Availabilities to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Availabilities input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Availability == input.Availability ||
                    this.Availability != null &&
                    input.Availability != null &&
                    this.Availability.SequenceEqual(input.Availability)
                ) && 
                (
                    this.NoBank == input.NoBank ||
                    this.NoBank != null &&
                    input.NoBank != null &&
                    this.NoBank.SequenceEqual(input.NoBank)
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
                if (this.Availability != null)
                    hashCode = hashCode * 59 + this.Availability.GetHashCode();
                if (this.NoBank != null)
                    hashCode = hashCode * 59 + this.NoBank.GetHashCode();
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
