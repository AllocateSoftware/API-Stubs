package com.allocate.vms.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AgencyCosting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

public class AgencyCosting   {
  @JsonProperty("agencyId")
  private String agencyId;

  @JsonProperty("agencyName")
  private String agencyName;

  @JsonProperty("cost")
  private BigDecimal cost;

  public AgencyCosting agencyId(String agencyId) {
    this.agencyId = agencyId;
    return this;
  }

  /**
   * Get agencyId
   * @return agencyId
  */
  @ApiModelProperty(value = "")


  public String getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(String agencyId) {
    this.agencyId = agencyId;
  }

  public AgencyCosting agencyName(String agencyName) {
    this.agencyName = agencyName;
    return this;
  }

  /**
   * Get agencyName
   * @return agencyName
  */
  @ApiModelProperty(value = "")


  public String getAgencyName() {
    return agencyName;
  }

  public void setAgencyName(String agencyName) {
    this.agencyName = agencyName;
  }

  public AgencyCosting cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
  */
  @ApiModelProperty(example = "125", value = "")

  @Valid

  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgencyCosting agencyCosting = (AgencyCosting) o;
    return Objects.equals(this.agencyId, agencyCosting.agencyId) &&
        Objects.equals(this.agencyName, agencyCosting.agencyName) &&
        Objects.equals(this.cost, agencyCosting.cost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agencyId, agencyName, cost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgencyCosting {\n");
    
    sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
    sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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

