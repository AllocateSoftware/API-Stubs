package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.VacancyPersonRequirements;
import com.allocate.openapi.model.VacancyWhen;
import com.allocate.openapi.model.VacancyWhere;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Vacancy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

public class Vacancy   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("when")
  private VacancyWhen when;

  @JsonProperty("where")
  private VacancyWhere where;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("personRequirements")
  private VacancyPersonRequirements personRequirements;

  public Vacancy id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier for this vacancy
   * @return id
  */
  @ApiModelProperty(example = "D6540039-97B6-4D38-9837-29AA1C02302F", required = true, value = "Identifier for this vacancy")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Vacancy when(VacancyWhen when) {
    this.when = when;
    return this;
  }

  /**
   * Get when
   * @return when
  */
  @ApiModelProperty(value = "")

  @Valid

  public VacancyWhen getWhen() {
    return when;
  }

  public void setWhen(VacancyWhen when) {
    this.when = when;
  }

  public Vacancy where(VacancyWhere where) {
    this.where = where;
    return this;
  }

  /**
   * Get where
   * @return where
  */
  @ApiModelProperty(value = "")

  @Valid

  public VacancyWhere getWhere() {
    return where;
  }

  public void setWhere(VacancyWhere where) {
    this.where = where;
  }

  public Vacancy reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the request
   * @return reason
  */
  @ApiModelProperty(value = "Reason for the request")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Vacancy personRequirements(VacancyPersonRequirements personRequirements) {
    this.personRequirements = personRequirements;
    return this;
  }

  /**
   * Get personRequirements
   * @return personRequirements
  */
  @ApiModelProperty(value = "")

  @Valid

  public VacancyPersonRequirements getPersonRequirements() {
    return personRequirements;
  }

  public void setPersonRequirements(VacancyPersonRequirements personRequirements) {
    this.personRequirements = personRequirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vacancy vacancy = (Vacancy) o;
    return Objects.equals(this.id, vacancy.id) &&
        Objects.equals(this.when, vacancy.when) &&
        Objects.equals(this.where, vacancy.where) &&
        Objects.equals(this.reason, vacancy.reason) &&
        Objects.equals(this.personRequirements, vacancy.personRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, when, where, reason, personRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vacancy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    personRequirements: ").append(toIndentedString(personRequirements)).append("\n");
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

