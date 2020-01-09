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
 * Posting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class Posting   {
  @JsonProperty("unit")
  private String unit;

  @JsonProperty("post")
  private String post;

  @JsonProperty("postingType")
  private String postingType;

  @JsonProperty("assignmentNumber")
  private String assignmentNumber;

  @JsonProperty("team")
  private String team;

  @JsonProperty("isPrimary")
  private Boolean isPrimary;

  public Posting unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


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
  */
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
  */
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
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


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
  */
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
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


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

