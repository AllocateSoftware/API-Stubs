package com.allocate.vms.api.model;

import java.util.Objects;
import com.allocate.vms.api.model.Grade;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StaffGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:34.643941Z[Europe/London]")

public class StaffGroup   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("grades")
  @Valid
  private List<Grade> grades = null;

  public StaffGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(example = "1121", value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StaffGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "Medics", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StaffGroup grades(List<Grade> grades) {
    this.grades = grades;
    return this;
  }

  public StaffGroup addGradesItem(Grade gradesItem) {
    if (this.grades == null) {
      this.grades = new ArrayList<>();
    }
    this.grades.add(gradesItem);
    return this;
  }

  /**
   * Get grades
   * @return grades
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Grade> getGrades() {
    return grades;
  }

  public void setGrades(List<Grade> grades) {
    this.grades = grades;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffGroup staffGroup = (StaffGroup) o;
    return Objects.equals(this.id, staffGroup.id) &&
        Objects.equals(this.name, staffGroup.name) &&
        Objects.equals(this.grades, staffGroup.grades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, grades);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    grades: ").append(toIndentedString(grades)).append("\n");
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

