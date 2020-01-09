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
    /// StructureProvision
    /// </summary>
    [DataContract]
    public partial class StructureProvision :  IEquatable<StructureProvision>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StructureProvision" /> class.
        /// </summary>
        /// <param name="customerCode">ID of the Customer (Trust).</param>
        /// <param name="units">List of units present within the customer&#39;s system.</param>
        public StructureProvision(string customerCode = default(string), List<Unit> units = default(List<Unit>))
        {
            this.CustomerCode = customerCode;
            this.Units = units;
        }
        
        /// <summary>
        /// ID of the Customer (Trust)
        /// </summary>
        /// <value>ID of the Customer (Trust)</value>
        [DataMember(Name="customerCode", EmitDefaultValue=false)]
        public string CustomerCode { get; set; }

        /// <summary>
        /// List of units present within the customer&#39;s system
        /// </summary>
        /// <value>List of units present within the customer&#39;s system</value>
        [DataMember(Name="units", EmitDefaultValue=false)]
        public List<Unit> Units { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StructureProvision {\n");
            sb.Append("  CustomerCode: ").Append(CustomerCode).Append("\n");
            sb.Append("  Units: ").Append(Units).Append("\n");
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
            return this.Equals(input as StructureProvision);
        }

        /// <summary>
        /// Returns true if StructureProvision instances are equal
        /// </summary>
        /// <param name="input">Instance of StructureProvision to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StructureProvision input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CustomerCode == input.CustomerCode ||
                    (this.CustomerCode != null &&
                    this.CustomerCode.Equals(input.CustomerCode))
                ) && 
                (
                    this.Units == input.Units ||
                    this.Units != null &&
                    input.Units != null &&
                    this.Units.SequenceEqual(input.Units)
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
                if (this.CustomerCode != null)
                    hashCode = hashCode * 59 + this.CustomerCode.GetHashCode();
                if (this.Units != null)
                    hashCode = hashCode * 59 + this.Units.GetHashCode();
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