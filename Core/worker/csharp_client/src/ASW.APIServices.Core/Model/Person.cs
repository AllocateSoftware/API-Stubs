/* 
 * Workers
 *
 * ## Workers and events 
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
    /// Person
    /// </summary>
    [DataContract]
    public partial class Person :  IEquatable<Person>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Person" /> class.
        /// </summary>
        /// <param name="identification">identification.</param>
        /// <param name="personalInfo">personalInfo.</param>
        /// <param name="employmentDetails">employmentDetails.</param>
        /// <param name="workLocations">workLocations.</param>
        /// <param name="postings">postings.</param>
        /// <param name="contracts">contracts.</param>
        /// <param name="skills">skills.</param>
        /// <param name="specialties">specialties.</param>
        /// <param name="attributes">attributes.</param>
        /// <param name="visas">visas.</param>
        /// <param name="workingRestrictions">workingRestrictions.</param>
        /// <param name="availabilities">availabilities.</param>
        /// <param name="personalPattern">personalPattern.</param>
        public Person(Identification identification = default(Identification), PersonalInfo personalInfo = default(PersonalInfo), EmploymentDetails employmentDetails = default(EmploymentDetails), WorkLocations workLocations = default(WorkLocations), List<Posting> postings = default(List<Posting>), List<Contract> contracts = default(List<Contract>), List<Skill> skills = default(List<Skill>), List<Specialty> specialties = default(List<Specialty>), List<Attribute> attributes = default(List<Attribute>), List<Visa> visas = default(List<Visa>), List<WorkingRestriction> workingRestrictions = default(List<WorkingRestriction>), Availabilities availabilities = default(Availabilities), PersonalPattern personalPattern = default(PersonalPattern))
        {
            this.Identification = identification;
            this.PersonalInfo = personalInfo;
            this.EmploymentDetails = employmentDetails;
            this.WorkLocations = workLocations;
            this.Postings = postings;
            this.Contracts = contracts;
            this.Skills = skills;
            this.Specialties = specialties;
            this.Attributes = attributes;
            this.Visas = visas;
            this.WorkingRestrictions = workingRestrictions;
            this.Availabilities = availabilities;
            this.PersonalPattern = personalPattern;
        }
        
        /// <summary>
        /// Gets or Sets Identification
        /// </summary>
        [DataMember(Name="identification", EmitDefaultValue=false)]
        public Identification Identification { get; set; }

        /// <summary>
        /// Gets or Sets PersonalInfo
        /// </summary>
        [DataMember(Name="personalInfo", EmitDefaultValue=false)]
        public PersonalInfo PersonalInfo { get; set; }

        /// <summary>
        /// Gets or Sets EmploymentDetails
        /// </summary>
        [DataMember(Name="employmentDetails", EmitDefaultValue=false)]
        public EmploymentDetails EmploymentDetails { get; set; }

        /// <summary>
        /// Gets or Sets WorkLocations
        /// </summary>
        [DataMember(Name="workLocations", EmitDefaultValue=false)]
        public WorkLocations WorkLocations { get; set; }

        /// <summary>
        /// Gets or Sets Postings
        /// </summary>
        [DataMember(Name="postings", EmitDefaultValue=false)]
        public List<Posting> Postings { get; set; }

        /// <summary>
        /// Gets or Sets Contracts
        /// </summary>
        [DataMember(Name="contracts", EmitDefaultValue=false)]
        public List<Contract> Contracts { get; set; }

        /// <summary>
        /// Gets or Sets Skills
        /// </summary>
        [DataMember(Name="skills", EmitDefaultValue=false)]
        public List<Skill> Skills { get; set; }

        /// <summary>
        /// Gets or Sets Specialties
        /// </summary>
        [DataMember(Name="specialties", EmitDefaultValue=false)]
        public List<Specialty> Specialties { get; set; }

        /// <summary>
        /// Gets or Sets Attributes
        /// </summary>
        [DataMember(Name="attributes", EmitDefaultValue=false)]
        public List<Attribute> Attributes { get; set; }

        /// <summary>
        /// Gets or Sets Visas
        /// </summary>
        [DataMember(Name="visas", EmitDefaultValue=false)]
        public List<Visa> Visas { get; set; }

        /// <summary>
        /// Gets or Sets WorkingRestrictions
        /// </summary>
        [DataMember(Name="workingRestrictions", EmitDefaultValue=false)]
        public List<WorkingRestriction> WorkingRestrictions { get; set; }

        /// <summary>
        /// Gets or Sets Availabilities
        /// </summary>
        [DataMember(Name="availabilities", EmitDefaultValue=false)]
        public Availabilities Availabilities { get; set; }

        /// <summary>
        /// Gets or Sets PersonalPattern
        /// </summary>
        [DataMember(Name="personalPattern", EmitDefaultValue=false)]
        public PersonalPattern PersonalPattern { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Person {\n");
            sb.Append("  Identification: ").Append(Identification).Append("\n");
            sb.Append("  PersonalInfo: ").Append(PersonalInfo).Append("\n");
            sb.Append("  EmploymentDetails: ").Append(EmploymentDetails).Append("\n");
            sb.Append("  WorkLocations: ").Append(WorkLocations).Append("\n");
            sb.Append("  Postings: ").Append(Postings).Append("\n");
            sb.Append("  Contracts: ").Append(Contracts).Append("\n");
            sb.Append("  Skills: ").Append(Skills).Append("\n");
            sb.Append("  Specialties: ").Append(Specialties).Append("\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  Visas: ").Append(Visas).Append("\n");
            sb.Append("  WorkingRestrictions: ").Append(WorkingRestrictions).Append("\n");
            sb.Append("  Availabilities: ").Append(Availabilities).Append("\n");
            sb.Append("  PersonalPattern: ").Append(PersonalPattern).Append("\n");
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
            return this.Equals(input as Person);
        }

        /// <summary>
        /// Returns true if Person instances are equal
        /// </summary>
        /// <param name="input">Instance of Person to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Person input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Identification == input.Identification ||
                    (this.Identification != null &&
                    this.Identification.Equals(input.Identification))
                ) && 
                (
                    this.PersonalInfo == input.PersonalInfo ||
                    (this.PersonalInfo != null &&
                    this.PersonalInfo.Equals(input.PersonalInfo))
                ) && 
                (
                    this.EmploymentDetails == input.EmploymentDetails ||
                    (this.EmploymentDetails != null &&
                    this.EmploymentDetails.Equals(input.EmploymentDetails))
                ) && 
                (
                    this.WorkLocations == input.WorkLocations ||
                    (this.WorkLocations != null &&
                    this.WorkLocations.Equals(input.WorkLocations))
                ) && 
                (
                    this.Postings == input.Postings ||
                    this.Postings != null &&
                    input.Postings != null &&
                    this.Postings.SequenceEqual(input.Postings)
                ) && 
                (
                    this.Contracts == input.Contracts ||
                    this.Contracts != null &&
                    input.Contracts != null &&
                    this.Contracts.SequenceEqual(input.Contracts)
                ) && 
                (
                    this.Skills == input.Skills ||
                    this.Skills != null &&
                    input.Skills != null &&
                    this.Skills.SequenceEqual(input.Skills)
                ) && 
                (
                    this.Specialties == input.Specialties ||
                    this.Specialties != null &&
                    input.Specialties != null &&
                    this.Specialties.SequenceEqual(input.Specialties)
                ) && 
                (
                    this.Attributes == input.Attributes ||
                    this.Attributes != null &&
                    input.Attributes != null &&
                    this.Attributes.SequenceEqual(input.Attributes)
                ) && 
                (
                    this.Visas == input.Visas ||
                    this.Visas != null &&
                    input.Visas != null &&
                    this.Visas.SequenceEqual(input.Visas)
                ) && 
                (
                    this.WorkingRestrictions == input.WorkingRestrictions ||
                    this.WorkingRestrictions != null &&
                    input.WorkingRestrictions != null &&
                    this.WorkingRestrictions.SequenceEqual(input.WorkingRestrictions)
                ) && 
                (
                    this.Availabilities == input.Availabilities ||
                    (this.Availabilities != null &&
                    this.Availabilities.Equals(input.Availabilities))
                ) && 
                (
                    this.PersonalPattern == input.PersonalPattern ||
                    (this.PersonalPattern != null &&
                    this.PersonalPattern.Equals(input.PersonalPattern))
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
                if (this.Identification != null)
                    hashCode = hashCode * 59 + this.Identification.GetHashCode();
                if (this.PersonalInfo != null)
                    hashCode = hashCode * 59 + this.PersonalInfo.GetHashCode();
                if (this.EmploymentDetails != null)
                    hashCode = hashCode * 59 + this.EmploymentDetails.GetHashCode();
                if (this.WorkLocations != null)
                    hashCode = hashCode * 59 + this.WorkLocations.GetHashCode();
                if (this.Postings != null)
                    hashCode = hashCode * 59 + this.Postings.GetHashCode();
                if (this.Contracts != null)
                    hashCode = hashCode * 59 + this.Contracts.GetHashCode();
                if (this.Skills != null)
                    hashCode = hashCode * 59 + this.Skills.GetHashCode();
                if (this.Specialties != null)
                    hashCode = hashCode * 59 + this.Specialties.GetHashCode();
                if (this.Attributes != null)
                    hashCode = hashCode * 59 + this.Attributes.GetHashCode();
                if (this.Visas != null)
                    hashCode = hashCode * 59 + this.Visas.GetHashCode();
                if (this.WorkingRestrictions != null)
                    hashCode = hashCode * 59 + this.WorkingRestrictions.GetHashCode();
                if (this.Availabilities != null)
                    hashCode = hashCode * 59 + this.Availabilities.GetHashCode();
                if (this.PersonalPattern != null)
                    hashCode = hashCode * 59 + this.PersonalPattern.GetHashCode();
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
