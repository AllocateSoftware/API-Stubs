/*
 * VMS Provisioning API
 *
 * ## Description  API to be impemented by 247Time (and, potentially, partners) to enable provisioning of accounts and the org structure 
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
using ASW.APIServices.VMS.Converters;

namespace ASW.APIServices.VMS.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class StructureProvision : IEquatable<StructureProvision>
    { 
        /// <summary>
        /// ID of the Customer (Trust)
        /// </summary>
        /// <value>ID of the Customer (Trust)</value>
        [DataMember(Name="customerCode", EmitDefaultValue=false)]
        public string CustomerCode { get; set; }

        /// <summary>
        /// List of units present within the customer&#39;s system
        /// </summary>
        /// <value>List of units present within the customer&#39;s system</value>
        [DataMember(Name="units", EmitDefaultValue=false)]
        public List<Unit> Units { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StructureProvision {\n");
            sb.Append("  CustomerCode: ").Append(CustomerCode).Append("\n");
            sb.Append("  Units: ").Append(Units).Append("\n");
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
            return obj.GetType() == GetType() && Equals((StructureProvision)obj);
        }

        /// <summary>
        /// Returns true if StructureProvision instances are equal
        /// </summary>
        /// <param name="other">Instance of StructureProvision to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StructureProvision other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CustomerCode == other.CustomerCode ||
                    CustomerCode != null &&
                    CustomerCode.Equals(other.CustomerCode)
                ) && 
                (
                    Units == other.Units ||
                    Units != null &&
                    other.Units != null &&
                    Units.SequenceEqual(other.Units)
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
                    if (CustomerCode != null)
                    hashCode = hashCode * 59 + CustomerCode.GetHashCode();
                    if (Units != null)
                    hashCode = hashCode * 59 + Units.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(StructureProvision left, StructureProvision right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(StructureProvision left, StructureProvision right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}