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
    public partial class CreateVacancyResponse : IEquatable<CreateVacancyResponse>
    { 
        /// <summary>
        /// The ID of the vacancy created
        /// </summary>
        /// <value>The ID of the vacancy created</value>
        [Required]
        [DataMember(Name="vacancyId", EmitDefaultValue=false)]
        public string VacancyId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CreateVacancyResponse {\n");
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
            return obj.GetType() == GetType() && Equals((CreateVacancyResponse)obj);
        }

        /// <summary>
        /// Returns true if CreateVacancyResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of CreateVacancyResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateVacancyResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
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
                    if (VacancyId != null)
                    hashCode = hashCode * 59 + VacancyId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(CreateVacancyResponse left, CreateVacancyResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(CreateVacancyResponse left, CreateVacancyResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
