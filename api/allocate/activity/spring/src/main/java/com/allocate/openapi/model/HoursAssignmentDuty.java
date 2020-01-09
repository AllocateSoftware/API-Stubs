package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.TimeSpan;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HoursAssignmentDuty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:19.518070Z[Europe/London]")

public class HoursAssignmentDuty   {
  @JsonProperty("when")
  private TimeSpan when;

  public HoursAssignmentDuty when(TimeSpan when) {
    this.when = when;
    return this;
  }

  /**
   * Get when
   * @return when
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeSpan getWhen() {
    return when;
  }

  public void setWhen(TimeSpan when) {
    this.when = when;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoursAssignmentDuty hoursAssignmentDuty = (HoursAssignmentDuty) o;
    return Objects.equals(this.when, hoursAssignmentDuty.when);
  }

  @Override
  public int hashCode() {
    return Objects.hash(when);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoursAssignmentDuty {\n");
    
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
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

