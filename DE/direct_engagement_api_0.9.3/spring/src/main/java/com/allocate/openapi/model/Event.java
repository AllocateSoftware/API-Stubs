package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Event
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:37:09.334042Z[Europe/London]")

public class Event   {
  /**
   * Type of change that is done to the entity
   */
  public enum EventTypeEnum {
    CREATE("CREATE"),
    
    DELETE("DELETE"),
    
    UPDATE("UPDATE");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("eventType")
  private EventTypeEnum eventType;

  /**
   * Entity that is changed.
   */
  public enum EntityTypeEnum {
    DUTY("duty"),
    
    TIMESHEET("timesheet"),
    
    BOOKING("booking"),
    
    GRADE("grade"),
    
    AGENCY("agency"),
    
    REASON_FOR_VACANCY("reason_for_vacancy"),
    
    CONTRACT_STATUS("contract_status"),
    
    STAFF_GROUP("staff_group"),
    
    UNIT("unit");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("entityType")
  private EntityTypeEnum entityType;

  @JsonProperty("entityId")
  private String entityId;

  @JsonProperty("timeStamp")
  private OffsetDateTime timeStamp;

  public Event eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Type of change that is done to the entity
   * @return eventType
  */
  @ApiModelProperty(value = "Type of change that is done to the entity")


  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public Event entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Entity that is changed.
   * @return entityType
  */
  @ApiModelProperty(example = "duty", value = "Entity that is changed.")


  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  public Event entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Trust identifier of the changed entity
   * @return entityId
  */
  @ApiModelProperty(example = "TrustA.11109", value = "Trust identifier of the changed entity")


  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public Event timeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

  /**
   * Timestamp of the event
   * @return timeStamp
  */
  @ApiModelProperty(value = "Timestamp of the event")

  @Valid

  public OffsetDateTime getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
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
    return Objects.equals(this.eventType, event.eventType) &&
        Objects.equals(this.entityType, event.entityType) &&
        Objects.equals(this.entityId, event.entityId) &&
        Objects.equals(this.timeStamp, event.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, entityType, entityId, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
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

