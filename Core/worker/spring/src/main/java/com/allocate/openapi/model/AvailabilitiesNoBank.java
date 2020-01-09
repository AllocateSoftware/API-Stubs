package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AvailabilitiesNoBank
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class AvailabilitiesNoBank   {
  @JsonProperty("start")
  private String start;

  @JsonProperty("numberOfOccurances")
  private BigDecimal numberOfOccurances;

  @JsonProperty("notes")
  private String notes;

  public AvailabilitiesNoBank start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  */
  @ApiModelProperty(value = "")


  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public AvailabilitiesNoBank numberOfOccurances(BigDecimal numberOfOccurances) {
    this.numberOfOccurances = numberOfOccurances;
    return this;
  }

  /**
   * Get numberOfOccurances
   * @return numberOfOccurances
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getNumberOfOccurances() {
    return numberOfOccurances;
  }

  public void setNumberOfOccurances(BigDecimal numberOfOccurances) {
    this.numberOfOccurances = numberOfOccurances;
  }

  public AvailabilitiesNoBank notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  @ApiModelProperty(value = "")


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilitiesNoBank availabilitiesNoBank = (AvailabilitiesNoBank) o;
    return Objects.equals(this.start, availabilitiesNoBank.start) &&
        Objects.equals(this.numberOfOccurances, availabilitiesNoBank.numberOfOccurances) &&
        Objects.equals(this.notes, availabilitiesNoBank.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, numberOfOccurances, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilitiesNoBank {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    numberOfOccurances: ").append(toIndentedString(numberOfOccurances)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

