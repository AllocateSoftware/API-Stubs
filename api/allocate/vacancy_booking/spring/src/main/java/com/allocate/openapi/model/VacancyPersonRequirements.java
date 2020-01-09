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
 * VacancyPersonRequirements
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

public class VacancyPersonRequirements   {
  @JsonProperty("grade")
  private String grade;

  @JsonProperty("gradeType")
  private String gradeType;

  @JsonProperty("gradeTypeCategory")
  private String gradeTypeCategory;

  @JsonProperty("gender")
  private String gender;

  public VacancyPersonRequirements grade(String grade) {
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

  public VacancyPersonRequirements gradeType(String gradeType) {
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

  public VacancyPersonRequirements gradeTypeCategory(String gradeTypeCategory) {
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

  public VacancyPersonRequirements gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(value = "")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyPersonRequirements vacancyPersonRequirements = (VacancyPersonRequirements) o;
    return Objects.equals(this.grade, vacancyPersonRequirements.grade) &&
        Objects.equals(this.gradeType, vacancyPersonRequirements.gradeType) &&
        Objects.equals(this.gradeTypeCategory, vacancyPersonRequirements.gradeTypeCategory) &&
        Objects.equals(this.gender, vacancyPersonRequirements.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grade, gradeType, gradeTypeCategory, gender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyPersonRequirements {\n");
    
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    gradeType: ").append(toIndentedString(gradeType)).append("\n");
    sb.append("    gradeTypeCategory: ").append(toIndentedString(gradeTypeCategory)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

