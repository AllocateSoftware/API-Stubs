/*
 * DE Provider Direct Engagement API
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BookingResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:37:11.208292Z[Europe/London]")
public class BookingResponse {
  public static final String SERIALIZED_NAME_DUTY_ID = "dutyId";
  @SerializedName(SERIALIZED_NAME_DUTY_ID)
  private String dutyId;

  public static final String SERIALIZED_NAME_BOOKING_ID = "bookingId";
  @SerializedName(SERIALIZED_NAME_BOOKING_ID)
  private String bookingId;

  public static final String SERIALIZED_NAME_ALLOCATE_PERSON_ID = "allocatePersonId";
  @SerializedName(SERIALIZED_NAME_ALLOCATE_PERSON_ID)
  private String allocatePersonId;

  public static final String SERIALIZED_NAME_MASTER_DUTY_ID = "masterDutyId";
  @SerializedName(SERIALIZED_NAME_MASTER_DUTY_ID)
  private String masterDutyId;

  public static final String SERIALIZED_NAME_SLAVE_DUTY_ID = "slaveDutyId";
  @SerializedName(SERIALIZED_NAME_SLAVE_DUTY_ID)
  private String slaveDutyId;


  public BookingResponse dutyId(String dutyId) {
    
    this.dutyId = dutyId;
    return this;
  }

   /**
   * Trust identifier of the booked duty
   * @return dutyId
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
