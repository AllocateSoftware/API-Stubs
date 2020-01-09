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
 * A vacancy has been updated
 */
@ApiModel(description = "A vacancy has been updated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

public class VacancyUpdatedEvent   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("vacancy")
  private String vacancy;

  public VacancyUpdatedEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the vacancy
   * @return id
  */
  @ApiModelProperty(required = true, value = "ID of the vacancy")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VacancyUpdatedEvent vacancy(String vacancy) {
    this.vacancy = vacancy;
    return this;
  }

  /**
   * Details of the vacancy
   * @return vacancy
  */
  @ApiModelProperty(required = true, value = "Details of the vacancy")
  @NotNull


  public String getVacancy() {
    return vacancy;
  }

  public void setVacancy(String vacancy) {
    this.vacancy = vacancy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyUpdatedEvent vacancyUpdatedEvent = (VacancyUpdatedEvent) o;
    return Objects.equals(this.id, vacancyUpdatedEvent.id) &&
        Objects.equals(this.vacancy, vacancyUpdatedEvent.vacancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vacancy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyUpdatedEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vacancy: ").append(toIndentedString(vacancy)).append("\n");
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

