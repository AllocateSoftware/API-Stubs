package com.allocate.vms.api.model;

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
 * BookingCancelledEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

public class BookingCancelledEvent   {
  @JsonProperty("bookingRequestId")
  private String bookingRequestId;

  @JsonProperty("bookingId")
  private String bookingId;

  @JsonProperty("agencyId")
  private String agencyId;

  @JsonProperty("cost")
  private BigDecimal cost;

  public BookingCancelledEvent bookingRequestId(String bookingRequestId) {
    this.bookingRequestId = bookingRequestId;
    return this;
  }

  /**
   * Get bookingRequestId
   * @return bookingRequestId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBookingRequestId() {
    return bookingRequestId;
  }

  public void setBookingRequestId(String bookingRequestId) {
    this.bookingRequestId = bookingRequestId;
  }

  public BookingCancelledEvent bookingId(String bookingId) {
    this.bookingId = bookingId;
    return this;
  }

  /**
   * Get bookingId
   * @return bookingId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBookingId() {
    return bookingId;
  }

  public void setBookingId(String bookingId) {
    this.bookingId = bookingId;
  }

  public BookingCancelledEvent agencyId(String agencyId) {
    this.agencyId = agencyId;
    return this;
  }

  /**
   * Get agencyId
   * @return agencyId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(String agencyId) {
    this.agencyId = agencyId;
  }

  public BookingCancelledEvent cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
  */
  @ApiModelProperty(example = "123.45", value = "")

  @Valid

  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
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
    return Objects.equals(this.bookingRequestId, bookingCancelledEvent.bookingRequestId) &&
        Objects.equals(this.bookingId, bookingCancelledEvent.bookingId) &&
        Objects.equals(this.agencyId, bookingCancelledEvent.agencyId) &&
        Objects.equals(this.cost, bookingCancelledEvent.cost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingRequestId, bookingId, agencyId, cost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingCancelledEvent {\n");
    
    sb.append("    bookingRequestId: ").append(toIndentedString(bookingRequestId)).append("\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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

