/*
 * Duty Booking API and Events
 * ## Duty Booking API and events and Events 
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
import com.allocate.openapi.model.Duty;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A vacancy has become available for filling.
 */
@ApiModel(description = "A vacancy has become available for filling.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:36:22.326094Z[Europe/London]")
public class VacancyUpdatedEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DUTY = "duty";
  @SerializedName(SERIALIZED_NAME_DUTY)
  private Duty duty;


  public VacancyUpdatedEvent id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the vacancy
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID of the vacancy")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public VacancyUpdatedEvent duty(Duty duty) {
    
    this.duty = duty;
    return this;
  }

   /**
   * Get duty
   * @return duty
  **/
  @ApiModelProperty(required = true, value = "")

  public Duty getDuty() {
    return duty;
  }


  public void setDuty(Duty duty) {
    this.duty = duty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyUpdatedEvent vacancyUpdatedEvent = (VacancyUpdatedEvent) o;
    return Objects.equals(this.id, vacancyUpdatedEvent.id) &&
        Objects.equals(this.duty, vacancyUpdatedEvent.duty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, duty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyUpdatedEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    duty: ").append(toIndentedString(duty)).append("\n");
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

