package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Vacancy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A vacancy has become available for filling
 */
@ApiModel(description = "A vacancy has become available for filling")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

public class VacancyPublishedEvent   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("vacancy")
  private Vacancy vacancy;

  public VacancyPublishedEvent id(String id) {
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

  public VacancyPublishedEvent vacancy(Vacancy vacancy) {
    this.vacancy = vacancy;
    return this;
  }

  /**
   * Get vacancy
   * @return vacancy
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Vacancy getVacancy() {
    return vacancy;
  }

  public void setVacancy(Vacancy vacancy) {
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
    VacancyPublishedEvent vacancyPublishedEvent = (VacancyPublishedEvent) o;
    return Objects.equals(this.id, vacancyPublishedEvent.id) &&
        Objects.equals(this.vacancy, vacancyPublishedEvent.vacancy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vacancy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyPublishedEvent {\n");
    
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

