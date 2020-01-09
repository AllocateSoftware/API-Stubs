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
 * DutyTimes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:20.724158Z[Europe/London]")

public class DutyTimes   {
  @JsonProperty("period")
  private DutyTimes period;

  @JsonProperty("restTime")
  private Integer restTime;

  public DutyTimes period(DutyTimes period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  */
  @ApiModelProperty(value = "")

  @Valid

  public DutyTimes getPeriod() {
    return period;
  }

  public void setPeriod(DutyTimes period) {
    this.period = period;
  }

  public DutyTimes restTime(Integer restTime) {
    this.restTime = restTime;
    return this;
  }

  /**
   * Number of minutes of rest date-time
   * @return restTime
  */
  @ApiModelProperty(example = "60", value = "Number of minutes of rest date-time")


  public Integer getRestTime() {
    return restTime;
  }

  public void setRestTime(Integer restTime) {
    this.restTime = restTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyTimes dutyTimes = (DutyTimes) o;
    return Objects.equals(this.period, dutyTimes.period) &&
        Objects.equals(this.restTime, dutyTimes.restTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, restTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyTimes {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    restTime: ").append(toIndentedString(restTime)).append("\n");
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

