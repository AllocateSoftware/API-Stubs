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
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class InlineObject   {
  @JsonProperty("trustCode")
  private String trustCode;

  @JsonProperty("engagementRoute")
  private String engagementRoute;

  public InlineObject trustCode(String trustCode) {
    this.trustCode = trustCode;
    return this;
  }

  /**
   * The code for the trust that the worker should be on-boarded to
   * @return trustCode
  */
  @ApiModelProperty(value = "The code for the trust that the worker should be on-boarded to")


  public String getTrustCode() {
    return trustCode;
  }

  public void setTrustCode(String trustCode) {
    this.trustCode = trustCode;
  }

  public InlineObject engagementRoute(String engagementRoute) {
    this.engagementRoute = engagementRoute;
    return this;
  }

  /**
   * The 'engagement route' of the worker, such as substantive, bank, agency
   * @return engagementRoute
  */
  @ApiModelProperty(value = "The 'engagement route' of the worker, such as substantive, bank, agency")


  public String getEngagementRoute() {
    return engagementRoute;
  }

  public void setEngagementRoute(String engagementRoute) {
    this.engagementRoute = engagementRoute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.trustCode, inlineObject.trustCode) &&
        Objects.equals(this.engagementRoute, inlineObject.engagementRoute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trustCode, engagementRoute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    
    sb.append("    trustCode: ").append(toIndentedString(trustCode)).append("\n");
    sb.append("    engagementRoute: ").append(toIndentedString(engagementRoute)).append("\n");
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

