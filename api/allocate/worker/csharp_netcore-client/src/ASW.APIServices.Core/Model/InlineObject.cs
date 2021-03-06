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
    /// InlineObject
    /// </summary>
    [DataContract]
    public partial class InlineObject :  IEquatable<InlineObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineObject" /> class.
        /// </summary>
        /// <param name="trustCode">The code for the trust that the worker should be on-boarded to.</param>
        /// <param name="engagementRoute">The &#39;engagement route&#39; of the worker, such as substantive, bank, agency.</param>
        public InlineObject(string trustCode = default(string), string engagementRoute = default(string))
        {
            this.TrustCode = trustCode;
            this.EngagementRoute = engagementRoute;
        }
        
        /// <summary>
        /// The code for the trust that the worker should be on-boarded to
        /// </summary>
        /// <value>The code for the trust that the worker should be on-boarded to</value>
        [DataMember(Name="trustCode", EmitDefaultValue=false)]
        public string TrustCode { get; set; }

        /// <summary>
        /// The &#39;engagement route&#39; of the worker, such as substantive, bank, agency
        /// </summary>
        /// <value>The &#39;engagement route&#39; of the worker, such as substantive, bank, agency</value>
        [DataMember(Name="engagementRoute", EmitDefaultValue=false)]
        public string EngagementRoute { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineObject {\n");
            sb.Append("  TrustCode: ").Append(TrustCode).Append("\n");
            sb.Append("  EngagementRoute: ").Append(EngagementRoute).Append("\n");
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
            return this.Equals(input as InlineObject);
        }

        /// <summary>
        /// Returns true if InlineObject instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineObject input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.TrustCode == input.TrustCode ||
                    (this.TrustCode != null &&
                    this.TrustCode.Equals(input.TrustCode))
                ) && 
                (
                    this.EngagementRoute == input.EngagementRoute ||
                    (this.EngagementRoute != null &&
                    this.EngagementRoute.Equals(input.EngagementRoute))
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
                if (this.TrustCode != null)
                    hashCode = hashCode * 59 + this.TrustCode.GetHashCode();
                if (this.EngagementRoute != null)
                    hashCode = hashCode * 59 + this.EngagementRoute.GetHashCode();
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
