package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Grade;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HoursAssignmentPost
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:19.518070Z[Europe/London]")

public class HoursAssignmentPost   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("grade")
  private Grade grade;

  public HoursAssignmentPost title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(example = "NHSp Bank Contract - Band 5 RN", value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public HoursAssignmentPost grade(Grade grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Get grade
   * @return grade
  */
  @ApiModelProperty(value = "")

  @Valid

  public Grade getGrade() {
    return grade;
  }

  public void setGrade(Grade grade) {
    this.grade = grade;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoursAssignmentPost hoursAssignmentPost = (HoursAssignmentPost) o;
    return Objects.equals(this.title, hoursAssignmentPost.title) &&
        Objects.equals(this.grade, hoursAssignmentPost.grade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, grade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoursAssignmentPost {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
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

