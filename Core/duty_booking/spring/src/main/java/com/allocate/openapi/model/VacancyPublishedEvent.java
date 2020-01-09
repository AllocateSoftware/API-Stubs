package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Duty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A vacancy has become available for filling.
 */
@ApiModel(description = "A vacancy has become available for filling.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:20.724158Z[Europe/London]")

public class VacancyPublishedEvent   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("duty")
  private Duty duty;

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

  public VacancyPublishedEvent duty(Duty duty) {
    this.duty = duty;
    return this;
  }

  /**
   * Get duty
   * @return duty
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Duty getDuty() {
    return duty;
  }

  public void setDuty(Duty duty) {
    this.duty = duty;
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
        Objects.equals(this.duty, vacancyPublishedEvent.duty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, duty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacancyPublishedEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    duty: ").append(toIndentedString(duty)).append("\n");
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

