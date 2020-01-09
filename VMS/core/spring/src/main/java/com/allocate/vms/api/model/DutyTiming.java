package com.allocate.vms.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DutyTiming
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

public class DutyTiming   {
  @JsonProperty("date")
  private LocalDate date;

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("endTime")
  private String endTime;

  @JsonProperty("breakDuration")
  private Integer breakDuration;

  public DutyTiming date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Date of the duty (yyyy-mm-dd)
   * @return date
  */
  @ApiModelProperty(example = "Sun Jul 29 01:00:00 BST 2018", required = true, value = "Date of the duty (yyyy-mm-dd)")
  @NotNull

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public DutyTiming startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Start time of the shift
   * @return startTime
  */
  @ApiModelProperty(example = "12:40", required = true, value = "Start time of the shift")
  @NotNull


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public DutyTiming endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * End time of the shift
   * @return endTime
  */
  @ApiModelProperty(example = "01:25", required = true, value = "End time of the shift")
  @NotNull


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public DutyTiming breakDuration(Integer breakDuration) {
    this.breakDuration = breakDuration;
    return this;
  }

  /**
   * Duration of break in minutes
   * @return breakDuration
  */
  @ApiModelProperty(example = "30", value = "Duration of break in minutes")


  public Integer getBreakDuration() {
    return breakDuration;
  }

  public void setBreakDuration(Integer breakDuration) {
    this.breakDuration = breakDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyTiming dutyTiming = (DutyTiming) o;
    return Objects.equals(this.date, dutyTiming.date) &&
        Objects.equals(this.startTime, dutyTiming.startTime) &&
        Objects.equals(this.endTime, dutyTiming.endTime) &&
        Objects.equals(this.breakDuration, dutyTiming.breakDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, startTime, endTime, breakDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyTiming {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    breakDuration: ").append(toIndentedString(breakDuration)).append("\n");
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

