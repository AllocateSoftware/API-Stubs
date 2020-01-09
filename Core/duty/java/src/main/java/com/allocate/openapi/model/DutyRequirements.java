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
import com.allocate.openapi.model.DutyRequirementsGradeRequirement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DutyRequirements
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:58.022235Z[Europe/London]")
public class DutyRequirements {
  public static final String SERIALIZED_NAME_GRADE_REQUIREMENT = "gradeRequirement";
  @SerializedName(SERIALIZED_NAME_GRADE_REQUIREMENT)
  private DutyRequirementsGradeRequirement gradeRequirement;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;


  public DutyRequirements gradeRequirement(DutyRequirementsGradeRequirement gradeRequirement) {
    
    this.gradeRequirement = gradeRequirement;
    return this;
  }

   /**
   * Get gradeRequirement
   * @return gradeRequirement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DutyRequirementsGradeRequirement getGradeRequirement() {
    return gradeRequirement;
  }


  public void setGradeRequirement(DutyRequirementsGradeRequirement gradeRequirement) {
    this.gradeRequirement = gradeRequirement;
  }


  public DutyRequirements gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Female", value = "")

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
    DutyRequirements dutyRequirements = (DutyRequirements) o;
    return Objects.equals(this.gradeRequirement, dutyRequirements.gradeRequirement) &&
        Objects.equals(this.gender, dutyRequirements.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gradeRequirement, gender);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyRequirements {\n");
    sb.append("    gradeRequirement: ").append(toIndentedString(gradeRequirement)).append("\n");
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

