/*
 * Worker API and Events
 *      ## API and events for providing workers. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:34:21.101948Z[Europe/London]")
public class InlineObject {
  public static final String SERIALIZED_NAME_TRUST_CODE = "trustCode";
  @SerializedName(SERIALIZED_NAME_TRUST_CODE)
  private String trustCode;

  public static final String SERIALIZED_NAME_ENGAGEMENT_ROUTE = "engagementRoute";
  @SerializedName(SERIALIZED_NAME_ENGAGEMENT_ROUTE)
  private String engagementRoute;


  public InlineObject trustCode(String trustCode) {
    
    this.trustCode = trustCode;
    return this;
  }

   /**
   * The code for the trust that the worker should be on-boarded to
   * @return trustCode
  **/
  @javax.annotation.Nullable
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
   * The &#39;engagement route&#39; of the worker, such as substantive, bank, agency
   * @return engagementRoute
  **/
  @javax.annotation.Nullable
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

