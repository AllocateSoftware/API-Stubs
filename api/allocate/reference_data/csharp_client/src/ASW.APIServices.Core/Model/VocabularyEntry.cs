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
    /// VocabularyEntry
    /// </summary>
    [DataContract]
    public partial class VocabularyEntry :  IEquatable<VocabularyEntry>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VocabularyEntry" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected VocabularyEntry() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="VocabularyEntry" /> class.
        /// </summary>
        /// <param name="code">Code for the element. Should be unique within the vocabulary (required).</param>
        /// <param name="title">Title for the element.</param>
        public VocabularyEntry(string code = default(string), string title = default(string))
        {
            // to ensure "code" is required (not null)
            if (code == null)
            {
                throw new InvalidDataException("code is a required property for VocabularyEntry and cannot be null");
            }
            else
            {
                this.Code = code;
            }
            
            this.Title = title;
        }
        
        /// <summary>
        /// Code for the element. Should be unique within the vocabulary
        /// </summary>
        /// <value>Code for the element. Should be unique within the vocabulary</value>
        [DataMember(Name="code", EmitDefaultValue=false)]
        public string Code { get; set; }

        /// <summary>
        /// Title for the element
        /// </summary>
        /// <value>Title for the element</value>
        [DataMember(Name="title", EmitDefaultValue=false)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VocabularyEntry {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
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
            return this.Equals(input as VocabularyEntry);
        }

        /// <summary>
        /// Returns true if VocabularyEntry instances are equal
        /// </summary>
        /// <param name="input">Instance of VocabularyEntry to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VocabularyEntry input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
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
                if (this.Code != null)
                    hashCode = hashCode * 59 + this.Code.GetHashCode();
                if (this.Title != null)
                    hashCode = hashCode * 59 + this.Title.GetHashCode();
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
