package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Identifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkerPerformanceEventEvaluationEvaluator
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class WorkerPerformanceEventEvaluationEvaluator   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("identities")
  @Valid
  private List<Identifier> identities = null;

  public WorkerPerformanceEventEvaluationEvaluator name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkerPerformanceEventEvaluationEvaluator identities(List<Identifier> identities) {
    this.identities = identities;
    return this;
  }

  public WorkerPerformanceEventEvaluationEvaluator addIdentitiesItem(Identifier identitiesItem) {
    if (this.identities == null) {
      this.identities = new ArrayList<>();
    }
    this.identities.add(identitiesItem);
    return this;
  }

  /**
   * Get identities
   * @return identities
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Identifier> getIdentities() {
    return identities;
  }

  public void setIdentities(List<Identifier> identities) {
    this.identities = identities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerPerformanceEventEvaluationEvaluator workerPerformanceEventEvaluationEvaluator = (WorkerPerformanceEventEvaluationEvaluator) o;
    return Objects.equals(this.name, workerPerformanceEventEvaluationEvaluator.name) &&
        Objects.equals(this.identities, workerPerformanceEventEvaluationEvaluator.identities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, identities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerPerformanceEventEvaluationEvaluator {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
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

