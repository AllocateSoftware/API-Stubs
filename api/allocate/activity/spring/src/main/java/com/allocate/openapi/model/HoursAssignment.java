package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DateSpan;
import com.allocate.openapi.model.HoursAssignmentAssignment;
import com.allocate.openapi.model.HoursAssignmentCancellation;
import com.allocate.openapi.model.HoursAssignmentCostCentre;
import com.allocate.openapi.model.HoursAssignmentDuty;
import com.allocate.openapi.model.HoursAssignmentEmployeeType;
import com.allocate.openapi.model.HoursAssignmentFulfillment;
import com.allocate.openapi.model.HoursAssignmentLocation;
import com.allocate.openapi.model.HoursAssignmentOwningUnit;
import com.allocate.openapi.model.HoursAssignmentPerson;
import com.allocate.openapi.model.HoursAssignmentPost;
import com.allocate.openapi.model.HoursAssignmentPosting;
import com.allocate.openapi.model.HoursAssignmentRequirement;
import com.allocate.openapi.model.HoursAssignmentShift;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HoursAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:19.518070Z[Europe/London]")

public class HoursAssignment   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("when")
  private LocalDate when;

  @JsonProperty("actual")
  private DateSpan actual;

  @JsonProperty("workTime")
  private Integer workTime;

  @JsonProperty("contractedTime")
  private Integer contractedTime;

  /**
   * Details where the duty is in it’s lifecycle. *   Requested = (Requested Bank Duty) *   Accepted = (Roster Approved) *   Approved = (Finalised) *   Submitted = (PAID) *   Paid *   Unlocked = (Was once Finalised state.) *   Relocked = (Finalised given that it was once un-finalised for some reason) 
   */
  public enum PayStateEnum {
    REQUESTED("requested"),
    
    ACCEPTED("accepted"),
    
    APPROVED("approved"),
    
    SUBMITTED("submitted"),
    
    PAID("paid"),
    
    UNLOCKED("unlocked"),
    
    RELOCKED("relocked");

    private String value;

    PayStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PayStateEnum fromValue(String value) {
      for (PayStateEnum b : PayStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("payState")
  private PayStateEnum payState;

  @JsonProperty("employeeType")
  private HoursAssignmentEmployeeType employeeType;

  @JsonProperty("person")
  private HoursAssignmentPerson person;

  @JsonProperty("assignment")
  private HoursAssignmentAssignment assignment;

  @JsonProperty("post")
  private HoursAssignmentPost post;

  @JsonProperty("posting")
  private HoursAssignmentPosting posting;

  @JsonProperty("cancellation")
  private HoursAssignmentCancellation cancellation;

  @JsonProperty("inCharge")
  private Boolean inCharge;

  @JsonProperty("shift")
  private HoursAssignmentShift shift;

  @JsonProperty("duty")
  private HoursAssignmentDuty duty;

  @JsonProperty("fulfillment")
  private HoursAssignmentFulfillment fulfillment;

  @JsonProperty("costCentre")
  private HoursAssignmentCostCentre costCentre;

  @JsonProperty("owningUnit")
  private HoursAssignmentOwningUnit owningUnit;

  @JsonProperty("resourcingUnit")
  private HoursAssignmentOwningUnit resourcingUnit;

  @JsonProperty("requirement")
  private HoursAssignmentRequirement requirement;

  @JsonProperty("location")
  private HoursAssignmentLocation location;

  @JsonProperty("additionalDutyReason")
  private String additionalDutyReason;

  @JsonProperty("dutyHasWarnings")
  private Boolean dutyHasWarnings;

  public HoursAssignment id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier for the hours assignment
   * @return id
  */
  @ApiModelProperty(example = "123523", required = true, value = "Identifier for the hours assignment")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public HoursAssignment when(LocalDate when) {
    this.when = when;
    return this;
  }

  /**
   * Date assignment begins on
   * @return when
  */
  @ApiModelProperty(value = "Date assignment begins on")

  @Valid

  public LocalDate getWhen() {
    return when;
  }

  public void setWhen(LocalDate when) {
    this.when = when;
  }

  public HoursAssignment actual(DateSpan actual) {
    this.actual = actual;
    return this;
  }

  /**
   * Get actual
   * @return actual
  */
  @ApiModelProperty(value = "")

  @Valid

  public DateSpan getActual() {
    return actual;
  }

  public void setActual(DateSpan actual) {
    this.actual = actual;
  }

  public HoursAssignment workTime(Integer workTime) {
    this.workTime = workTime;
    return this;
  }

  /**
   * Number of minutes worked in assignment
   * @return workTime
  */
  @ApiModelProperty(example = "450", value = "Number of minutes worked in assignment")


  public Integer getWorkTime() {
    return workTime;
  }

  public void setWorkTime(Integer workTime) {
    this.workTime = workTime;
  }

  public HoursAssignment contractedTime(Integer contractedTime) {
    this.contractedTime = contractedTime;
    return this;
  }

  /**
   * Number of minutes that count towards the person’s contracted hours
   * @return contractedTime
  */
  @ApiModelProperty(example = "450", value = "Number of minutes that count towards the person’s contracted hours")


  public Integer getContractedTime() {
    return contractedTime;
  }

  public void setContractedTime(Integer contractedTime) {
    this.contractedTime = contractedTime;
  }

  public HoursAssignment payState(PayStateEnum payState) {
    this.payState = payState;
    return this;
  }

  /**
   * Details where the duty is in it’s lifecycle. *   Requested = (Requested Bank Duty) *   Accepted = (Roster Approved) *   Approved = (Finalised) *   Submitted = (PAID) *   Paid *   Unlocked = (Was once Finalised state.) *   Relocked = (Finalised given that it was once un-finalised for some reason) 
   * @return payState
  */
  @ApiModelProperty(value = "Details where the duty is in it’s lifecycle. *   Requested = (Requested Bank Duty) *   Accepted = (Roster Approved) *   Approved = (Finalised) *   Submitted = (PAID) *   Paid *   Unlocked = (Was once Finalised state.) *   Relocked = (Finalised given that it was once un-finalised for some reason) ")


  public PayStateEnum getPayState() {
    return payState;
  }

  public void setPayState(PayStateEnum payState) {
    this.payState = payState;
  }

  public HoursAssignment employeeType(HoursAssignmentEmployeeType employeeType) {
    this.employeeType = employeeType;
    return this;
  }

  /**
   * Get employeeType
   * @return employeeType
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentEmployeeType getEmployeeType() {
    return employeeType;
  }

  public void setEmployeeType(HoursAssignmentEmployeeType employeeType) {
    this.employeeType = employeeType;
  }

  public HoursAssignment person(HoursAssignmentPerson person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentPerson getPerson() {
    return person;
  }

  public void setPerson(HoursAssignmentPerson person) {
    this.person = person;
  }

  public HoursAssignment assignment(HoursAssignmentAssignment assignment) {
    this.assignment = assignment;
    return this;
  }

  /**
   * Get assignment
   * @return assignment
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentAssignment getAssignment() {
    return assignment;
  }

  public void setAssignment(HoursAssignmentAssignment assignment) {
    this.assignment = assignment;
  }

  public HoursAssignment post(HoursAssignmentPost post) {
    this.post = post;
    return this;
  }

  /**
   * Get post
   * @return post
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentPost getPost() {
    return post;
  }

  public void setPost(HoursAssignmentPost post) {
    this.post = post;
  }

  public HoursAssignment posting(HoursAssignmentPosting posting) {
    this.posting = posting;
    return this;
  }

  /**
   * Get posting
   * @return posting
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentPosting getPosting() {
    return posting;
  }

  public void setPosting(HoursAssignmentPosting posting) {
    this.posting = posting;
  }

  public HoursAssignment cancellation(HoursAssignmentCancellation cancellation) {
    this.cancellation = cancellation;
    return this;
  }

  /**
   * Get cancellation
   * @return cancellation
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentCancellation getCancellation() {
    return cancellation;
  }

  public void setCancellation(HoursAssignmentCancellation cancellation) {
    this.cancellation = cancellation;
  }

  public HoursAssignment inCharge(Boolean inCharge) {
    this.inCharge = inCharge;
    return this;
  }

  /**
   * Was the employee in charge?
   * @return inCharge
  */
  @ApiModelProperty(value = "Was the employee in charge?")


  public Boolean getInCharge() {
    return inCharge;
  }

  public void setInCharge(Boolean inCharge) {
    this.inCharge = inCharge;
  }

  public HoursAssignment shift(HoursAssignmentShift shift) {
    this.shift = shift;
    return this;
  }

  /**
   * Get shift
   * @return shift
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentShift getShift() {
    return shift;
  }

  public void setShift(HoursAssignmentShift shift) {
    this.shift = shift;
  }

  public HoursAssignment duty(HoursAssignmentDuty duty) {
    this.duty = duty;
    return this;
  }

  /**
   * Get duty
   * @return duty
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentDuty getDuty() {
    return duty;
  }

  public void setDuty(HoursAssignmentDuty duty) {
    this.duty = duty;
  }

  public HoursAssignment fulfillment(HoursAssignmentFulfillment fulfillment) {
    this.fulfillment = fulfillment;
    return this;
  }

  /**
   * Get fulfillment
   * @return fulfillment
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentFulfillment getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(HoursAssignmentFulfillment fulfillment) {
    this.fulfillment = fulfillment;
  }

  public HoursAssignment costCentre(HoursAssignmentCostCentre costCentre) {
    this.costCentre = costCentre;
    return this;
  }

  /**
   * Get costCentre
   * @return costCentre
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentCostCentre getCostCentre() {
    return costCentre;
  }

  public void setCostCentre(HoursAssignmentCostCentre costCentre) {
    this.costCentre = costCentre;
  }

  public HoursAssignment owningUnit(HoursAssignmentOwningUnit owningUnit) {
    this.owningUnit = owningUnit;
    return this;
  }

  /**
   * Get owningUnit
   * @return owningUnit
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentOwningUnit getOwningUnit() {
    return owningUnit;
  }

  public void setOwningUnit(HoursAssignmentOwningUnit owningUnit) {
    this.owningUnit = owningUnit;
  }

  public HoursAssignment resourcingUnit(HoursAssignmentOwningUnit resourcingUnit) {
    this.resourcingUnit = resourcingUnit;
    return this;
  }

  /**
   * Get resourcingUnit
   * @return resourcingUnit
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentOwningUnit getResourcingUnit() {
    return resourcingUnit;
  }

  public void setResourcingUnit(HoursAssignmentOwningUnit resourcingUnit) {
    this.resourcingUnit = resourcingUnit;
  }

  public HoursAssignment requirement(HoursAssignmentRequirement requirement) {
    this.requirement = requirement;
    return this;
  }

  /**
   * Get requirement
   * @return requirement
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentRequirement getRequirement() {
    return requirement;
  }

  public void setRequirement(HoursAssignmentRequirement requirement) {
    this.requirement = requirement;
  }

  public HoursAssignment location(HoursAssignmentLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")

  @Valid

  public HoursAssignmentLocation getLocation() {
    return location;
  }

  public void setLocation(HoursAssignmentLocation location) {
    this.location = location;
  }

  public HoursAssignment additionalDutyReason(String additionalDutyReason) {
    this.additionalDutyReason = additionalDutyReason;
    return this;
  }

  /**
   * Get additionalDutyReason
   * @return additionalDutyReason
  */
  @ApiModelProperty(value = "")


  public String getAdditionalDutyReason() {
    return additionalDutyReason;
  }

  public void setAdditionalDutyReason(String additionalDutyReason) {
    this.additionalDutyReason = additionalDutyReason;
  }

  public HoursAssignment dutyHasWarnings(Boolean dutyHasWarnings) {
    this.dutyHasWarnings = dutyHasWarnings;
    return this;
  }

  /**
   * Get dutyHasWarnings
   * @return dutyHasWarnings
  */
  @ApiModelProperty(value = "")


  public Boolean getDutyHasWarnings() {
    return dutyHasWarnings;
  }

  public void setDutyHasWarnings(Boolean dutyHasWarnings) {
    this.dutyHasWarnings = dutyHasWarnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoursAssignment hoursAssignment = (HoursAssignment) o;
    return Objects.equals(this.id, hoursAssignment.id) &&
        Objects.equals(this.when, hoursAssignment.when) &&
        Objects.equals(this.actual, hoursAssignment.actual) &&
        Objects.equals(this.workTime, hoursAssignment.workTime) &&
        Objects.equals(this.contractedTime, hoursAssignment.contractedTime) &&
        Objects.equals(this.payState, hoursAssignment.payState) &&
        Objects.equals(this.employeeType, hoursAssignment.employeeType) &&
        Objects.equals(this.person, hoursAssignment.person) &&
        Objects.equals(this.assignment, hoursAssignment.assignment) &&
        Objects.equals(this.post, hoursAssignment.post) &&
        Objects.equals(this.posting, hoursAssignment.posting) &&
        Objects.equals(this.cancellation, hoursAssignment.cancellation) &&
        Objects.equals(this.inCharge, hoursAssignment.inCharge) &&
        Objects.equals(this.shift, hoursAssignment.shift) &&
        Objects.equals(this.duty, hoursAssignment.duty) &&
        Objects.equals(this.fulfillment, hoursAssignment.fulfillment) &&
        Objects.equals(this.costCentre, hoursAssignment.costCentre) &&
        Objects.equals(this.owningUnit, hoursAssignment.owningUnit) &&
        Objects.equals(this.resourcingUnit, hoursAssignment.resourcingUnit) &&
        Objects.equals(this.requirement, hoursAssignment.requirement) &&
        Objects.equals(this.location, hoursAssignment.location) &&
        Objects.equals(this.additionalDutyReason, hoursAssignment.additionalDutyReason) &&
        Objects.equals(this.dutyHasWarnings, hoursAssignment.dutyHasWarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, when, actual, workTime, contractedTime, payState, employeeType, person, assignment, post, posting, cancellation, inCharge, shift, duty, fulfillment, costCentre, owningUnit, resourcingUnit, requirement, location, additionalDutyReason, dutyHasWarnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoursAssignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
    sb.append("    workTime: ").append(toIndentedString(workTime)).append("\n");
    sb.append("    contractedTime: ").append(toIndentedString(contractedTime)).append("\n");
    sb.append("    payState: ").append(toIndentedString(payState)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    posting: ").append(toIndentedString(posting)).append("\n");
    sb.append("    cancellation: ").append(toIndentedString(cancellation)).append("\n");
    sb.append("    inCharge: ").append(toIndentedString(inCharge)).append("\n");
    sb.append("    shift: ").append(toIndentedString(shift)).append("\n");
    sb.append("    duty: ").append(toIndentedString(duty)).append("\n");
    sb.append("    fulfillment: ").append(toIndentedString(fulfillment)).append("\n");
    sb.append("    costCentre: ").append(toIndentedString(costCentre)).append("\n");
    sb.append("    owningUnit: ").append(toIndentedString(owningUnit)).append("\n");
    sb.append("    resourcingUnit: ").append(toIndentedString(resourcingUnit)).append("\n");
    sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    additionalDutyReason: ").append(toIndentedString(additionalDutyReason)).append("\n");
    sb.append("    dutyHasWarnings: ").append(toIndentedString(dutyHasWarnings)).append("\n");
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

