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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AsyncResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:36:22.326094Z[Europe/London]")
public class AsyncResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public AsyncResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Correlation Identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Correlation Identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncResponse asyncResponse = (AsyncResponse) o;
    return Objects.equals(this.id, asyncResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

