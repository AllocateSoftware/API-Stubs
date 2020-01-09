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
 * Posting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:34:21.101948Z[Europe/London]")
public class Posting {
  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_POST = "post";
  @SerializedName(SERIALIZED_NAME_POST)
  private String post;

  public static final String SERIALIZED_NAME_POSTING_TYPE = "postingType";
  @SerializedName(SERIALIZED_NAME_POSTING_TYPE)
  private String postingType;

  public static final String SERIALIZED_NAME_ASSIGNMENT_NUMBER = "assignmentNumber";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENT_NUMBER)
  private String assignmentNumber;

  public static final String SERIALIZED_NAME_TEAM = "team";
  @SerializedName(SERIALIZED_NAME_TEAM)
  private String team;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "isPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary;


  public Posting unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(required = true, value = "")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  public Posting post(String post) {
    
    this.post = post;
    return this;
  }

   /**
   * Get post
   * @return post
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPost() {
    return post;
  }


  public void setPost(String post) {
    this.post = post;
  }


  public Posting postingType(String postingType) {
    
    this.postingType = postingType;
    return this;
  }

   /**
   * Get postingType
   * @return postingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostingType() {
    return postingType;
  }


  public void setPostingType(String postingType) {
    this.postingType = postingType;
  }


  public Posting assignmentNumber(String assignmentNumber) {
    
    this.assignmentNumber = assignmentNumber;
    return this;
  }

   /**
   * Get assignmentNumber
   * @return assignmentNumber
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAssignmentNumber() {
    return assignmentNumber;
  }


  public void setAssignmentNumber(String assignmentNumber) {
    this.assignmentNumber = assignmentNumber;
  }


  public Posting team(String team) {
    
    this.team = team;
    return this;
  }

   /**
   * Get team
   * @return team
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTeam() {
    return team;
  }


  public void setTeam(String team) {
    this.team = team;
  }


  public Posting isPrimary(Boolean isPrimary) {
    
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Posting posting = (Posting) o;
    return Objects.equals(this.unit, posting.unit) &&
        Objects.equals(this.post, posting.post) &&
        Objects.equals(this.postingType, posting.postingType) &&
        Objects.equals(this.assignmentNumber, posting.assignmentNumber) &&
        Objects.equals(this.team, posting.team) &&
        Objects.equals(this.isPrimary, posting.isPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, post, postingType, assignmentNumber, team, isPrimary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Posting {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    postingType: ").append(toIndentedString(postingType)).append("\n");
    sb.append("    assignmentNumber: ").append(toIndentedString(assignmentNumber)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
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
