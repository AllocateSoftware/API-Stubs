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
 * Grade
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:19.518070Z[Europe/London]")

public class Grade   {
  @JsonProperty("longName")
  private String longName;

  @JsonProperty("shortName")
  private String shortName;

  @JsonProperty("externalReference")
  private String externalReference;

  public Grade longName(String longName) {
    this.longName = longName;
    return this;
  }

  /**
   * Get longName
   * @return longName
  */
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
  */
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

