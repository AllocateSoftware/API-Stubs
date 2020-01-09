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
    public partial class DutyTempStaffingNoteDeletedEvent : Event,  IEquatable<DutyTempStaffingNoteDeletedEvent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DutyTempStaffingNoteDeletedEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DutyTempStaffingNoteDeletedEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DutyTempStaffingNoteDeletedEvent" /> class.
        /// </summary>
        /// <param name="dutyId">dutyId.</param>
        /// <param name="noteId">Identifier for the note.</param>
        public DutyTempStaffingNoteDeletedEvent(string dutyId = default(string), string noteId = default(string), string eventType = default(string)) : base(eventType)
        {
            this.DutyId = dutyId;
            this.NoteId = noteId;
        }
        
        /// <summary>
        /// Gets or Sets DutyId
        /// </summary>
        [DataMember(Name="dutyId", EmitDefaultValue=false)]
        public string DutyId { get; set; }

        /// <summary>
        /// Identifier for the note
        /// </summary>
        /// <value>Identifier for the note</value>
        [DataMember(Name="noteId", EmitDefaultValue=false)]
        public string NoteId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DutyTempStaffingNoteDeletedEvent {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  DutyId: ").Append(DutyId).Append("\n");
            sb.Append("  NoteId: ").Append(NoteId).Append("\n");
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
            return this.Equals(input as DutyTempStaffingNoteDeletedEvent);
        }

        /// <summary>
        /// Returns true if DutyTempStaffingNoteDeletedEvent instances are equal
        /// </summary>
        /// <param name="input">Instance of DutyTempStaffingNoteDeletedEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DutyTempStaffingNoteDeletedEvent input)
        {
            if (input == null)
                return false;

            return base.Equals(input) && 
                (
                    this.DutyId == input.DutyId ||
                    (this.DutyId != null &&
                    this.DutyId.Equals(input.DutyId))
                ) && base.Equals(input) && 
                (
                    this.NoteId == input.NoteId ||
                    (this.NoteId != null &&
                    this.NoteId.Equals(input.NoteId))
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
                if (this.DutyId != null)
                    hashCode = hashCode * 59 + this.DutyId.GetHashCode();
                if (this.NoteId != null)
                    hashCode = hashCode * 59 + this.NoteId.GetHashCode();
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