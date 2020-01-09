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
 * A booking has been cancelled
 */
@ApiModel(description = "A booking has been cancelled")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:20.724158Z[Europe/London]")

public class BookingCancelledEvent   {
  @JsonProperty("proposalId")
  private String proposalId;

  @JsonProperty("vacancyId")
  private String vacancyId;

  public BookingCancelledEvent proposalId(String proposalId) {
    this.proposalId = proposalId;
    return this;
  }

  /**
   * The ID of the booking
   * @return proposalId
  */
  @ApiModelProperty(required = true, value = "The ID of the booking")
  @NotNull


  public String getProposalId() {
    return proposalId;
  }

  public void setProposalId(String proposalId) {
    this.proposalId = proposalId;
  }

  public BookingCancelledEvent vacancyId(String vacancyId) {
    this.vacancyId = vacancyId;
    return this;
  }

  /**
   * The ID of the vacancy
   * @return vacancyId
  */
  @ApiModelProperty(value = "The ID of the vacancy")


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
    BookingCancelledEvent bookingCancelledEvent = (BookingCancelledEvent) o;
    return Objects.equals(this.proposalId, bookingCancelledEvent.proposalId) &&
        Objects.equals(this.vacancyId, bookingCancelledEvent.vacancyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposalId, vacancyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingCancelledEvent {\n");
    
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

