/*
 * VMS API
 *
 * ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 
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
    public partial class AgencyCosting : IEquatable<AgencyCosting>
    { 
        /// <summary>
        /// Gets or Sets AgencyId
        /// </summary>
        [DataMember(Name="agencyId", EmitDefaultValue=false)]
        public string AgencyId { get; set; }

        /// <summary>
        /// Gets or Sets AgencyName
        /// </summary>
        [DataMember(Name="agencyName", EmitDefaultValue=false)]
        public string AgencyName { get; set; }

        /// <summary>
        /// Gets or Sets Cost
        /// </summary>
        [DataMember(Name="cost", EmitDefaultValue=false)]
        public decimal Cost { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AgencyCosting {\n");
            sb.Append("  AgencyId: ").Append(AgencyId).Append("\n");
            sb.Append("  AgencyName: ").Append(AgencyName).Append("\n");
            sb.Append("  Cost: ").Append(Cost).Append("\n");
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
            return obj.GetType() == GetType() && Equals((AgencyCosting)obj);
        }

        /// <summary>
        /// Returns true if AgencyCosting instances are equal
        /// </summary>
        /// <param name="other">Instance of AgencyCosting to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AgencyCosting other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    AgencyId == other.AgencyId ||
                    AgencyId != null &&
                    AgencyId.Equals(other.AgencyId)
                ) && 
                (
                    AgencyName == other.AgencyName ||
                    AgencyName != null &&
                    AgencyName.Equals(other.AgencyName)
                ) && 
                (
                    Cost == other.Cost ||
                    
                    Cost.Equals(other.Cost)
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
                    if (AgencyId != null)
                    hashCode = hashCode * 59 + AgencyId.GetHashCode();
                    if (AgencyName != null)
                    hashCode = hashCode * 59 + AgencyName.GetHashCode();
                    
                    hashCode = hashCode * 59 + Cost.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(AgencyCosting left, AgencyCosting right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(AgencyCosting left, AgencyCosting right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
