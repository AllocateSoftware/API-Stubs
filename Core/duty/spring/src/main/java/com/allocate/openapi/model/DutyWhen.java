package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DutyTimes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DutyWhen
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutyWhen   {
  @JsonProperty("planned")
  private DutyTimes planned;

  @JsonProperty("actual")
  private DutyTimes actual;

  @JsonProperty("shiftType")
  private String shiftType;

  public DutyWhen planned(DutyTimes planned) {
    this.planned = planned;
    return this;
  }

  /**
   * Get planned
   * @return planned
  */
  @ApiModelProperty(value = "")

  @Valid

  public DutyTimes getPlanned() {
    return planned;
  }

  public void setPlanned(DutyTimes planned) {
    this.planned = planned;
  }

  public DutyWhen actual(DutyTimes actual) {
    this.actual = actual;
    return this;
  }

  /**
   * Get actual
   * @return actual
  */
  @ApiModelProperty(value = "")

  @Valid

  public DutyTimes getActual() {
    return actual;
  }

  public void setActual(DutyTimes actual) {
    this.actual = actual;
  }

  public DutyWhen shiftType(String shiftType) {
    this.shiftType = shiftType;
    return this;
  }

  /**
   * Night, Day, etc
   * @return shiftType
  */
  @ApiModelProperty(value = "Night, Day, etc")


  public String getShiftType() {
    return shiftType;
  }

  public void setShiftType(String shiftType) {
    this.shiftType = shiftType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyWhen dutyWhen = (DutyWhen) o;
    return Objects.equals(this.planned, dutyWhen.planned) &&
        Objects.equals(this.actual, dutyWhen.actual) &&
        Objects.equals(this.shiftType, dutyWhen.shiftType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planned, actual, shiftType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyWhen {\n");
    
    sb.append("    planned: ").append(toIndentedString(planned)).append("\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
    sb.append("    shiftType: ").append(toIndentedString(shiftType)).append("\n");
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

