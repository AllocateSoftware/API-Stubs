package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HoursAssignmentAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:19.518070Z[Europe/London]")

public class HoursAssignmentAssignment   {
  /**
   * How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest 
   */
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("method")
  private MethodEnum method;

  @JsonProperty("fromRequest")
  private Boolean fromRequest;

  public HoursAssignmentAssignment method(MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * How duty was assigned. *   Unspecified *   AutoRoster *   ManualManagerAssignment *   EmployeeWebTimesheet *   ExternalAssignment e.g. from BankStaff *   EmployeeRequest 
   * @return method
  */
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
  */
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

