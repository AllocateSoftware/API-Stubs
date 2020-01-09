/*
 * DE Provider Direct Engagement API
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
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
 * ReferenceDataResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:37:11.208292Z[Europe/London]")
public class ReferenceDataResponse {
  public static final String SERIALIZED_NAME_REF_ID = "refId";
  @SerializedName(SERIALIZED_NAME_REF_ID)
  private String refId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public ReferenceDataResponse refId(String refId) {
    
    this.refId = refId;
    return this;
  }

   /**
   * Reference data trust identifier from BankStaff
   * @return refId
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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

