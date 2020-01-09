package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.VacancyWhereLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VacancyWhere
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

public class VacancyWhere   {
  @JsonProperty("trustId")
  private String trustId;

  @JsonProperty("location")
  private VacancyWhereLocation location;

  public VacancyWhere trustId(String trustId) {
    this.trustId = trustId;
    return this;
  }

  /**
   * Get trustId
   * @return trustId
  */
  @ApiModelProperty(value = "")


  public String getTrustId() {
    return trustId;
  }

  public void setTrustId(String trustId) {
    this.trustId = trustId;
  }

  public VacancyWhere location(VacancyWhereLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")

  @Valid

  public VacancyWhereLocation getLocation() {
    return location;
  }

  public void setLocation(VacancyWhereLocation location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyWhere vacancyWhere = (VacancyWhere) o;
    return Objects.equals(this.trustId, vacancyWhere.trustId) &&
        Objects.equals(this.location, vacancyWhere.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trustId, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyWhere {\n");
    
    sb.append("    trustId: ").append(toIndentedString(trustId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

