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
 * DutyRequirementsGradeRequirement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutyRequirementsGradeRequirement   {
  @JsonProperty("grade")
  private String grade;

  @JsonProperty("gradeType")
  private String gradeType;

  @JsonProperty("gradeTypeCategory")
  private String gradeTypeCategory;

  public DutyRequirementsGradeRequirement grade(String grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Get grade
   * @return grade
  */
  @ApiModelProperty(value = "")


  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public DutyRequirementsGradeRequirement gradeType(String gradeType) {
    this.gradeType = gradeType;
    return this;
  }

  /**
   * Get gradeType
   * @return gradeType
  */
  @ApiModelProperty(value = "")


  public String getGradeType() {
    return gradeType;
  }

  public void setGradeType(String gradeType) {
    this.gradeType = gradeType;
  }

  public DutyRequirementsGradeRequirement gradeTypeCategory(String gradeTypeCategory) {
    this.gradeTypeCategory = gradeTypeCategory;
    return this;
  }

  /**
   * Get gradeTypeCategory
   * @return gradeTypeCategory
  */
  @ApiModelProperty(value = "")


  public String getGradeTypeCategory() {
    return gradeTypeCategory;
  }

  public void setGradeTypeCategory(String gradeTypeCategory) {
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
    DutyRequirementsGradeRequirement dutyRequirementsGradeRequirement = (DutyRequirementsGradeRequirement) o;
    return Objects.equals(this.grade, dutyRequirementsGradeRequirement.grade) &&
        Objects.equals(this.gradeType, dutyRequirementsGradeRequirement.gradeType) &&
        Objects.equals(this.gradeTypeCategory, dutyRequirementsGradeRequirement.gradeTypeCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grade, gradeType, gradeTypeCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyRequirementsGradeRequirement {\n");
    
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

