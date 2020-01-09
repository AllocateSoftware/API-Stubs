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
 * PersonalPattern
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:34:21.101948Z[Europe/London]")
public class PersonalPattern {
  public static final String SERIALIZED_NAME_DUTY = "duty";
  @SerializedName(SERIALIZED_NAME_DUTY)
  private List<Object> duty = null;

  public static final String SERIALIZED_NAME_UNAVAILABILITY = "unavailability";
  @SerializedName(SERIALIZED_NAME_UNAVAILABILITY)
  private List<Object> unavailability = null;


  public PersonalPattern duty(List<Object> duty) {
    
    this.duty = duty;
    return this;
  }

  public PersonalPattern addDutyItem(Object dutyItem) {
    if (this.duty == null) {
      this.duty = new ArrayList<Object>();
    }
    this.duty.add(dutyItem);
    return this;
  }

   /**
   * Get duty
   * @return duty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getDuty() {
    return duty;
  }


  public void setDuty(List<Object> duty) {
    this.duty = duty;
  }


  public PersonalPattern unavailability(List<Object> unavailability) {
    
    this.unavailability = unavailability;
    return this;
  }

  public PersonalPattern addUnavailabilityItem(Object unavailabilityItem) {
    if (this.unavailability == null) {
      this.unavailability = new ArrayList<Object>();
    }
    this.unavailability.add(unavailabilityItem);
    return this;
  }

   /**
   * Get unavailability
   * @return unavailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getUnavailability() {
    return unavailability;
  }


  public void setUnavailability(List<Object> unavailability) {
    this.unavailability = unavailability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalPattern personalPattern = (PersonalPattern) o;
    return Objects.equals(this.duty, personalPattern.duty) &&
        Objects.equals(this.unavailability, personalPattern.unavailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duty, unavailability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalPattern {\n");
    sb.append("    duty: ").append(toIndentedString(duty)).append("\n");
    sb.append("    unavailability: ").append(toIndentedString(unavailability)).append("\n");
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
