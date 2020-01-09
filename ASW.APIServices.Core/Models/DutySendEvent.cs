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
    public partial class DutySendEvent : IEquatable<DutySendEvent>
    { 
        /// <summary>
        /// Gets or Sets EventType
        /// </summary>
        [Required]
        [DataMember(Name="eventType", EmitDefaultValue=false)]
        public string EventType { get; set; }

        /// <summary>
        /// Where this duty has been sent
        /// </summary>
        /// <value>Where this duty has been sent</value>
        [TypeConverter(typeof(CustomEnumConverter<DestinationEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum DestinationEnum
        {
            
            /// <summary>
            /// Enum BankEnum for bank
            /// </summary>
            [EnumMember(Value = "bank")]
            BankEnum = 1,
            
            /// <summary>
            /// Enum AgencyEnum for agency
            /// </summary>
            [EnumMember(Value = "agency")]
            AgencyEnum = 2,
            
            /// <summary>
            /// Enum CloudstaffEnum for cloudstaff
            /// </summary>
            [EnumMember(Value = "cloudstaff")]
            CloudstaffEnum = 3
        }

        /// <summary>
        /// Where this duty has been sent
        /// </summary>
        /// <value>Where this duty has been sent</value>
        [DataMember(Name="destination", EmitDefaultValue=false)]
        public DestinationEnum Destination { get; set; }

        /// <summary>
        /// Gets or Sets Duty
        /// </summary>
        [DataMember(Name="duty", EmitDefaultValue=false)]
        public Duty Duty { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DutySendEvent {\n");
            sb.Append("  EventType: ").Append(EventType).Append("\n");
            sb.Append("  Destination: ").Append(Destination).Append("\n");
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
            return obj.GetType() == GetType() && Equals((DutySendEvent)obj);
        }

        /// <summary>
        /// Returns true if DutySendEvent instances are equal
        /// </summary>
        /// <param name="other">Instance of DutySendEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DutySendEvent other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    EventType == other.EventType ||
                    EventType != null &&
                    EventType.Equals(other.EventType)
                ) && 
                (
                    Destination == other.Destination ||
                    
                    Destination.Equals(other.Destination)
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
                    if (EventType != null)
                    hashCode = hashCode * 59 + EventType.GetHashCode();
                    
                    hashCode = hashCode * 59 + Destination.GetHashCode();
                    if (Duty != null)
                    hashCode = hashCode * 59 + Duty.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(DutySendEvent left, DutySendEvent right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(DutySendEvent left, DutySendEvent right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}