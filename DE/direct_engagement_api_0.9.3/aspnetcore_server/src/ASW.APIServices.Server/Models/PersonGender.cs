/*
 * DE Provider Direct Engagement API
 *
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
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
using ASW.APIServices.Server.Converters;

namespace ASW.APIServices.Server.Models
{ 
        /// <summary>
        /// Person gender, potenially could be a broader set
        /// </summary>
        /// <value>Person gender, potenially could be a broader set</value>
        [TypeConverter(typeof(CustomEnumConverter<PersonGender>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum PersonGender
        {
            
            /// <summary>
            /// Enum MaleEnum for male
            /// </summary>
            [EnumMember(Value = "male")]
            MaleEnum = 1,
            
            /// <summary>
            /// Enum FemaleEnum for female
            /// </summary>
            [EnumMember(Value = "female")]
            FemaleEnum = 2
        }
}
