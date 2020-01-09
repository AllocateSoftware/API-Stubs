/*
 * VMS Provisioning API
 * ## Description  API to be impemented by 247Time (and, potentially, partners) to enable provisioning of accounts and the org structure 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.vms.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.allocate.vms.api.model.Grade;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StaffGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:36.006010Z[Europe/London]")
public class StaffGroup {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GRADES = "grades";
  @SerializedName(SERIALIZED_NAME_GRADES)
  private List<Grade> grades = null;


  public StaffGroup id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
      this.grades = new ArrayList<Grade>();
    }
    this.grades.add(gradesItem);
    return this;
  }

   /**
   * Get grades
   * @return grades
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
