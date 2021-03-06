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
    /// VacancyWhere
    /// </summary>
    [DataContract]
    public partial class VacancyWhere :  IEquatable<VacancyWhere>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VacancyWhere" /> class.
        /// </summary>
        /// <param name="trustId">trustId.</param>
        /// <param name="location">location.</param>
        public VacancyWhere(string trustId = default(string), VacancyWhereLocation location = default(VacancyWhereLocation))
        {
            this.TrustId = trustId;
            this.Location = location;
        }
        
        /// <summary>
        /// Gets or Sets TrustId
        /// </summary>
        [DataMember(Name="trustId", EmitDefaultValue=false)]
        public string TrustId { get; set; }

        /// <summary>
        /// Gets or Sets Location
        /// </summary>
        [DataMember(Name="location", EmitDefaultValue=false)]
        public VacancyWhereLocation Location { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VacancyWhere {\n");
            sb.Append("  TrustId: ").Append(TrustId).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
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
            return this.Equals(input as VacancyWhere);
        }

        /// <summary>
        /// Returns true if VacancyWhere instances are equal
        /// </summary>
        /// <param name="input">Instance of VacancyWhere to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VacancyWhere input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.TrustId == input.TrustId ||
                    (this.TrustId != null &&
                    this.TrustId.Equals(input.TrustId))
                ) && 
                (
                    this.Location == input.Location ||
                    (this.Location != null &&
                    this.Location.Equals(input.Location))
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
                if (this.TrustId != null)
                    hashCode = hashCode * 59 + this.TrustId.GetHashCode();
                if (this.Location != null)
                    hashCode = hashCode * 59 + this.Location.GetHashCode();
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
