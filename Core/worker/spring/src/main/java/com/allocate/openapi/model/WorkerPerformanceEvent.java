package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.WorkerPerformanceEventDutyDetails;
import com.allocate.openapi.model.WorkerPerformanceEventEvaluation;
import com.allocate.openapi.model.WorkerPerformanceEventWorker;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkerPerformanceEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class WorkerPerformanceEvent   {
  @JsonProperty("worker")
  private WorkerPerformanceEventWorker worker;

  @JsonProperty("dutyDetails")
  private WorkerPerformanceEventDutyDetails dutyDetails;

  @JsonProperty("evaluation")
  private WorkerPerformanceEventEvaluation evaluation;

  public WorkerPerformanceEvent worker(WorkerPerformanceEventWorker worker) {
    this.worker = worker;
    return this;
  }

  /**
   * Get worker
   * @return worker
  */
  @ApiModelProperty(value = "")

  @Valid

  public WorkerPerformanceEventWorker getWorker() {
    return worker;
  }

  public void setWorker(WorkerPerformanceEventWorker worker) {
    this.worker = worker;
  }

  public WorkerPerformanceEvent dutyDetails(WorkerPerformanceEventDutyDetails dutyDetails) {
    this.dutyDetails = dutyDetails;
    return this;
  }

  /**
   * Get dutyDetails
   * @return dutyDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public WorkerPerformanceEventDutyDetails getDutyDetails() {
    return dutyDetails;
  }

  public void setDutyDetails(WorkerPerformanceEventDutyDetails dutyDetails) {
    this.dutyDetails = dutyDetails;
  }

  public WorkerPerformanceEvent evaluation(WorkerPerformanceEventEvaluation evaluation) {
    this.evaluation = evaluation;
    return this;
  }

  /**
   * Get evaluation
   * @return evaluation
  */
  @ApiModelProperty(value = "")

  @Valid

  public WorkerPerformanceEventEvaluation getEvaluation() {
    return evaluation;
  }

  public void setEvaluation(WorkerPerformanceEventEvaluation evaluation) {
    this.evaluation = evaluation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerPerformanceEvent workerPerformanceEvent = (WorkerPerformanceEvent) o;
    return Objects.equals(this.worker, workerPerformanceEvent.worker) &&
        Objects.equals(this.dutyDetails, workerPerformanceEvent.dutyDetails) &&
        Objects.equals(this.evaluation, workerPerformanceEvent.evaluation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worker, dutyDetails, evaluation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerPerformanceEvent {\n");
    
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    dutyDetails: ").append(toIndentedString(dutyDetails)).append("\n");
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
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

