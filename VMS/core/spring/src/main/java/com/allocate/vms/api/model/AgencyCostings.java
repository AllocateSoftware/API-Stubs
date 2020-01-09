package com.allocate.vms.api.model;

import java.util.Objects;
import com.allocate.vms.api.model.AgencyCosting;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AgencyCostings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

public class AgencyCostings   {
  @JsonProperty("dutyId")
  private String dutyId;

  @JsonProperty("results")
  @Valid
  private List<AgencyCosting> results = null;

  public AgencyCostings dutyId(String dutyId) {
    this.dutyId = dutyId;
    return this;
  }

  /**
   * The ID of the incoming duty.
   * @return dutyId
  */
  @ApiModelProperty(value = "The ID of the incoming duty.")


  public String getDutyId() {
    return dutyId;
  }

  public void setDutyId(String dutyId) {
    this.dutyId = dutyId;
  }

  public AgencyCostings results(List<AgencyCosting> results) {
    this.results = results;
    return this;
  }

  public AgencyCostings addResultsItem(AgencyCosting resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AgencyCosting> getResults() {
    return results;
  }

  public void setResults(List<AgencyCosting> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgencyCostings agencyCostings = (AgencyCostings) o;
    return Objects.equals(this.dutyId, agencyCostings.dutyId) &&
        Objects.equals(this.results, agencyCostings.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dutyId, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgencyCostings {\n");
    
    sb.append("    dutyId: ").append(toIndentedString(dutyId)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

