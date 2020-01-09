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
 * WorkerRegistrationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class WorkerRegistrationResponse   {
  @JsonProperty("workerId")
  private String workerId;

  public WorkerRegistrationResponse workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * Allocate Worker ID of the person
   * @return workerId
  */
  @ApiModelProperty(example = "3B78B5C3-07B3-4DC6-8A2A-7D85153869FC", required = true, value = "Allocate Worker ID of the person")
  @NotNull


  public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerRegistrationResponse workerRegistrationResponse = (WorkerRegistrationResponse) o;
    return Objects.equals(this.workerId, workerRegistrationResponse.workerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerRegistrationResponse {\n");
    
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
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

