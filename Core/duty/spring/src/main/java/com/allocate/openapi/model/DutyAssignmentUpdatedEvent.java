package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DutyEventAllOf;
import com.allocate.openapi.model.Event;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DutyAssignmentUpdatedEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutyAssignmentUpdatedEvent extends Event  {
  @JsonProperty("dutyId")
  private String dutyId;

  public DutyAssignmentUpdatedEvent dutyId(String dutyId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyAssignmentUpdatedEvent dutyAssignmentUpdatedEvent = (DutyAssignmentUpdatedEvent) o;
    return Objects.equals(this.dutyId, dutyAssignmentUpdatedEvent.dutyId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dutyId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyAssignmentUpdatedEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dutyId: ").append(toIndentedString(dutyId)).append("\n");
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

