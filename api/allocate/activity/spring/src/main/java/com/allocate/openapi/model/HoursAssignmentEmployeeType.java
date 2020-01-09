package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HoursAssignmentEmployeeType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:19.518070Z[Europe/London]")

public class HoursAssignmentEmployeeType   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("externalReference")
  private String externalReference;

  public HoursAssignmentEmployeeType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * e.g: Employee, Bank, Agency
   * @return name
  */
  @ApiModelProperty(example = "Bank Only", value = "e.g: Employee, Bank, Agency")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HoursAssignmentEmployeeType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HoursAssignmentEmployeeType externalReference(String externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  /**
   * Get externalReference
   * @return externalReference
  */
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
    HoursAssignmentEmployeeType hoursAssignmentEmployeeType = (HoursAssignmentEmployeeType) o;
    return Objects.equals(this.name, hoursAssignmentEmployeeType.name) &&
        Objects.equals(this.description, hoursAssignmentEmployeeType.description) &&
        Objects.equals(this.externalReference, hoursAssignmentEmployeeType.externalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, externalReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoursAssignmentEmployeeType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

