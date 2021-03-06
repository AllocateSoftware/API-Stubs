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
    /// WorkingRestriction
    /// </summary>
    [DataContract]
    public partial class WorkingRestriction :  IEquatable<WorkingRestriction>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WorkingRestriction" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected WorkingRestriction() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="WorkingRestriction" /> class.
        /// </summary>
        /// <param name="title">title (required).</param>
        /// <param name="validity">validity (required).</param>
        /// <param name="hoursOfWork">hoursOfWork (required).</param>
        /// <param name="defaultLeaveHours">defaultLeaveHours (required).</param>
        /// <param name="restrictions">restrictions (required).</param>
        public WorkingRestriction(string title = default(string), DateSpan validity = default(DateSpan), WorkingRestrictionHoursOfWork hoursOfWork = default(WorkingRestrictionHoursOfWork), WorkingRestrictionDefaultLeaveHours defaultLeaveHours = default(WorkingRestrictionDefaultLeaveHours), WorkingRestrictionRestrictions restrictions = default(WorkingRestrictionRestrictions))
        {
            // to ensure "title" is required (not null)
            if (title == null)
            {
                throw new InvalidDataException("title is a required property for WorkingRestriction and cannot be null");
            }
            else
            {
                this.Title = title;
            }
            
            // to ensure "validity" is required (not null)
            if (validity == null)
            {
                throw new InvalidDataException("validity is a required property for WorkingRestriction and cannot be null");
            }
            else
            {
                this.Validity = validity;
            }
            
            // to ensure "hoursOfWork" is required (not null)
            if (hoursOfWork == null)
            {
                throw new InvalidDataException("hoursOfWork is a required property for WorkingRestriction and cannot be null");
            }
            else
            {
                this.HoursOfWork = hoursOfWork;
            }
            
            // to ensure "defaultLeaveHours" is required (not null)
            if (defaultLeaveHours == null)
            {
                throw new InvalidDataException("defaultLeaveHours is a required property for WorkingRestriction and cannot be null");
            }
            else
            {
                this.DefaultLeaveHours = defaultLeaveHours;
            }
            
            // to ensure "restrictions" is required (not null)
            if (restrictions == null)
            {
                throw new InvalidDataException("restrictions is a required property for WorkingRestriction and cannot be null");
            }
            else
            {
                this.Restrictions = restrictions;
            }
            
        }
        
        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Validity
        /// </summary>
        [DataMember(Name="validity", EmitDefaultValue=false)]
        public DateSpan Validity { get; set; }

        /// <summary>
        /// Gets or Sets HoursOfWork
        /// </summary>
        [DataMember(Name="hoursOfWork", EmitDefaultValue=false)]
        public WorkingRestrictionHoursOfWork HoursOfWork { get; set; }

        /// <summary>
        /// Gets or Sets DefaultLeaveHours
        /// </summary>
        [DataMember(Name="defaultLeaveHours", EmitDefaultValue=false)]
        public WorkingRestrictionDefaultLeaveHours DefaultLeaveHours { get; set; }

        /// <summary>
        /// Gets or Sets Restrictions
        /// </summary>
        [DataMember(Name="restrictions", EmitDefaultValue=false)]
        public WorkingRestrictionRestrictions Restrictions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkingRestriction {\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Validity: ").Append(Validity).Append("\n");
            sb.Append("  HoursOfWork: ").Append(HoursOfWork).Append("\n");
            sb.Append("  DefaultLeaveHours: ").Append(DefaultLeaveHours).Append("\n");
            sb.Append("  Restrictions: ").Append(Restrictions).Append("\n");
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
            return this.Equals(input as WorkingRestriction);
        }

        /// <summary>
        /// Returns true if WorkingRestriction instances are equal
        /// </summary>
        /// <param name="input">Instance of WorkingRestriction to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkingRestriction input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Validity == input.Validity ||
                    (this.Validity != null &&
                    this.Validity.Equals(input.Validity))
                ) && 
                (
                    this.HoursOfWork == input.HoursOfWork ||
                    (this.HoursOfWork != null &&
                    this.HoursOfWork.Equals(input.HoursOfWork))
                ) && 
                (
                    this.DefaultLeaveHours == input.DefaultLeaveHours ||
                    (this.DefaultLeaveHours != null &&
                    this.DefaultLeaveHours.Equals(input.DefaultLeaveHours))
                ) && 
                (
                    this.Restrictions == input.Restrictions ||
                    (this.Restrictions != null &&
                    this.Restrictions.Equals(input.Restrictions))
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
                if (this.Title != null)
                    hashCode = hashCode * 59 + this.Title.GetHashCode();
                if (this.Validity != null)
                    hashCode = hashCode * 59 + this.Validity.GetHashCode();
                if (this.HoursOfWork != null)
                    hashCode = hashCode * 59 + this.HoursOfWork.GetHashCode();
                if (this.DefaultLeaveHours != null)
                    hashCode = hashCode * 59 + this.DefaultLeaveHours.GetHashCode();
                if (this.Restrictions != null)
                    hashCode = hashCode * 59 + this.Restrictions.GetHashCode();
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
