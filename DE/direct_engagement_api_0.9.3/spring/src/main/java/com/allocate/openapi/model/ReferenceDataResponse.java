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
 * ReferenceDataResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:37:09.334042Z[Europe/London]")

public class ReferenceDataResponse   {
  @JsonProperty("refId")
  private String refId;

  @JsonProperty("description")
  private String description;

  public ReferenceDataResponse refId(String refId) {
    this.refId = refId;
    return this;
  }

  /**
   * Reference data trust identifier from BankStaff
   * @return refId
  */
  @ApiModelProperty(example = "TrustA.12", value = "Reference data trust identifier from BankStaff")


  public String getRefId() {
    return refId;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }

  public ReferenceDataResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Reference data description from BankStaff
   * @return description
  */
  @ApiModelProperty(example = "Description", value = "Reference data description from BankStaff")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceDataResponse referenceDataResponse = (ReferenceDataResponse) o;
    return Objects.equals(this.refId, referenceDataResponse.refId) &&
        Objects.equals(this.description, referenceDataResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refId, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceDataResponse {\n");
    
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

