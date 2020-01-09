/*
 * Duties and Events
 * ## Duties and Events 
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
 * DutyRequirementsGradeRequirement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:58.022235Z[Europe/London]")
public class DutyRequirementsGradeRequirement {
  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private String grade;

  public static final String SERIALIZED_NAME_GRADE_TYPE = "gradeType";
  @SerializedName(SERIALIZED_NAME_GRADE_TYPE)
  private String gradeType;

  public static final String SERIALIZED_NAME_GRADE_TYPE_CATEGORY = "gradeTypeCategory";
  @SerializedName(SERIALIZED_NAME_GRADE_TYPE_CATEGORY)
  private String gradeTypeCategory;


  public DutyRequirementsGradeRequirement grade(String grade) {
    
    this.grade = grade;
    return this;
  }

   /**
   * Get grade
   * @return grade
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
