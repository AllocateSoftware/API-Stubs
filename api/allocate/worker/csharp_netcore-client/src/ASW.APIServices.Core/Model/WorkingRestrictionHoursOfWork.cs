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
    /// WorkingRestrictionHoursOfWork
    /// </summary>
    [DataContract]
    public partial class WorkingRestrictionHoursOfWork :  IEquatable<WorkingRestrictionHoursOfWork>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WorkingRestrictionHoursOfWork" /> class.
        /// </summary>
        /// <param name="mon">mon.</param>
        /// <param name="tue">tue.</param>
        /// <param name="wed">wed.</param>
        /// <param name="thu">thu.</param>
        /// <param name="fri">fri.</param>
        /// <param name="sat">sat.</param>
        /// <param name="sun">sun.</param>
        public WorkingRestrictionHoursOfWork(TimeSpan mon = default(TimeSpan), TimeSpan tue = default(TimeSpan), TimeSpan wed = default(TimeSpan), TimeSpan thu = default(TimeSpan), TimeSpan fri = default(TimeSpan), TimeSpan sat = default(TimeSpan), TimeSpan sun = default(TimeSpan))
        {
            this.Mon = mon;
            this.Tue = tue;
            this.Wed = wed;
            this.Thu = thu;
            this.Fri = fri;
            this.Sat = sat;
            this.Sun = sun;
        }
        
        /// <summary>
        /// Gets or Sets Mon
        /// </summary>
        [DataMember(Name="mon", EmitDefaultValue=false)]
        public TimeSpan Mon { get; set; }

        /// <summary>
        /// Gets or Sets Tue
        /// </summary>
        [DataMember(Name="tue", EmitDefaultValue=false)]
        public TimeSpan Tue { get; set; }

        /// <summary>
        /// Gets or Sets Wed
        /// </summary>
        [DataMember(Name="wed", EmitDefaultValue=false)]
        public TimeSpan Wed { get; set; }

        /// <summary>
        /// Gets or Sets Thu
        /// </summary>
        [DataMember(Name="thu", EmitDefaultValue=false)]
        public TimeSpan Thu { get; set; }

        /// <summary>
        /// Gets or Sets Fri
        /// </summary>
        [DataMember(Name="fri", EmitDefaultValue=false)]
        public TimeSpan Fri { get; set; }

        /// <summary>
        /// Gets or Sets Sat
        /// </summary>
        [DataMember(Name="sat", EmitDefaultValue=false)]
        public TimeSpan Sat { get; set; }

        /// <summary>
        /// Gets or Sets Sun
        /// </summary>
        [DataMember(Name="sun", EmitDefaultValue=false)]
        public TimeSpan Sun { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkingRestrictionHoursOfWork {\n");
            sb.Append("  Mon: ").Append(Mon).Append("\n");
            sb.Append("  Tue: ").Append(Tue).Append("\n");
            sb.Append("  Wed: ").Append(Wed).Append("\n");
            sb.Append("  Thu: ").Append(Thu).Append("\n");
            sb.Append("  Fri: ").Append(Fri).Append("\n");
            sb.Append("  Sat: ").Append(Sat).Append("\n");
            sb.Append("  Sun: ").Append(Sun).Append("\n");
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
            return this.Equals(input as WorkingRestrictionHoursOfWork);
        }

        /// <summary>
        /// Returns true if WorkingRestrictionHoursOfWork instances are equal
        /// </summary>
        /// <param name="input">Instance of WorkingRestrictionHoursOfWork to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkingRestrictionHoursOfWork input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Mon == input.Mon ||
                    (this.Mon != null &&
                    this.Mon.Equals(input.Mon))
                ) && 
                (
                    this.Tue == input.Tue ||
                    (this.Tue != null &&
                    this.Tue.Equals(input.Tue))
                ) && 
                (
                    this.Wed == input.Wed ||
                    (this.Wed != null &&
                    this.Wed.Equals(input.Wed))
                ) && 
                (
                    this.Thu == input.Thu ||
                    (this.Thu != null &&
                    this.Thu.Equals(input.Thu))
                ) && 
                (
                    this.Fri == input.Fri ||
                    (this.Fri != null &&
                    this.Fri.Equals(input.Fri))
                ) && 
                (
                    this.Sat == input.Sat ||
                    (this.Sat != null &&
                    this.Sat.Equals(input.Sat))
                ) && 
                (
                    this.Sun == input.Sun ||
                    (this.Sun != null &&
                    this.Sun.Equals(input.Sun))
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
                if (this.Mon != null)
                    hashCode = hashCode * 59 + this.Mon.GetHashCode();
                if (this.Tue != null)
                    hashCode = hashCode * 59 + this.Tue.GetHashCode();
                if (this.Wed != null)
                    hashCode = hashCode * 59 + this.Wed.GetHashCode();
                if (this.Thu != null)
                    hashCode = hashCode * 59 + this.Thu.GetHashCode();
                if (this.Fri != null)
                    hashCode = hashCode * 59 + this.Fri.GetHashCode();
                if (this.Sat != null)
                    hashCode = hashCode * 59 + this.Sat.GetHashCode();
                if (this.Sun != null)
                    hashCode = hashCode * 59 + this.Sun.GetHashCode();
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
