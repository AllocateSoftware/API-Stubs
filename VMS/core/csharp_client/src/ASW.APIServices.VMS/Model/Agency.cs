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
    /// Agency
    /// </summary>
    [DataContract]
    public partial class Agency :  IEquatable<Agency>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Agency" /> class.
        /// </summary>
        /// <param name="id">ID of the agency.</param>
        /// <param name="name">Name of the agency.</param>
        /// <param name="contactTelephone">Telephone number for agency.</param>
        /// <param name="contactEmail">Email address for agency.</param>
        public Agency(string id = default(string), string name = default(string), string contactTelephone = default(string), string contactEmail = default(string))
        {
            this.Id = id;
            this.Name = name;
            this.ContactTelephone = contactTelephone;
            this.ContactEmail = contactEmail;
        }
        
        /// <summary>
        /// ID of the agency
        /// </summary>
        /// <value>ID of the agency</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Name of the agency
        /// </summary>
        /// <value>Name of the agency</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Telephone number for agency
        /// </summary>
        /// <value>Telephone number for agency</value>
        [DataMember(Name="contactTelephone", EmitDefaultValue=false)]
        public string ContactTelephone { get; set; }

        /// <summary>
        /// Email address for agency
        /// </summary>
        /// <value>Email address for agency</value>
        [DataMember(Name="contactEmail", EmitDefaultValue=false)]
        public string ContactEmail { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Agency {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ContactTelephone: ").Append(ContactTelephone).Append("\n");
            sb.Append("  ContactEmail: ").Append(ContactEmail).Append("\n");
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
            return this.Equals(input as Agency);
        }

        /// <summary>
        /// Returns true if Agency instances are equal
        /// </summary>
        /// <param name="input">Instance of Agency to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Agency input)
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ContactTelephone == input.ContactTelephone ||
                    (this.ContactTelephone != null &&
                    this.ContactTelephone.Equals(input.ContactTelephone))
                ) && 
                (
                    this.ContactEmail == input.ContactEmail ||
                    (this.ContactEmail != null &&
                    this.ContactEmail.Equals(input.ContactEmail))
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.ContactTelephone != null)
                    hashCode = hashCode * 59 + this.ContactTelephone.GetHashCode();
                if (this.ContactEmail != null)
                    hashCode = hashCode * 59 + this.ContactEmail.GetHashCode();
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
