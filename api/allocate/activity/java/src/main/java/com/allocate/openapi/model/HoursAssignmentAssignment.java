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
 * HoursAssignmentAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:33:21.258826Z[Europe/London]")
public class HoursAssignmentAssignment {
  /**
   * How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest 
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    UNSPECIFIED("unspecified"),
    
    AUTOROSTER("autoroster"),
    
    MANUALMANAGERASSIGNMENT("manualManagerAssignment"),
    
    EMPLOYEEWEBTIMESHEET("employeeWebTimesheet"),
    
    EXTERNALASSIGNMENT("externalAssignment"),
    
    EMPLOYEEREQUEST("employeeRequest");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private MethodEnum method;

  public static final String SERIALIZED_NAME_FROM_REQUEST = "fromRequest";
  @SerializedName(SERIALIZED_NAME_FROM_REQUEST)
  private Boolean fromRequest;


  public HoursAssignmentAssignment method(MethodEnum method) {
    
    this.method = method;
    return this;
  }

   /**
   * How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest 
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "autoroster", value = "How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest ")

  public MethodEnum getMethod() {
    return method;
  }


  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  public HoursAssignmentAssignment fromRequest(Boolean fromRequest) {
    
    this.fromRequest = fromRequest;
    return this;
  }

   /**
   * Did the employee request this assignment? Yes/No
   * @return fromRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Did the employee request this assignment? Yes/No")

  public Boolean getFromRequest() {
    return fromRequest;
  }


  public void setFromRequest(Boolean fromRequest) {
    this.fromRequest = fromRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoursAssignmentAssignment hoursAssignmentAssignment = (HoursAssignmentAssignment) o;
    return Objects.equals(this.method, hoursAssignmentAssignment.method) &&
        Objects.equals(this.fromRequest, hoursAssignmentAssignment.fromRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, fromRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoursAssignmentAssignment {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    fromRequest: ").append(toIndentedString(fromRequest)).append("\n");
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
