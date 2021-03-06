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
    public partial class DutyCostDetails : IEquatable<DutyCostDetails>
    { 
        /// <summary>
        /// Whether this cost is estimated, or actual
        /// </summary>
        /// <value>Whether this cost is estimated, or actual</value>
        [TypeConverter(typeof(CustomEnumConverter<CostingTypeEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum CostingTypeEnum
        {
            
            /// <summary>
            /// Enum EstimatedEnum for estimated
            /// </summary>
            [EnumMember(Value = "estimated")]
            EstimatedEnum = 1,
            
            /// <summary>
            /// Enum ActualEnum for actual
            /// </summary>
            [EnumMember(Value = "actual")]
            ActualEnum = 2
        }

        /// <summary>
        /// Whether this cost is estimated, or actual
        /// </summary>
        /// <value>Whether this cost is estimated, or actual</value>
        [DataMember(Name="costingType", EmitDefaultValue=false)]
        public CostingTypeEnum CostingType { get; set; }

        /// <summary>
        /// The amount (sterling)
        /// </summary>
        /// <value>The amount (sterling)</value>
        [DataMember(Name="amount", EmitDefaultValue=false)]
        public decimal Amount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DutyCostDetails {\n");
            sb.Append("  CostingType: ").Append(CostingType).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DutyCostDetails)obj);
        }

        /// <summary>
        /// Returns true if DutyCostDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of DutyCostDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DutyCostDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CostingType == other.CostingType ||
                    
                    CostingType.Equals(other.CostingType)
                ) && 
                (
                    Amount == other.Amount ||
                    
                    Amount.Equals(other.Amount)
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
                    
                    hashCode = hashCode * 59 + CostingType.GetHashCode();
                    
                    hashCode = hashCode * 59 + Amount.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DutyCostDetails left, DutyCostDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DutyCostDetails left, DutyCostDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
