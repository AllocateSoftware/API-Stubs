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
    /// Denote a contact with a worker
    /// </summary>
    [DataContract]
    public partial class ContactLogEvent :  IEquatable<ContactLogEvent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContactLogEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ContactLogEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ContactLogEvent" /> class.
        /// </summary>
        /// <param name="personId">ASWid of the person (required).</param>
        /// <param name="contactLogInformation">contactLogInformation (required).</param>
        public ContactLogEvent(string personId = default(string), Dictionary<string, ContactLogInformation> contactLogInformation = default(Dictionary<string, ContactLogInformation>))
        {
            // to ensure "personId" is required (not null)
            if (personId == null)
            {
                throw new InvalidDataException("personId is a required property for ContactLogEvent and cannot be null");
            }
            else
            {
                this.PersonId = personId;
            }

            // to ensure "contactLogInformation" is required (not null)
            if (contactLogInformation == null)
            {
                throw new InvalidDataException("contactLogInformation is a required property for ContactLogEvent and cannot be null");
            }
            else
            {
                this.ContactLogInformation = contactLogInformation;
            }

        }
        
        /// <summary>
        /// ASWid of the person
        /// </summary>
        /// <value>ASWid of the person</value>
        [DataMember(Name="personId", EmitDefaultValue=false)]
        public string PersonId { get; set; }

        /// <summary>
        /// Gets or Sets ContactLogInformation
        /// </summary>
        [DataMember(Name="contactLogInformation", EmitDefaultValue=false)]
        public Dictionary<string, ContactLogInformation> ContactLogInformation { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ContactLogEvent {\n");
            sb.Append("  PersonId: ").Append(PersonId).Append("\n");
            sb.Append("  ContactLogInformation: ").Append(ContactLogInformation).Append("\n");
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
            return this.Equals(input as ContactLogEvent);
        }

        /// <summary>
        /// Returns true if ContactLogEvent instances are equal
        /// </summary>
        /// <param name="input">Instance of ContactLogEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContactLogEvent input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PersonId == input.PersonId ||
                    (this.PersonId != null &&
                    this.PersonId.Equals(input.PersonId))
                ) && 
                (
                    this.ContactLogInformation == input.ContactLogInformation ||
                    this.ContactLogInformation != null &&
                    input.ContactLogInformation != null &&
                    this.ContactLogInformation.SequenceEqual(input.ContactLogInformation)
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
                if (this.PersonId != null)
                    hashCode = hashCode * 59 + this.PersonId.GetHashCode();
                if (this.ContactLogInformation != null)
                    hashCode = hashCode * 59 + this.ContactLogInformation.GetHashCode();
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
