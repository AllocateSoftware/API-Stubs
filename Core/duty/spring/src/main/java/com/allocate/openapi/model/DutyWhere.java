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
 * DutyWhere
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutyWhere   {
  @JsonProperty("trustId")
  private String trustId;

  @JsonProperty("unitCode")
  private String unitCode;

  public DutyWhere trustId(String trustId) {
    this.trustId = trustId;
    return this;
  }

  /**
   * name of the trust
   * @return trustId
  */
  @ApiModelProperty(example = "SPQR", value = "name of the trust")


  public String getTrustId() {
    return trustId;
  }

  public void setTrustId(String trustId) {
    this.trustId = trustId;
  }

  public DutyWhere unitCode(String unitCode) {
    this.unitCode = unitCode;
    return this;
  }

  /**
   * Code for the unit within the trust
   * @return unitCode
  */
  @ApiModelProperty(example = "HPPDWard", value = "Code for the unit within the trust")


  public String getUnitCode() {
    return unitCode;
  }

  public void setUnitCode(String unitCode) {
    this.unitCode = unitCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyWhere dutyWhere = (DutyWhere) o;
    return Objects.equals(this.trustId, dutyWhere.trustId) &&
        Objects.equals(this.unitCode, dutyWhere.unitCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trustId, unitCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyWhere {\n");
    
    sb.append("    trustId: ").append(toIndentedString(trustId)).append("\n");
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
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

