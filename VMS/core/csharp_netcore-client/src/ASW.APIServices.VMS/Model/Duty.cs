/* 
 * VMS API
 *
 * ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 
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
    /// Duty
    /// </summary>
    [DataContract]
    public partial class Duty :  IEquatable<Duty>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Duty" /> class.
        /// </summary>
        /// <param name="id">ID of the duty (from the source system).</param>
        /// <param name="when">when.</param>
        /// <param name="where">where.</param>
        /// <param name="requirements">requirements.</param>
        /// <param name="clientDeptId">BankStaff ward trust identifier.</param>
        /// <param name="subDiscipline">Staff group trust identifier.</param>
        /// <param name="grade">Grade trust identifier of the request.</param>
        /// <param name="fallbackGrade">fallbackGrade.</param>
        /// <param name="vacancyReason">vacancyReason.</param>
        /// <param name="poNumber">Need to understand if needed from Trust/Agency.</param>
        /// <param name="uniqueNumber">BRN / Unique number.</param>
        /// <param name="agency">Supplying agency for the duty.</param>
        public Duty(string id = default(string), DutyTiming when = default(DutyTiming), DutyLocation where = default(DutyLocation), DutyRequirements requirements = default(DutyRequirements), string clientDeptId = default(string), string subDiscipline = default(string), string grade = default(string), string fallbackGrade = default(string), string vacancyReason = default(string), int poNumber = default(int), int uniqueNumber = default(int), string agency = default(string))
        {
            this.Id = id;
            this.When = when;
            this.Where = where;
            this.Requirements = requirements;
            this.ClientDeptId = clientDeptId;
            this.SubDiscipline = subDiscipline;
            this.Grade = grade;
            this.FallbackGrade = fallbackGrade;
            this.VacancyReason = vacancyReason;
            this.PoNumber = poNumber;
            this.UniqueNumber = uniqueNumber;
            this.Agency = agency;
        }
        
        /// <summary>
        /// ID of the duty (from the source system)
        /// </summary>
        /// <value>ID of the duty (from the source system)</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets When
        /// </summary>
        [DataMember(Name="when", EmitDefaultValue=false)]
        public DutyTiming When { get; set; }

        /// <summary>
        /// Gets or Sets Where
        /// </summary>
        [DataMember(Name="where", EmitDefaultValue=false)]
        public DutyLocation Where { get; set; }

        /// <summary>
        /// Gets or Sets Requirements
        /// </summary>
        [DataMember(Name="requirements", EmitDefaultValue=false)]
        public DutyRequirements Requirements { get; set; }

        /// <summary>
        /// BankStaff ward trust identifier
        /// </summary>
        /// <value>BankStaff ward trust identifier</value>
        [DataMember(Name="clientDeptId", EmitDefaultValue=false)]
        public string ClientDeptId { get; set; }

        /// <summary>
        /// Staff group trust identifier
        /// </summary>
        /// <value>Staff group trust identifier</value>
        [DataMember(Name="subDiscipline", EmitDefaultValue=false)]
        public string SubDiscipline { get; set; }

        /// <summary>
        /// Grade trust identifier of the request
        /// </summary>
        /// <value>Grade trust identifier of the request</value>
        [DataMember(Name="grade", EmitDefaultValue=false)]
        public string Grade { get; set; }

        /// <summary>
        /// Gets or Sets FallbackGrade
        /// </summary>
        [DataMember(Name="fallbackGrade", EmitDefaultValue=false)]
        public string FallbackGrade { get; set; }

        /// <summary>
        /// Gets or Sets VacancyReason
        /// </summary>
        [DataMember(Name="vacancyReason", EmitDefaultValue=false)]
        public string VacancyReason { get; set; }

        /// <summary>
        /// Need to understand if needed from Trust/Agency
        /// </summary>
        /// <value>Need to understand if needed from Trust/Agency</value>
        [DataMember(Name="poNumber", EmitDefaultValue=false)]
        public int PoNumber { get; set; }

        /// <summary>
        /// BRN / Unique number
        /// </summary>
        /// <value>BRN / Unique number</value>
        [DataMember(Name="uniqueNumber", EmitDefaultValue=false)]
        public int UniqueNumber { get; set; }

        /// <summary>
        /// Supplying agency for the duty
        /// </summary>
        /// <value>Supplying agency for the duty</value>
        [DataMember(Name="agency", EmitDefaultValue=false)]
        public string Agency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Duty {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  When: ").Append(When).Append("\n");
            sb.Append("  Where: ").Append(Where).Append("\n");
            sb.Append("  Requirements: ").Append(Requirements).Append("\n");
            sb.Append("  ClientDeptId: ").Append(ClientDeptId).Append("\n");
            sb.Append("  SubDiscipline: ").Append(SubDiscipline).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  FallbackGrade: ").Append(FallbackGrade).Append("\n");
            sb.Append("  VacancyReason: ").Append(VacancyReason).Append("\n");
            sb.Append("  PoNumber: ").Append(PoNumber).Append("\n");
            sb.Append("  UniqueNumber: ").Append(UniqueNumber).Append("\n");
            sb.Append("  Agency: ").Append(Agency).Append("\n");
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
            return this.Equals(input as Duty);
        }

        /// <summary>
        /// Returns true if Duty instances are equal
        /// </summary>
        /// <param name="input">Instance of Duty to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Duty input)
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
                    this.When == input.When ||
                    (this.When != null &&
                    this.When.Equals(input.When))
                ) && 
                (
                    this.Where == input.Where ||
                    (this.Where != null &&
                    this.Where.Equals(input.Where))
                ) && 
                (
                    this.Requirements == input.Requirements ||
                    (this.Requirements != null &&
                    this.Requirements.Equals(input.Requirements))
                ) && 
                (
                    this.ClientDeptId == input.ClientDeptId ||
                    (this.ClientDeptId != null &&
                    this.ClientDeptId.Equals(input.ClientDeptId))
                ) && 
                (
                    this.SubDiscipline == input.SubDiscipline ||
                    (this.SubDiscipline != null &&
                    this.SubDiscipline.Equals(input.SubDiscipline))
                ) && 
                (
                    this.Grade == input.Grade ||
                    (this.Grade != null &&
                    this.Grade.Equals(input.Grade))
                ) && 
                (
                    this.FallbackGrade == input.FallbackGrade ||
                    (this.FallbackGrade != null &&
                    this.FallbackGrade.Equals(input.FallbackGrade))
                ) && 
                (
                    this.VacancyReason == input.VacancyReason ||
                    (this.VacancyReason != null &&
                    this.VacancyReason.Equals(input.VacancyReason))
                ) && 
                (
                    this.PoNumber == input.PoNumber ||
                    this.PoNumber.Equals(input.PoNumber)
                ) && 
                (
                    this.UniqueNumber == input.UniqueNumber ||
                    this.UniqueNumber.Equals(input.UniqueNumber)
                ) && 
                (
                    this.Agency == input.Agency ||
                    (this.Agency != null &&
                    this.Agency.Equals(input.Agency))
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
                if (this.When != null)
                    hashCode = hashCode * 59 + this.When.GetHashCode();
                if (this.Where != null)
                    hashCode = hashCode * 59 + this.Where.GetHashCode();
                if (this.Requirements != null)
                    hashCode = hashCode * 59 + this.Requirements.GetHashCode();
                if (this.ClientDeptId != null)
                    hashCode = hashCode * 59 + this.ClientDeptId.GetHashCode();
                if (this.SubDiscipline != null)
                    hashCode = hashCode * 59 + this.SubDiscipline.GetHashCode();
                if (this.Grade != null)
                    hashCode = hashCode * 59 + this.Grade.GetHashCode();
                if (this.FallbackGrade != null)
                    hashCode = hashCode * 59 + this.FallbackGrade.GetHashCode();
                if (this.VacancyReason != null)
                    hashCode = hashCode * 59 + this.VacancyReason.GetHashCode();
                hashCode = hashCode * 59 + this.PoNumber.GetHashCode();
                hashCode = hashCode * 59 + this.UniqueNumber.GetHashCode();
                if (this.Agency != null)
                    hashCode = hashCode * 59 + this.Agency.GetHashCode();
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
