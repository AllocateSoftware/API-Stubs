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
    /// EmploymentDetails
    /// </summary>
    [DataContract]
    public partial class EmploymentDetails :  IEquatable<EmploymentDetails>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EmploymentDetails" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EmploymentDetails() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EmploymentDetails" /> class.
        /// </summary>
        /// <param name="employmentStatus">employmentStatus.</param>
        /// <param name="employeeType">employeeType.</param>
        /// <param name="hireDetails">hireDetails (required).</param>
        /// <param name="dateJoinedNHS">dateJoinedNHS.</param>
        /// <param name="alAccrualPlan">alAccrualPlan.</param>
        /// <param name="prevEmployer">prevEmployer.</param>
        /// <param name="agencies">agencies.</param>
        public EmploymentDetails(string employmentStatus = default(string), string employeeType = default(string), string hireDetails = default(string), string dateJoinedNHS = default(string), string alAccrualPlan = default(string), string prevEmployer = default(string), string agencies = default(string))
        {
            // to ensure "hireDetails" is required (not null)
            if (hireDetails == null)
            {
                throw new InvalidDataException("hireDetails is a required property for EmploymentDetails and cannot be null");
            }
            else
            {
                this.HireDetails = hireDetails;
            }
            
            this.EmploymentStatus = employmentStatus;
            this.EmployeeType = employeeType;
            this.DateJoinedNHS = dateJoinedNHS;
            this.AlAccrualPlan = alAccrualPlan;
            this.PrevEmployer = prevEmployer;
            this.Agencies = agencies;
        }
        
        /// <summary>
        /// Gets or Sets EmploymentStatus
        /// </summary>
        [DataMember(Name="employmentStatus", EmitDefaultValue=false)]
        public string EmploymentStatus { get; set; }

        /// <summary>
        /// Gets or Sets EmployeeType
        /// </summary>
        [DataMember(Name="employeeType", EmitDefaultValue=false)]
        public string EmployeeType { get; set; }

        /// <summary>
        /// Gets or Sets HireDetails
        /// </summary>
        [DataMember(Name="hireDetails", EmitDefaultValue=false)]
        public string HireDetails { get; set; }

        /// <summary>
        /// Gets or Sets DateJoinedNHS
        /// </summary>
        [DataMember(Name="dateJoinedNHS", EmitDefaultValue=false)]
        public string DateJoinedNHS { get; set; }

        /// <summary>
        /// Gets or Sets AlAccrualPlan
        /// </summary>
        [DataMember(Name="alAccrualPlan", EmitDefaultValue=false)]
        public string AlAccrualPlan { get; set; }

        /// <summary>
        /// Gets or Sets PrevEmployer
        /// </summary>
        [DataMember(Name="prevEmployer", EmitDefaultValue=false)]
        public string PrevEmployer { get; set; }

        /// <summary>
        /// Gets or Sets Agencies
        /// </summary>
        [DataMember(Name="agencies", EmitDefaultValue=false)]
        public string Agencies { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EmploymentDetails {\n");
            sb.Append("  EmploymentStatus: ").Append(EmploymentStatus).Append("\n");
            sb.Append("  EmployeeType: ").Append(EmployeeType).Append("\n");
            sb.Append("  HireDetails: ").Append(HireDetails).Append("\n");
            sb.Append("  DateJoinedNHS: ").Append(DateJoinedNHS).Append("\n");
            sb.Append("  AlAccrualPlan: ").Append(AlAccrualPlan).Append("\n");
            sb.Append("  PrevEmployer: ").Append(PrevEmployer).Append("\n");
            sb.Append("  Agencies: ").Append(Agencies).Append("\n");
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
            return this.Equals(input as EmploymentDetails);
        }

        /// <summary>
        /// Returns true if EmploymentDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of EmploymentDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EmploymentDetails input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EmploymentStatus == input.EmploymentStatus ||
                    (this.EmploymentStatus != null &&
                    this.EmploymentStatus.Equals(input.EmploymentStatus))
                ) && 
                (
                    this.EmployeeType == input.EmployeeType ||
                    (this.EmployeeType != null &&
                    this.EmployeeType.Equals(input.EmployeeType))
                ) && 
                (
                    this.HireDetails == input.HireDetails ||
                    (this.HireDetails != null &&
                    this.HireDetails.Equals(input.HireDetails))
                ) && 
                (
                    this.DateJoinedNHS == input.DateJoinedNHS ||
                    (this.DateJoinedNHS != null &&
                    this.DateJoinedNHS.Equals(input.DateJoinedNHS))
                ) && 
                (
                    this.AlAccrualPlan == input.AlAccrualPlan ||
                    (this.AlAccrualPlan != null &&
                    this.AlAccrualPlan.Equals(input.AlAccrualPlan))
                ) && 
                (
                    this.PrevEmployer == input.PrevEmployer ||
                    (this.PrevEmployer != null &&
                    this.PrevEmployer.Equals(input.PrevEmployer))
                ) && 
                (
                    this.Agencies == input.Agencies ||
                    (this.Agencies != null &&
                    this.Agencies.Equals(input.Agencies))
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
                if (this.EmploymentStatus != null)
                    hashCode = hashCode * 59 + this.EmploymentStatus.GetHashCode();
                if (this.EmployeeType != null)
                    hashCode = hashCode * 59 + this.EmployeeType.GetHashCode();
                if (this.HireDetails != null)
                    hashCode = hashCode * 59 + this.HireDetails.GetHashCode();
                if (this.DateJoinedNHS != null)
                    hashCode = hashCode * 59 + this.DateJoinedNHS.GetHashCode();
                if (this.AlAccrualPlan != null)
                    hashCode = hashCode * 59 + this.AlAccrualPlan.GetHashCode();
                if (this.PrevEmployer != null)
                    hashCode = hashCode * 59 + this.PrevEmployer.GetHashCode();
                if (this.Agencies != null)
                    hashCode = hashCode * 59 + this.Agencies.GetHashCode();
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
