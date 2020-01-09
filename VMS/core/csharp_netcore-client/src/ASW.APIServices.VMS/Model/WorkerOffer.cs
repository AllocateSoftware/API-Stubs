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
    /// WorkerOffer
    /// </summary>
    [DataContract]
    public partial class WorkerOffer :  IEquatable<WorkerOffer>, IValidatableObject
    {
        /// <summary>
        /// Qualification Status:  * &#x60;qualified&#x60; - Worker has passed all trust-defined checks, and may be considered valid to book.  * &#x60;unqualified&#x60; - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker. 
        /// </summary>
        /// <value>Qualification Status:  * &#x60;qualified&#x60; - Worker has passed all trust-defined checks, and may be considered valid to book.  * &#x60;unqualified&#x60; - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker. </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum QualificationStatusEnum
        {
            /// <summary>
            /// Enum Qualified for value: qualified
            /// </summary>
            [EnumMember(Value = "qualified")]
            Qualified = 1,

            /// <summary>
            /// Enum Unqualified for value: unqualified
            /// </summary>
            [EnumMember(Value = "unqualified")]
            Unqualified = 2

        }

        /// <summary>
        /// Qualification Status:  * &#x60;qualified&#x60; - Worker has passed all trust-defined checks, and may be considered valid to book.  * &#x60;unqualified&#x60; - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker. 
        /// </summary>
        /// <value>Qualification Status:  * &#x60;qualified&#x60; - Worker has passed all trust-defined checks, and may be considered valid to book.  * &#x60;unqualified&#x60; - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker. </value>
        [DataMember(Name="qualificationStatus", EmitDefaultValue=false)]
        public QualificationStatusEnum QualificationStatus { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="WorkerOffer" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected WorkerOffer() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="WorkerOffer" /> class.
        /// </summary>
        /// <param name="id">Unique identifier for this offer..</param>
        /// <param name="bookingRequestId">The underlying booking request for this offer..</param>
        /// <param name="worker">worker (required).</param>
        /// <param name="agency">agency (required).</param>
        /// <param name="qualificationStatus">Qualification Status:  * &#x60;qualified&#x60; - Worker has passed all trust-defined checks, and may be considered valid to book.  * &#x60;unqualified&#x60; - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker.  (required).</param>
        public WorkerOffer(string id = default(string), string bookingRequestId = default(string), Person worker = default(Person), Agency agency = default(Agency), QualificationStatusEnum qualificationStatus = default(QualificationStatusEnum))
        {
            // to ensure "worker" is required (not null)
            if (worker == null)
            {
                throw new InvalidDataException("worker is a required property for WorkerOffer and cannot be null");
            }
            else
            {
                this.Worker = worker;
            }

            // to ensure "agency" is required (not null)
            if (agency == null)
            {
                throw new InvalidDataException("agency is a required property for WorkerOffer and cannot be null");
            }
            else
            {
                this.Agency = agency;
            }

            this.QualificationStatus = qualificationStatus;
            this.Id = id;
            this.BookingRequestId = bookingRequestId;
        }
        
        /// <summary>
        /// Unique identifier for this offer.
        /// </summary>
        /// <value>Unique identifier for this offer.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The underlying booking request for this offer.
        /// </summary>
        /// <value>The underlying booking request for this offer.</value>
        [DataMember(Name="bookingRequestId", EmitDefaultValue=false)]
        public string BookingRequestId { get; set; }

        /// <summary>
        /// Gets or Sets Worker
        /// </summary>
        [DataMember(Name="worker", EmitDefaultValue=false)]
        public Person Worker { get; set; }

        /// <summary>
        /// Gets or Sets Agency
        /// </summary>
        [DataMember(Name="agency", EmitDefaultValue=false)]
        public Agency Agency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkerOffer {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  BookingRequestId: ").Append(BookingRequestId).Append("\n");
            sb.Append("  Worker: ").Append(Worker).Append("\n");
            sb.Append("  Agency: ").Append(Agency).Append("\n");
            sb.Append("  QualificationStatus: ").Append(QualificationStatus).Append("\n");
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
            return this.Equals(input as WorkerOffer);
        }

        /// <summary>
        /// Returns true if WorkerOffer instances are equal
        /// </summary>
        /// <param name="input">Instance of WorkerOffer to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkerOffer input)
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
                    this.BookingRequestId == input.BookingRequestId ||
                    (this.BookingRequestId != null &&
                    this.BookingRequestId.Equals(input.BookingRequestId))
                ) && 
                (
                    this.Worker == input.Worker ||
                    (this.Worker != null &&
                    this.Worker.Equals(input.Worker))
                ) && 
                (
                    this.Agency == input.Agency ||
                    (this.Agency != null &&
                    this.Agency.Equals(input.Agency))
                ) && 
                (
                    this.QualificationStatus == input.QualificationStatus ||
                    this.QualificationStatus.Equals(input.QualificationStatus)
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
                if (this.BookingRequestId != null)
                    hashCode = hashCode * 59 + this.BookingRequestId.GetHashCode();
                if (this.Worker != null)
                    hashCode = hashCode * 59 + this.Worker.GetHashCode();
                if (this.Agency != null)
                    hashCode = hashCode * 59 + this.Agency.GetHashCode();
                hashCode = hashCode * 59 + this.QualificationStatus.GetHashCode();
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
