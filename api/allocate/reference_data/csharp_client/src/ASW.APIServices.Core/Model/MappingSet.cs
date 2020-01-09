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
    /// MappingSet
    /// </summary>
    [DataContract]
    public partial class MappingSet :  IEquatable<MappingSet>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MappingSet" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MappingSet() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MappingSet" /> class.
        /// </summary>
        /// <param name="id">ID of this mapping set (required).</param>
        /// <param name="vocabularyType">vocabularyType (required).</param>
        public MappingSet(string id = default(string), VocabularyType vocabularyType = default(VocabularyType))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new InvalidDataException("id is a required property for MappingSet and cannot be null");
            }
            else
            {
                this.Id = id;
            }
            
            // to ensure "vocabularyType" is required (not null)
            if (vocabularyType == null)
            {
                throw new InvalidDataException("vocabularyType is a required property for MappingSet and cannot be null");
            }
            else
            {
                this.VocabularyType = vocabularyType;
            }
            
        }
        
        /// <summary>
        /// ID of this mapping set
        /// </summary>
        /// <value>ID of this mapping set</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets VocabularyType
        /// </summary>
        [DataMember(Name="vocabularyType", EmitDefaultValue=false)]
        public VocabularyType VocabularyType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MappingSet {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  VocabularyType: ").Append(VocabularyType).Append("\n");
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
            return this.Equals(input as MappingSet);
        }

        /// <summary>
        /// Returns true if MappingSet instances are equal
        /// </summary>
        /// <param name="input">Instance of MappingSet to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MappingSet input)
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
                    this.VocabularyType == input.VocabularyType ||
                    (this.VocabularyType != null &&
                    this.VocabularyType.Equals(input.VocabularyType))
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
                if (this.VocabularyType != null)
                    hashCode = hashCode * 59 + this.VocabularyType.GetHashCode();
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