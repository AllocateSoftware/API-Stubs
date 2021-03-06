/* 
 * Activity API
 *
 *      ## API for querying worker activity.      This is an early availabilty API, and is subject to change. 
 *
 * The version of the OpenAPI document: 0.0.1
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
    /// HoursAssignmentShift
    /// </summary>
    [DataContract]
    public partial class HoursAssignmentShift :  IEquatable<HoursAssignmentShift>, IValidatableObject
    {
        /// <summary>
        ///  Standard HealthRoster enumerations: *   Day *   Combined *   Night *   OnCall *   SleepIn *   StandBy *   Rest *   None *   ADO *   Evening *   Other *   PrivatePractice                 
        /// </summary>
        /// <value> Standard HealthRoster enumerations: *   Day *   Combined *   Night *   OnCall *   SleepIn *   StandBy *   Rest *   None *   ADO *   Evening *   Other *   PrivatePractice                 </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Day for value: day
            /// </summary>
            [EnumMember(Value = "day")]
            Day = 1,

            /// <summary>
            /// Enum Combined for value: combined
            /// </summary>
            [EnumMember(Value = "combined")]
            Combined = 2,

            /// <summary>
            /// Enum Night for value: night
            /// </summary>
            [EnumMember(Value = "night")]
            Night = 3,

            /// <summary>
            /// Enum OnCall for value: onCall
            /// </summary>
            [EnumMember(Value = "onCall")]
            OnCall = 4,

            /// <summary>
            /// Enum SleepIn for value: sleepIn
            /// </summary>
            [EnumMember(Value = "sleepIn")]
            SleepIn = 5,

            /// <summary>
            /// Enum StandBy for value: standBy
            /// </summary>
            [EnumMember(Value = "standBy")]
            StandBy = 6,

            /// <summary>
            /// Enum Rest for value: rest
            /// </summary>
            [EnumMember(Value = "rest")]
            Rest = 7,

            /// <summary>
            /// Enum None for value: none
            /// </summary>
            [EnumMember(Value = "none")]
            None = 8,

            /// <summary>
            /// Enum ADO for value: ADO
            /// </summary>
            [EnumMember(Value = "ADO")]
            ADO = 9,

            /// <summary>
            /// Enum Evening for value: evening
            /// </summary>
            [EnumMember(Value = "evening")]
            Evening = 10,

            /// <summary>
            /// Enum Other for value: other
            /// </summary>
            [EnumMember(Value = "other")]
            Other = 11,

            /// <summary>
            /// Enum PrivatePractice for value: PrivatePractice
            /// </summary>
            [EnumMember(Value = "PrivatePractice")]
            PrivatePractice = 12

        }

        /// <summary>
        ///  Standard HealthRoster enumerations: *   Day *   Combined *   Night *   OnCall *   SleepIn *   StandBy *   Rest *   None *   ADO *   Evening *   Other *   PrivatePractice                 
        /// </summary>
        /// <value> Standard HealthRoster enumerations: *   Day *   Combined *   Night *   OnCall *   SleepIn *   StandBy *   Rest *   None *   ADO *   Evening *   Other *   PrivatePractice                 </value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="HoursAssignmentShift" /> class.
        /// </summary>
        /// <param name="type"> Standard HealthRoster enumerations: *   Day *   Combined *   Night *   OnCall *   SleepIn *   StandBy *   Rest *   None *   ADO *   Evening *   Other *   PrivatePractice                 .</param>
        /// <param name="name">name.</param>
        public HoursAssignmentShift(TypeEnum? type = default(TypeEnum?), string name = default(string))
        {
            this.Type = type;
            this.Name = name;
        }
        

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HoursAssignmentShift {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return this.Equals(input as HoursAssignmentShift);
        }

        /// <summary>
        /// Returns true if HoursAssignmentShift instances are equal
        /// </summary>
        /// <param name="input">Instance of HoursAssignmentShift to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HoursAssignmentShift input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
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
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
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
