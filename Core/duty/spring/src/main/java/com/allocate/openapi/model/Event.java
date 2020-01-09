package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Event
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "eventType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = DutyEvent.class, name = "DutyEvent"),
  @JsonSubTypes.Type(value = DutyTempStaffingNoteCreatedEvent.class, name = "DutyTempStaffingNoteCreatedEvent"),
  @JsonSubTypes.Type(value = DutyTempStaffingNoteDeletedEvent.class, name = "DutyTempStaffingNoteDeletedEvent"),
  @JsonSubTypes.Type(value = DutyTempStaffingExpressionOfInterestEvent.class, name = "DutyTempStaffingExpressionOfInterestEvent"),
  @JsonSubTypes.Type(value = DutyCascadeEvent.class, name = "DutyCascadeEvent"),
  @JsonSubTypes.Type(value = DutyUpdatedEvent.class, name = "DutyUpdatedEvent"),
  @JsonSubTypes.Type(value = DutyCancelledEvent.class, name = "DutyCancelledEvent"),
  @JsonSubTypes.Type(value = DutyDeletedEvent.class, name = "DutyDeletedEvent"),
  @JsonSubTypes.Type(value = DutyApprovedEvent.class, name = "DutyApprovedEvent"),
  @JsonSubTypes.Type(value = DutyAssignedEvent.class, name = "DutyAssignedEvent"),
  @JsonSubTypes.Type(value = DutyAssignmentClearedEvent.class, name = "DutyAssignmentClearedEvent"),
  @JsonSubTypes.Type(value = DutyAssignmentUpdatedEvent.class, name = "DutyAssignmentUpdatedEvent"),
  @JsonSubTypes.Type(value = DutyAssignmentFinalisedEvent.class, name = "DutyAssignmentFinalisedEvent"),
  @JsonSubTypes.Type(value = DutyAssignmentUnFinalisedEvent.class, name = "DutyAssignmentUnFinalisedEvent"),
  @JsonSubTypes.Type(value = DutyAssignmentTimesheetConfirmedEvent.class, name = "DutyAssignmentTimesheetConfirmedEvent"),
  @JsonSubTypes.Type(value = DutyAssignmentTimesheetUnconfirmedEvent.class, name = "DutyAssignmentTimesheetUnconfirmedEvent"),
  @JsonSubTypes.Type(value = DutyAssignmentTimesheetRejectedEvent.class, name = "DutyAssignmentTimesheetRejectedEvent"),
  @JsonSubTypes.Type(value = DutyAssignmentSubmittedEvent.class, name = "DutyAssignmentSubmittedEvent"),
  @JsonSubTypes.Type(value = DutyAssignmentRedeploymentEvent.class, name = "DutyAssignmentRedeploymentEvent"),
})

public class Event   {
  @JsonProperty("eventType")
  private String eventType;

  public Event eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.eventType, event.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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

