/*
 * VMS Provisioning API
 *
 * ## Description  API to be impemented by 247Time (and, potentially, partners) to enable provisioning of accounts and the org structure 
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
    public partial class Unit : IEquatable<Unit>
    { 
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets CostCentre
        /// </summary>
        [DataMember(Name="costCentre", EmitDefaultValue=false)]
        public CostCentre CostCentre { get; set; }

        /// <summary>
        /// Gets or Sets StaffGroups
        /// </summary>
        [DataMember(Name="staffGroups", EmitDefaultValue=false)]
        public List<StaffGroup> StaffGroups { get; set; }

        /// <summary>
        /// Children of this unit. This may be an arbitarily deep tree structure.
        /// </summary>
        /// <value>Children of this unit. This may be an arbitarily deep tree structure.</value>
        [DataMember(Name="children", EmitDefaultValue=false)]
        public List<Unit> Children { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Unit {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  CostCentre: ").Append(CostCentre).Append("\n");
            sb.Append("  StaffGroups: ").Append(StaffGroups).Append("\n");
            sb.Append("  Children: ").Append(Children).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Unit)obj);
        }

        /// <summary>
        /// Returns true if Unit instances are equal
        /// </summary>
        /// <param name="other">Instance of Unit to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Unit other)
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
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    CostCentre == other.CostCentre ||
                    CostCentre != null &&
                    CostCentre.Equals(other.CostCentre)
                ) && 
                (
                    StaffGroups == other.StaffGroups ||
                    StaffGroups != null &&
                    other.StaffGroups != null &&
                    StaffGroups.SequenceEqual(other.StaffGroups)
                ) && 
                (
                    Children == other.Children ||
                    Children != null &&
                    other.Children != null &&
                    Children.SequenceEqual(other.Children)
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
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (CostCentre != null)
                    hashCode = hashCode * 59 + CostCentre.GetHashCode();
                    if (StaffGroups != null)
                    hashCode = hashCode * 59 + StaffGroups.GetHashCode();
                    if (Children != null)
                    hashCode = hashCode * 59 + Children.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Unit left, Unit right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Unit left, Unit right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}