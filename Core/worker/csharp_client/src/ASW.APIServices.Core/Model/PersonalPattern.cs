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
    /// PersonalPattern
    /// </summary>
    [DataContract]
    public partial class PersonalPattern :  IEquatable<PersonalPattern>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PersonalPattern" /> class.
        /// </summary>
        /// <param name="duty">duty.</param>
        /// <param name="unavailability">unavailability.</param>
        public PersonalPattern(List<PersonalPatternDuty> duty = default(List<PersonalPatternDuty>), List<PersonalPatternUnavailability> unavailability = default(List<PersonalPatternUnavailability>))
        {
            this.Duty = duty;
            this.Unavailability = unavailability;
        }
        
        /// <summary>
        /// Gets or Sets Duty
        /// </summary>
        [DataMember(Name="duty", EmitDefaultValue=false)]
        public List<PersonalPatternDuty> Duty { get; set; }

        /// <summary>
        /// Gets or Sets Unavailability
        /// </summary>
        [DataMember(Name="unavailability", EmitDefaultValue=false)]
        public List<PersonalPatternUnavailability> Unavailability { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PersonalPattern {\n");
            sb.Append("  Duty: ").Append(Duty).Append("\n");
            sb.Append("  Unavailability: ").Append(Unavailability).Append("\n");
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
            return this.Equals(input as PersonalPattern);
        }

        /// <summary>
        /// Returns true if PersonalPattern instances are equal
        /// </summary>
        /// <param name="input">Instance of PersonalPattern to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PersonalPattern input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Duty == input.Duty ||
                    this.Duty != null &&
                    input.Duty != null &&
                    this.Duty.SequenceEqual(input.Duty)
                ) && 
                (
                    this.Unavailability == input.Unavailability ||
                    this.Unavailability != null &&
                    input.Unavailability != null &&
                    this.Unavailability.SequenceEqual(input.Unavailability)
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
                if (this.Duty != null)
                    hashCode = hashCode * 59 + this.Duty.GetHashCode();
                if (this.Unavailability != null)
                    hashCode = hashCode * 59 + this.Unavailability.GetHashCode();
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
