package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HoursAssignmentShift
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:19.518070Z[Europe/London]")

public class HoursAssignmentShift   {
  /**
   *  Standard HealthRoster enumerations: *   Day *   Combined *   Night *   OnCall *   SleepIn *   StandBy *   Rest *   None *   ADO *   Evening *   Other *   PrivatePractice                 
   */
  public enum TypeEnum {
    DAY("day"),
    
    COMBINED("combined"),
    
    NIGHT("night"),
    
    ONCALL("onCall"),
    
    SLEEPIN("sleepIn"),
    
    STANDBY("standBy"),
    
    REST("rest"),
    
    NONE("none"),
    
    ADO("ADO"),
    
    EVENING("evening"),
    
    OTHER("other"),
    
    PRIVATEPRACTICE("PrivatePractice");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("name")
  private String name;

  public HoursAssignmentShift type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   *  Standard HealthRoster enumerations: *   Day *   Combined *   Night *   OnCall *   SleepIn *   StandBy *   Rest *   None *   ADO *   Evening *   Other *   PrivatePractice                 
   * @return type
  */
  @ApiModelProperty(example = "day", value = " Standard HealthRoster enumerations: *   Day *   Combined *   Night *   OnCall *   SleepIn *   StandBy *   Rest *   None *   ADO *   Evening *   Other *   PrivatePractice                 ")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public HoursAssignmentShift name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "early", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoursAssignmentShift hoursAssignmentShift = (HoursAssignmentShift) o;
    return Objects.equals(this.type, hoursAssignmentShift.type) &&
        Objects.equals(this.name, hoursAssignmentShift.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoursAssignmentShift {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

