/*
 * Worker API and Events
 *
 *      ## API and events for providing workers. 
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
    public partial class InlineObject : IEquatable<InlineObject>
    { 
        /// <summary>
        /// The code for the trust that the worker should be on-boarded to
        /// </summary>
        /// <value>The code for the trust that the worker should be on-boarded to</value>
        [DataMember(Name="trustCode", EmitDefaultValue=false)]
        public string TrustCode { get; set; }

        /// <summary>
        /// The &#39;engagement route&#39; of the worker, such as substantive, bank, agency
        /// </summary>
        /// <value>The &#39;engagement route&#39; of the worker, such as substantive, bank, agency</value>
        [DataMember(Name="engagementRoute", EmitDefaultValue=false)]
        public string EngagementRoute { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineObject {\n");
            sb.Append("  TrustCode: ").Append(TrustCode).Append("\n");
            sb.Append("  EngagementRoute: ").Append(EngagementRoute).Append("\n");
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
            return obj.GetType() == GetType() && Equals((InlineObject)obj);
        }

        /// <summary>
        /// Returns true if InlineObject instances are equal
        /// </summary>
        /// <param name="other">Instance of InlineObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineObject other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    TrustCode == other.TrustCode ||
                    TrustCode != null &&
                    TrustCode.Equals(other.TrustCode)
                ) && 
                (
                    EngagementRoute == other.EngagementRoute ||
                    EngagementRoute != null &&
                    EngagementRoute.Equals(other.EngagementRoute)
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
                    if (TrustCode != null)
                    hashCode = hashCode * 59 + TrustCode.GetHashCode();
                    if (EngagementRoute != null)
                    hashCode = hashCode * 59 + EngagementRoute.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(InlineObject left, InlineObject right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(InlineObject left, InlineObject right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
