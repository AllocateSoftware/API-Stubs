package com.allocate.vms.api.model;

import java.util.Objects;
import com.allocate.vms.api.model.Agency;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkerOfferedEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

public class WorkerOfferedEvent   {
  @JsonProperty("objectType")
  private String objectType;

  @JsonProperty("bookingRequestId")
  private String bookingRequestId;

  @JsonProperty("agency")
  private Agency agency;

  public WorkerOfferedEvent objectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * Get objectType
   * @return objectType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getObjectType() {
    return objectType;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  public WorkerOfferedEvent bookingRequestId(String bookingRequestId) {
    this.bookingRequestId = bookingRequestId;
    return this;
  }

  /**
   * The ID of the booking request
   * @return bookingRequestId
  */
  @ApiModelProperty(value = "The ID of the booking request")


  public String getBookingRequestId() {
    return bookingRequestId;
  }

  public void setBookingRequestId(String bookingRequestId) {
    this.bookingRequestId = bookingRequestId;
  }

  public WorkerOfferedEvent agency(Agency agency) {
    this.agency = agency;
    return this;
  }

  /**
   * Get agency
   * @return agency
  */
  @ApiModelProperty(value = "")

  @Valid

  public Agency getAgency() {
    return agency;
  }

  public void setAgency(Agency agency) {
    this.agency = agency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerOfferedEvent workerOfferedEvent = (WorkerOfferedEvent) o;
    return Objects.equals(this.objectType, workerOfferedEvent.objectType) &&
        Objects.equals(this.bookingRequestId, workerOfferedEvent.bookingRequestId) &&
        Objects.equals(this.agency, workerOfferedEvent.agency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectType, bookingRequestId, agency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerOfferedEvent {\n");
    
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    bookingRequestId: ").append(toIndentedString(bookingRequestId)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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

