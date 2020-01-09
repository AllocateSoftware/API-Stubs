/* 
 * Duties and Events
 *
 * ## Duties and Events 
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
using OpenAPIDateConverter = ASW.APIServices.Core.Client.OpenAPIDateConverter;

namespace ASW.APIServices.Core.Model
{
    /// <summary>
    /// DutyCascadeEventAllOf
    /// </summary>
    [DataContract]
    public partial class DutyCascadeEventAllOf :  IEquatable<DutyCascadeEventAllOf>, IValidatableObject
    {
        /// <summary>
        /// Defines CascadeFrom
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CascadeFromEnum
        {
            /// <summary>
            /// Enum Ward for value: ward
            /// </summary>
            [EnumMember(Value = "ward")]
            Ward = 1,

            /// <summary>
            /// Enum Bank for value: bank
            /// </summary>
            [EnumMember(Value = "bank")]
            Bank = 2,

            /// <summary>
            /// Enum Cloudstaff for value: cloudstaff
            /// </summary>
            [EnumMember(Value = "cloudstaff")]
            Cloudstaff = 3,

            /// <summary>
            /// Enum Agency for value: agency
            /// </summary>
            [EnumMember(Value = "agency")]
            Agency = 4,

            /// <summary>
            /// Enum NationalBank for value: nationalBank
            /// </summary>
            [EnumMember(Value = "nationalBank")]
            NationalBank = 5

        }

        /// <summary>
        /// Gets or Sets CascadeFrom
        /// </summary>
        [DataMember(Name="cascadeFrom", EmitDefaultValue=false)]
        public CascadeFromEnum? CascadeFrom { get; set; }
        /// <summary>
        /// Defines CascadeTo
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CascadeToEnum
        {
            /// <summary>
            /// Enum Ward for value: ward
            /// </summary>
            [EnumMember(Value = "ward")]
            Ward = 1,

            /// <summary>
            /// Enum Bank for value: bank
            /// </summary>
            [EnumMember(Value = "bank")]
            Bank = 2,

            /// <summary>
            /// Enum Cloudstaff for value: cloudstaff
            /// </summary>
            [EnumMember(Value = "cloudstaff")]
            Cloudstaff = 3,

            /// <summary>
            /// Enum Agency for value: agency
            /// </summary>
            [EnumMember(Value = "agency")]
            Agency = 4,

            /// <summary>
            /// Enum NationalBank for value: nationalBank
            /// </summary>
            [EnumMember(Value = "nationalBank")]
            NationalBank = 5

        }

        /// <summary>
        /// Gets or Sets CascadeTo
        /// </summary>
        [DataMember(Name="cascadeTo", EmitDefaultValue=false)]
        public CascadeToEnum CascadeTo { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="DutyCascadeEventAllOf" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DutyCascadeEventAllOf() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DutyCascadeEventAllOf" /> class.
        /// </summary>
        /// <param name="dutyId">dutyId (required).</param>
        /// <param name="cascadeFrom">cascadeFrom.</param>
        /// <param name="cascadeTo">cascadeTo (required).</param>
        /// <param name="isDutyReset">Is this a &#39;reset&#39; ? (I.E Revert).</param>
        public DutyCascadeEventAllOf(string dutyId = default(string), CascadeFromEnum? cascadeFrom = default(CascadeFromEnum?), CascadeToEnum cascadeTo = default(CascadeToEnum), bool isDutyReset = default(bool))
        {
            // to ensure "dutyId" is required (not null)
            if (dutyId == null)
            {
                throw new InvalidDataException("dutyId is a required property for DutyCascadeEventAllOf and cannot be null");
            }
            else
            {
                this.DutyId = dutyId;
            }

            this.CascadeTo = cascadeTo;
            this.CascadeFrom = cascadeFrom;
            this.IsDutyReset = isDutyReset;
        }
        
        /// <summary>
        /// Gets or Sets DutyId
        /// </summary>
        [DataMember(Name="dutyId", EmitDefaultValue=false)]
        public string DutyId { get; set; }

        /// <summary>
        /// Is this a &#39;reset&#39; ? (I.E Revert)
        /// </summary>
        /// <value>Is this a &#39;reset&#39; ? (I.E Revert)</value>
        [DataMember(Name="isDutyReset", EmitDefaultValue=false)]
        public bool IsDutyReset { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DutyCascadeEventAllOf {\n");
            sb.Append("  DutyId: ").Append(DutyId).Append("\n");
            sb.Append("  CascadeFrom: ").Append(CascadeFrom).Append("\n");
            sb.Append("  CascadeTo: ").Append(CascadeTo).Append("\n");
            sb.Append("  IsDutyReset: ").Append(IsDutyReset).Append("\n");
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
            return this.Equals(input as DutyCascadeEventAllOf);
        }

        /// <summary>
        /// Returns true if DutyCascadeEventAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of DutyCascadeEventAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DutyCascadeEventAllOf input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DutyId == input.DutyId ||
                    (this.DutyId != null &&
                    this.DutyId.Equals(input.DutyId))
                ) && 
                (
                    this.CascadeFrom == input.CascadeFrom ||
                    this.CascadeFrom.Equals(input.CascadeFrom)
                ) && 
                (
                    this.CascadeTo == input.CascadeTo ||
                    this.CascadeTo.Equals(input.CascadeTo)
                ) && 
                (
                    this.IsDutyReset == input.IsDutyReset ||
                    this.IsDutyReset.Equals(input.IsDutyReset)
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
                if (this.DutyId != null)
                    hashCode = hashCode * 59 + this.DutyId.GetHashCode();
                hashCode = hashCode * 59 + this.CascadeFrom.GetHashCode();
                hashCode = hashCode * 59 + this.CascadeTo.GetHashCode();
                hashCode = hashCode * 59 + this.IsDutyReset.GetHashCode();
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
