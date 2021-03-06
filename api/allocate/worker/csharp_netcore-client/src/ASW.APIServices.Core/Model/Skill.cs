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
    /// Skill
    /// </summary>
    [DataContract]
    public partial class Skill :  IEquatable<Skill>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Skill" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Skill() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Skill" /> class.
        /// </summary>
        /// <param name="skillGroup">skillGroup.</param>
        /// <param name="cluster">cluster.</param>
        /// <param name="skill">skill.</param>
        /// <param name="validity">validity (required).</param>
        /// <param name="dateGained">dateGained.</param>
        /// <param name="obtainedFromReason">obtainedFromReason.</param>
        /// <param name="certificateNumber">certificateNumber.</param>
        /// <param name="notes">notes.</param>
        public Skill(string skillGroup = default(string), string cluster = default(string), string skill = default(string), DateSpan validity = default(DateSpan), string dateGained = default(string), string obtainedFromReason = default(string), string certificateNumber = default(string), string notes = default(string))
        {
            // to ensure "validity" is required (not null)
            if (validity == null)
            {
                throw new InvalidDataException("validity is a required property for Skill and cannot be null");
            }
            else
            {
                this.Validity = validity;
            }

            this.SkillGroup = skillGroup;
            this.Cluster = cluster;
            this._Skill = skill;
            this.DateGained = dateGained;
            this.ObtainedFromReason = obtainedFromReason;
            this.CertificateNumber = certificateNumber;
            this.Notes = notes;
        }
        
        /// <summary>
        /// Gets or Sets SkillGroup
        /// </summary>
        [DataMember(Name="skillGroup", EmitDefaultValue=false)]
        public string SkillGroup { get; set; }

        /// <summary>
        /// Gets or Sets Cluster
        /// </summary>
        [DataMember(Name="cluster", EmitDefaultValue=false)]
        public string Cluster { get; set; }

        /// <summary>
        /// Gets or Sets _Skill
        /// </summary>
        [DataMember(Name="skill", EmitDefaultValue=false)]
        public string _Skill { get; set; }

        /// <summary>
        /// Gets or Sets Validity
        /// </summary>
        [DataMember(Name="validity", EmitDefaultValue=false)]
        public DateSpan Validity { get; set; }

        /// <summary>
        /// Gets or Sets DateGained
        /// </summary>
        [DataMember(Name="dateGained", EmitDefaultValue=false)]
        public string DateGained { get; set; }

        /// <summary>
        /// Gets or Sets ObtainedFromReason
        /// </summary>
        [DataMember(Name="obtainedFromReason", EmitDefaultValue=false)]
        public string ObtainedFromReason { get; set; }

        /// <summary>
        /// Gets or Sets CertificateNumber
        /// </summary>
        [DataMember(Name="certificateNumber", EmitDefaultValue=false)]
        public string CertificateNumber { get; set; }

        /// <summary>
        /// Gets or Sets Notes
        /// </summary>
        [DataMember(Name="notes", EmitDefaultValue=false)]
        public string Notes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Skill {\n");
            sb.Append("  SkillGroup: ").Append(SkillGroup).Append("\n");
            sb.Append("  Cluster: ").Append(Cluster).Append("\n");
            sb.Append("  _Skill: ").Append(_Skill).Append("\n");
            sb.Append("  Validity: ").Append(Validity).Append("\n");
            sb.Append("  DateGained: ").Append(DateGained).Append("\n");
            sb.Append("  ObtainedFromReason: ").Append(ObtainedFromReason).Append("\n");
            sb.Append("  CertificateNumber: ").Append(CertificateNumber).Append("\n");
            sb.Append("  Notes: ").Append(Notes).Append("\n");
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
            return this.Equals(input as Skill);
        }

        /// <summary>
        /// Returns true if Skill instances are equal
        /// </summary>
        /// <param name="input">Instance of Skill to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Skill input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.SkillGroup == input.SkillGroup ||
                    (this.SkillGroup != null &&
                    this.SkillGroup.Equals(input.SkillGroup))
                ) && 
                (
                    this.Cluster == input.Cluster ||
                    (this.Cluster != null &&
                    this.Cluster.Equals(input.Cluster))
                ) && 
                (
                    this._Skill == input._Skill ||
                    (this._Skill != null &&
                    this._Skill.Equals(input._Skill))
                ) && 
                (
                    this.Validity == input.Validity ||
                    (this.Validity != null &&
                    this.Validity.Equals(input.Validity))
                ) && 
                (
                    this.DateGained == input.DateGained ||
                    (this.DateGained != null &&
                    this.DateGained.Equals(input.DateGained))
                ) && 
                (
                    this.ObtainedFromReason == input.ObtainedFromReason ||
                    (this.ObtainedFromReason != null &&
                    this.ObtainedFromReason.Equals(input.ObtainedFromReason))
                ) && 
                (
                    this.CertificateNumber == input.CertificateNumber ||
                    (this.CertificateNumber != null &&
                    this.CertificateNumber.Equals(input.CertificateNumber))
                ) && 
                (
                    this.Notes == input.Notes ||
                    (this.Notes != null &&
                    this.Notes.Equals(input.Notes))
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
                if (this.SkillGroup != null)
                    hashCode = hashCode * 59 + this.SkillGroup.GetHashCode();
                if (this.Cluster != null)
                    hashCode = hashCode * 59 + this.Cluster.GetHashCode();
                if (this._Skill != null)
                    hashCode = hashCode * 59 + this._Skill.GetHashCode();
                if (this.Validity != null)
                    hashCode = hashCode * 59 + this.Validity.GetHashCode();
                if (this.DateGained != null)
                    hashCode = hashCode * 59 + this.DateGained.GetHashCode();
                if (this.ObtainedFromReason != null)
                    hashCode = hashCode * 59 + this.ObtainedFromReason.GetHashCode();
                if (this.CertificateNumber != null)
                    hashCode = hashCode * 59 + this.CertificateNumber.GetHashCode();
                if (this.Notes != null)
                    hashCode = hashCode * 59 + this.Notes.GetHashCode();
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
