package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Duty;
import com.allocate.openapi.model.DutyAssignmentRedeploymentEventAllOf;
import com.allocate.openapi.model.Event;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DutyAssignmentRedeploymentEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutyAssignmentRedeploymentEvent extends Event  {
  @JsonProperty("assignmentNumber")
  private String assignmentNumber;

  @JsonProperty("originalDuty")
  private Duty originalDuty;

  @JsonProperty("newDuty")
  private Duty newDuty;

  public DutyAssignmentRedeploymentEvent assignmentNumber(String assignmentNumber) {
    this.assignmentNumber = assignmentNumber;
    return this;
  }

  /**
   * Get assignmentNumber
   * @return assignmentNumber
  */
  @ApiModelProperty(value = "")


  public String getAssignmentNumber() {
    return assignmentNumber;
  }

  public void setAssignmentNumber(String assignmentNumber) {
    this.assignmentNumber = assignmentNumber;
  }

  public DutyAssignmentRedeploymentEvent originalDuty(Duty originalDuty) {
    this.originalDuty = originalDuty;
    return this;
  }

  /**
   * Get originalDuty
   * @return originalDuty
  */
  @ApiModelProperty(value = "")

  @Valid

  public Duty getOriginalDuty() {
    return originalDuty;
  }

  public void setOriginalDuty(Duty originalDuty) {
    this.originalDuty = originalDuty;
  }

  public DutyAssignmentRedeploymentEvent newDuty(Duty newDuty) {
    this.newDuty = newDuty;
    return this;
  }

  /**
   * Get newDuty
   * @return newDuty
  */
  @ApiModelProperty(value = "")

  @Valid

  public Duty getNewDuty() {
    return newDuty;
  }

  public void setNewDuty(Duty newDuty) {
    this.newDuty = newDuty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyAssignmentRedeploymentEvent dutyAssignmentRedeploymentEvent = (DutyAssignmentRedeploymentEvent) o;
    return Objects.equals(this.assignmentNumber, dutyAssignmentRedeploymentEvent.assignmentNumber) &&
        Objects.equals(this.originalDuty, dutyAssignmentRedeploymentEvent.originalDuty) &&
        Objects.equals(this.newDuty, dutyAssignmentRedeploymentEvent.newDuty) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentNumber, originalDuty, newDuty, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyAssignmentRedeploymentEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    assignmentNumber: ").append(toIndentedString(assignmentNumber)).append("\n");
    sb.append("    originalDuty: ").append(toIndentedString(originalDuty)).append("\n");
    sb.append("    newDuty: ").append(toIndentedString(newDuty)).append("\n");
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

