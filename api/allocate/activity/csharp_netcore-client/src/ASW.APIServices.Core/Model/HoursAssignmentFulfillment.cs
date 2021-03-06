/* 
 * Activity API
 *
 *      ## API for querying worker activity.      This is an early availabilty API, and is subject to change. 
 *
 * The version of the OpenAPI document: 0.0.1
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
    /// HoursAssignmentFulfillment
    /// </summary>
    [DataContract]
    public partial class HoursAssignmentFulfillment :  IEquatable<HoursAssignmentFulfillment>, IValidatableObject
    {
        /// <summary>
        /// Defines Type
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Local for value: local
            /// </summary>
            [EnumMember(Value = "local")]
            Local = 1,

            /// <summary>
            /// Enum Bank for value: bank
            /// </summary>
            [EnumMember(Value = "bank")]
            Bank = 2,

            /// <summary>
            /// Enum Agency for value: agency
            /// </summary>
            [EnumMember(Value = "agency")]
            Agency = 3

        }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Defines Status
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            /// <summary>
            /// Enum Vacant for value: vacant
            /// </summary>
            [EnumMember(Value = "vacant")]
            Vacant = 1,

            /// <summary>
            /// Enum Filled for value: filled
            /// </summary>
            [EnumMember(Value = "filled")]
            Filled = 2,

            /// <summary>
            /// Enum Partial for value: partial
            /// </summary>
            [EnumMember(Value = "partial")]
            Partial = 3

        }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public StatusEnum? Status { get; set; }
        /// <summary>
        /// Defines Category
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CategoryEnum
        {
            /// <summary>
            /// Enum Mandatory for value: mandatory
            /// </summary>
            [EnumMember(Value = "mandatory")]
            Mandatory = 1,

            /// <summary>
            /// Enum Optional for value: optional
            /// </summary>
            [EnumMember(Value = "optional")]
            Optional = 2,

            /// <summary>
            /// Enum Additional for value: additional
            /// </summary>
            [EnumMember(Value = "additional")]
            Additional = 3,

            /// <summary>
            /// Enum Stub for value: stub
            /// </summary>
            [EnumMember(Value = "stub")]
            Stub = 4

        }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [DataMember(Name="category", EmitDefaultValue=false)]
        public CategoryEnum? Category { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="HoursAssignmentFulfillment" /> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="status">status.</param>
        /// <param name="category">category.</param>
        public HoursAssignmentFulfillment(TypeEnum? type = default(TypeEnum?), StatusEnum? status = default(StatusEnum?), CategoryEnum? category = default(CategoryEnum?))
        {
            this.Type = type;
            this.Status = status;
            this.Category = category;
        }
        
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HoursAssignmentFulfillment {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
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
            return this.Equals(input as HoursAssignmentFulfillment);
        }

        /// <summary>
        /// Returns true if HoursAssignmentFulfillment instances are equal
        /// </summary>
        /// <param name="input">Instance of HoursAssignmentFulfillment to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HoursAssignmentFulfillment input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                ) && 
                (
                    this.Category == input.Category ||
                    this.Category.Equals(input.Category)
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
                hashCode = hashCode * 59 + this.Type.GetHashCode();
                hashCode = hashCode * 59 + this.Status.GetHashCode();
                hashCode = hashCode * 59 + this.Category.GetHashCode();
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
