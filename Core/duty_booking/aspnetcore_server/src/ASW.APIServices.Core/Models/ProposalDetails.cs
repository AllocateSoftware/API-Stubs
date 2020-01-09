/*
 * Duty Booking API and Events
 *
 * ## Duty Booking API and events and Events 
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
    public partial class ProposalDetails : IEquatable<ProposalDetails>
    { 
        /// <summary>
        /// The ASWid of the worker being offered for this duty
        /// </summary>
        /// <value>The ASWid of the worker being offered for this duty</value>
        [Required]
        [DataMember(Name="personId", EmitDefaultValue=false)]
        public string PersonId { get; set; }

        /// <summary>
        /// The engagement route for this worker
        /// </summary>
        /// <value>The engagement route for this worker</value>
        [TypeConverter(typeof(CustomEnumConverter<EngagementRouteEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EngagementRouteEnum
        {
            
            /// <summary>
            /// Enum SubstantiveEnum for substantive
            /// </summary>
            [EnumMember(Value = "substantive")]
            SubstantiveEnum = 1,
            
            /// <summary>
            /// Enum BankEnum for bank
            /// </summary>
            [EnumMember(Value = "bank")]
            BankEnum = 2,
            
            /// <summary>
            /// Enum AgencyEnum for agency
            /// </summary>
            [EnumMember(Value = "agency")]
            AgencyEnum = 3,
            
            /// <summary>
            /// Enum OtherEnum for other
            /// </summary>
            [EnumMember(Value = "other")]
            OtherEnum = 4
        }

        /// <summary>
        /// The engagement route for this worker
        /// </summary>
        /// <value>The engagement route for this worker</value>
        [Required]
        [DataMember(Name="engagementRoute", EmitDefaultValue=false)]
        public EngagementRouteEnum EngagementRoute { get; set; }

        /// <summary>
        /// The ASWid of the agency, if this worker is being provided through an agency engagement
        /// </summary>
        /// <value>The ASWid of the agency, if this worker is being provided through an agency engagement</value>
        [DataMember(Name="agencyId", EmitDefaultValue=false)]
        public Object AgencyId { get; set; }

        /// <summary>
        /// Cost for this worker
        /// </summary>
        /// <value>Cost for this worker</value>
        [Required]
        [DataMember(Name="cost", EmitDefaultValue=false)]
        public decimal Cost { get; set; }

        /// <summary>
        /// Gets or Sets CancellationCosts
        /// </summary>
        [Required]
        [DataMember(Name="cancellationCosts", EmitDefaultValue=false)]
        public List<CancellationCost> CancellationCosts { get; set; }

        /// <summary>
        /// Any options being passed for this worker
        /// </summary>
        /// <value>Any options being passed for this worker</value>
        [TypeConverter(typeof(CustomEnumConverter<List&lt;List&lt;OptionsEnum&gt;&gt;>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum List&lt;List&lt;OptionsEnum&gt;&gt;
        {
            
            /// <summary>
            /// Enum DirectBookEnum for directBook
            /// </summary>
            [EnumMember(Value = "directBook")]
            DirectBookEnum = 1
        }

        /// <summary>
        /// Gets or Sets Options
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<List&lt;OptionsEnum&gt;>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum List&lt;OptionsEnum&gt;
        {
            
            /// <summary>
            /// Enum DirectBookEnum for directBook
            /// </summary>
            [EnumMember(Value = "directBook")]
            DirectBookEnum = 1
        }

        /// <summary>
        /// Any options being passed for this worker
        /// </summary>
        /// <value>Any options being passed for this worker</value>
        [DataMember(Name="options", EmitDefaultValue=false)]
        public List<List<OptionsEnum>> Options { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ProposalDetails {\n");
            sb.Append("  PersonId: ").Append(PersonId).Append("\n");
            sb.Append("  EngagementRoute: ").Append(EngagementRoute).Append("\n");
            sb.Append("  AgencyId: ").Append(AgencyId).Append("\n");
            sb.Append("  Cost: ").Append(Cost).Append("\n");
            sb.Append("  CancellationCosts: ").Append(CancellationCosts).Append("\n");
            sb.Append("  Options: ").Append(Options).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ProposalDetails)obj);
        }

        /// <summary>
        /// Returns true if ProposalDetails instances are equal
        /// </summary>
        /// <param name="other">Instance of ProposalDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProposalDetails other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    PersonId == other.PersonId ||
                    PersonId != null &&
                    PersonId.Equals(other.PersonId)
                ) && 
                (
                    EngagementRoute == other.EngagementRoute ||
                    
                    EngagementRoute.Equals(other.EngagementRoute)
                ) && 
                (
                    AgencyId == other.AgencyId ||
                    AgencyId != null &&
                    AgencyId.Equals(other.AgencyId)
                ) && 
                (
                    Cost == other.Cost ||
                    
                    Cost.Equals(other.Cost)
                ) && 
                (
                    CancellationCosts == other.CancellationCosts ||
                    CancellationCosts != null &&
                    other.CancellationCosts != null &&
                    CancellationCosts.SequenceEqual(other.CancellationCosts)
                ) && 
                (
                    Options == other.Options ||
                    Options.SequenceEqual(other.Options)
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
                    if (PersonId != null)
                    hashCode = hashCode * 59 + PersonId.GetHashCode();
                    
                    hashCode = hashCode * 59 + EngagementRoute.GetHashCode();
                    if (AgencyId != null)
                    hashCode = hashCode * 59 + AgencyId.GetHashCode();
                    
                    hashCode = hashCode * 59 + Cost.GetHashCode();
                    if (CancellationCosts != null)
                    hashCode = hashCode * 59 + CancellationCosts.GetHashCode();
                    
                    hashCode = hashCode * 59 + Options.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ProposalDetails left, ProposalDetails right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ProposalDetails left, ProposalDetails right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
