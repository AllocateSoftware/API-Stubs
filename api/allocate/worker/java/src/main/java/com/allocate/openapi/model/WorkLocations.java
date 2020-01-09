/*
 * Worker API and Events
 *      ## API and events for providing workers. 
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
import java.util.ArrayList;
import java.util.List;

/**
 * WorkLocations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:34:21.101948Z[Europe/London]")
public class WorkLocations {
  public static final String SERIALIZED_NAME_HOME_TRUST = "homeTrust";
  @SerializedName(SERIALIZED_NAME_HOME_TRUST)
  private String homeTrust;

  public static final String SERIALIZED_NAME_WORKING_TRUSTS = "workingTrusts";
  @SerializedName(SERIALIZED_NAME_WORKING_TRUSTS)
  private List<Object> workingTrusts = null;


  public WorkLocations homeTrust(String homeTrust) {
    
    this.homeTrust = homeTrust;
    return this;
  }

   /**
   * The identifier for the home trust for this worker
   * @return homeTrust
  **/
  @ApiModelProperty(required = true, value = "The identifier for the home trust for this worker")

  public String getHomeTrust() {
    return homeTrust;
  }


  public void setHomeTrust(String homeTrust) {
    this.homeTrust = homeTrust;
  }


  public WorkLocations workingTrusts(List<Object> workingTrusts) {
    
    this.workingTrusts = workingTrusts;
    return this;
  }

  public WorkLocations addWorkingTrustsItem(Object workingTrustsItem) {
    if (this.workingTrusts == null) {
      this.workingTrusts = new ArrayList<Object>();
    }
    this.workingTrusts.add(workingTrustsItem);
    return this;
  }

   /**
   * Identifiers for the trusts that the worker may work in (in addition to their home trust)
   * @return workingTrusts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifiers for the trusts that the worker may work in (in addition to their home trust)")

  public List<Object> getWorkingTrusts() {
    return workingTrusts;
  }


  public void setWorkingTrusts(List<Object> workingTrusts) {
    this.workingTrusts = workingTrusts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkLocations workLocations = (WorkLocations) o;
    return Objects.equals(this.homeTrust, workLocations.homeTrust) &&
        Objects.equals(this.workingTrusts, workLocations.workingTrusts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homeTrust, workingTrusts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkLocations {\n");
    sb.append("    homeTrust: ").append(toIndentedString(homeTrust)).append("\n");
    sb.append("    workingTrusts: ").append(toIndentedString(workingTrusts)).append("\n");
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
