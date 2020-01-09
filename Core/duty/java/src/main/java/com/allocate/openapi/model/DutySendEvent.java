/*
 * Duties and Events
 * ## Duties and Events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.allocate.openapi.model.Duty;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DutySendEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:58.022235Z[Europe/London]")
public class DutySendEvent {
  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  /**
   * Where this duty has been sent
   */
  @JsonAdapter(DestinationEnum.Adapter.class)
  public enum DestinationEnum {
    BANK("bank"),
    
    AGENCY("agency"),
    
    CLOUDSTAFF("cloudstaff");

    private String value;

    DestinationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationEnum fromValue(String value) {
      for (DestinationEnum b : DestinationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DestinationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DestinationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private DestinationEnum destination;

  public static final String SERIALIZED_NAME_DUTY = "duty";
  @SerializedName(SERIALIZED_NAME_DUTY)
  private Duty duty;


  public DutySendEvent eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "")

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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
