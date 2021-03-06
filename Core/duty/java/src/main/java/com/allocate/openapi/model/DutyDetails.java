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
import com.allocate.openapi.model.DutyDetailsWhen;
import com.allocate.openapi.model.DutyDetailsWhere;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DutyDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:58.022235Z[Europe/London]")
public class DutyDetails {
  public static final String SERIALIZED_NAME_WHEN = "when";
  @SerializedName(SERIALIZED_NAME_WHEN)
  private DutyDetailsWhen when;

  public static final String SERIALIZED_NAME_WHERE = "where";
  @SerializedName(SERIALIZED_NAME_WHERE)
  private DutyDetailsWhere where;

  public static final String SERIALIZED_NAME_REQUIREMENTS = "requirements";
  @SerializedName(SERIALIZED_NAME_REQUIREMENTS)
  private Object requirements;


  public DutyDetails when(DutyDetailsWhen when) {
    
    this.when = when;
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DutyDetailsWhen getWhen() {
    return when;
  }


  public void setWhen(DutyDetailsWhen when) {
    this.when = when;
  }


  public DutyDetails where(DutyDetailsWhere where) {
    
    this.where = where;
    return this;
  }

   /**
   * Get where
   * @return where
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DutyDetailsWhere getWhere() {
    return where;
  }


  public void setWhere(DutyDetailsWhere where) {
    this.where = where;
  }


  public DutyDetails requirements(Object requirements) {
    
    this.requirements = requirements;
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRequirements() {
    return requirements;
  }


  public void setRequirements(Object requirements) {
    this.requirements = requirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyDetails dutyDetails = (DutyDetails) o;
    return Objects.equals(this.when, dutyDetails.when) &&
        Objects.equals(this.where, dutyDetails.where) &&
        Objects.equals(this.requirements, dutyDetails.requirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(when, where, requirements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyDetails {\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
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

