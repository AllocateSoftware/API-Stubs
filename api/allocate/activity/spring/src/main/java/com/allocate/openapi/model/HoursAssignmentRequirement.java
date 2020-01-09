package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Grade;
import com.allocate.openapi.model.GradeType;
import com.allocate.openapi.model.GradeTypeCategory;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HoursAssignmentRequirement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:19.518070Z[Europe/London]")

public class HoursAssignmentRequirement   {
  @JsonProperty("grade")
  private Grade grade;

  @JsonProperty("gradeType")
  private GradeType gradeType;

  @JsonProperty("gradeTypeCategory")
  private GradeTypeCategory gradeTypeCategory;

  public HoursAssignmentRequirement grade(Grade grade) {
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

  public HoursAssignmentRequirement gradeType(GradeType gradeType) {
    this.gradeType = gradeType;
    return this;
  }

  /**
   * Get gradeType
   * @return gradeType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GradeType getGradeType() {
    return gradeType;
  }

  public void setGradeType(GradeType gradeType) {
    this.gradeType = gradeType;
  }

  public HoursAssignmentRequirement gradeTypeCategory(GradeTypeCategory gradeTypeCategory) {
    this.gradeTypeCategory = gradeTypeCategory;
    return this;
  }

  /**
   * Get gradeTypeCategory
   * @return gradeTypeCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public GradeTypeCategory getGradeTypeCategory() {
    return gradeTypeCategory;
  }

  public void setGradeTypeCategory(GradeTypeCategory gradeTypeCategory) {
    this.gradeTypeCategory = gradeTypeCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoursAssignmentRequirement hoursAssignmentRequirement = (HoursAssignmentRequirement) o;
    return Objects.equals(this.grade, hoursAssignmentRequirement.grade) &&
        Objects.equals(this.gradeType, hoursAssignmentRequirement.gradeType) &&
        Objects.equals(this.gradeTypeCategory, hoursAssignmentRequirement.gradeTypeCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grade, gradeType, gradeTypeCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoursAssignmentRequirement {\n");
    
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    gradeType: ").append(toIndentedString(gradeType)).append("\n");
    sb.append("    gradeTypeCategory: ").append(toIndentedString(gradeTypeCategory)).append("\n");
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

