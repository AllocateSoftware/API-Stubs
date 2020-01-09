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
    /// The time and duration of this vacancy
    /// </summary>
    [DataContract]
    public partial class VacancyWhen :  IEquatable<VacancyWhen>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VacancyWhen" /> class.
        /// </summary>
        /// <param name="planned">planned.</param>
        public VacancyWhen(DateSpan planned = default(DateSpan))
        {
            this.Planned = planned;
        }
        
        /// <summary>
        /// Gets or Sets Planned
        /// </summary>
        [DataMember(Name="planned", EmitDefaultValue=false)]
        public DateSpan Planned { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VacancyWhen {\n");
            sb.Append("  Planned: ").Append(Planned).Append("\n");
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
            return this.Equals(input as VacancyWhen);
        }

        /// <summary>
        /// Returns true if VacancyWhen instances are equal
        /// </summary>
        /// <param name="input">Instance of VacancyWhen to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VacancyWhen input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Planned == input.Planned ||
                    (this.Planned != null &&
                    this.Planned.Equals(input.Planned))
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
                if (this.Planned != null)
                    hashCode = hashCode * 59 + this.Planned.GetHashCode();
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
