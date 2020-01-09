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
 * A proposal to fill a vacancy has been accepted (booked)
 */
@ApiModel(description = "A proposal to fill a vacancy has been accepted (booked)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

public class BookingEvent   {
  @JsonProperty("proposalId")
  private String proposalId;

  @JsonProperty("vacancyId")
  private String vacancyId;

  public BookingEvent proposalId(String proposalId) {
    this.proposalId = proposalId;
    return this;
  }

  /**
   * The ID of the proposal
   * @return proposalId
  */
  @ApiModelProperty(required = true, value = "The ID of the proposal")
  @NotNull


  public String getProposalId() {
    return proposalId;
  }

  public void setProposalId(String proposalId) {
    this.proposalId = proposalId;
  }

  public BookingEvent vacancyId(String vacancyId) {
    this.vacancyId = vacancyId;
    return this;
  }

  /**
   * The ID of the vacancy
   * @return vacancyId
  */
  @ApiModelProperty(required = true, value = "The ID of the vacancy")
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
    BookingEvent bookingEvent = (BookingEvent) o;
    return Objects.equals(this.proposalId, bookingEvent.proposalId) &&
        Objects.equals(this.vacancyId, bookingEvent.vacancyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposalId, vacancyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingEvent {\n");
    
    sb.append("    proposalId: ").append(toIndentedString(proposalId)).append("\n");
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

