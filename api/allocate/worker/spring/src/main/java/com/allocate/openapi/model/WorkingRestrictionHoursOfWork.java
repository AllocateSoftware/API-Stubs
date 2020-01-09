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
 * WorkingRestrictionHoursOfWork
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class WorkingRestrictionHoursOfWork   {
  @JsonProperty("mon")
  private TimeSpan mon;

  @JsonProperty("tue")
  private TimeSpan tue;

  @JsonProperty("wed")
  private TimeSpan wed;

  @JsonProperty("thu")
  private TimeSpan thu;

  @JsonProperty("fri")
  private TimeSpan fri;

  @JsonProperty("sat")
  private TimeSpan sat;

  @JsonProperty("sun")
  private TimeSpan sun;

  public WorkingRestrictionHoursOfWork mon(TimeSpan mon) {
    this.mon = mon;
    return this;
  }

  /**
   * Get mon
   * @return mon
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeSpan getMon() {
    return mon;
  }

  public void setMon(TimeSpan mon) {
    this.mon = mon;
  }

  public WorkingRestrictionHoursOfWork tue(TimeSpan tue) {
    this.tue = tue;
    return this;
  }

  /**
   * Get tue
   * @return tue
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeSpan getTue() {
    return tue;
  }

  public void setTue(TimeSpan tue) {
    this.tue = tue;
  }

  public WorkingRestrictionHoursOfWork wed(TimeSpan wed) {
    this.wed = wed;
    return this;
  }

  /**
   * Get wed
   * @return wed
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeSpan getWed() {
    return wed;
  }

  public void setWed(TimeSpan wed) {
    this.wed = wed;
  }

  public WorkingRestrictionHoursOfWork thu(TimeSpan thu) {
    this.thu = thu;
    return this;
  }

  /**
   * Get thu
   * @return thu
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeSpan getThu() {
    return thu;
  }

  public void setThu(TimeSpan thu) {
    this.thu = thu;
  }

  public WorkingRestrictionHoursOfWork fri(TimeSpan fri) {
    this.fri = fri;
    return this;
  }

  /**
   * Get fri
   * @return fri
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeSpan getFri() {
    return fri;
  }

  public void setFri(TimeSpan fri) {
    this.fri = fri;
  }

  public WorkingRestrictionHoursOfWork sat(TimeSpan sat) {
    this.sat = sat;
    return this;
  }

  /**
   * Get sat
   * @return sat
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeSpan getSat() {
    return sat;
  }

  public void setSat(TimeSpan sat) {
    this.sat = sat;
  }

  public WorkingRestrictionHoursOfWork sun(TimeSpan sun) {
    this.sun = sun;
    return this;
  }

  /**
   * Get sun
   * @return sun
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeSpan getSun() {
    return sun;
  }

  public void setSun(TimeSpan sun) {
    this.sun = sun;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkingRestrictionHoursOfWork workingRestrictionHoursOfWork = (WorkingRestrictionHoursOfWork) o;
    return Objects.equals(this.mon, workingRestrictionHoursOfWork.mon) &&
        Objects.equals(this.tue, workingRestrictionHoursOfWork.tue) &&
        Objects.equals(this.wed, workingRestrictionHoursOfWork.wed) &&
        Objects.equals(this.thu, workingRestrictionHoursOfWork.thu) &&
        Objects.equals(this.fri, workingRestrictionHoursOfWork.fri) &&
        Objects.equals(this.sat, workingRestrictionHoursOfWork.sat) &&
        Objects.equals(this.sun, workingRestrictionHoursOfWork.sun);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mon, tue, wed, thu, fri, sat, sun);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkingRestrictionHoursOfWork {\n");
    
    sb.append("    mon: ").append(toIndentedString(mon)).append("\n");
    sb.append("    tue: ").append(toIndentedString(tue)).append("\n");
    sb.append("    wed: ").append(toIndentedString(wed)).append("\n");
    sb.append("    thu: ").append(toIndentedString(thu)).append("\n");
    sb.append("    fri: ").append(toIndentedString(fri)).append("\n");
    sb.append("    sat: ").append(toIndentedString(sat)).append("\n");
    sb.append("    sun: ").append(toIndentedString(sun)).append("\n");
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

