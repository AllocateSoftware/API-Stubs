/* 
 * Reference data and Mappings API
 *
 *      ## API for accessing reference data and mapping information 
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
    /// Mapping
    /// </summary>
    [DataContract]
    public partial class Mapping :  IEquatable<Mapping>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Mapping" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Mapping() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Mapping" /> class.
        /// </summary>
        /// <param name="id">Id of this mapping.</param>
        /// <param name="mappingSetId">mappingSetId (required).</param>
        /// <param name="from">from (required).</param>
        /// <param name="to">to (required).</param>
        public Mapping(string id = default(string), string mappingSetId = default(string), VocabularyEntry from = default(VocabularyEntry), VocabularyEntry to = default(VocabularyEntry))
        {
            // to ensure "mappingSetId" is required (not null)
            if (mappingSetId == null)
            {
                throw new InvalidDataException("mappingSetId is a required property for Mapping and cannot be null");
            }
            else
            {
                this.MappingSetId = mappingSetId;
            }

            // to ensure "from" is required (not null)
            if (from == null)
            {
                throw new InvalidDataException("from is a required property for Mapping and cannot be null");
            }
            else
            {
                this.From = from;
            }

            // to ensure "to" is required (not null)
            if (to == null)
            {
                throw new InvalidDataException("to is a required property for Mapping and cannot be null");
            }
            else
            {
                this.To = to;
            }

            this.Id = id;
        }
        
        /// <summary>
        /// Id of this mapping
        /// </summary>
        /// <value>Id of this mapping</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets MappingSetId
        /// </summary>
        [DataMember(Name="mappingSetId", EmitDefaultValue=false)]
        public string MappingSetId { get; set; }

        /// <summary>
        /// Gets or Sets From
        /// </summary>
        [DataMember(Name="from", EmitDefaultValue=false)]
        public VocabularyEntry From { get; set; }

        /// <summary>
        /// Gets or Sets To
        /// </summary>
        [DataMember(Name="to", EmitDefaultValue=false)]
        public VocabularyEntry To { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Mapping {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  MappingSetId: ").Append(MappingSetId).Append("\n");
            sb.Append("  From: ").Append(From).Append("\n");
            sb.Append("  To: ").Append(To).Append("\n");
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
            return this.Equals(input as Mapping);
        }

        /// <summary>
        /// Returns true if Mapping instances are equal
        /// </summary>
        /// <param name="input">Instance of Mapping to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Mapping input)
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
                    this.MappingSetId == input.MappingSetId ||
                    (this.MappingSetId != null &&
                    this.MappingSetId.Equals(input.MappingSetId))
                ) && 
                (
                    this.From == input.From ||
                    (this.From != null &&
                    this.From.Equals(input.From))
                ) && 
                (
                    this.To == input.To ||
                    (this.To != null &&
                    this.To.Equals(input.To))
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
                if (this.MappingSetId != null)
                    hashCode = hashCode * 59 + this.MappingSetId.GetHashCode();
                if (this.From != null)
                    hashCode = hashCode * 59 + this.From.GetHashCode();
                if (this.To != null)
                    hashCode = hashCode * 59 + this.To.GetHashCode();
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
