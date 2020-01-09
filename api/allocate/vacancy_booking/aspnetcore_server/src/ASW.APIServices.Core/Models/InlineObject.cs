/*
 * Vacancy Booking API and Events
 *
 *      ## Duty Booking API and events and Events 
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
        /// The ID of the orignal proposal (booking)
        /// </summary>
        /// <value>The ID of the orignal proposal (booking)</value>
        [DataMember(Name="proposalId", EmitDefaultValue=false)]
        public string ProposalId { get; set; }

        /// <summary>
        /// Gets or Sets Times
        /// </summary>
        [DataMember(Name="times", EmitDefaultValue=false)]
        public TimeSpan Times { get; set; }

        /// <summary>
        /// Break time in minutes
        /// </summary>
        /// <value>Break time in minutes</value>
        [DataMember(Name="break", EmitDefaultValue=false)]
        public int Break { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineObject {\n");
            sb.Append("  ProposalId: ").Append(ProposalId).Append("\n");
            sb.Append("  Times: ").Append(Times).Append("\n");
            sb.Append("  Break: ").Append(Break).Append("\n");
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
                    ProposalId == other.ProposalId ||
                    ProposalId != null &&
                    ProposalId.Equals(other.ProposalId)
                ) && 
                (
                    Times == other.Times ||
                    Times != null &&
                    Times.Equals(other.Times)
                ) && 
                (
                    Break == other.Break ||
                    
                    Break.Equals(other.Break)
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
                    if (ProposalId != null)
                    hashCode = hashCode * 59 + ProposalId.GetHashCode();
                    if (Times != null)
                    hashCode = hashCode * 59 + Times.GetHashCode();
                    
                    hashCode = hashCode * 59 + Break.GetHashCode();
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