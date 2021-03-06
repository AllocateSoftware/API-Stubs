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
    /// XPaginationHeader
    /// </summary>
    [DataContract]
    public partial class XPaginationHeader :  IEquatable<XPaginationHeader>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="XPaginationHeader" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected XPaginationHeader() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="XPaginationHeader" /> class.
        /// </summary>
        /// <param name="currentPage">currentPage (required).</param>
        /// <param name="pageSize">pageSize (required).</param>
        public XPaginationHeader(int currentPage = default(int), int pageSize = default(int))
        {
            // to ensure "currentPage" is required (not null)
            if (currentPage == null)
            {
                throw new InvalidDataException("currentPage is a required property for XPaginationHeader and cannot be null");
            }
            else
            {
                this.CurrentPage = currentPage;
            }

            // to ensure "pageSize" is required (not null)
            if (pageSize == null)
            {
                throw new InvalidDataException("pageSize is a required property for XPaginationHeader and cannot be null");
            }
            else
            {
                this.PageSize = pageSize;
            }

        }
        
        /// <summary>
        /// Gets or Sets CurrentPage
        /// </summary>
        [DataMember(Name="currentPage", EmitDefaultValue=false)]
        public int CurrentPage { get; set; }

        /// <summary>
        /// Gets or Sets PageSize
        /// </summary>
        [DataMember(Name="pageSize", EmitDefaultValue=false)]
        public int PageSize { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class XPaginationHeader {\n");
            sb.Append("  CurrentPage: ").Append(CurrentPage).Append("\n");
            sb.Append("  PageSize: ").Append(PageSize).Append("\n");
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
            return this.Equals(input as XPaginationHeader);
        }

        /// <summary>
        /// Returns true if XPaginationHeader instances are equal
        /// </summary>
        /// <param name="input">Instance of XPaginationHeader to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(XPaginationHeader input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CurrentPage == input.CurrentPage ||
                    this.CurrentPage.Equals(input.CurrentPage)
                ) && 
                (
                    this.PageSize == input.PageSize ||
                    this.PageSize.Equals(input.PageSize)
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
                hashCode = hashCode * 59 + this.CurrentPage.GetHashCode();
                hashCode = hashCode * 59 + this.PageSize.GetHashCode();
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
