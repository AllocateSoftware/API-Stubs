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
    public partial class HoursAssignmentFulfillment : IEquatable<HoursAssignmentFulfillment>
    { 
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<TypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum LocalEnum for local
            /// </summary>
            [EnumMember(Value = "local")]
            LocalEnum = 1,
            
            /// <summary>
            /// Enum BankEnum for bank
            /// </summary>
            [EnumMember(Value = "bank")]
            BankEnum = 2,
            
            /// <summary>
            /// Enum AgencyEnum for agency
            /// </summary>
            [EnumMember(Value = "agency")]
            AgencyEnum = 3
        }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<StatusEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum StatusEnum
        {
            
            /// <summary>
            /// Enum VacantEnum for vacant
            /// </summary>
            [EnumMember(Value = "vacant")]
            VacantEnum = 1,
            
            /// <summary>
            /// Enum FilledEnum for filled
            /// </summary>
            [EnumMember(Value = "filled")]
            FilledEnum = 2,
            
            /// <summary>
            /// Enum PartialEnum for partial
            /// </summary>
            [EnumMember(Value = "partial")]
            PartialEnum = 3
        }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public StatusEnum Status { get; set; }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<CategoryEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum CategoryEnum
        {
            
            /// <summary>
            /// Enum MandatoryEnum for mandatory
            /// </summary>
            [EnumMember(Value = "mandatory")]
            MandatoryEnum = 1,
            
            /// <summary>
            /// Enum OptionalEnum for optional
            /// </summary>
            [EnumMember(Value = "optional")]
            OptionalEnum = 2,
            
            /// <summary>
            /// Enum AdditionalEnum for additional
            /// </summary>
            [EnumMember(Value = "additional")]
            AdditionalEnum = 3,
            
            /// <summary>
            /// Enum StubEnum for stub
            /// </summary>
            [EnumMember(Value = "stub")]
            StubEnum = 4
        }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [DataMember(Name="category", EmitDefaultValue=false)]
        public CategoryEnum Category { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HoursAssignmentFulfillment {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
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
            return obj.GetType() == GetType() && Equals((HoursAssignmentFulfillment)obj);
        }

        /// <summary>
        /// Returns true if HoursAssignmentFulfillment instances are equal
        /// </summary>
        /// <param name="other">Instance of HoursAssignmentFulfillment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HoursAssignmentFulfillment other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Type == other.Type ||
                    
                    Type.Equals(other.Type)
                ) && 
                (
                    Status == other.Status ||
                    
                    Status.Equals(other.Status)
                ) && 
                (
                    Category == other.Category ||
                    
                    Category.Equals(other.Category)
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
                    
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    
                    hashCode = hashCode * 59 + Category.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(HoursAssignmentFulfillment left, HoursAssignmentFulfillment right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(HoursAssignmentFulfillment left, HoursAssignmentFulfillment right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
