/*
 * Reference data and Mappings API
 *
 *      ## API for accessing reference data and mapping information 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using ASW.APIServices.Core.Converters;

namespace ASW.APIServices.Core.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class XPaginationHeader : IEquatable<XPaginationHeader>
    { 
        /// <summary>
        /// Gets or Sets CurrentPage
        /// </summary>
        [Required]
        [DataMember(Name="currentPage", EmitDefaultValue=false)]
        public int CurrentPage { get; set; }

        /// <summary>
        /// Gets or Sets PageSize
        /// </summary>
        [Required]
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
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((XPaginationHeader)obj);
        }

        /// <summary>
        /// Returns true if XPaginationHeader instances are equal
        /// </summary>
        /// <param name="other">Instance of XPaginationHeader to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(XPaginationHeader other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CurrentPage == other.CurrentPage ||
                    
                    CurrentPage.Equals(other.CurrentPage)
                ) && 
                (
                    PageSize == other.PageSize ||
                    
                    PageSize.Equals(other.PageSize)
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
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    
                    hashCode = hashCode * 59 + CurrentPage.GetHashCode();
                    
                    hashCode = hashCode * 59 + PageSize.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(XPaginationHeader left, XPaginationHeader right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(XPaginationHeader left, XPaginationHeader right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
