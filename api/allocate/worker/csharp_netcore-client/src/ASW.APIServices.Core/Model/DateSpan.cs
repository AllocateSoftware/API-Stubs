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
    /// DateSpan
    /// </summary>
    [DataContract]
    public partial class DateSpan :  IEquatable<DateSpan>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DateSpan" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DateSpan() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DateSpan" /> class.
        /// </summary>
        /// <param name="from">When the span starts (required).</param>
        /// <param name="to">When the span ends.</param>
        public DateSpan(DateTime from = default(DateTime), DateTime to = default(DateTime))
        {
            // to ensure "from" is required (not null)
            if (from == null)
            {
                throw new InvalidDataException("from is a required property for DateSpan and cannot be null");
            }
            else
            {
                this.From = from;
            }

            this.To = to;
        }
        
        /// <summary>
        /// When the span starts
        /// </summary>
        /// <value>When the span starts</value>
        [DataMember(Name="from", EmitDefaultValue=false)]
        public DateTime From { get; set; }

        /// <summary>
        /// When the span ends
        /// </summary>
        /// <value>When the span ends</value>
        [DataMember(Name="to", EmitDefaultValue=false)]
        public DateTime To { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DateSpan {\n");
            sb.Append("  From: ").Append(From).Append("\n");
            sb.Append("  To: ").Append(To).Append("\n");
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
            return this.Equals(input as DateSpan);
        }

        /// <summary>
        /// Returns true if DateSpan instances are equal
        /// </summary>
        /// <param name="input">Instance of DateSpan to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DateSpan input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.From == input.From ||
                    (this.From != null &&
                    this.From.Equals(input.From))
                ) && 
                (
                    this.To == input.To ||
                    (this.To != null &&
                    this.To.Equals(input.To))
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
                if (this.From != null)
                    hashCode = hashCode * 59 + this.From.GetHashCode();
                if (this.To != null)
                    hashCode = hashCode * 59 + this.To.GetHashCode();
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
