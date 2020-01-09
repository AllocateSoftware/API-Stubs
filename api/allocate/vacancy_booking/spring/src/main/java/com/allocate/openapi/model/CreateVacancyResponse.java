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
 * CreateVacancyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

public class CreateVacancyResponse   {
  @JsonProperty("vacancyId")
  private String vacancyId;

  public CreateVacancyResponse vacancyId(String vacancyId) {
    this.vacancyId = vacancyId;
    return this;
  }

  /**
   * The ID of the vacancy created
   * @return vacancyId
  */
  @ApiModelProperty(example = "3B78B5C3-07B3-4DC6-8A2A-7D85153869FC", required = true, value = "The ID of the vacancy created")
  @NotNull


  public String getVacancyId() {
    return vacancyId;
  }

  public void setVacancyId(String vacancyId) {
    this.vacancyId = vacancyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVacancyResponse createVacancyResponse = (CreateVacancyResponse) o;
    return Objects.equals(this.vacancyId, createVacancyResponse.vacancyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vacancyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVacancyResponse {\n");
    
    sb.append("    vacancyId: ").append(toIndentedString(vacancyId)).append("\n");
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

