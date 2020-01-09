/*
 * Duties and Events
 * ## Duties and Events 
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
import com.allocate.openapi.model.DutyTimes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DutyWhen
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:58.022235Z[Europe/London]")
public class DutyWhen {
  public static final String SERIALIZED_NAME_PLANNED = "planned";
  @SerializedName(SERIALIZED_NAME_PLANNED)
  private DutyTimes planned;

  public static final String SERIALIZED_NAME_ACTUAL = "actual";
  @SerializedName(SERIALIZED_NAME_ACTUAL)
  private DutyTimes actual;

  public static final String SERIALIZED_NAME_SHIFT_TYPE = "shiftType";
  @SerializedName(SERIALIZED_NAME_SHIFT_TYPE)
  private String shiftType;


  public DutyWhen planned(DutyTimes planned) {
    
    this.planned = planned;
    return this;
  }

   /**
   * Get planned
   * @return planned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  **/
  @javax.annotation.Nullable
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
