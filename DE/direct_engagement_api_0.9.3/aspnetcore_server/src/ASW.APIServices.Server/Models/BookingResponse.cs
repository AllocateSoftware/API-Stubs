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
    public partial class BookingResponse : IEquatable<BookingResponse>
    { 
        /// <summary>
        /// Trust identifier of the booked duty
        /// </summary>
        /// <value>Trust identifier of the booked duty</value>
        [DataMember(Name="dutyId", EmitDefaultValue=false)]
        public string DutyId { get; set; }

        /// <summary>
        /// Trust identifier of the booking in BankStaff
        /// </summary>
        /// <value>Trust identifier of the booking in BankStaff</value>
        [DataMember(Name="bookingId", EmitDefaultValue=false)]
        public string BookingId { get; set; }

        /// <summary>
        /// Trust identifier of the booked person in BankStaff
        /// </summary>
        /// <value>Trust identifier of the booked person in BankStaff</value>
        [DataMember(Name="allocatePersonId", EmitDefaultValue=false)]
        public string AllocatePersonId { get; set; }

        /// <summary>
        /// Trust identifier of the master duty if the duty is part of the consolidated duty
        /// </summary>
        /// <value>Trust identifier of the master duty if the duty is part of the consolidated duty</value>
        [DataMember(Name="masterDutyId", EmitDefaultValue=false)]
        public string MasterDutyId { get; set; }

        /// <summary>
        /// Trust identifier of the slave duty if the duty is part of the consolidated duty
        /// </summary>
        /// <value>Trust identifier of the slave duty if the duty is part of the consolidated duty</value>
        [DataMember(Name="slaveDutyId", EmitDefaultValue=false)]
        public string SlaveDutyId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BookingResponse {\n");
            sb.Append("  DutyId: ").Append(DutyId).Append("\n");
            sb.Append("  BookingId: ").Append(BookingId).Append("\n");
            sb.Append("  AllocatePersonId: ").Append(AllocatePersonId).Append("\n");
            sb.Append("  MasterDutyId: ").Append(MasterDutyId).Append("\n");
            sb.Append("  SlaveDutyId: ").Append(SlaveDutyId).Append("\n");
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
            return obj.GetType() == GetType() && Equals((BookingResponse)obj);
        }

        /// <summary>
        /// Returns true if BookingResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of BookingResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BookingResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DutyId == other.DutyId ||
                    DutyId != null &&
                    DutyId.Equals(other.DutyId)
                ) && 
                (
                    BookingId == other.BookingId ||
                    BookingId != null &&
                    BookingId.Equals(other.BookingId)
                ) && 
                (
                    AllocatePersonId == other.AllocatePersonId ||
                    AllocatePersonId != null &&
                    AllocatePersonId.Equals(other.AllocatePersonId)
                ) && 
                (
                    MasterDutyId == other.MasterDutyId ||
                    MasterDutyId != null &&
                    MasterDutyId.Equals(other.MasterDutyId)
                ) && 
                (
                    SlaveDutyId == other.SlaveDutyId ||
                    SlaveDutyId != null &&
                    SlaveDutyId.Equals(other.SlaveDutyId)
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
                    if (DutyId != null)
                    hashCode = hashCode * 59 + DutyId.GetHashCode();
                    if (BookingId != null)
                    hashCode = hashCode * 59 + BookingId.GetHashCode();
                    if (AllocatePersonId != null)
                    hashCode = hashCode * 59 + AllocatePersonId.GetHashCode();
                    if (MasterDutyId != null)
                    hashCode = hashCode * 59 + MasterDutyId.GetHashCode();
                    if (SlaveDutyId != null)
                    hashCode = hashCode * 59 + SlaveDutyId.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(BookingResponse left, BookingResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(BookingResponse left, BookingResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
