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
    /// AvailabilitiesNoBank
    /// </summary>
    [DataContract]
    public partial class AvailabilitiesNoBank :  IEquatable<AvailabilitiesNoBank>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AvailabilitiesNoBank" /> class.
        /// </summary>
        /// <param name="start">start.</param>
        /// <param name="numberOfOccurances">numberOfOccurances.</param>
        /// <param name="notes">notes.</param>
        public AvailabilitiesNoBank(string start = default(string), decimal numberOfOccurances = default(decimal), string notes = default(string))
        {
            this.Start = start;
            this.NumberOfOccurances = numberOfOccurances;
            this.Notes = notes;
        }
        
        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [DataMember(Name="start", EmitDefaultValue=false)]
        public string Start { get; set; }

        /// <summary>
        /// Gets or Sets NumberOfOccurances
        /// </summary>
        [DataMember(Name="numberOfOccurances", EmitDefaultValue=false)]
        public decimal NumberOfOccurances { get; set; }

        /// <summary>
        /// Gets or Sets Notes
        /// </summary>
        [DataMember(Name="notes", EmitDefaultValue=false)]
        public string Notes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AvailabilitiesNoBank {\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  NumberOfOccurances: ").Append(NumberOfOccurances).Append("\n");
            sb.Append("  Notes: ").Append(Notes).Append("\n");
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
            return this.Equals(input as AvailabilitiesNoBank);
        }

        /// <summary>
        /// Returns true if AvailabilitiesNoBank instances are equal
        /// </summary>
        /// <param name="input">Instance of AvailabilitiesNoBank to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AvailabilitiesNoBank input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.NumberOfOccurances == input.NumberOfOccurances ||
                    this.NumberOfOccurances.Equals(input.NumberOfOccurances)
                ) && 
                (
                    this.Notes == input.Notes ||
                    (this.Notes != null &&
                    this.Notes.Equals(input.Notes))
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
                if (this.Start != null)
                    hashCode = hashCode * 59 + this.Start.GetHashCode();
                hashCode = hashCode * 59 + this.NumberOfOccurances.GetHashCode();
                if (this.Notes != null)
                    hashCode = hashCode * 59 + this.Notes.GetHashCode();
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
