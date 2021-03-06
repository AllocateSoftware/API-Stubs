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
    /// DutyCostDetails
    /// </summary>
    [DataContract]
    public partial class DutyCostDetails :  IEquatable<DutyCostDetails>, IValidatableObject
    {
        /// <summary>
        /// Whether this cost is estimated, or actual
        /// </summary>
        /// <value>Whether this cost is estimated, or actual</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CostingTypeEnum
        {
            /// <summary>
            /// Enum Estimated for value: estimated
            /// </summary>
            [EnumMember(Value = "estimated")]
            Estimated = 1,

            /// <summary>
            /// Enum Actual for value: actual
            /// </summary>
            [EnumMember(Value = "actual")]
            Actual = 2

        }

        /// <summary>
        /// Whether this cost is estimated, or actual
        /// </summary>
        /// <value>Whether this cost is estimated, or actual</value>
        [DataMember(Name="costingType", EmitDefaultValue=false)]
        public CostingTypeEnum? CostingType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="DutyCostDetails" /> class.
        /// </summary>
        /// <param name="costingType">Whether this cost is estimated, or actual.</param>
        /// <param name="amount">The amount (sterling).</param>
        public DutyCostDetails(CostingTypeEnum? costingType = default(CostingTypeEnum?), decimal amount = default(decimal))
        {
            this.CostingType = costingType;
            this.Amount = amount;
        }
        
        /// <summary>
        /// The amount (sterling)
        /// </summary>
        /// <value>The amount (sterling)</value>
        [DataMember(Name="amount", EmitDefaultValue=false)]
        public decimal Amount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DutyCostDetails {\n");
            sb.Append("  CostingType: ").Append(CostingType).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
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
            return this.Equals(input as DutyCostDetails);
        }

        /// <summary>
        /// Returns true if DutyCostDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of DutyCostDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DutyCostDetails input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CostingType == input.CostingType ||
                    this.CostingType.Equals(input.CostingType)
                ) && 
                (
                    this.Amount == input.Amount ||
                    this.Amount.Equals(input.Amount)
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
                hashCode = hashCode * 59 + this.CostingType.GetHashCode();
                hashCode = hashCode * 59 + this.Amount.GetHashCode();
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
