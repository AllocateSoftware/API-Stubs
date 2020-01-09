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
    /// PersonalPatternDuty
    /// </summary>
    [DataContract]
    public partial class PersonalPatternDuty :  IEquatable<PersonalPatternDuty>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PersonalPatternDuty" /> class.
        /// </summary>
        /// <param name="shiftGroup">shiftGroup.</param>
        /// <param name="shift">shift.</param>
        /// <param name="rosterLocation">rosterLocation.</param>
        /// <param name="team">team.</param>
        /// <param name="activityCategory">activityCategory.</param>
        /// <param name="activityBenchmark">activityBenchmark.</param>
        /// <param name="activityType">activityType.</param>
        /// <param name="activityProfile">activityProfile.</param>
        /// <param name="work">work.</param>
        /// <param name="start">start.</param>
        /// <param name="end">end.</param>
        /// <param name="monthlyReccurrance">monthlyReccurrance.</param>
        public PersonalPatternDuty(string shiftGroup = default(string), string shift = default(string), string rosterLocation = default(string), string team = default(string), string activityCategory = default(string), string activityBenchmark = default(string), string activityType = default(string), string activityProfile = default(string), string work = default(string), string start = default(string), string end = default(string), bool monthlyReccurrance = default(bool))
        {
            this.ShiftGroup = shiftGroup;
            this.Shift = shift;
            this.RosterLocation = rosterLocation;
            this.Team = team;
            this.ActivityCategory = activityCategory;
            this.ActivityBenchmark = activityBenchmark;
            this.ActivityType = activityType;
            this.ActivityProfile = activityProfile;
            this.Work = work;
            this.Start = start;
            this.End = end;
            this.MonthlyReccurrance = monthlyReccurrance;
        }
        
        /// <summary>
        /// Gets or Sets ShiftGroup
        /// </summary>
        [DataMember(Name="shiftGroup", EmitDefaultValue=false)]
        public string ShiftGroup { get; set; }

        /// <summary>
        /// Gets or Sets Shift
        /// </summary>
        [DataMember(Name="shift", EmitDefaultValue=false)]
        public string Shift { get; set; }

        /// <summary>
        /// Gets or Sets RosterLocation
        /// </summary>
        [DataMember(Name="rosterLocation", EmitDefaultValue=false)]
        public string RosterLocation { get; set; }

        /// <summary>
        /// Gets or Sets Team
        /// </summary>
        [DataMember(Name="team", EmitDefaultValue=false)]
        public string Team { get; set; }

        /// <summary>
        /// Gets or Sets ActivityCategory
        /// </summary>
        [DataMember(Name="activityCategory", EmitDefaultValue=false)]
        public string ActivityCategory { get; set; }

        /// <summary>
        /// Gets or Sets ActivityBenchmark
        /// </summary>
        [DataMember(Name="activityBenchmark", EmitDefaultValue=false)]
        public string ActivityBenchmark { get; set; }

        /// <summary>
        /// Gets or Sets ActivityType
        /// </summary>
        [DataMember(Name="activityType", EmitDefaultValue=false)]
        public string ActivityType { get; set; }

        /// <summary>
        /// Gets or Sets ActivityProfile
        /// </summary>
        [DataMember(Name="activityProfile", EmitDefaultValue=false)]
        public string ActivityProfile { get; set; }

        /// <summary>
        /// Gets or Sets Work
        /// </summary>
        [DataMember(Name="work", EmitDefaultValue=false)]
        public string Work { get; set; }

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
        /// Gets or Sets MonthlyReccurrance
        /// </summary>
        [DataMember(Name="monthlyReccurrance", EmitDefaultValue=false)]
        public bool MonthlyReccurrance { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PersonalPatternDuty {\n");
            sb.Append("  ShiftGroup: ").Append(ShiftGroup).Append("\n");
            sb.Append("  Shift: ").Append(Shift).Append("\n");
            sb.Append("  RosterLocation: ").Append(RosterLocation).Append("\n");
            sb.Append("  Team: ").Append(Team).Append("\n");
            sb.Append("  ActivityCategory: ").Append(ActivityCategory).Append("\n");
            sb.Append("  ActivityBenchmark: ").Append(ActivityBenchmark).Append("\n");
            sb.Append("  ActivityType: ").Append(ActivityType).Append("\n");
            sb.Append("  ActivityProfile: ").Append(ActivityProfile).Append("\n");
            sb.Append("  Work: ").Append(Work).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
            sb.Append("  MonthlyReccurrance: ").Append(MonthlyReccurrance).Append("\n");
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
            return this.Equals(input as PersonalPatternDuty);
        }

        /// <summary>
        /// Returns true if PersonalPatternDuty instances are equal
        /// </summary>
        /// <param name="input">Instance of PersonalPatternDuty to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PersonalPatternDuty input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ShiftGroup == input.ShiftGroup ||
                    (this.ShiftGroup != null &&
                    this.ShiftGroup.Equals(input.ShiftGroup))
                ) && 
                (
                    this.Shift == input.Shift ||
                    (this.Shift != null &&
                    this.Shift.Equals(input.Shift))
                ) && 
                (
                    this.RosterLocation == input.RosterLocation ||
                    (this.RosterLocation != null &&
                    this.RosterLocation.Equals(input.RosterLocation))
                ) && 
                (
                    this.Team == input.Team ||
                    (this.Team != null &&
                    this.Team.Equals(input.Team))
                ) && 
                (
                    this.ActivityCategory == input.ActivityCategory ||
                    (this.ActivityCategory != null &&
                    this.ActivityCategory.Equals(input.ActivityCategory))
                ) && 
                (
                    this.ActivityBenchmark == input.ActivityBenchmark ||
                    (this.ActivityBenchmark != null &&
                    this.ActivityBenchmark.Equals(input.ActivityBenchmark))
                ) && 
                (
                    this.ActivityType == input.ActivityType ||
                    (this.ActivityType != null &&
                    this.ActivityType.Equals(input.ActivityType))
                ) && 
                (
                    this.ActivityProfile == input.ActivityProfile ||
                    (this.ActivityProfile != null &&
                    this.ActivityProfile.Equals(input.ActivityProfile))
                ) && 
                (
                    this.Work == input.Work ||
                    (this.Work != null &&
                    this.Work.Equals(input.Work))
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
                    this.MonthlyReccurrance == input.MonthlyReccurrance ||
                    (this.MonthlyReccurrance != null &&
                    this.MonthlyReccurrance.Equals(input.MonthlyReccurrance))
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
                if (this.ShiftGroup != null)
                    hashCode = hashCode * 59 + this.ShiftGroup.GetHashCode();
                if (this.Shift != null)
                    hashCode = hashCode * 59 + this.Shift.GetHashCode();
                if (this.RosterLocation != null)
                    hashCode = hashCode * 59 + this.RosterLocation.GetHashCode();
                if (this.Team != null)
                    hashCode = hashCode * 59 + this.Team.GetHashCode();
                if (this.ActivityCategory != null)
                    hashCode = hashCode * 59 + this.ActivityCategory.GetHashCode();
                if (this.ActivityBenchmark != null)
                    hashCode = hashCode * 59 + this.ActivityBenchmark.GetHashCode();
                if (this.ActivityType != null)
                    hashCode = hashCode * 59 + this.ActivityType.GetHashCode();
                if (this.ActivityProfile != null)
                    hashCode = hashCode * 59 + this.ActivityProfile.GetHashCode();
                if (this.Work != null)
                    hashCode = hashCode * 59 + this.Work.GetHashCode();
                if (this.Start != null)
                    hashCode = hashCode * 59 + this.Start.GetHashCode();
                if (this.End != null)
                    hashCode = hashCode * 59 + this.End.GetHashCode();
                if (this.MonthlyReccurrance != null)
                    hashCode = hashCode * 59 + this.MonthlyReccurrance.GetHashCode();
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
