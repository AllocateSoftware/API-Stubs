/* 
 * DE Provider Direct Engagement API
 *
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
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
    /// Event
    /// </summary>
    [DataContract]
    public partial class Event :  IEquatable<Event>, IValidatableObject
    {
        /// <summary>
        /// Type of change that is done to the entity
        /// </summary>
        /// <value>Type of change that is done to the entity</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EventTypeEnum
        {
            /// <summary>
            /// Enum CREATE for value: CREATE
            /// </summary>
            [EnumMember(Value = "CREATE")]
            CREATE = 1,

            /// <summary>
            /// Enum DELETE for value: DELETE
            /// </summary>
            [EnumMember(Value = "DELETE")]
            DELETE = 2,

            /// <summary>
            /// Enum UPDATE for value: UPDATE
            /// </summary>
            [EnumMember(Value = "UPDATE")]
            UPDATE = 3

        }

        /// <summary>
        /// Type of change that is done to the entity
        /// </summary>
        /// <value>Type of change that is done to the entity</value>
        [DataMember(Name="eventType", EmitDefaultValue=false)]
        public EventTypeEnum? EventType { get; set; }
        /// <summary>
        /// Entity that is changed.
        /// </summary>
        /// <value>Entity that is changed.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EntityTypeEnum
        {
            /// <summary>
            /// Enum Duty for value: duty
            /// </summary>
            [EnumMember(Value = "duty")]
            Duty = 1,

            /// <summary>
            /// Enum Timesheet for value: timesheet
            /// </summary>
            [EnumMember(Value = "timesheet")]
            Timesheet = 2,

            /// <summary>
            /// Enum Booking for value: booking
            /// </summary>
            [EnumMember(Value = "booking")]
            Booking = 3,

            /// <summary>
            /// Enum Grade for value: grade
            /// </summary>
            [EnumMember(Value = "grade")]
            Grade = 4,

            /// <summary>
            /// Enum Agency for value: agency
            /// </summary>
            [EnumMember(Value = "agency")]
            Agency = 5,

            /// <summary>
            /// Enum Reasonforvacancy for value: reason_for_vacancy
            /// </summary>
            [EnumMember(Value = "reason_for_vacancy")]
            Reasonforvacancy = 6,

            /// <summary>
            /// Enum Contractstatus for value: contract_status
            /// </summary>
            [EnumMember(Value = "contract_status")]
            Contractstatus = 7,

            /// <summary>
            /// Enum Staffgroup for value: staff_group
            /// </summary>
            [EnumMember(Value = "staff_group")]
            Staffgroup = 8,

            /// <summary>
            /// Enum Unit for value: unit
            /// </summary>
            [EnumMember(Value = "unit")]
            Unit = 9

        }

        /// <summary>
        /// Entity that is changed.
        /// </summary>
        /// <value>Entity that is changed.</value>
        [DataMember(Name="entityType", EmitDefaultValue=false)]
        public EntityTypeEnum? EntityType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Event" /> class.
        /// </summary>
        /// <param name="eventType">Type of change that is done to the entity.</param>
        /// <param name="entityType">Entity that is changed..</param>
        /// <param name="entityId">Trust identifier of the changed entity.</param>
        /// <param name="timeStamp">Timestamp of the event.</param>
        public Event(EventTypeEnum? eventType = default(EventTypeEnum?), EntityTypeEnum? entityType = default(EntityTypeEnum?), string entityId = default(string), DateTime timeStamp = default(DateTime))
        {
            this.EventType = eventType;
            this.EntityType = entityType;
            this.EntityId = entityId;
            this.TimeStamp = timeStamp;
        }
        
        /// <summary>
        /// Trust identifier of the changed entity
        /// </summary>
        /// <value>Trust identifier of the changed entity</value>
        [DataMember(Name="entityId", EmitDefaultValue=false)]
        public string EntityId { get; set; }

        /// <summary>
        /// Timestamp of the event
        /// </summary>
        /// <value>Timestamp of the event</value>
        [DataMember(Name="timeStamp", EmitDefaultValue=false)]
        public DateTime TimeStamp { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Event {\n");
            sb.Append("  EventType: ").Append(EventType).Append("\n");
            sb.Append("  EntityType: ").Append(EntityType).Append("\n");
            sb.Append("  EntityId: ").Append(EntityId).Append("\n");
            sb.Append("  TimeStamp: ").Append(TimeStamp).Append("\n");
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
            return this.Equals(input as Event);
        }

        /// <summary>
        /// Returns true if Event instances are equal
        /// </summary>
        /// <param name="input">Instance of Event to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Event input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EventType == input.EventType ||
                    this.EventType.Equals(input.EventType)
                ) && 
                (
                    this.EntityType == input.EntityType ||
                    this.EntityType.Equals(input.EntityType)
                ) && 
                (
                    this.EntityId == input.EntityId ||
                    (this.EntityId != null &&
                    this.EntityId.Equals(input.EntityId))
                ) && 
                (
                    this.TimeStamp == input.TimeStamp ||
                    (this.TimeStamp != null &&
                    this.TimeStamp.Equals(input.TimeStamp))
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
                hashCode = hashCode * 59 + this.EventType.GetHashCode();
                hashCode = hashCode * 59 + this.EntityType.GetHashCode();
                if (this.EntityId != null)
                    hashCode = hashCode * 59 + this.EntityId.GetHashCode();
                if (this.TimeStamp != null)
                    hashCode = hashCode * 59 + this.TimeStamp.GetHashCode();
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
