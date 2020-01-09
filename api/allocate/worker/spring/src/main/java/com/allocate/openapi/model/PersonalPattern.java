package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PersonalPattern
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class PersonalPattern   {
  @JsonProperty("duty")
  @Valid
  private List<Object> duty = null;

  @JsonProperty("unavailability")
  @Valid
  private List<Object> unavailability = null;

  public PersonalPattern duty(List<Object> duty) {
    this.duty = duty;
    return this;
  }

  public PersonalPattern addDutyItem(Object dutyItem) {
    if (this.duty == null) {
      this.duty = new ArrayList<>();
    }
    this.duty.add(dutyItem);
    return this;
  }

  /**
   * Get duty
   * @return duty
  */
  @ApiModelProperty(value = "")


  public List<Object> getDuty() {
    return duty;
  }

  public void setDuty(List<Object> duty) {
    this.duty = duty;
  }

  public PersonalPattern unavailability(List<Object> unavailability) {
    this.unavailability = unavailability;
    return this;
  }

  public PersonalPattern addUnavailabilityItem(Object unavailabilityItem) {
    if (this.unavailability == null) {
      this.unavailability = new ArrayList<>();
    }
    this.unavailability.add(unavailabilityItem);
    return this;
  }

  /**
   * Get unavailability
   * @return unavailability
  */
  @ApiModelProperty(value = "")


  public List<Object> getUnavailability() {
    return unavailability;
  }

  public void setUnavailability(List<Object> unavailability) {
    this.unavailability = unavailability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalPattern personalPattern = (PersonalPattern) o;
    return Objects.equals(this.duty, personalPattern.duty) &&
        Objects.equals(this.unavailability, personalPattern.unavailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duty, unavailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalPattern {\n");
    
    sb.append("    duty: ").append(toIndentedString(duty)).append("\n");
    sb.append("    unavailability: ").append(toIndentedString(unavailability)).append("\n");
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

