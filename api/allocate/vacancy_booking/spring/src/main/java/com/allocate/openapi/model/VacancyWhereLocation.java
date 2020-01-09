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
 * VacancyWhereLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

public class VacancyWhereLocation   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  public VacancyWhereLocation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the location (within the trust)
   * @return id
  */
  @ApiModelProperty(required = true, value = "The ID of the location (within the trust)")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyWhereLocation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the location
   * @return name
  */
  @ApiModelProperty(value = "The name of the location")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyWhereLocation vacancyWhereLocation = (VacancyWhereLocation) o;
    return Objects.equals(this.id, vacancyWhereLocation.id) &&
        Objects.equals(this.name, vacancyWhereLocation.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyWhereLocation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

