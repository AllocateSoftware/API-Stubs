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
    /// WorkerPerformanceEventWorker
    /// </summary>
    [DataContract]
    public partial class WorkerPerformanceEventWorker :  IEquatable<WorkerPerformanceEventWorker>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WorkerPerformanceEventWorker" /> class.
        /// </summary>
        /// <param name="name">Simple name for the worker.</param>
        /// <param name="identities">Collection of identifiers of the worker. There may be several unique identifiers for a worker within HealthSuite, and identifiers used for interactions with 3rd party systems (I.E: their identifiers). .</param>
        public WorkerPerformanceEventWorker(string name = default(string), List<Identifier> identities = default(List<Identifier>))
        {
            this.Name = name;
            this.Identities = identities;
        }
        
        /// <summary>
        /// Simple name for the worker
        /// </summary>
        /// <value>Simple name for the worker</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Collection of identifiers of the worker. There may be several unique identifiers for a worker within HealthSuite, and identifiers used for interactions with 3rd party systems (I.E: their identifiers). 
        /// </summary>
        /// <value>Collection of identifiers of the worker. There may be several unique identifiers for a worker within HealthSuite, and identifiers used for interactions with 3rd party systems (I.E: their identifiers). </value>
        [DataMember(Name="identities", EmitDefaultValue=false)]
        public List<Identifier> Identities { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkerPerformanceEventWorker {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Identities: ").Append(Identities).Append("\n");
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
            return this.Equals(input as WorkerPerformanceEventWorker);
        }

        /// <summary>
        /// Returns true if WorkerPerformanceEventWorker instances are equal
        /// </summary>
        /// <param name="input">Instance of WorkerPerformanceEventWorker to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkerPerformanceEventWorker input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Identities == input.Identities ||
                    this.Identities != null &&
                    input.Identities != null &&
                    this.Identities.SequenceEqual(input.Identities)
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Identities != null)
                    hashCode = hashCode * 59 + this.Identities.GetHashCode();
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