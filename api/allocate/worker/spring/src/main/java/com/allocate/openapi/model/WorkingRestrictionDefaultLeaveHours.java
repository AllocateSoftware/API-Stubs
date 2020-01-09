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
 * WorkingRestrictionDefaultLeaveHours
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class WorkingRestrictionDefaultLeaveHours   {
  @JsonProperty("useWorkingDay")
  private String useWorkingDay;

  @JsonProperty("mondayTime")
  private String mondayTime;

  @JsonProperty("tuesdayTime")
  private String tuesdayTime;

  @JsonProperty("wednesdayTime")
  private String wednesdayTime;

  @JsonProperty("fridayTime")
  private String fridayTime;

  @JsonProperty("saturdayTime")
  private String saturdayTime;

  @JsonProperty("sundayTime")
  private String sundayTime;

  public WorkingRestrictionDefaultLeaveHours useWorkingDay(String useWorkingDay) {
    this.useWorkingDay = useWorkingDay;
    return this;
  }

  /**
   * Get useWorkingDay
   * @return useWorkingDay
  */
  @ApiModelProperty(value = "")


  public String getUseWorkingDay() {
    return useWorkingDay;
  }

  public void setUseWorkingDay(String useWorkingDay) {
    this.useWorkingDay = useWorkingDay;
  }

  public WorkingRestrictionDefaultLeaveHours mondayTime(String mondayTime) {
    this.mondayTime = mondayTime;
    return this;
  }

  /**
   * Get mondayTime
   * @return mondayTime
  */
  @ApiModelProperty(value = "")


  public String getMondayTime() {
    return mondayTime;
  }

  public void setMondayTime(String mondayTime) {
    this.mondayTime = mondayTime;
  }

  public WorkingRestrictionDefaultLeaveHours tuesdayTime(String tuesdayTime) {
    this.tuesdayTime = tuesdayTime;
    return this;
  }

  /**
   * Get tuesdayTime
   * @return tuesdayTime
  */
  @ApiModelProperty(value = "")


  public String getTuesdayTime() {
    return tuesdayTime;
  }

  public void setTuesdayTime(String tuesdayTime) {
    this.tuesdayTime = tuesdayTime;
  }

  public WorkingRestrictionDefaultLeaveHours wednesdayTime(String wednesdayTime) {
    this.wednesdayTime = wednesdayTime;
    return this;
  }

  /**
   * Get wednesdayTime
   * @return wednesdayTime
  */
  @ApiModelProperty(value = "")


  public String getWednesdayTime() {
    return wednesdayTime;
  }

  public void setWednesdayTime(String wednesdayTime) {
    this.wednesdayTime = wednesdayTime;
  }

  public WorkingRestrictionDefaultLeaveHours fridayTime(String fridayTime) {
    this.fridayTime = fridayTime;
    return this;
  }

  /**
   * Get fridayTime
   * @return fridayTime
  */
  @ApiModelProperty(value = "")


  public String getFridayTime() {
    return fridayTime;
  }

  public void setFridayTime(String fridayTime) {
    this.fridayTime = fridayTime;
  }

  public WorkingRestrictionDefaultLeaveHours saturdayTime(String saturdayTime) {
    this.saturdayTime = saturdayTime;
    return this;
  }

  /**
   * Get saturdayTime
   * @return saturdayTime
  */
  @ApiModelProperty(value = "")


  public String getSaturdayTime() {
    return saturdayTime;
  }

  public void setSaturdayTime(String saturdayTime) {
    this.saturdayTime = saturdayTime;
  }

  public WorkingRestrictionDefaultLeaveHours sundayTime(String sundayTime) {
    this.sundayTime = sundayTime;
    return this;
  }

  /**
   * Get sundayTime
   * @return sundayTime
  */
  @ApiModelProperty(value = "")


  public String getSundayTime() {
    return sundayTime;
  }

  public void setSundayTime(String sundayTime) {
    this.sundayTime = sundayTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkingRestrictionDefaultLeaveHours workingRestrictionDefaultLeaveHours = (WorkingRestrictionDefaultLeaveHours) o;
    return Objects.equals(this.useWorkingDay, workingRestrictionDefaultLeaveHours.useWorkingDay) &&
        Objects.equals(this.mondayTime, workingRestrictionDefaultLeaveHours.mondayTime) &&
        Objects.equals(this.tuesdayTime, workingRestrictionDefaultLeaveHours.tuesdayTime) &&
        Objects.equals(this.wednesdayTime, workingRestrictionDefaultLeaveHours.wednesdayTime) &&
        Objects.equals(this.fridayTime, workingRestrictionDefaultLeaveHours.fridayTime) &&
        Objects.equals(this.saturdayTime, workingRestrictionDefaultLeaveHours.saturdayTime) &&
        Objects.equals(this.sundayTime, workingRestrictionDefaultLeaveHours.sundayTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useWorkingDay, mondayTime, tuesdayTime, wednesdayTime, fridayTime, saturdayTime, sundayTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkingRestrictionDefaultLeaveHours {\n");
    
    sb.append("    useWorkingDay: ").append(toIndentedString(useWorkingDay)).append("\n");
    sb.append("    mondayTime: ").append(toIndentedString(mondayTime)).append("\n");
    sb.append("    tuesdayTime: ").append(toIndentedString(tuesdayTime)).append("\n");
    sb.append("    wednesdayTime: ").append(toIndentedString(wednesdayTime)).append("\n");
    sb.append("    fridayTime: ").append(toIndentedString(fridayTime)).append("\n");
    sb.append("    saturdayTime: ").append(toIndentedString(saturdayTime)).append("\n");
    sb.append("    sundayTime: ").append(toIndentedString(sundayTime)).append("\n");
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

