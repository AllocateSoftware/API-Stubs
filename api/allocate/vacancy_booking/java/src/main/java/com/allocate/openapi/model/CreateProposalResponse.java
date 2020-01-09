/*
 * Vacancy Booking API and Events
 *      ## Duty Booking API and events and Events 
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
 * CreateProposalResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:33:52.482992Z[Europe/London]")
public class CreateProposalResponse {
  public static final String SERIALIZED_NAME_PROPOSAL_ID = "proposalId";
  @SerializedName(SERIALIZED_NAME_PROPOSAL_ID)
  private String proposalId;


  public CreateProposalResponse proposalId(String proposalId) {
    
    this.proposalId = proposalId;
    return this;
  }

   /**
   * The ID of the proposal created
   * @return proposalId
  **/
  @ApiModelProperty(example = "3B78B5C3-07B3-4DC6-8A2A-7D85153869FC", required = true, value = "The ID of the proposal created")

  public String getProposalId() {
    return proposalId;
  }


  public void setProposalId(String proposalId) {
    this.proposalId = proposalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProposalResponse createProposalResponse = (CreateProposalResponse) o;
    return Objects.equals(this.proposalId, createProposalResponse.proposalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProposalResponse {\n");
    sb.append("    proposalId: ").append(toIndentedString(proposalId)).append("\n");
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
