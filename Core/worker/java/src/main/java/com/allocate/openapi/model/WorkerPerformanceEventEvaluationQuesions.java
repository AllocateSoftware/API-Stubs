/*
 * Workers
 * ## Workers and events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkerPerformanceEventEvaluationQuesions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:36:44.017277Z[Europe/London]")
public class WorkerPerformanceEventEvaluationQuesions {
  public static final String SERIALIZED_NAME_QUESTION = "question";
  @SerializedName(SERIALIZED_NAME_QUESTION)
  private String question;

  public static final String SERIALIZED_NAME_ANSWER = "answer";
  @SerializedName(SERIALIZED_NAME_ANSWER)
  private String answer;


  public WorkerPerformanceEventEvaluationQuesions question(String question) {
    
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuestion() {
    return question;
  }


  public void setQuestion(String question) {
    this.question = question;
  }


  public WorkerPerformanceEventEvaluationQuesions answer(String answer) {
    
    this.answer = answer;
    return this;
  }

   /**
   * Get answer
   * @return answer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAnswer() {
    return answer;
  }


  public void setAnswer(String answer) {
    this.answer = answer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerPerformanceEventEvaluationQuesions workerPerformanceEventEvaluationQuesions = (WorkerPerformanceEventEvaluationQuesions) o;
    return Objects.equals(this.question, workerPerformanceEventEvaluationQuesions.question) &&
        Objects.equals(this.answer, workerPerformanceEventEvaluationQuesions.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(question, answer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerPerformanceEventEvaluationQuesions {\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
