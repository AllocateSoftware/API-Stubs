package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.AvailabilitiesAvailability;
import com.allocate.openapi.model.AvailabilitiesNoBank;
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
 * Availabilities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class Availabilities   {
  @JsonProperty("Availability")
  @Valid
  private List<AvailabilitiesAvailability> availability = new ArrayList<>();

  @JsonProperty("NoBank")
  @Valid
  private List<AvailabilitiesNoBank> noBank = new ArrayList<>();

  public Availabilities availability(List<AvailabilitiesAvailability> availability) {
    this.availability = availability;
    return this;
  }

  public Availabilities addAvailabilityItem(AvailabilitiesAvailability availabilityItem) {
    this.availability.add(availabilityItem);
    return this;
  }

  /**
   * Get availability
   * @return availability
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<AvailabilitiesAvailability> getAvailability() {
    return availability;
  }

  public void setAvailability(List<AvailabilitiesAvailability> availability) {
    this.availability = availability;
  }

  public Availabilities noBank(List<AvailabilitiesNoBank> noBank) {
    this.noBank = noBank;
    return this;
  }

  public Availabilities addNoBankItem(AvailabilitiesNoBank noBankItem) {
    this.noBank.add(noBankItem);
    return this;
  }

  /**
   * Get noBank
   * @return noBank
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<AvailabilitiesNoBank> getNoBank() {
    return noBank;
  }

  public void setNoBank(List<AvailabilitiesNoBank> noBank) {
    this.noBank = noBank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Availabilities availabilities = (Availabilities) o;
    return Objects.equals(this.availability, availabilities.availability) &&
        Objects.equals(this.noBank, availabilities.noBank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, noBank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Availabilities {\n");
    
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    noBank: ").append(toIndentedString(noBank)).append("\n");
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

