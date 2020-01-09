package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Duty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DutyUpdatedEventAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutyUpdatedEventAllOf   {
  @JsonProperty("duty")
  private Duty duty;

  public DutyUpdatedEventAllOf duty(Duty duty) {
    this.duty = duty;
    return this;
  }

  /**
   * Get duty
   * @return duty
  */
  @ApiModelProperty(value = "")

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
    DutyUpdatedEventAllOf dutyUpdatedEventAllOf = (DutyUpdatedEventAllOf) o;
    return Objects.equals(this.duty, dutyUpdatedEventAllOf.duty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyUpdatedEventAllOf {\n");
    
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

