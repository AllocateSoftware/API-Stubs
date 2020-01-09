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
    /// AvailabilitiesAvailability
    /// </summary>
    [DataContract]
    public partial class AvailabilitiesAvailability :  IEquatable<AvailabilitiesAvailability>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AvailabilitiesAvailability" /> class.
        /// </summary>
        /// <param name="date">date.</param>
        /// <param name="availabilityType">availabilityType.</param>
        /// <param name="start">start.</param>
        /// <param name="end">end.</param>
        /// <param name="numberOfOccurrences">numberOfOccurrences.</param>
        /// <param name="notes">notes.</param>
        public AvailabilitiesAvailability(DateTime date = default(DateTime), string availabilityType = default(string), string start = default(string), string end = default(string), decimal numberOfOccurrences = default(decimal), string notes = default(string))
        {
            this.Date = date;
            this.AvailabilityType = availabilityType;
            this.Start = start;
            this.End = end;
            this.NumberOfOccurrences = numberOfOccurrences;
            this.Notes = notes;
        }
        
        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name="date", EmitDefaultValue=false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// Gets or Sets AvailabilityType
        /// </summary>
        [DataMember(Name="availabilityType", EmitDefaultValue=false)]
        public string AvailabilityType { get; set; }

        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [DataMember(Name="start", EmitDefaultValue=false)]
        public string Start { get; set; }

        /// <summary>
        /// Gets or Sets End
        /// </summary>
        [DataMember(Name="end", EmitDefaultValue=false)]
        public string End { get; set; }

        /// <summary>
        /// Gets or Sets NumberOfOccurrences
        /// </summary>
        [DataMember(Name="numberOfOccurrences", EmitDefaultValue=false)]
        public decimal NumberOfOccurrences { get; set; }

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
            sb.Append("class AvailabilitiesAvailability {\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  AvailabilityType: ").Append(AvailabilityType).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
            sb.Append("  NumberOfOccurrences: ").Append(NumberOfOccurrences).Append("\n");
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
            return this.Equals(input as AvailabilitiesAvailability);
        }

        /// <summary>
        /// Returns true if AvailabilitiesAvailability instances are equal
        /// </summary>
        /// <param name="input">Instance of AvailabilitiesAvailability to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AvailabilitiesAvailability input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.AvailabilityType == input.AvailabilityType ||
                    (this.AvailabilityType != null &&
                    this.AvailabilityType.Equals(input.AvailabilityType))
                ) && 
                (
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.End == input.End ||
                    (this.End != null &&
                    this.End.Equals(input.End))
                ) && 
                (
                    this.NumberOfOccurrences == input.NumberOfOccurrences ||
                    this.NumberOfOccurrences.Equals(input.NumberOfOccurrences)
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
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.AvailabilityType != null)
                    hashCode = hashCode * 59 + this.AvailabilityType.GetHashCode();
                if (this.Start != null)
                    hashCode = hashCode * 59 + this.Start.GetHashCode();
                if (this.End != null)
                    hashCode = hashCode * 59 + this.End.GetHashCode();
                hashCode = hashCode * 59 + this.NumberOfOccurrences.GetHashCode();
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
