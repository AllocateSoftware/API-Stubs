package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.CancellationCost;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProposalDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

public class ProposalDetails   {
  @JsonProperty("personId")
  private String personId;

  /**
   * The engagement route for this worker
   */
  public enum EngagementRouteEnum {
    SUBSTANTIVE("substantive"),
    
    BANK("bank"),
    
    AGENCY("agency"),
    
    OTHER("other");

    private String value;

    EngagementRouteEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EngagementRouteEnum fromValue(String value) {
      for (EngagementRouteEnum b : EngagementRouteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("engagementRoute")
  private EngagementRouteEnum engagementRoute;

  @JsonProperty("agencyId")
  private String agencyId;

  @JsonProperty("cost")
  private BigDecimal cost;

  @JsonProperty("cancellationCosts")
  @Valid
  private List<CancellationCost> cancellationCosts = null;

  public ProposalDetails personId(String personId) {
    this.personId = personId;
    return this;
  }

  /**
   * Allocate PersonID for the person being proposed
   * @return personId
  */
  @ApiModelProperty(required = true, value = "Allocate PersonID for the person being proposed")
  @NotNull


  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public ProposalDetails engagementRoute(EngagementRouteEnum engagementRoute) {
    this.engagementRoute = engagementRoute;
    return this;
  }

  /**
   * The engagement route for this worker
   * @return engagementRoute
  */
  @ApiModelProperty(required = true, value = "The engagement route for this worker")
  @NotNull


  public EngagementRouteEnum getEngagementRoute() {
    return engagementRoute;
  }

  public void setEngagementRoute(EngagementRouteEnum engagementRoute) {
    this.engagementRoute = engagementRoute;
  }

  public ProposalDetails agencyId(String agencyId) {
    this.agencyId = agencyId;
    return this;
  }

  /**
   * The Allocate Agency ID for the agency, if this worker is being provided through an agency engagement
   * @return agencyId
  */
  @ApiModelProperty(value = "The Allocate Agency ID for the agency, if this worker is being provided through an agency engagement")


  public String getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(String agencyId) {
    this.agencyId = agencyId;
  }

  public ProposalDetails cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public ProposalDetails cancellationCosts(List<CancellationCost> cancellationCosts) {
    this.cancellationCosts = cancellationCosts;
    return this;
  }

  public ProposalDetails addCancellationCostsItem(CancellationCost cancellationCostsItem) {
    if (this.cancellationCosts == null) {
      this.cancellationCosts = new ArrayList<>();
    }
    this.cancellationCosts.add(cancellationCostsItem);
    return this;
  }

  /**
   * Get cancellationCosts
   * @return cancellationCosts
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CancellationCost> getCancellationCosts() {
    return cancellationCosts;
  }

  public void setCancellationCosts(List<CancellationCost> cancellationCosts) {
    this.cancellationCosts = cancellationCosts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProposalDetails proposalDetails = (ProposalDetails) o;
    return Objects.equals(this.personId, proposalDetails.personId) &&
        Objects.equals(this.engagementRoute, proposalDetails.engagementRoute) &&
        Objects.equals(this.agencyId, proposalDetails.agencyId) &&
        Objects.equals(this.cost, proposalDetails.cost) &&
        Objects.equals(this.cancellationCosts, proposalDetails.cancellationCosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, engagementRoute, agencyId, cost, cancellationCosts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProposalDetails {\n");
    
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    engagementRoute: ").append(toIndentedString(engagementRoute)).append("\n");
    sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    cancellationCosts: ").append(toIndentedString(cancellationCosts)).append("\n");
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

