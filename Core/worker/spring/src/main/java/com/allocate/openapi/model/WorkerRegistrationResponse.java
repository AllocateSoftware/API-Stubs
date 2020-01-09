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
 * WorkerRegistrationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class WorkerRegistrationResponse   {
  @JsonProperty("personId")
  private String personId;

  public WorkerRegistrationResponse personId(String personId) {
    this.personId = personId;
    return this;
  }

  /**
   * ASWid of the person
   * @return personId
  */
  @ApiModelProperty(required = true, value = "ASWid of the person")
  @NotNull


  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerRegistrationResponse workerRegistrationResponse = (WorkerRegistrationResponse) o;
    return Objects.equals(this.personId, workerRegistrationResponse.personId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerRegistrationResponse {\n");
    
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
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

