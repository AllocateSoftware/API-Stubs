/*
 * Workers
 * ## Workers and events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PersonalPatternDuty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:36:44.017277Z[Europe/London]")
public class PersonalPatternDuty {
  public static final String SERIALIZED_NAME_SHIFT_GROUP = "shiftGroup";
  @SerializedName(SERIALIZED_NAME_SHIFT_GROUP)
  private String shiftGroup;

  public static final String SERIALIZED_NAME_SHIFT = "shift";
  @SerializedName(SERIALIZED_NAME_SHIFT)
  private String shift;

  public static final String SERIALIZED_NAME_ROSTER_LOCATION = "rosterLocation";
  @SerializedName(SERIALIZED_NAME_ROSTER_LOCATION)
  private String rosterLocation;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private String team;

  public static final String SERIALIZED_NAME_ACTIVITY_CATEGORY = "activityCategory";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_CATEGORY)
  private String activityCategory;

  public static final String SERIALIZED_NAME_ACTIVITY_BENCHMARK = "activityBenchmark";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_BENCHMARK)
  private String activityBenchmark;

  public static final String SERIALIZED_NAME_ACTIVITY_TYPE = "activityType";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_TYPE)
  private String activityType;

  public static final String SERIALIZED_NAME_ACTIVITY_PROFILE = "activityProfile";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_PROFILE)
  private String activityProfile;

  public static final String SERIALIZED_NAME_WORK = "work";
  @SerializedName(SERIALIZED_NAME_WORK)
  private String work;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private String end;

  public static final String SERIALIZED_NAME_MONTHLY_RECCURRANCE = "monthlyReccurrance";
  @SerializedName(SERIALIZED_NAME_MONTHLY_RECCURRANCE)
  private Boolean monthlyReccurrance;


  public PersonalPatternDuty shiftGroup(String shiftGroup) {
    
    this.shiftGroup = shiftGroup;
    return this;
  }

   /**
   * Get shiftGroup
   * @return shiftGroup
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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

