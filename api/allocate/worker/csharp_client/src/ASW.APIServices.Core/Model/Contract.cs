/* 
 * Worker API and Events
 *
 *      ## API and events for providing workers. 
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
    /// Contract
    /// </summary>
    [DataContract]
    public partial class Contract :  IEquatable<Contract>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Contract" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Contract() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Contract" /> class.
        /// </summary>
        /// <param name="staffGroup">staffGroup.</param>
        /// <param name="grade">grade (required).</param>
        /// <param name="contract">contract (required).</param>
        /// <param name="payscale">payscale.</param>
        /// <param name="contractType">contractType.</param>
        /// <param name="contractedTime">contractedTime (required).</param>
        /// <param name="defaultUnavailabilityHours">defaultUnavailabilityHours.</param>
        /// <param name="wtdOptOut">wtdOptOut.</param>
        /// <param name="salaryFrequency">salaryFrequency.</param>
        /// <param name="salaryAmount">salaryAmount.</param>
        public Contract(string staffGroup = default(string), string grade = default(string), string contract = default(string), string payscale = default(string), string contractType = default(string), string contractedTime = default(string), string defaultUnavailabilityHours = default(string), bool wtdOptOut = default(bool), string salaryFrequency = default(string), decimal salaryAmount = default(decimal))
        {
            // to ensure "grade" is required (not null)
            if (grade == null)
            {
                throw new InvalidDataException("grade is a required property for Contract and cannot be null");
            }
            else
            {
                this.Grade = grade;
            }
            
            // to ensure "contract" is required (not null)
            if (contract == null)
            {
                throw new InvalidDataException("contract is a required property for Contract and cannot be null");
            }
            else
            {
                this._Contract = contract;
            }
            
            // to ensure "contractedTime" is required (not null)
            if (contractedTime == null)
            {
                throw new InvalidDataException("contractedTime is a required property for Contract and cannot be null");
            }
            else
            {
                this.ContractedTime = contractedTime;
            }
            
            this.StaffGroup = staffGroup;
            this.Payscale = payscale;
            this.ContractType = contractType;
            this.DefaultUnavailabilityHours = defaultUnavailabilityHours;
            this.WtdOptOut = wtdOptOut;
            this.SalaryFrequency = salaryFrequency;
            this.SalaryAmount = salaryAmount;
        }
        
        /// <summary>
        /// Gets or Sets StaffGroup
        /// </summary>
        [DataMember(Name="staffGroup", EmitDefaultValue=false)]
        public string StaffGroup { get; set; }

        /// <summary>
        /// Gets or Sets Grade
        /// </summary>
        [DataMember(Name="grade", EmitDefaultValue=false)]
        public string Grade { get; set; }

        /// <summary>
        /// Gets or Sets _Contract
        /// </summary>
        [DataMember(Name="contract", EmitDefaultValue=false)]
        public string _Contract { get; set; }

        /// <summary>
        /// Gets or Sets Payscale
        /// </summary>
        [DataMember(Name="payscale", EmitDefaultValue=false)]
        public string Payscale { get; set; }

        /// <summary>
        /// Gets or Sets ContractType
        /// </summary>
        [DataMember(Name="contractType", EmitDefaultValue=false)]
        public string ContractType { get; set; }

        /// <summary>
        /// Gets or Sets ContractedTime
        /// </summary>
        [DataMember(Name="contractedTime", EmitDefaultValue=false)]
        public string ContractedTime { get; set; }

        /// <summary>
        /// Gets or Sets DefaultUnavailabilityHours
        /// </summary>
        [DataMember(Name="defaultUnavailabilityHours", EmitDefaultValue=false)]
        public string DefaultUnavailabilityHours { get; set; }

        /// <summary>
        /// Gets or Sets WtdOptOut
        /// </summary>
        [DataMember(Name="wtdOptOut", EmitDefaultValue=false)]
        public bool WtdOptOut { get; set; }

        /// <summary>
        /// Gets or Sets SalaryFrequency
        /// </summary>
        [DataMember(Name="salaryFrequency", EmitDefaultValue=false)]
        public string SalaryFrequency { get; set; }

        /// <summary>
        /// Gets or Sets SalaryAmount
        /// </summary>
        [DataMember(Name="salaryAmount", EmitDefaultValue=false)]
        public decimal SalaryAmount { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Contract {\n");
            sb.Append("  StaffGroup: ").Append(StaffGroup).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  _Contract: ").Append(_Contract).Append("\n");
            sb.Append("  Payscale: ").Append(Payscale).Append("\n");
            sb.Append("  ContractType: ").Append(ContractType).Append("\n");
            sb.Append("  ContractedTime: ").Append(ContractedTime).Append("\n");
            sb.Append("  DefaultUnavailabilityHours: ").Append(DefaultUnavailabilityHours).Append("\n");
            sb.Append("  WtdOptOut: ").Append(WtdOptOut).Append("\n");
            sb.Append("  SalaryFrequency: ").Append(SalaryFrequency).Append("\n");
            sb.Append("  SalaryAmount: ").Append(SalaryAmount).Append("\n");
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
            return this.Equals(input as Contract);
        }

        /// <summary>
        /// Returns true if Contract instances are equal
        /// </summary>
        /// <param name="input">Instance of Contract to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Contract input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.StaffGroup == input.StaffGroup ||
                    (this.StaffGroup != null &&
                    this.StaffGroup.Equals(input.StaffGroup))
                ) && 
                (
                    this.Grade == input.Grade ||
                    (this.Grade != null &&
                    this.Grade.Equals(input.Grade))
                ) && 
                (
                    this._Contract == input._Contract ||
                    (this._Contract != null &&
                    this._Contract.Equals(input._Contract))
                ) && 
                (
                    this.Payscale == input.Payscale ||
                    (this.Payscale != null &&
                    this.Payscale.Equals(input.Payscale))
                ) && 
                (
                    this.ContractType == input.ContractType ||
                    (this.ContractType != null &&
                    this.ContractType.Equals(input.ContractType))
                ) && 
                (
                    this.ContractedTime == input.ContractedTime ||
                    (this.ContractedTime != null &&
                    this.ContractedTime.Equals(input.ContractedTime))
                ) && 
                (
                    this.DefaultUnavailabilityHours == input.DefaultUnavailabilityHours ||
                    (this.DefaultUnavailabilityHours != null &&
                    this.DefaultUnavailabilityHours.Equals(input.DefaultUnavailabilityHours))
                ) && 
                (
                    this.WtdOptOut == input.WtdOptOut ||
                    (this.WtdOptOut != null &&
                    this.WtdOptOut.Equals(input.WtdOptOut))
                ) && 
                (
                    this.SalaryFrequency == input.SalaryFrequency ||
                    (this.SalaryFrequency != null &&
                    this.SalaryFrequency.Equals(input.SalaryFrequency))
                ) && 
                (
                    this.SalaryAmount == input.SalaryAmount ||
                    (this.SalaryAmount != null &&
                    this.SalaryAmount.Equals(input.SalaryAmount))
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
                if (this.StaffGroup != null)
                    hashCode = hashCode * 59 + this.StaffGroup.GetHashCode();
                if (this.Grade != null)
                    hashCode = hashCode * 59 + this.Grade.GetHashCode();
                if (this._Contract != null)
                    hashCode = hashCode * 59 + this._Contract.GetHashCode();
                if (this.Payscale != null)
                    hashCode = hashCode * 59 + this.Payscale.GetHashCode();
                if (this.ContractType != null)
                    hashCode = hashCode * 59 + this.ContractType.GetHashCode();
                if (this.ContractedTime != null)
                    hashCode = hashCode * 59 + this.ContractedTime.GetHashCode();
                if (this.DefaultUnavailabilityHours != null)
                    hashCode = hashCode * 59 + this.DefaultUnavailabilityHours.GetHashCode();
                if (this.WtdOptOut != null)
                    hashCode = hashCode * 59 + this.WtdOptOut.GetHashCode();
                if (this.SalaryFrequency != null)
                    hashCode = hashCode * 59 + this.SalaryFrequency.GetHashCode();
                if (this.SalaryAmount != null)
                    hashCode = hashCode * 59 + this.SalaryAmount.GetHashCode();
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
