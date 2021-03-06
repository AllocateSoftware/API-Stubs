/*
 * Workers
 *
 * ## Workers and events 
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
    public partial class WorkerPerformanceEventEvaluationQuesions : IEquatable<WorkerPerformanceEventEvaluationQuesions>
    { 
        /// <summary>
        /// Gets or Sets Question
        /// </summary>
        [DataMember(Name="question", EmitDefaultValue=false)]
        public string Question { get; set; }

        /// <summary>
        /// Gets or Sets Answer
        /// </summary>
        [DataMember(Name="answer", EmitDefaultValue=false)]
        public string Answer { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WorkerPerformanceEventEvaluationQuesions {\n");
            sb.Append("  Question: ").Append(Question).Append("\n");
            sb.Append("  Answer: ").Append(Answer).Append("\n");
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
            return obj.GetType() == GetType() && Equals((WorkerPerformanceEventEvaluationQuesions)obj);
        }

        /// <summary>
        /// Returns true if WorkerPerformanceEventEvaluationQuesions instances are equal
        /// </summary>
        /// <param name="other">Instance of WorkerPerformanceEventEvaluationQuesions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WorkerPerformanceEventEvaluationQuesions other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Question == other.Question ||
                    Question != null &&
                    Question.Equals(other.Question)
                ) && 
                (
                    Answer == other.Answer ||
                    Answer != null &&
                    Answer.Equals(other.Answer)
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
                    if (Question != null)
                    hashCode = hashCode * 59 + Question.GetHashCode();
                    if (Answer != null)
                    hashCode = hashCode * 59 + Answer.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WorkerPerformanceEventEvaluationQuesions left, WorkerPerformanceEventEvaluationQuesions right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WorkerPerformanceEventEvaluationQuesions left, WorkerPerformanceEventEvaluationQuesions right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
