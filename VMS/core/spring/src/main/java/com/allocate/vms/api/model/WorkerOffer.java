package com.allocate.vms.api.model;

import java.util.Objects;
import com.allocate.vms.api.model.Agency;
import com.allocate.vms.api.model.Person;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkerOffer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

public class WorkerOffer   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("bookingRequestId")
  private String bookingRequestId;

  @JsonProperty("worker")
  private Person worker;

  @JsonProperty("agency")
  private Agency agency;

  /**
   * Qualification Status:  * `qualified` - Worker has passed all trust-defined checks, and may be considered valid to book.  * `unqualified` - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker. 
   */
  public enum QualificationStatusEnum {
    QUALIFIED("qualified"),
    
    UNQUALIFIED("unqualified");

    private String value;

    QualificationStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static QualificationStatusEnum fromValue(String value) {
      for (QualificationStatusEnum b : QualificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("qualificationStatus")
  private QualificationStatusEnum qualificationStatus;

  public WorkerOffer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for this offer.
   * @return id
  */
  @ApiModelProperty(value = "Unique identifier for this offer.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkerOffer bookingRequestId(String bookingRequestId) {
    this.bookingRequestId = bookingRequestId;
    return this;
  }

  /**
   * The underlying booking request for this offer.
   * @return bookingRequestId
  */
  @ApiModelProperty(value = "The underlying booking request for this offer.")


  public String getBookingRequestId() {
    return bookingRequestId;
  }

  public void setBookingRequestId(String bookingRequestId) {
    this.bookingRequestId = bookingRequestId;
  }

  public WorkerOffer worker(Person worker) {
    this.worker = worker;
    return this;
  }

  /**
   * Get worker
   * @return worker
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Person getWorker() {
    return worker;
  }

  public void setWorker(Person worker) {
    this.worker = worker;
  }

  public WorkerOffer agency(Agency agency) {
    this.agency = agency;
    return this;
  }

  /**
   * Get agency
   * @return agency
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Agency getAgency() {
    return agency;
  }

  public void setAgency(Agency agency) {
    this.agency = agency;
  }

  public WorkerOffer qualificationStatus(QualificationStatusEnum qualificationStatus) {
    this.qualificationStatus = qualificationStatus;
    return this;
  }

  /**
   * Qualification Status:  * `qualified` - Worker has passed all trust-defined checks, and may be considered valid to book.  * `unqualified` - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker. 
   * @return qualificationStatus
  */
  @ApiModelProperty(required = true, value = "Qualification Status:  * `qualified` - Worker has passed all trust-defined checks, and may be considered valid to book.  * `unqualified` - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker. ")
  @NotNull


  public QualificationStatusEnum getQualificationStatus() {
    return qualificationStatus;
  }

  public void setQualificationStatus(QualificationStatusEnum qualificationStatus) {
    this.qualificationStatus = qualificationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerOffer workerOffer = (WorkerOffer) o;
    return Objects.equals(this.id, workerOffer.id) &&
        Objects.equals(this.bookingRequestId, workerOffer.bookingRequestId) &&
        Objects.equals(this.worker, workerOffer.worker) &&
        Objects.equals(this.agency, workerOffer.agency) &&
        Objects.equals(this.qualificationStatus, workerOffer.qualificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bookingRequestId, worker, agency, qualificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkerOffer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bookingRequestId: ").append(toIndentedString(bookingRequestId)).append("\n");
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    qualificationStatus: ").append(toIndentedString(qualificationStatus)).append("\n");
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

