/*
 * Duty Booking API and Events
 *
 * ## Duty Booking API and events and Events 
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
    /// A booking has been cancelled
    /// </summary>
    [DataContract]
    public partial class BookingCancelledEvent : IEquatable<BookingCancelledEvent>
    { 
        /// <summary>
        /// The ID of the booking
        /// </summary>
        /// <value>The ID of the booking</value>
        [Required]
        [DataMember(Name="proposalId", EmitDefaultValue=false)]
        public string ProposalId { get; set; }

        /// <summary>
        /// The ID of the vacancy
        /// </summary>
        /// <value>The ID of the vacancy</value>
        [DataMember(Name="vacancyId", EmitDefaultValue=false)]
        public string VacancyId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BookingCancelledEvent {\n");
            sb.Append("  ProposalId: ").Append(ProposalId).Append("\n");
            sb.Append("  VacancyId: ").Append(VacancyId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BookingCancelledEvent)obj);
        }

        /// <summary>
        /// Returns true if BookingCancelledEvent instances are equal
        /// </summary>
        /// <param name="other">Instance of BookingCancelledEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BookingCancelledEvent other)
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
                    VacancyId == other.VacancyId ||
                    VacancyId != null &&
                    VacancyId.Equals(other.VacancyId)
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
                    if (VacancyId != null)
                    hashCode = hashCode * 59 + VacancyId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BookingCancelledEvent left, BookingCancelledEvent right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BookingCancelledEvent left, BookingCancelledEvent right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
