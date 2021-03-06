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
    public partial class WorkingRestrictionDefaultLeaveHours : IEquatable<WorkingRestrictionDefaultLeaveHours>
    { 
        /// <summary>
        /// Gets or Sets UseWorkingDay
        /// </summary>
        [DataMember(Name="useWorkingDay", EmitDefaultValue=false)]
        public string UseWorkingDay { get; set; }

        /// <summary>
        /// Gets or Sets MondayTime
        /// </summary>
        [DataMember(Name="mondayTime", EmitDefaultValue=false)]
        public string MondayTime { get; set; }

        /// <summary>
        /// Gets or Sets TuesdayTime
        /// </summary>
        [DataMember(Name="tuesdayTime", EmitDefaultValue=false)]
        public string TuesdayTime { get; set; }

        /// <summary>
        /// Gets or Sets WednesdayTime
        /// </summary>
        [DataMember(Name="wednesdayTime", EmitDefaultValue=false)]
        public string WednesdayTime { get; set; }

        /// <summary>
        /// Gets or Sets FridayTime
        /// </summary>
        [DataMember(Name="fridayTime", EmitDefaultValue=false)]
        public string FridayTime { get; set; }

        /// <summary>
        /// Gets or Sets SaturdayTime
        /// </summary>
        [DataMember(Name="saturdayTime", EmitDefaultValue=false)]
        public string SaturdayTime { get; set; }

        /// <summary>
        /// Gets or Sets SundayTime
        /// </summary>
        [DataMember(Name="sundayTime", EmitDefaultValue=false)]
        public string SundayTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkingRestrictionDefaultLeaveHours {\n");
            sb.Append("  UseWorkingDay: ").Append(UseWorkingDay).Append("\n");
            sb.Append("  MondayTime: ").Append(MondayTime).Append("\n");
            sb.Append("  TuesdayTime: ").Append(TuesdayTime).Append("\n");
            sb.Append("  WednesdayTime: ").Append(WednesdayTime).Append("\n");
            sb.Append("  FridayTime: ").Append(FridayTime).Append("\n");
            sb.Append("  SaturdayTime: ").Append(SaturdayTime).Append("\n");
            sb.Append("  SundayTime: ").Append(SundayTime).Append("\n");
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
            return obj.GetType() == GetType() && Equals((WorkingRestrictionDefaultLeaveHours)obj);
        }

        /// <summary>
        /// Returns true if WorkingRestrictionDefaultLeaveHours instances are equal
        /// </summary>
        /// <param name="other">Instance of WorkingRestrictionDefaultLeaveHours to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkingRestrictionDefaultLeaveHours other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    UseWorkingDay == other.UseWorkingDay ||
                    UseWorkingDay != null &&
                    UseWorkingDay.Equals(other.UseWorkingDay)
                ) && 
                (
                    MondayTime == other.MondayTime ||
                    MondayTime != null &&
                    MondayTime.Equals(other.MondayTime)
                ) && 
                (
                    TuesdayTime == other.TuesdayTime ||
                    TuesdayTime != null &&
                    TuesdayTime.Equals(other.TuesdayTime)
                ) && 
                (
                    WednesdayTime == other.WednesdayTime ||
                    WednesdayTime != null &&
                    WednesdayTime.Equals(other.WednesdayTime)
                ) && 
                (
                    FridayTime == other.FridayTime ||
                    FridayTime != null &&
                    FridayTime.Equals(other.FridayTime)
                ) && 
                (
                    SaturdayTime == other.SaturdayTime ||
                    SaturdayTime != null &&
                    SaturdayTime.Equals(other.SaturdayTime)
                ) && 
                (
                    SundayTime == other.SundayTime ||
                    SundayTime != null &&
                    SundayTime.Equals(other.SundayTime)
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
                    if (UseWorkingDay != null)
                    hashCode = hashCode * 59 + UseWorkingDay.GetHashCode();
                    if (MondayTime != null)
                    hashCode = hashCode * 59 + MondayTime.GetHashCode();
                    if (TuesdayTime != null)
                    hashCode = hashCode * 59 + TuesdayTime.GetHashCode();
                    if (WednesdayTime != null)
                    hashCode = hashCode * 59 + WednesdayTime.GetHashCode();
                    if (FridayTime != null)
                    hashCode = hashCode * 59 + FridayTime.GetHashCode();
                    if (SaturdayTime != null)
                    hashCode = hashCode * 59 + SaturdayTime.GetHashCode();
                    if (SundayTime != null)
                    hashCode = hashCode * 59 + SundayTime.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WorkingRestrictionDefaultLeaveHours left, WorkingRestrictionDefaultLeaveHours right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WorkingRestrictionDefaultLeaveHours left, WorkingRestrictionDefaultLeaveHours right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
