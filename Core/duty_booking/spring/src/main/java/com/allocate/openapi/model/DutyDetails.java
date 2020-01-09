package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DutyDetailsWhen;
import com.allocate.openapi.model.DutyDetailsWhere;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DutyDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:20.724158Z[Europe/London]")

public class DutyDetails   {
  @JsonProperty("when")
  private DutyDetailsWhen when;

  @JsonProperty("where")
  private DutyDetailsWhere where;

  @JsonProperty("requirements")
  private Object requirements;

  public DutyDetails when(DutyDetailsWhen when) {
    this.when = when;
    return this;
  }

  /**
   * Get when
   * @return when
  */
  @ApiModelProperty(value = "")

  @Valid

  public DutyDetailsWhen getWhen() {
    return when;
  }

  public void setWhen(DutyDetailsWhen when) {
    this.when = when;
  }

  public DutyDetails where(DutyDetailsWhere where) {
    this.where = where;
    return this;
  }

  /**
   * Get where
   * @return where
  */
  @ApiModelProperty(value = "")

  @Valid

  public DutyDetailsWhere getWhere() {
    return where;
  }

  public void setWhere(DutyDetailsWhere where) {
    this.where = where;
  }

  public DutyDetails requirements(Object requirements) {
    this.requirements = requirements;
    return this;
  }

  /**
   * Get requirements
   * @return requirements
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getRequirements() {
    return requirements;
  }

  public void setRequirements(Object requirements) {
    this.requirements = requirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyDetails dutyDetails = (DutyDetails) o;
    return Objects.equals(this.when, dutyDetails.when) &&
        Objects.equals(this.where, dutyDetails.where) &&
        Objects.equals(this.requirements, dutyDetails.requirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(when, where, requirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyDetails {\n");
    
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
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

