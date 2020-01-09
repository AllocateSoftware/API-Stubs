package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AvailabilitiesAvailability
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class AvailabilitiesAvailability   {
  @JsonProperty("date")
  private LocalDate date;

  @JsonProperty("availabilityType")
  private String availabilityType;

  @JsonProperty("start")
  private String start;

  @JsonProperty("end")
  private String end;

  @JsonProperty("numberOfOccurrences")
  private BigDecimal numberOfOccurrences;

  @JsonProperty("notes")
  private String notes;

  public AvailabilitiesAvailability date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public AvailabilitiesAvailability availabilityType(String availabilityType) {
    this.availabilityType = availabilityType;
    return this;
  }

  /**
   * Get availabilityType
   * @return availabilityType
  */
  @ApiModelProperty(value = "")


  public String getAvailabilityType() {
    return availabilityType;
  }

  public void setAvailabilityType(String availabilityType) {
    this.availabilityType = availabilityType;
  }

  public AvailabilitiesAvailability start(String start) {
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

  public AvailabilitiesAvailability end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
  */
  @ApiModelProperty(value = "")


  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public AvailabilitiesAvailability numberOfOccurrences(BigDecimal numberOfOccurrences) {
    this.numberOfOccurrences = numberOfOccurrences;
    return this;
  }

  /**
   * Get numberOfOccurrences
   * @return numberOfOccurrences
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getNumberOfOccurrences() {
    return numberOfOccurrences;
  }

  public void setNumberOfOccurrences(BigDecimal numberOfOccurrences) {
    this.numberOfOccurrences = numberOfOccurrences;
  }

  public AvailabilitiesAvailability notes(String notes) {
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
    AvailabilitiesAvailability availabilitiesAvailability = (AvailabilitiesAvailability) o;
    return Objects.equals(this.date, availabilitiesAvailability.date) &&
        Objects.equals(this.availabilityType, availabilitiesAvailability.availabilityType) &&
        Objects.equals(this.start, availabilitiesAvailability.start) &&
        Objects.equals(this.end, availabilitiesAvailability.end) &&
        Objects.equals(this.numberOfOccurrences, availabilitiesAvailability.numberOfOccurrences) &&
        Objects.equals(this.notes, availabilitiesAvailability.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, availabilityType, start, end, numberOfOccurrences, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilitiesAvailability {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    availabilityType: ").append(toIndentedString(availabilityType)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    numberOfOccurrences: ").append(toIndentedString(numberOfOccurrences)).append("\n");
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

