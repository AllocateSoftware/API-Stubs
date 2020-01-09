package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkerPerformanceEventEvaluationQuesions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class WorkerPerformanceEventEvaluationQuesions   {
  @JsonProperty("question")
  private String question;

  @JsonProperty("answer")
  private String answer;

  public WorkerPerformanceEventEvaluationQuesions question(String question) {
    this.question = question;
    return this;
  }

  /**
   * Get question
   * @return question
  */
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
  */
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

