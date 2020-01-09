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
 * UnitReferenceDataResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:37:09.334042Z[Europe/London]")

public class UnitReferenceDataResponse   {
  @JsonProperty("refId")
  private String refId;

  @JsonProperty("description")
  private String description;

  @JsonProperty("unitSite")
  private String unitSite;

  public UnitReferenceDataResponse refId(String refId) {
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

  public UnitReferenceDataResponse description(String description) {
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

  public UnitReferenceDataResponse unitSite(String unitSite) {
    this.unitSite = unitSite;
    return this;
  }

  /**
   * Location of the unit from BankStaff
   * @return unitSite
  */
  @ApiModelProperty(example = "Unit site", value = "Location of the unit from BankStaff")


  public String getUnitSite() {
    return unitSite;
  }

  public void setUnitSite(String unitSite) {
    this.unitSite = unitSite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitReferenceDataResponse unitReferenceDataResponse = (UnitReferenceDataResponse) o;
    return Objects.equals(this.refId, unitReferenceDataResponse.refId) &&
        Objects.equals(this.description, unitReferenceDataResponse.description) &&
        Objects.equals(this.unitSite, unitReferenceDataResponse.unitSite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refId, description, unitSite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitReferenceDataResponse {\n");
    
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unitSite: ").append(toIndentedString(unitSite)).append("\n");
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

