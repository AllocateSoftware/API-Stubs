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
    /// A vacancy has become available for filling.
    /// </summary>
    [DataContract]
    public partial class VacancyUpdatedEvent : IEquatable<VacancyUpdatedEvent>
    { 
        /// <summary>
        /// ID of the vacancy
        /// </summary>
        /// <value>ID of the vacancy</value>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Duty
        /// </summary>
        [Required]
        [DataMember(Name="duty", EmitDefaultValue=false)]
        public Duty Duty { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VacancyUpdatedEvent {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Duty: ").Append(Duty).Append("\n");
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
            return obj.GetType() == GetType() && Equals((VacancyUpdatedEvent)obj);
        }

        /// <summary>
        /// Returns true if VacancyUpdatedEvent instances are equal
        /// </summary>
        /// <param name="other">Instance of VacancyUpdatedEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VacancyUpdatedEvent other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Duty == other.Duty ||
                    Duty != null &&
                    Duty.Equals(other.Duty)
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
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Duty != null)
                    hashCode = hashCode * 59 + Duty.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(VacancyUpdatedEvent left, VacancyUpdatedEvent right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(VacancyUpdatedEvent left, VacancyUpdatedEvent right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
