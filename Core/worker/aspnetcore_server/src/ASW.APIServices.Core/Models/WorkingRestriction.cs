/*
 * Workers
 *
 * ## Workers and events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using ASW.APIServices.Core.Converters;

namespace ASW.APIServices.Core.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class WorkingRestriction : IEquatable<WorkingRestriction>
    { 
        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [Required]
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Validity
        /// </summary>
        [Required]
        [DataMember(Name="validity", EmitDefaultValue=false)]
        public DateSpan Validity { get; set; }

        /// <summary>
        /// Gets or Sets HoursOfWork
        /// </summary>
        [Required]
        [DataMember(Name="hoursOfWork", EmitDefaultValue=false)]
        public WorkingRestrictionHoursOfWork HoursOfWork { get; set; }

        /// <summary>
        /// Gets or Sets DefaultLeaveHours
        /// </summary>
        [Required]
        [DataMember(Name="defaultLeaveHours", EmitDefaultValue=false)]
        public WorkingRestrictionDefaultLeaveHours DefaultLeaveHours { get; set; }

        /// <summary>
        /// Gets or Sets Restrictions
        /// </summary>
        [Required]
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
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((WorkingRestriction)obj);
        }

        /// <summary>
        /// Returns true if WorkingRestriction instances are equal
        /// </summary>
        /// <param name="other">Instance of WorkingRestriction to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkingRestriction other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
                ) && 
                (
                    Validity == other.Validity ||
                    Validity != null &&
                    Validity.Equals(other.Validity)
                ) && 
                (
                    HoursOfWork == other.HoursOfWork ||
                    HoursOfWork != null &&
                    HoursOfWork.Equals(other.HoursOfWork)
                ) && 
                (
                    DefaultLeaveHours == other.DefaultLeaveHours ||
                    DefaultLeaveHours != null &&
                    DefaultLeaveHours.Equals(other.DefaultLeaveHours)
                ) && 
                (
                    Restrictions == other.Restrictions ||
                    Restrictions != null &&
                    Restrictions.Equals(other.Restrictions)
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
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                    if (Validity != null)
                    hashCode = hashCode * 59 + Validity.GetHashCode();
                    if (HoursOfWork != null)
                    hashCode = hashCode * 59 + HoursOfWork.GetHashCode();
                    if (DefaultLeaveHours != null)
                    hashCode = hashCode * 59 + DefaultLeaveHours.GetHashCode();
                    if (Restrictions != null)
                    hashCode = hashCode * 59 + Restrictions.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WorkingRestriction left, WorkingRestriction right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WorkingRestriction left, WorkingRestriction right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
