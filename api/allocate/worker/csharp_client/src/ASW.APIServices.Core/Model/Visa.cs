/* 
 * Worker API and Events
 *
 *      ## API and events for providing workers. 
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
    /// Visa
    /// </summary>
    [DataContract]
    public partial class Visa :  IEquatable<Visa>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Visa" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Visa() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Visa" /> class.
        /// </summary>
        /// <param name="number">number.</param>
        /// <param name="country">country.</param>
        /// <param name="issuingOffice">issuingOffice.</param>
        /// <param name="type">type.</param>
        /// <param name="entries">entries.</param>
        /// <param name="validity">validity (required).</param>
        public Visa(string number = default(string), string country = default(string), string issuingOffice = default(string), string type = default(string), string entries = default(string), DateSpan validity = default(DateSpan))
        {
            // to ensure "validity" is required (not null)
            if (validity == null)
            {
                throw new InvalidDataException("validity is a required property for Visa and cannot be null");
            }
            else
            {
                this.Validity = validity;
            }
            
            this.Number = number;
            this.Country = country;
            this.IssuingOffice = issuingOffice;
            this.Type = type;
            this.Entries = entries;
        }
        
        /// <summary>
        /// Gets or Sets Number
        /// </summary>
        [DataMember(Name="number", EmitDefaultValue=false)]
        public string Number { get; set; }

        /// <summary>
        /// Gets or Sets Country
        /// </summary>
        [DataMember(Name="country", EmitDefaultValue=false)]
        public string Country { get; set; }

        /// <summary>
        /// Gets or Sets IssuingOffice
        /// </summary>
        [DataMember(Name="issuingOffice", EmitDefaultValue=false)]
        public string IssuingOffice { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Entries
        /// </summary>
        [DataMember(Name="entries", EmitDefaultValue=false)]
        public string Entries { get; set; }

        /// <summary>
        /// Gets or Sets Validity
        /// </summary>
        [DataMember(Name="validity", EmitDefaultValue=false)]
        public DateSpan Validity { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Visa {\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  IssuingOffice: ").Append(IssuingOffice).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Entries: ").Append(Entries).Append("\n");
            sb.Append("  Validity: ").Append(Validity).Append("\n");
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
            return this.Equals(input as Visa);
        }

        /// <summary>
        /// Returns true if Visa instances are equal
        /// </summary>
        /// <param name="input">Instance of Visa to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Visa input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Number == input.Number ||
                    (this.Number != null &&
                    this.Number.Equals(input.Number))
                ) && 
                (
                    this.Country == input.Country ||
                    (this.Country != null &&
                    this.Country.Equals(input.Country))
                ) && 
                (
                    this.IssuingOffice == input.IssuingOffice ||
                    (this.IssuingOffice != null &&
                    this.IssuingOffice.Equals(input.IssuingOffice))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Entries == input.Entries ||
                    (this.Entries != null &&
                    this.Entries.Equals(input.Entries))
                ) && 
                (
                    this.Validity == input.Validity ||
                    (this.Validity != null &&
                    this.Validity.Equals(input.Validity))
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
                if (this.Number != null)
                    hashCode = hashCode * 59 + this.Number.GetHashCode();
                if (this.Country != null)
                    hashCode = hashCode * 59 + this.Country.GetHashCode();
                if (this.IssuingOffice != null)
                    hashCode = hashCode * 59 + this.IssuingOffice.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Entries != null)
                    hashCode = hashCode * 59 + this.Entries.GetHashCode();
                if (this.Validity != null)
                    hashCode = hashCode * 59 + this.Validity.GetHashCode();
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
