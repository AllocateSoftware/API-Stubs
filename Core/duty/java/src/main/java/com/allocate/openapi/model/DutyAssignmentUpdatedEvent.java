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
import com.allocate.openapi.model.DutyEventAllOf;
import com.allocate.openapi.model.Event;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DutyAssignmentUpdatedEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:58.022235Z[Europe/London]")
public class DutyAssignmentUpdatedEvent extends Event {
  public static final String SERIALIZED_NAME_DUTY_ID = "dutyId";
  @SerializedName(SERIALIZED_NAME_DUTY_ID)
  private String dutyId;


  public DutyAssignmentUpdatedEvent dutyId(String dutyId) {
    
    this.dutyId = dutyId;
    return this;
  }

   /**
   * Get dutyId
   * @return dutyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDutyId() {
    return dutyId;
  }


  public void setDutyId(String dutyId) {
    this.dutyId = dutyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyAssignmentUpdatedEvent dutyAssignmentUpdatedEvent = (DutyAssignmentUpdatedEvent) o;
    return Objects.equals(this.dutyId, dutyAssignmentUpdatedEvent.dutyId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dutyId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyAssignmentUpdatedEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dutyId: ").append(toIndentedString(dutyId)).append("\n");
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

