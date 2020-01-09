package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkerPerformanceEventDutyDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class WorkerPerformanceEventDutyDetails   {
  @JsonProperty("dutyId")
  private String dutyId;

  @JsonProperty("from")
  private OffsetDateTime from;

  @JsonProperty("to")
  private OffsetDateTime to;

  public WorkerPerformanceEventDutyDetails dutyId(String dutyId) {
    this.dutyId = dutyId;
    return this;
  }

  /**
   * ID of the duty within the allocate system
   * @return dutyId
  */
  @ApiModelProperty(value = "ID of the duty within the allocate system")


  public String getDutyId() {
    return dutyId;
  }

  public void setDutyId(String dutyId) {
    this.dutyId = dutyId;
  }

  public WorkerPerformanceEventDutyDetails from(OffsetDateTime from) {
    this.from = from;
    return this;
  }

  /**
   * When the duty started
   * @return from
  */
  @ApiModelProperty(value = "When the duty started")

  @Valid

  public OffsetDateTime getFrom() {
    return from;
  }

  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }

  public WorkerPerformanceEventDutyDetails to(OffsetDateTime to) {
    this.to = to;
    return this;
  }

  /**
   * When the duty ended
   * @return to
  */
  @ApiModelProperty(value = "When the duty ended")

  @Valid

  public OffsetDateTime getTo() {
    return to;
  }

  public void setTo(OffsetDateTime to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerPerformanceEventDutyDetails workerPerformanceEventDutyDetails = (WorkerPerformanceEventDutyDetails) o;
    return Objects.equals(this.dutyId, workerPerformanceEventDutyDetails.dutyId) &&
        Objects.equals(this.from, workerPerformanceEventDutyDetails.from) &&
        Objects.equals(this.to, workerPerformanceEventDutyDetails.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dutyId, from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerPerformanceEventDutyDetails {\n");
    
    sb.append("    dutyId: ").append(toIndentedString(dutyId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

