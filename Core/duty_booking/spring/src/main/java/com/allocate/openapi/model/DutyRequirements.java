package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DutyRequirementsGradeRequirement;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DutyRequirements
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:20.724158Z[Europe/London]")

public class DutyRequirements   {
  @JsonProperty("gradeRequirement")
  private DutyRequirementsGradeRequirement gradeRequirement;

  @JsonProperty("gender")
  private String gender;

  public DutyRequirements gradeRequirement(DutyRequirementsGradeRequirement gradeRequirement) {
    this.gradeRequirement = gradeRequirement;
    return this;
  }

  /**
   * Get gradeRequirement
   * @return gradeRequirement
  */
  @ApiModelProperty(value = "")

  @Valid

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
  */
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

