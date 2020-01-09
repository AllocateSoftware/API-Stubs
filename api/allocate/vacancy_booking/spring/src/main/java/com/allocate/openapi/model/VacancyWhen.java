package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DateSpan;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The time and duration of this vacancy
 */
@ApiModel(description = "The time and duration of this vacancy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

public class VacancyWhen   {
  @JsonProperty("planned")
  private DateSpan planned;

  public VacancyWhen planned(DateSpan planned) {
    this.planned = planned;
    return this;
  }

  /**
   * Get planned
   * @return planned
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateSpan getPlanned() {
    return planned;
  }

  public void setPlanned(DateSpan planned) {
    this.planned = planned;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VacancyWhen vacancyWhen = (VacancyWhen) o;
    return Objects.equals(this.planned, vacancyWhen.planned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyWhen {\n");
    
    sb.append("    planned: ").append(toIndentedString(planned)).append("\n");
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

