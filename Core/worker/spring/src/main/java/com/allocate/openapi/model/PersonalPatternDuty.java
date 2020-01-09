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
 * PersonalPatternDuty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class PersonalPatternDuty   {
  @JsonProperty("shiftGroup")
  private String shiftGroup;

  @JsonProperty("shift")
  private String shift;

  @JsonProperty("rosterLocation")
  private String rosterLocation;

  @JsonProperty("team")
  private String team;

  @JsonProperty("activityCategory")
  private String activityCategory;

  @JsonProperty("activityBenchmark")
  private String activityBenchmark;

  @JsonProperty("activityType")
  private String activityType;

  @JsonProperty("activityProfile")
  private String activityProfile;

  @JsonProperty("work")
  private String work;

  @JsonProperty("start")
  private String start;

  @JsonProperty("end")
  private String end;

  @JsonProperty("monthlyReccurrance")
  private Boolean monthlyReccurrance;

  public PersonalPatternDuty shiftGroup(String shiftGroup) {
    this.shiftGroup = shiftGroup;
    return this;
  }

  /**
   * Get shiftGroup
   * @return shiftGroup
  */
  @ApiModelProperty(value = "")


  public String getShiftGroup() {
    return shiftGroup;
  }

  public void setShiftGroup(String shiftGroup) {
    this.shiftGroup = shiftGroup;
  }

  public PersonalPatternDuty shift(String shift) {
    this.shift = shift;
    return this;
  }

  /**
   * Get shift
   * @return shift
  */
  @ApiModelProperty(value = "")


  public String getShift() {
    return shift;
  }

  public void setShift(String shift) {
    this.shift = shift;
  }

  public PersonalPatternDuty rosterLocation(String rosterLocation) {
    this.rosterLocation = rosterLocation;
    return this;
  }

  /**
   * Get rosterLocation
   * @return rosterLocation
  */
  @ApiModelProperty(value = "")


  public String getRosterLocation() {
    return rosterLocation;
  }

  public void setRosterLocation(String rosterLocation) {
    this.rosterLocation = rosterLocation;
  }

  public PersonalPatternDuty team(String team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
  */
  @ApiModelProperty(value = "")


  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public PersonalPatternDuty activityCategory(String activityCategory) {
    this.activityCategory = activityCategory;
    return this;
  }

  /**
   * Get activityCategory
   * @return activityCategory
  */
  @ApiModelProperty(value = "")


  public String getActivityCategory() {
    return activityCategory;
  }

  public void setActivityCategory(String activityCategory) {
    this.activityCategory = activityCategory;
  }

  public PersonalPatternDuty activityBenchmark(String activityBenchmark) {
    this.activityBenchmark = activityBenchmark;
    return this;
  }

  /**
   * Get activityBenchmark
   * @return activityBenchmark
  */
  @ApiModelProperty(value = "")


  public String getActivityBenchmark() {
    return activityBenchmark;
  }

  public void setActivityBenchmark(String activityBenchmark) {
    this.activityBenchmark = activityBenchmark;
  }

  public PersonalPatternDuty activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * Get activityType
   * @return activityType
  */
  @ApiModelProperty(value = "")


  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

  public PersonalPatternDuty activityProfile(String activityProfile) {
    this.activityProfile = activityProfile;
    return this;
  }

  /**
   * Get activityProfile
   * @return activityProfile
  */
  @ApiModelProperty(value = "")


  public String getActivityProfile() {
    return activityProfile;
  }

  public void setActivityProfile(String activityProfile) {
    this.activityProfile = activityProfile;
  }

  public PersonalPatternDuty work(String work) {
    this.work = work;
    return this;
  }

  /**
   * Get work
   * @return work
  */
  @ApiModelProperty(value = "")


  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public PersonalPatternDuty start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  */
  @ApiModelProperty(value = "")


  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public PersonalPatternDuty end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  */
  @ApiModelProperty(value = "")


  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public PersonalPatternDuty monthlyReccurrance(Boolean monthlyReccurrance) {
    this.monthlyReccurrance = monthlyReccurrance;
    return this;
  }

  /**
   * Get monthlyReccurrance
   * @return monthlyReccurrance
  */
  @ApiModelProperty(value = "")


  public Boolean getMonthlyReccurrance() {
    return monthlyReccurrance;
  }

  public void setMonthlyReccurrance(Boolean monthlyReccurrance) {
    this.monthlyReccurrance = monthlyReccurrance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalPatternDuty personalPatternDuty = (PersonalPatternDuty) o;
    return Objects.equals(this.shiftGroup, personalPatternDuty.shiftGroup) &&
        Objects.equals(this.shift, personalPatternDuty.shift) &&
        Objects.equals(this.rosterLocation, personalPatternDuty.rosterLocation) &&
        Objects.equals(this.team, personalPatternDuty.team) &&
        Objects.equals(this.activityCategory, personalPatternDuty.activityCategory) &&
        Objects.equals(this.activityBenchmark, personalPatternDuty.activityBenchmark) &&
        Objects.equals(this.activityType, personalPatternDuty.activityType) &&
        Objects.equals(this.activityProfile, personalPatternDuty.activityProfile) &&
        Objects.equals(this.work, personalPatternDuty.work) &&
        Objects.equals(this.start, personalPatternDuty.start) &&
        Objects.equals(this.end, personalPatternDuty.end) &&
        Objects.equals(this.monthlyReccurrance, personalPatternDuty.monthlyReccurrance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shiftGroup, shift, rosterLocation, team, activityCategory, activityBenchmark, activityType, activityProfile, work, start, end, monthlyReccurrance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalPatternDuty {\n");
    
    sb.append("    shiftGroup: ").append(toIndentedString(shiftGroup)).append("\n");
    sb.append("    shift: ").append(toIndentedString(shift)).append("\n");
    sb.append("    rosterLocation: ").append(toIndentedString(rosterLocation)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    activityCategory: ").append(toIndentedString(activityCategory)).append("\n");
    sb.append("    activityBenchmark: ").append(toIndentedString(activityBenchmark)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    activityProfile: ").append(toIndentedString(activityProfile)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    monthlyReccurrance: ").append(toIndentedString(monthlyReccurrance)).append("\n");
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

