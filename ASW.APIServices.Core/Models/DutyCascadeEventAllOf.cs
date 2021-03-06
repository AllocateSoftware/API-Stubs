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
    public partial class DutyCascadeEventAllOf : IEquatable<DutyCascadeEventAllOf>
    { 
        /// <summary>
        /// Gets or Sets DutyId
        /// </summary>
        [Required]
        [DataMember(Name="dutyId", EmitDefaultValue=false)]
        public string DutyId { get; set; }

        /// <summary>
        /// Gets or Sets CascadeFrom
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<CascadeFromEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum CascadeFromEnum
        {
            
            /// <summary>
            /// Enum WardEnum for ward
            /// </summary>
            [EnumMember(Value = "ward")]
            WardEnum = 1,
            
            /// <summary>
            /// Enum BankEnum for bank
            /// </summary>
            [EnumMember(Value = "bank")]
            BankEnum = 2,
            
            /// <summary>
            /// Enum CloudstaffEnum for cloudstaff
            /// </summary>
            [EnumMember(Value = "cloudstaff")]
            CloudstaffEnum = 3,
            
            /// <summary>
            /// Enum AgencyEnum for agency
            /// </summary>
            [EnumMember(Value = "agency")]
            AgencyEnum = 4,
            
            /// <summary>
            /// Enum NationalBankEnum for nationalBank
            /// </summary>
            [EnumMember(Value = "nationalBank")]
            NationalBankEnum = 5
        }

        /// <summary>
        /// Gets or Sets CascadeFrom
        /// </summary>
        [DataMember(Name="cascadeFrom", EmitDefaultValue=false)]
        public CascadeFromEnum CascadeFrom { get; set; }

        /// <summary>
        /// Gets or Sets CascadeTo
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<CascadeToEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum CascadeToEnum
        {
            
            /// <summary>
            /// Enum WardEnum for ward
            /// </summary>
            [EnumMember(Value = "ward")]
            WardEnum = 1,
            
            /// <summary>
            /// Enum BankEnum for bank
            /// </summary>
            [EnumMember(Value = "bank")]
            BankEnum = 2,
            
            /// <summary>
            /// Enum CloudstaffEnum for cloudstaff
            /// </summary>
            [EnumMember(Value = "cloudstaff")]
            CloudstaffEnum = 3,
            
            /// <summary>
            /// Enum AgencyEnum for agency
            /// </summary>
            [EnumMember(Value = "agency")]
            AgencyEnum = 4,
            
            /// <summary>
            /// Enum NationalBankEnum for nationalBank
            /// </summary>
            [EnumMember(Value = "nationalBank")]
            NationalBankEnum = 5
        }

        /// <summary>
        /// Gets or Sets CascadeTo
        /// </summary>
        [Required]
        [DataMember(Name="cascadeTo", EmitDefaultValue=false)]
        public CascadeToEnum CascadeTo { get; set; }

        /// <summary>
        /// Is this a &#39;reset&#39; ? (I.E Revert)
        /// </summary>
        /// <value>Is this a &#39;reset&#39; ? (I.E Revert)</value>
        [DataMember(Name="isDutyReset", EmitDefaultValue=false)]
        public bool IsDutyReset { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DutyCascadeEventAllOf {\n");
            sb.Append("  DutyId: ").Append(DutyId).Append("\n");
            sb.Append("  CascadeFrom: ").Append(CascadeFrom).Append("\n");
            sb.Append("  CascadeTo: ").Append(CascadeTo).Append("\n");
            sb.Append("  IsDutyReset: ").Append(IsDutyReset).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DutyCascadeEventAllOf)obj);
        }

        /// <summary>
        /// Returns true if DutyCascadeEventAllOf instances are equal
        /// </summary>
        /// <param name="other">Instance of DutyCascadeEventAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DutyCascadeEventAllOf other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DutyId == other.DutyId ||
                    DutyId != null &&
                    DutyId.Equals(other.DutyId)
                ) && 
                (
                    CascadeFrom == other.CascadeFrom ||
                    
                    CascadeFrom.Equals(other.CascadeFrom)
                ) && 
                (
                    CascadeTo == other.CascadeTo ||
                    
                    CascadeTo.Equals(other.CascadeTo)
                ) && 
                (
                    IsDutyReset == other.IsDutyReset ||
                    
                    IsDutyReset.Equals(other.IsDutyReset)
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
                    if (DutyId != null)
                    hashCode = hashCode * 59 + DutyId.GetHashCode();
                    
                    hashCode = hashCode * 59 + CascadeFrom.GetHashCode();
                    
                    hashCode = hashCode * 59 + CascadeTo.GetHashCode();
                    
                    hashCode = hashCode * 59 + IsDutyReset.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DutyCascadeEventAllOf left, DutyCascadeEventAllOf right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DutyCascadeEventAllOf left, DutyCascadeEventAllOf right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
