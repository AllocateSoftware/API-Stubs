package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DutyRequirements;
import com.allocate.openapi.model.DutyWhen;
import com.allocate.openapi.model.DutyWhere;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Duty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class Duty   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("when")
  private DutyWhen when;

  @JsonProperty("where")
  private DutyWhere where;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("requirements")
  private DutyRequirements requirements;

  public Duty id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier for this duty
   * @return id
  */
  @ApiModelProperty(example = "ABCD-93370", value = "Identifier for this duty")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Duty when(DutyWhen when) {
    this.when = when;
    return this;
  }

  /**
   * Get when
   * @return when
  */
  @ApiModelProperty(value = "")

  @Valid

  public DutyWhen getWhen() {
    return when;
  }

  public void setWhen(DutyWhen when) {
    this.when = when;
  }

  public Duty where(DutyWhere where) {
    this.where = where;
    return this;
  }

  /**
   * Get where
   * @return where
  */
  @ApiModelProperty(value = "")

  @Valid

  public DutyWhere getWhere() {
    return where;
  }

  public void setWhere(DutyWhere where) {
    this.where = where;
  }

  public Duty reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * reason for requestBody
   * @return reason
  */
  @ApiModelProperty(value = "reason for requestBody")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Duty requirements(DutyRequirements requirements) {
    this.requirements = requirements;
    return this;
  }

  /**
   * Get requirements
   * @return requirements
  */
  @ApiModelProperty(value = "")

  @Valid

  public DutyRequirements getRequirements() {
    return requirements;
  }

  public void setRequirements(DutyRequirements requirements) {
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
    Duty duty = (Duty) o;
    return Objects.equals(this.id, duty.id) &&
        Objects.equals(this.when, duty.when) &&
        Objects.equals(this.where, duty.where) &&
        Objects.equals(this.reason, duty.reason) &&
        Objects.equals(this.requirements, duty.requirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, when, where, reason, requirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Duty {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

