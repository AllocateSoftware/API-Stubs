/*
 * Activity API
 *      ## API for querying worker activity.      This is an early availabilty API, and is subject to change. 
 *
 * The version of the OpenAPI document: 0.0.1
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
 * Grade
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:33:21.258826Z[Europe/London]")
public class Grade {
  public static final String SERIALIZED_NAME_LONG_NAME = "longName";
  @SerializedName(SERIALIZED_NAME_LONG_NAME)
  private String longName;

  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_EXTERNAL_REFERENCE = "externalReference";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_REFERENCE)
  private String externalReference;


  public Grade longName(String longName) {
    
    this.longName = longName;
    return this;
  }

   /**
   * Get longName
   * @return longName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Band 5 RN", value = "")

  public String getLongName() {
    return longName;
  }


  public void setLongName(String longName) {
    this.longName = longName;
  }


  public Grade shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Band 5 RN", value = "")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public Grade externalReference(String externalReference) {
    
    this.externalReference = externalReference;
    return this;
  }

   /**
   * Get externalReference
   * @return externalReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalReference() {
    return externalReference;
  }


  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grade grade = (Grade) o;
    return Objects.equals(this.longName, grade.longName) &&
        Objects.equals(this.shortName, grade.shortName) &&
        Objects.equals(this.externalReference, grade.externalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longName, shortName, externalReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grade {\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
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

