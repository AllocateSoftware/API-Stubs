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
    /// Duty
    /// </summary>
    [DataContract]
    public partial class Duty :  IEquatable<Duty>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Duty" /> class.
        /// </summary>
        /// <param name="id">Identifier for this duty.</param>
        /// <param name="when">when.</param>
        /// <param name="where">where.</param>
        /// <param name="reason">reason for requestBody.</param>
        /// <param name="requirements">requirements.</param>
        public Duty(string id = default(string), DutyWhen when = default(DutyWhen), DutyWhere where = default(DutyWhere), string reason = default(string), DutyRequirements requirements = default(DutyRequirements))
        {
            this.Id = id;
            this.When = when;
            this.Where = where;
            this.Reason = reason;
            this.Requirements = requirements;
        }
        
        /// <summary>
        /// Identifier for this duty
        /// </summary>
        /// <value>Identifier for this duty</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets When
        /// </summary>
        [DataMember(Name="when", EmitDefaultValue=false)]
        public DutyWhen When { get; set; }

        /// <summary>
        /// Gets or Sets Where
        /// </summary>
        [DataMember(Name="where", EmitDefaultValue=false)]
        public DutyWhere Where { get; set; }

        /// <summary>
        /// reason for requestBody
        /// </summary>
        /// <value>reason for requestBody</value>
        [DataMember(Name="reason", EmitDefaultValue=false)]
        public string Reason { get; set; }

        /// <summary>
        /// Gets or Sets Requirements
        /// </summary>
        [DataMember(Name="requirements", EmitDefaultValue=false)]
        public DutyRequirements Requirements { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Duty {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  When: ").Append(When).Append("\n");
            sb.Append("  Where: ").Append(Where).Append("\n");
            sb.Append("  Reason: ").Append(Reason).Append("\n");
            sb.Append("  Requirements: ").Append(Requirements).Append("\n");
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
            return this.Equals(input as Duty);
        }

        /// <summary>
        /// Returns true if Duty instances are equal
        /// </summary>
        /// <param name="input">Instance of Duty to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Duty input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.When == input.When ||
                    (this.When != null &&
                    this.When.Equals(input.When))
                ) && 
                (
                    this.Where == input.Where ||
                    (this.Where != null &&
                    this.Where.Equals(input.Where))
                ) && 
                (
                    this.Reason == input.Reason ||
                    (this.Reason != null &&
                    this.Reason.Equals(input.Reason))
                ) && 
                (
                    this.Requirements == input.Requirements ||
                    (this.Requirements != null &&
                    this.Requirements.Equals(input.Requirements))
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
                if (this.When != null)
                    hashCode = hashCode * 59 + this.When.GetHashCode();
                if (this.Where != null)
                    hashCode = hashCode * 59 + this.Where.GetHashCode();
                if (this.Reason != null)
                    hashCode = hashCode * 59 + this.Reason.GetHashCode();
                if (this.Requirements != null)
                    hashCode = hashCode * 59 + this.Requirements.GetHashCode();
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