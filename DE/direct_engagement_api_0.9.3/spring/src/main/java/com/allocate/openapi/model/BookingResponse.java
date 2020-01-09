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
 * BookingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:37:09.334042Z[Europe/London]")

public class BookingResponse   {
  @JsonProperty("dutyId")
  private String dutyId;

  @JsonProperty("bookingId")
  private String bookingId;

  @JsonProperty("allocatePersonId")
  private String allocatePersonId;

  @JsonProperty("masterDutyId")
  private String masterDutyId;

  @JsonProperty("slaveDutyId")
  private String slaveDutyId;

  public BookingResponse dutyId(String dutyId) {
    this.dutyId = dutyId;
    return this;
  }

  /**
   * Trust identifier of the booked duty
   * @return dutyId
  */
  @ApiModelProperty(example = "TrustA.11667", value = "Trust identifier of the booked duty")


  public String getDutyId() {
    return dutyId;
  }

  public void setDutyId(String dutyId) {
    this.dutyId = dutyId;
  }

  public BookingResponse bookingId(String bookingId) {
    this.bookingId = bookingId;
    return this;
  }

  /**
   * Trust identifier of the booking in BankStaff
   * @return bookingId
  */
  @ApiModelProperty(example = "TrustA.33532", value = "Trust identifier of the booking in BankStaff")


  public String getBookingId() {
    return bookingId;
  }

  public void setBookingId(String bookingId) {
    this.bookingId = bookingId;
  }

  public BookingResponse allocatePersonId(String allocatePersonId) {
    this.allocatePersonId = allocatePersonId;
    return this;
  }

  /**
   * Trust identifier of the booked person in BankStaff
   * @return allocatePersonId
  */
  @ApiModelProperty(example = "TrustA.1126", value = "Trust identifier of the booked person in BankStaff")


  public String getAllocatePersonId() {
    return allocatePersonId;
  }

  public void setAllocatePersonId(String allocatePersonId) {
    this.allocatePersonId = allocatePersonId;
  }

  public BookingResponse masterDutyId(String masterDutyId) {
    this.masterDutyId = masterDutyId;
    return this;
  }

  /**
   * Trust identifier of the master duty if the duty is part of the consolidated duty
   * @return masterDutyId
  */
  @ApiModelProperty(example = "TrustA.11668", value = "Trust identifier of the master duty if the duty is part of the consolidated duty")


  public String getMasterDutyId() {
    return masterDutyId;
  }

  public void setMasterDutyId(String masterDutyId) {
    this.masterDutyId = masterDutyId;
  }

  public BookingResponse slaveDutyId(String slaveDutyId) {
    this.slaveDutyId = slaveDutyId;
    return this;
  }

  /**
   * Trust identifier of the slave duty if the duty is part of the consolidated duty
   * @return slaveDutyId
  */
  @ApiModelProperty(example = "TrustA.11667", value = "Trust identifier of the slave duty if the duty is part of the consolidated duty")


  public String getSlaveDutyId() {
    return slaveDutyId;
  }

  public void setSlaveDutyId(String slaveDutyId) {
    this.slaveDutyId = slaveDutyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingResponse bookingResponse = (BookingResponse) o;
    return Objects.equals(this.dutyId, bookingResponse.dutyId) &&
        Objects.equals(this.bookingId, bookingResponse.bookingId) &&
        Objects.equals(this.allocatePersonId, bookingResponse.allocatePersonId) &&
        Objects.equals(this.masterDutyId, bookingResponse.masterDutyId) &&
        Objects.equals(this.slaveDutyId, bookingResponse.slaveDutyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dutyId, bookingId, allocatePersonId, masterDutyId, slaveDutyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingResponse {\n");
    
    sb.append("    dutyId: ").append(toIndentedString(dutyId)).append("\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    allocatePersonId: ").append(toIndentedString(allocatePersonId)).append("\n");
    sb.append("    masterDutyId: ").append(toIndentedString(masterDutyId)).append("\n");
    sb.append("    slaveDutyId: ").append(toIndentedString(slaveDutyId)).append("\n");
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

