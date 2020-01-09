package com.allocate.openapi.model;

import java.util.Objects;
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
 * WorkLocations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class WorkLocations   {
  @JsonProperty("homeTrust")
  private String homeTrust;

  @JsonProperty("workingTrusts")
  @Valid
  private List<String> workingTrusts = null;

  public WorkLocations homeTrust(String homeTrust) {
    this.homeTrust = homeTrust;
    return this;
  }

  /**
   * The identifier for the home trust for this worker
   * @return homeTrust
  */
  @ApiModelProperty(required = true, value = "The identifier for the home trust for this worker")
  @NotNull


  public String getHomeTrust() {
    return homeTrust;
  }

  public void setHomeTrust(String homeTrust) {
    this.homeTrust = homeTrust;
  }

  public WorkLocations workingTrusts(List<String> workingTrusts) {
    this.workingTrusts = workingTrusts;
    return this;
  }

  public WorkLocations addWorkingTrustsItem(String workingTrustsItem) {
    if (this.workingTrusts == null) {
      this.workingTrusts = new ArrayList<>();
    }
    this.workingTrusts.add(workingTrustsItem);
    return this;
  }

  /**
   * Identifiers for the trusts that the worker may work in (in addition to their home trust)
   * @return workingTrusts
  */
  @ApiModelProperty(value = "Identifiers for the trusts that the worker may work in (in addition to their home trust)")


  public List<String> getWorkingTrusts() {
    return workingTrusts;
  }

  public void setWorkingTrusts(List<String> workingTrusts) {
    this.workingTrusts = workingTrusts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkLocations workLocations = (WorkLocations) o;
    return Objects.equals(this.homeTrust, workLocations.homeTrust) &&
        Objects.equals(this.workingTrusts, workLocations.workingTrusts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homeTrust, workingTrusts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkLocations {\n");
    
    sb.append("    homeTrust: ").append(toIndentedString(homeTrust)).append("\n");
    sb.append("    workingTrusts: ").append(toIndentedString(workingTrusts)).append("\n");
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

