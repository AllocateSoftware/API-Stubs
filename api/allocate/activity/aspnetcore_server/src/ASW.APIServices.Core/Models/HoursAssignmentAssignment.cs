/*
 * Activity API
 *
 *      ## API for querying worker activity.      This is an early availabilty API, and is subject to change. 
 *
 * The version of the OpenAPI document: 0.0.1
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
    public partial class HoursAssignmentAssignment : IEquatable<HoursAssignmentAssignment>
    { 
        /// <summary>
        /// How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest 
        /// </summary>
        /// <value>How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest </value>
        [TypeConverter(typeof(CustomEnumConverter<MethodEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum MethodEnum
        {
            
            /// <summary>
            /// Enum UnspecifiedEnum for unspecified
            /// </summary>
            [EnumMember(Value = "unspecified")]
            UnspecifiedEnum = 1,
            
            /// <summary>
            /// Enum AutorosterEnum for autoroster
            /// </summary>
            [EnumMember(Value = "autoroster")]
            AutorosterEnum = 2,
            
            /// <summary>
            /// Enum ManualManagerAssignmentEnum for manualManagerAssignment
            /// </summary>
            [EnumMember(Value = "manualManagerAssignment")]
            ManualManagerAssignmentEnum = 3,
            
            /// <summary>
            /// Enum EmployeeWebTimesheetEnum for employeeWebTimesheet
            /// </summary>
            [EnumMember(Value = "employeeWebTimesheet")]
            EmployeeWebTimesheetEnum = 4,
            
            /// <summary>
            /// Enum ExternalAssignmentEnum for externalAssignment
            /// </summary>
            [EnumMember(Value = "externalAssignment")]
            ExternalAssignmentEnum = 5,
            
            /// <summary>
            /// Enum EmployeeRequestEnum for employeeRequest
            /// </summary>
            [EnumMember(Value = "employeeRequest")]
            EmployeeRequestEnum = 6
        }

        /// <summary>
        /// How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest 
        /// </summary>
        /// <value>How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest </value>
        [DataMember(Name="method", EmitDefaultValue=false)]
        public MethodEnum Method { get; set; }

        /// <summary>
        /// Did the employee request this assignment? Yes/No
        /// </summary>
        /// <value>Did the employee request this assignment? Yes/No</value>
        [DataMember(Name="fromRequest", EmitDefaultValue=false)]
        public bool FromRequest { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HoursAssignmentAssignment {\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  FromRequest: ").Append(FromRequest).Append("\n");
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
            return obj.GetType() == GetType() && Equals((HoursAssignmentAssignment)obj);
        }

        /// <summary>
        /// Returns true if HoursAssignmentAssignment instances are equal
        /// </summary>
        /// <param name="other">Instance of HoursAssignmentAssignment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HoursAssignmentAssignment other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Method == other.Method ||
                    
                    Method.Equals(other.Method)
                ) && 
                (
                    FromRequest == other.FromRequest ||
                    
                    FromRequest.Equals(other.FromRequest)
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
                    
                    hashCode = hashCode * 59 + Method.GetHashCode();
                    
                    hashCode = hashCode * 59 + FromRequest.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(HoursAssignmentAssignment left, HoursAssignmentAssignment right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(HoursAssignmentAssignment left, HoursAssignmentAssignment right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}