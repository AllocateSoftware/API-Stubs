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
    public partial class PersonalInfo : IEquatable<PersonalInfo>
    { 
        /// <summary>
        /// Gets or Sets MaidenName
        /// </summary>
        [DataMember(Name="maidenName", EmitDefaultValue=false)]
        public string MaidenName { get; set; }

        /// <summary>
        /// Gets or Sets MaritalStatus
        /// </summary>
        [DataMember(Name="maritalStatus", EmitDefaultValue=false)]
        public string MaritalStatus { get; set; }

        /// <summary>
        /// Gets or Sets AdditionalID
        /// </summary>
        [DataMember(Name="additionalID", EmitDefaultValue=false)]
        public string AdditionalID { get; set; }

        /// <summary>
        /// Gets or Sets PlaceOfBirth
        /// </summary>
        [DataMember(Name="placeOfBirth", EmitDefaultValue=false)]
        public string PlaceOfBirth { get; set; }

        /// <summary>
        /// Gets or Sets Nationality
        /// </summary>
        [DataMember(Name="nationality", EmitDefaultValue=false)]
        public string Nationality { get; set; }

        /// <summary>
        /// Gets or Sets EthnicOrigin
        /// </summary>
        [DataMember(Name="ethnicOrigin", EmitDefaultValue=false)]
        public string EthnicOrigin { get; set; }

        /// <summary>
        /// Gets or Sets VisaRequired
        /// </summary>
        [DataMember(Name="visaRequired", EmitDefaultValue=false)]
        public string VisaRequired { get; set; }

        /// <summary>
        /// Gets or Sets DisabledNo
        /// </summary>
        [DataMember(Name="disabledNo", EmitDefaultValue=false)]
        public string DisabledNo { get; set; }

        /// <summary>
        /// Gets or Sets Disability
        /// </summary>
        [DataMember(Name="disability", EmitDefaultValue=false)]
        public string Disability { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PersonalInfo {\n");
            sb.Append("  MaidenName: ").Append(MaidenName).Append("\n");
            sb.Append("  MaritalStatus: ").Append(MaritalStatus).Append("\n");
            sb.Append("  AdditionalID: ").Append(AdditionalID).Append("\n");
            sb.Append("  PlaceOfBirth: ").Append(PlaceOfBirth).Append("\n");
            sb.Append("  Nationality: ").Append(Nationality).Append("\n");
            sb.Append("  EthnicOrigin: ").Append(EthnicOrigin).Append("\n");
            sb.Append("  VisaRequired: ").Append(VisaRequired).Append("\n");
            sb.Append("  DisabledNo: ").Append(DisabledNo).Append("\n");
            sb.Append("  Disability: ").Append(Disability).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PersonalInfo)obj);
        }

        /// <summary>
        /// Returns true if PersonalInfo instances are equal
        /// </summary>
        /// <param name="other">Instance of PersonalInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PersonalInfo other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    MaidenName == other.MaidenName ||
                    MaidenName != null &&
                    MaidenName.Equals(other.MaidenName)
                ) && 
                (
                    MaritalStatus == other.MaritalStatus ||
                    MaritalStatus != null &&
                    MaritalStatus.Equals(other.MaritalStatus)
                ) && 
                (
                    AdditionalID == other.AdditionalID ||
                    AdditionalID != null &&
                    AdditionalID.Equals(other.AdditionalID)
                ) && 
                (
                    PlaceOfBirth == other.PlaceOfBirth ||
                    PlaceOfBirth != null &&
                    PlaceOfBirth.Equals(other.PlaceOfBirth)
                ) && 
                (
                    Nationality == other.Nationality ||
                    Nationality != null &&
                    Nationality.Equals(other.Nationality)
                ) && 
                (
                    EthnicOrigin == other.EthnicOrigin ||
                    EthnicOrigin != null &&
                    EthnicOrigin.Equals(other.EthnicOrigin)
                ) && 
                (
                    VisaRequired == other.VisaRequired ||
                    VisaRequired != null &&
                    VisaRequired.Equals(other.VisaRequired)
                ) && 
                (
                    DisabledNo == other.DisabledNo ||
                    DisabledNo != null &&
                    DisabledNo.Equals(other.DisabledNo)
                ) && 
                (
                    Disability == other.Disability ||
                    Disability != null &&
                    Disability.Equals(other.Disability)
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
                    if (MaidenName != null)
                    hashCode = hashCode * 59 + MaidenName.GetHashCode();
                    if (MaritalStatus != null)
                    hashCode = hashCode * 59 + MaritalStatus.GetHashCode();
                    if (AdditionalID != null)
                    hashCode = hashCode * 59 + AdditionalID.GetHashCode();
                    if (PlaceOfBirth != null)
                    hashCode = hashCode * 59 + PlaceOfBirth.GetHashCode();
                    if (Nationality != null)
                    hashCode = hashCode * 59 + Nationality.GetHashCode();
                    if (EthnicOrigin != null)
                    hashCode = hashCode * 59 + EthnicOrigin.GetHashCode();
                    if (VisaRequired != null)
                    hashCode = hashCode * 59 + VisaRequired.GetHashCode();
                    if (DisabledNo != null)
                    hashCode = hashCode * 59 + DisabledNo.GetHashCode();
                    if (Disability != null)
                    hashCode = hashCode * 59 + Disability.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PersonalInfo left, PersonalInfo right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PersonalInfo left, PersonalInfo right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}