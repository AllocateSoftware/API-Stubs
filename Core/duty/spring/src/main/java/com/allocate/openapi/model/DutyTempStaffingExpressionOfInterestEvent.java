package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DutyTempStaffingExpressionOfInterestEventAllOf;
import com.allocate.openapi.model.Event;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A note previously added to a duty has been deleted.
 */
@ApiModel(description = "A note previously added to a duty has been deleted.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutyTempStaffingExpressionOfInterestEvent extends Event  {
  @JsonProperty("id")
  private String id;

  @JsonProperty("dutyId")
  private String dutyId;

  @JsonProperty("workerId")
  private String workerId;

  public DutyTempStaffingExpressionOfInterestEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DutyTempStaffingExpressionOfInterestEvent dutyId(String dutyId) {
    this.dutyId = dutyId;
    return this;
  }

  /**
   * Get dutyId
   * @return dutyId
  */
  @ApiModelProperty(value = "")


  public String getDutyId() {
    return dutyId;
  }

  public void setDutyId(String dutyId) {
    this.dutyId = dutyId;
  }

  public DutyTempStaffingExpressionOfInterestEvent workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * Identifier for the note
   * @return workerId
  */
  @ApiModelProperty(value = "Identifier for the note")


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
    DutyTempStaffingExpressionOfInterestEvent dutyTempStaffingExpressionOfInterestEvent = (DutyTempStaffingExpressionOfInterestEvent) o;
    return Objects.equals(this.id, dutyTempStaffingExpressionOfInterestEvent.id) &&
        Objects.equals(this.dutyId, dutyTempStaffingExpressionOfInterestEvent.dutyId) &&
        Objects.equals(this.workerId, dutyTempStaffingExpressionOfInterestEvent.workerId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dutyId, workerId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyTempStaffingExpressionOfInterestEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dutyId: ").append(toIndentedString(dutyId)).append("\n");
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

