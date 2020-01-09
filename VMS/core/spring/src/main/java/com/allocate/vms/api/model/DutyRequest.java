package com.allocate.vms.api.model;

import java.util.Objects;
import com.allocate.vms.api.model.Duty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DutyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

public class DutyRequest   {
  @JsonProperty("workerId")
  private String workerId;

  @JsonProperty("duty")
  private Duty duty;

  public DutyRequest workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * Where the caller wishes to direct-book a particular worker into the duty, their identifier is specified here.
   * @return workerId
  */
  @ApiModelProperty(value = "Where the caller wishes to direct-book a particular worker into the duty, their identifier is specified here.")


  public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  public DutyRequest duty(Duty duty) {
    this.duty = duty;
    return this;
  }

  /**
   * Get duty
   * @return duty
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Duty getDuty() {
    return duty;
  }

  public void setDuty(Duty duty) {
    this.duty = duty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyRequest dutyRequest = (DutyRequest) o;
    return Objects.equals(this.workerId, dutyRequest.workerId) &&
        Objects.equals(this.duty, dutyRequest.duty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workerId, duty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyRequest {\n");
    
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    duty: ").append(toIndentedString(duty)).append("\n");
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

