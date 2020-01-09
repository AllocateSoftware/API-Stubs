package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.WorkerPerformanceEventEvaluationEvaluator;
import com.allocate.openapi.model.WorkerPerformanceEventEvaluationQuesions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkerPerformanceEventEvaluation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class WorkerPerformanceEventEvaluation   {
  @JsonProperty("evaluator")
  private WorkerPerformanceEventEvaluationEvaluator evaluator;

  @JsonProperty("score")
  private BigDecimal score;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("quesions")
  @Valid
  private List<WorkerPerformanceEventEvaluationQuesions> quesions = null;

  public WorkerPerformanceEventEvaluation evaluator(WorkerPerformanceEventEvaluationEvaluator evaluator) {
    this.evaluator = evaluator;
    return this;
  }

  /**
   * Get evaluator
   * @return evaluator
  */
  @ApiModelProperty(value = "")

  @Valid

  public WorkerPerformanceEventEvaluationEvaluator getEvaluator() {
    return evaluator;
  }

  public void setEvaluator(WorkerPerformanceEventEvaluationEvaluator evaluator) {
    this.evaluator = evaluator;
  }

  public WorkerPerformanceEventEvaluation score(BigDecimal score) {
    this.score = score;
    return this;
  }

  /**
   * Score out of 10
   * minimum: 0
   * maximum: 10
   * @return score
  */
  @ApiModelProperty(value = "Score out of 10")

  @Valid
@DecimalMin("0") @DecimalMax("10") 
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public WorkerPerformanceEventEvaluation comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Free text comment
   * @return comment
  */
  @ApiModelProperty(value = "Free text comment")


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public WorkerPerformanceEventEvaluation quesions(List<WorkerPerformanceEventEvaluationQuesions> quesions) {
    this.quesions = quesions;
    return this;
  }

  public WorkerPerformanceEventEvaluation addQuesionsItem(WorkerPerformanceEventEvaluationQuesions quesionsItem) {
    if (this.quesions == null) {
      this.quesions = new ArrayList<>();
    }
    this.quesions.add(quesionsItem);
    return this;
  }

  /**
   * List of questions and answers froman evaluator
   * @return quesions
  */
  @ApiModelProperty(value = "List of questions and answers froman evaluator")

  @Valid

  public List<WorkerPerformanceEventEvaluationQuesions> getQuesions() {
    return quesions;
  }

  public void setQuesions(List<WorkerPerformanceEventEvaluationQuesions> quesions) {
    this.quesions = quesions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerPerformanceEventEvaluation workerPerformanceEventEvaluation = (WorkerPerformanceEventEvaluation) o;
    return Objects.equals(this.evaluator, workerPerformanceEventEvaluation.evaluator) &&
        Objects.equals(this.score, workerPerformanceEventEvaluation.score) &&
        Objects.equals(this.comment, workerPerformanceEventEvaluation.comment) &&
        Objects.equals(this.quesions, workerPerformanceEventEvaluation.quesions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluator, score, comment, quesions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerPerformanceEventEvaluation {\n");
    
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    quesions: ").append(toIndentedString(quesions)).append("\n");
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

