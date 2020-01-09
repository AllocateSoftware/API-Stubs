/*
 * DE Provider Direct Engagement API
 *
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
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
using ASW.APIServices.Server.Converters;

namespace ASW.APIServices.Server.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class TimeIntervalRates : IEquatable<TimeIntervalRates>
    { 
        /// <summary>
        /// Gets or Sets StartTime
        /// </summary>
        [DataMember(Name="startTime", EmitDefaultValue=false)]
        public DateTime StartTime { get; set; }

        /// <summary>
        /// Gets or Sets EndTime
        /// </summary>
        [DataMember(Name="endTime", EmitDefaultValue=false)]
        public DateTime EndTime { get; set; }

        /// <summary>
        /// Trust Pay Agency &amp; Trust Pays DE provider - split rate between pay to worker and pay to agency
        /// </summary>
        /// <value>Trust Pay Agency &amp; Trust Pays DE provider - split rate between pay to worker and pay to agency</value>
        [DataMember(Name="rates", EmitDefaultValue=false)]
        public List<Rates> Rates { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TimeIntervalRates {\n");
            sb.Append("  StartTime: ").Append(StartTime).Append("\n");
            sb.Append("  EndTime: ").Append(EndTime).Append("\n");
            sb.Append("  Rates: ").Append(Rates).Append("\n");
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
            return obj.GetType() == GetType() && Equals((TimeIntervalRates)obj);
        }

        /// <summary>
        /// Returns true if TimeIntervalRates instances are equal
        /// </summary>
        /// <param name="other">Instance of TimeIntervalRates to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TimeIntervalRates other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    StartTime == other.StartTime ||
                    StartTime != null &&
                    StartTime.Equals(other.StartTime)
                ) && 
                (
                    EndTime == other.EndTime ||
                    EndTime != null &&
                    EndTime.Equals(other.EndTime)
                ) && 
                (
                    Rates == other.Rates ||
                    Rates != null &&
                    other.Rates != null &&
                    Rates.SequenceEqual(other.Rates)
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
                    if (StartTime != null)
                    hashCode = hashCode * 59 + StartTime.GetHashCode();
                    if (EndTime != null)
                    hashCode = hashCode * 59 + EndTime.GetHashCode();
                    if (Rates != null)
                    hashCode = hashCode * 59 + Rates.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(TimeIntervalRates left, TimeIntervalRates right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(TimeIntervalRates left, TimeIntervalRates right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
