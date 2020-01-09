/* 
 * VMS API
 *
 * ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 
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
using OpenAPIDateConverter = ASW.APIServices.VMS.Client.OpenAPIDateConverter;

namespace ASW.APIServices.VMS.Model
{
    /// <summary>
    /// DutyRequest
    /// </summary>
    [DataContract]
    public partial class DutyRequest :  IEquatable<DutyRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DutyRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DutyRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DutyRequest" /> class.
        /// </summary>
        /// <param name="workerId">Where the caller wishes to direct-book a particular worker into the duty, their identifier is specified here..</param>
        /// <param name="duty">duty (required).</param>
        public DutyRequest(string workerId = default(string), Duty duty = default(Duty))
        {
            // to ensure "duty" is required (not null)
            if (duty == null)
            {
                throw new InvalidDataException("duty is a required property for DutyRequest and cannot be null");
            }
            else
            {
                this.Duty = duty;
            }
            
            this.WorkerId = workerId;
        }
        
        /// <summary>
        /// Where the caller wishes to direct-book a particular worker into the duty, their identifier is specified here.
        /// </summary>
        /// <value>Where the caller wishes to direct-book a particular worker into the duty, their identifier is specified here.</value>
        [DataMember(Name="workerId", EmitDefaultValue=false)]
        public string WorkerId { get; set; }

        /// <summary>
        /// Gets or Sets Duty
        /// </summary>
        [DataMember(Name="duty", EmitDefaultValue=false)]
        public Duty Duty { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DutyRequest {\n");
            sb.Append("  WorkerId: ").Append(WorkerId).Append("\n");
            sb.Append("  Duty: ").Append(Duty).Append("\n");
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
            return this.Equals(input as DutyRequest);
        }

        /// <summary>
        /// Returns true if DutyRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of DutyRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DutyRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.WorkerId == input.WorkerId ||
                    (this.WorkerId != null &&
                    this.WorkerId.Equals(input.WorkerId))
                ) && 
                (
                    this.Duty == input.Duty ||
                    (this.Duty != null &&
                    this.Duty.Equals(input.Duty))
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
                if (this.WorkerId != null)
                    hashCode = hashCode * 59 + this.WorkerId.GetHashCode();
                if (this.Duty != null)
                    hashCode = hashCode * 59 + this.Duty.GetHashCode();
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