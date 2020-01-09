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
 * PersonalPatternUnavailability
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:36:44.017277Z[Europe/London]")
public class PersonalPatternUnavailability {
  public static final String SERIALIZED_NAME_UNAVAILABILITY_GROUP = "unavailabilityGroup";
  @SerializedName(SERIALIZED_NAME_UNAVAILABILITY_GROUP)
  private String unavailabilityGroup;

  public static final String SERIALIZED_NAME_UNAVAILABILITY_REASON = "unavailabilityReason";
  @SerializedName(SERIALIZED_NAME_UNAVAILABILITY_REASON)
  private String unavailabilityReason;

  public static final String SERIALIZED_NAME_WORK = "work";
  @SerializedName(SERIALIZED_NAME_WORK)
  private String work;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private String end;

  public static final String SERIALIZED_NAME_EXTERNAL_UNAVAILABILITY_IDENTIFIER = "externalUnavailabilityIdentifier";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_UNAVAILABILITY_IDENTIFIER)
  private String externalUnavailabilityIdentifier;


  public PersonalPatternUnavailability unavailabilityGroup(String unavailabilityGroup) {
    
    this.unavailabilityGroup = unavailabilityGroup;
    return this;
  }

   /**
   * Get unavailabilityGroup
   * @return unavailabilityGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnavailabilityGroup() {
    return unavailabilityGroup;
  }


  public void setUnavailabilityGroup(String unavailabilityGroup) {
    this.unavailabilityGroup = unavailabilityGroup;
  }


  public PersonalPatternUnavailability unavailabilityReason(String unavailabilityReason) {
    
    this.unavailabilityReason = unavailabilityReason;
    return this;
  }

   /**
   * Get unavailabilityReason
   * @return unavailabilityReason
  **/
  @ApiModelProperty(required = true, value = "")

  public String getUnavailabilityReason() {
    return unavailabilityReason;
  }


  public void setUnavailabilityReason(String unavailabilityReason) {
    this.unavailabilityReason = unavailabilityReason;
  }


  public PersonalPatternUnavailability work(String work) {
    
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


  public PersonalPatternUnavailability start(String start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(required = true, value = "")

  public String getStart() {
    return start;
  }


  public void setStart(String start) {
    this.start = start;
  }


  public PersonalPatternUnavailability end(String end) {
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(required = true, value = "")

  public String getEnd() {
    return end;
  }


  public void setEnd(String end) {
    this.end = end;
  }


  public PersonalPatternUnavailability externalUnavailabilityIdentifier(String externalUnavailabilityIdentifier) {
    
    this.externalUnavailabilityIdentifier = externalUnavailabilityIdentifier;
    return this;
  }

   /**
   * Get externalUnavailabilityIdentifier
   * @return externalUnavailabilityIdentifier
  **/
  @ApiModelProperty(required = true, value = "")

  public String getExternalUnavailabilityIdentifier() {
    return externalUnavailabilityIdentifier;
  }


  public void setExternalUnavailabilityIdentifier(String externalUnavailabilityIdentifier) {
    this.externalUnavailabilityIdentifier = externalUnavailabilityIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalPatternUnavailability personalPatternUnavailability = (PersonalPatternUnavailability) o;
    return Objects.equals(this.unavailabilityGroup, personalPatternUnavailability.unavailabilityGroup) &&
        Objects.equals(this.unavailabilityReason, personalPatternUnavailability.unavailabilityReason) &&
        Objects.equals(this.work, personalPatternUnavailability.work) &&
        Objects.equals(this.start, personalPatternUnavailability.start) &&
        Objects.equals(this.end, personalPatternUnavailability.end) &&
        Objects.equals(this.externalUnavailabilityIdentifier, personalPatternUnavailability.externalUnavailabilityIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unavailabilityGroup, unavailabilityReason, work, start, end, externalUnavailabilityIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalPatternUnavailability {\n");
    sb.append("    unavailabilityGroup: ").append(toIndentedString(unavailabilityGroup)).append("\n");
    sb.append("    unavailabilityReason: ").append(toIndentedString(unavailabilityReason)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    externalUnavailabilityIdentifier: ").append(toIndentedString(externalUnavailabilityIdentifier)).append("\n");
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
