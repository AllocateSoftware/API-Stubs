package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Duty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DutySendEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutySendEvent   {
  @JsonProperty("eventType")
  private String eventType;

  /**
   * Where this duty has been sent
   */
  public enum DestinationEnum {
    BANK("bank"),
    
    AGENCY("agency"),
    
    CLOUDSTAFF("cloudstaff");

    private String value;

    DestinationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DestinationEnum fromValue(String value) {
      for (DestinationEnum b : DestinationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("destination")
  private DestinationEnum destination;

  @JsonProperty("duty")
  private Duty duty;

  public DutySendEvent eventType(String eventType) {
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

  public DutySendEvent destination(DestinationEnum destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Where this duty has been sent
   * @return destination
  */
  @ApiModelProperty(value = "Where this duty has been sent")


  public DestinationEnum getDestination() {
    return destination;
  }

  public void setDestination(DestinationEnum destination) {
    this.destination = destination;
  }

  public DutySendEvent duty(Duty duty) {
    this.duty = duty;
    return this;
  }

  /**
   * Get duty
   * @return duty
  */
  @ApiModelProperty(value = "")

  @Valid

  public Duty getDuty() {
    return duty;
  }

  public void setDuty(Duty duty) {
    this.duty = duty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutySendEvent dutySendEvent = (DutySendEvent) o;
    return Objects.equals(this.eventType, dutySendEvent.eventType) &&
        Objects.equals(this.destination, dutySendEvent.destination) &&
        Objects.equals(this.duty, dutySendEvent.duty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, destination, duty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutySendEvent {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    duty: ").append(toIndentedString(duty)).append("\n");
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

