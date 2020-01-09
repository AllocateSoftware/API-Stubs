/*
 * Duties and Events
 *
 * ## Duties and Events 
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
    public partial class DutyAssignmentRedeploymentEvent : Event, IEquatable<DutyAssignmentRedeploymentEvent>
    { 
        /// <summary>
        /// Gets or Sets AssignmentNumber
        /// </summary>
        [DataMember(Name="assignmentNumber", EmitDefaultValue=false)]
        public string AssignmentNumber { get; set; }

        /// <summary>
        /// Gets or Sets OriginalDuty
        /// </summary>
        [DataMember(Name="originalDuty", EmitDefaultValue=false)]
        public Duty OriginalDuty { get; set; }

        /// <summary>
        /// Gets or Sets NewDuty
        /// </summary>
        [DataMember(Name="newDuty", EmitDefaultValue=false)]
        public Duty NewDuty { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DutyAssignmentRedeploymentEvent {\n");
            sb.Append("  AssignmentNumber: ").Append(AssignmentNumber).Append("\n");
            sb.Append("  OriginalDuty: ").Append(OriginalDuty).Append("\n");
            sb.Append("  NewDuty: ").Append(NewDuty).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public new string ToJson()
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
            return obj.GetType() == GetType() && Equals((DutyAssignmentRedeploymentEvent)obj);
        }

        /// <summary>
        /// Returns true if DutyAssignmentRedeploymentEvent instances are equal
        /// </summary>
        /// <param name="other">Instance of DutyAssignmentRedeploymentEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DutyAssignmentRedeploymentEvent other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AssignmentNumber == other.AssignmentNumber ||
                    AssignmentNumber != null &&
                    AssignmentNumber.Equals(other.AssignmentNumber)
                ) && 
                (
                    OriginalDuty == other.OriginalDuty ||
                    OriginalDuty != null &&
                    OriginalDuty.Equals(other.OriginalDuty)
                ) && 
                (
                    NewDuty == other.NewDuty ||
                    NewDuty != null &&
                    NewDuty.Equals(other.NewDuty)
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
                    if (AssignmentNumber != null)
                    hashCode = hashCode * 59 + AssignmentNumber.GetHashCode();
                    if (OriginalDuty != null)
                    hashCode = hashCode * 59 + OriginalDuty.GetHashCode();
                    if (NewDuty != null)
                    hashCode = hashCode * 59 + NewDuty.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DutyAssignmentRedeploymentEvent left, DutyAssignmentRedeploymentEvent right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DutyAssignmentRedeploymentEvent left, DutyAssignmentRedeploymentEvent right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
