/* 
 * Duties and Events
 *
 * ## Duties and Events 
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
    /// A note previously added to a duty has been deleted.
    /// </summary>
    [DataContract]
    public partial class DutyTempStaffingExpressionOfInterestEvent : Event,  IEquatable<DutyTempStaffingExpressionOfInterestEvent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DutyTempStaffingExpressionOfInterestEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DutyTempStaffingExpressionOfInterestEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DutyTempStaffingExpressionOfInterestEvent" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="dutyId">dutyId.</param>
        /// <param name="workerId">Identifier for the note.</param>
        public DutyTempStaffingExpressionOfInterestEvent(string id = default(string), string dutyId = default(string), string workerId = default(string), string eventType = default(string)) : base(eventType)
        {
            this.Id = id;
            this.DutyId = dutyId;
            this.WorkerId = workerId;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets DutyId
        /// </summary>
        [DataMember(Name="dutyId", EmitDefaultValue=false)]
        public string DutyId { get; set; }

        /// <summary>
        /// Identifier for the note
        /// </summary>
        /// <value>Identifier for the note</value>
        [DataMember(Name="workerId", EmitDefaultValue=false)]
        public string WorkerId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DutyTempStaffingExpressionOfInterestEvent {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  DutyId: ").Append(DutyId).Append("\n");
            sb.Append("  WorkerId: ").Append(WorkerId).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
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
            return this.Equals(input as DutyTempStaffingExpressionOfInterestEvent);
        }

        /// <summary>
        /// Returns true if DutyTempStaffingExpressionOfInterestEvent instances are equal
        /// </summary>
        /// <param name="input">Instance of DutyTempStaffingExpressionOfInterestEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DutyTempStaffingExpressionOfInterestEvent input)
        {
            if (input == null)
                return false;

            return base.Equals(input) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && base.Equals(input) && 
                (
                    this.DutyId == input.DutyId ||
                    (this.DutyId != null &&
                    this.DutyId.Equals(input.DutyId))
                ) && base.Equals(input) && 
                (
                    this.WorkerId == input.WorkerId ||
                    (this.WorkerId != null &&
                    this.WorkerId.Equals(input.WorkerId))
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
                int hashCode = base.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.DutyId != null)
                    hashCode = hashCode * 59 + this.DutyId.GetHashCode();
                if (this.WorkerId != null)
                    hashCode = hashCode * 59 + this.WorkerId.GetHashCode();
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
            foreach(var x in base.BaseValidate(validationContext)) yield return x;
            yield break;
        }
    }

}
