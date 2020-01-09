/* 
 * VMS Provisioning API
 *
 * ## Description  API to be impemented by 247Time (and, potentially, partners) to enable provisioning of accounts and the org structure 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = ASW.APIServices.VMS.Client.OpenAPIDateConverter;

namespace ASW.APIServices.VMS.Model
{
    /// <summary>
    /// Unit
    /// </summary>
    [DataContract]
    public partial class Unit :  IEquatable<Unit>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Unit" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Unit() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Unit" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="name">name (required).</param>
        /// <param name="costCentre">costCentre.</param>
        /// <param name="staffGroups">staffGroups.</param>
        /// <param name="children">Children of this unit. This may be an arbitarily deep tree structure..</param>
        public Unit(string id = default(string), string name = default(string), CostCentre costCentre = default(CostCentre), List<StaffGroup> staffGroups = default(List<StaffGroup>), List<Unit> children = default(List<Unit>))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new InvalidDataException("id is a required property for Unit and cannot be null");
            }
            else
            {
                this.Id = id;
            }

            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for Unit and cannot be null");
            }
            else
            {
                this.Name = name;
            }

            this.CostCentre = costCentre;
            this.StaffGroups = staffGroups;
            this.Children = children;
        }
        
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
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
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Unit);
        }

        /// <summary>
        /// Returns true if Unit instances are equal
        /// </summary>
        /// <param name="input">Instance of Unit to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Unit input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.CostCentre == input.CostCentre ||
                    (this.CostCentre != null &&
                    this.CostCentre.Equals(input.CostCentre))
                ) && 
                (
                    this.StaffGroups == input.StaffGroups ||
                    this.StaffGroups != null &&
                    input.StaffGroups != null &&
                    this.StaffGroups.SequenceEqual(input.StaffGroups)
                ) && 
                (
                    this.Children == input.Children ||
                    this.Children != null &&
                    input.Children != null &&
                    this.Children.SequenceEqual(input.Children)
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
                int hashCode = 41;
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.CostCentre != null)
                    hashCode = hashCode * 59 + this.CostCentre.GetHashCode();
                if (this.StaffGroups != null)
                    hashCode = hashCode * 59 + this.StaffGroups.GetHashCode();
                if (this.Children != null)
                    hashCode = hashCode * 59 + this.Children.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}