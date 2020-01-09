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
    /// Details of a Person in the VMS, typically a Worker.
    /// </summary>
    [DataContract]
    public partial class Person :  IEquatable<Person>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Person" /> class.
        /// </summary>
        /// <param name="id">identifier of the person (worker) within the VMS.</param>
        /// <param name="universalId">Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes..</param>
        /// <param name="firstName">firstName.</param>
        /// <param name="surname">surname.</param>
        /// <param name="email">email.</param>
        /// <param name="telephoneNumber">telephoneNumber.</param>
        /// <param name="links">Array of HATEOAS-style references that may be followed by the client. This may include a &#39;worker.profile&#39; URL, which will return an HTML page representing the worker profile within the VMS..</param>
        public Person(string id = default(string), string universalId = default(string), string firstName = default(string), string surname = default(string), string email = default(string), string telephoneNumber = default(string), List<Link> links = default(List<Link>))
        {
            this.Id = id;
            this.UniversalId = universalId;
            this.FirstName = firstName;
            this.Surname = surname;
            this.Email = email;
            this.TelephoneNumber = telephoneNumber;
            this.Links = links;
        }
        
        /// <summary>
        /// identifier of the person (worker) within the VMS
        /// </summary>
        /// <value>identifier of the person (worker) within the VMS</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.
        /// </summary>
        /// <value>Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.</value>
        [DataMember(Name="universalId", EmitDefaultValue=false)]
        public string UniversalId { get; set; }

        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [DataMember(Name="firstName", EmitDefaultValue=false)]
        public string FirstName { get; set; }

        /// <summary>
        /// Gets or Sets Surname
        /// </summary>
        [DataMember(Name="surname", EmitDefaultValue=false)]
        public string Surname { get; set; }

        /// <summary>
        /// Gets or Sets Email
        /// </summary>
        [DataMember(Name="email", EmitDefaultValue=false)]
        public string Email { get; set; }

        /// <summary>
        /// Gets or Sets TelephoneNumber
        /// </summary>
        [DataMember(Name="telephoneNumber", EmitDefaultValue=false)]
        public string TelephoneNumber { get; set; }

        /// <summary>
        /// Array of HATEOAS-style references that may be followed by the client. This may include a &#39;worker.profile&#39; URL, which will return an HTML page representing the worker profile within the VMS.
        /// </summary>
        /// <value>Array of HATEOAS-style references that may be followed by the client. This may include a &#39;worker.profile&#39; URL, which will return an HTML page representing the worker profile within the VMS.</value>
        [DataMember(Name="links", EmitDefaultValue=false)]
        public List<Link> Links { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Person {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  UniversalId: ").Append(UniversalId).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  Surname: ").Append(Surname).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  TelephoneNumber: ").Append(TelephoneNumber).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
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
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.UniversalId == input.UniversalId ||
                    (this.UniversalId != null &&
                    this.UniversalId.Equals(input.UniversalId))
                ) && 
                (
                    this.FirstName == input.FirstName ||
                    (this.FirstName != null &&
                    this.FirstName.Equals(input.FirstName))
                ) && 
                (
                    this.Surname == input.Surname ||
                    (this.Surname != null &&
                    this.Surname.Equals(input.Surname))
                ) && 
                (
                    this.Email == input.Email ||
                    (this.Email != null &&
                    this.Email.Equals(input.Email))
                ) && 
                (
                    this.TelephoneNumber == input.TelephoneNumber ||
                    (this.TelephoneNumber != null &&
                    this.TelephoneNumber.Equals(input.TelephoneNumber))
                ) && 
                (
                    this.Links == input.Links ||
                    this.Links != null &&
                    input.Links != null &&
                    this.Links.SequenceEqual(input.Links)
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
                if (this.UniversalId != null)
                    hashCode = hashCode * 59 + this.UniversalId.GetHashCode();
                if (this.FirstName != null)
                    hashCode = hashCode * 59 + this.FirstName.GetHashCode();
                if (this.Surname != null)
                    hashCode = hashCode * 59 + this.Surname.GetHashCode();
                if (this.Email != null)
                    hashCode = hashCode * 59 + this.Email.GetHashCode();
                if (this.TelephoneNumber != null)
                    hashCode = hashCode * 59 + this.TelephoneNumber.GetHashCode();
                if (this.Links != null)
                    hashCode = hashCode * 59 + this.Links.GetHashCode();
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
