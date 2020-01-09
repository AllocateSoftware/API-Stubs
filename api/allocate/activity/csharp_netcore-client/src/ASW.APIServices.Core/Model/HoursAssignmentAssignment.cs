/* 
 * Activity API
 *
 *      ## API for querying worker activity.      This is an early availabilty API, and is subject to change. 
 *
 * The version of the OpenAPI document: 0.0.1
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
    /// HoursAssignmentAssignment
    /// </summary>
    [DataContract]
    public partial class HoursAssignmentAssignment :  IEquatable<HoursAssignmentAssignment>, IValidatableObject
    {
        /// <summary>
        /// How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest 
        /// </summary>
        /// <value>How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum MethodEnum
        {
            /// <summary>
            /// Enum Unspecified for value: unspecified
            /// </summary>
            [EnumMember(Value = "unspecified")]
            Unspecified = 1,

            /// <summary>
            /// Enum Autoroster for value: autoroster
            /// </summary>
            [EnumMember(Value = "autoroster")]
            Autoroster = 2,

            /// <summary>
            /// Enum ManualManagerAssignment for value: manualManagerAssignment
            /// </summary>
            [EnumMember(Value = "manualManagerAssignment")]
            ManualManagerAssignment = 3,

            /// <summary>
            /// Enum EmployeeWebTimesheet for value: employeeWebTimesheet
            /// </summary>
            [EnumMember(Value = "employeeWebTimesheet")]
            EmployeeWebTimesheet = 4,

            /// <summary>
            /// Enum ExternalAssignment for value: externalAssignment
            /// </summary>
            [EnumMember(Value = "externalAssignment")]
            ExternalAssignment = 5,

            /// <summary>
            /// Enum EmployeeRequest for value: employeeRequest
            /// </summary>
            [EnumMember(Value = "employeeRequest")]
            EmployeeRequest = 6

        }

        /// <summary>
        /// How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest 
        /// </summary>
        /// <value>How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest </value>
        [DataMember(Name="method", EmitDefaultValue=false)]
        public MethodEnum? Method { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="HoursAssignmentAssignment" /> class.
        /// </summary>
        /// <param name="method">How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest .</param>
        /// <param name="fromRequest">Did the employee request this assignment? Yes/No.</param>
        public HoursAssignmentAssignment(MethodEnum? method = default(MethodEnum?), bool fromRequest = default(bool))
        {
            this.Method = method;
            this.FromRequest = fromRequest;
        }
        
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
            return this.Equals(input as HoursAssignmentAssignment);
        }

        /// <summary>
        /// Returns true if HoursAssignmentAssignment instances are equal
        /// </summary>
        /// <param name="input">Instance of HoursAssignmentAssignment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HoursAssignmentAssignment input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Method == input.Method ||
                    this.Method.Equals(input.Method)
                ) && 
                (
                    this.FromRequest == input.FromRequest ||
                    this.FromRequest.Equals(input.FromRequest)
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
                hashCode = hashCode * 59 + this.Method.GetHashCode();
                hashCode = hashCode * 59 + this.FromRequest.GetHashCode();
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