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
 * DutyCascadeEventAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutyCascadeEventAllOf   {
  @JsonProperty("dutyId")
  private String dutyId;

  /**
   * Gets or Sets cascadeFrom
   */
  public enum CascadeFromEnum {
    WARD("ward"),
    
    BANK("bank"),
    
    CLOUDSTAFF("cloudstaff"),
    
    AGENCY("agency"),
    
    NATIONALBANK("nationalBank");

    private String value;

    CascadeFromEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CascadeFromEnum fromValue(String value) {
      for (CascadeFromEnum b : CascadeFromEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("cascadeFrom")
  private CascadeFromEnum cascadeFrom;

  /**
   * Gets or Sets cascadeTo
   */
  public enum CascadeToEnum {
    WARD("ward"),
    
    BANK("bank"),
    
    CLOUDSTAFF("cloudstaff"),
    
    AGENCY("agency"),
    
    NATIONALBANK("nationalBank");

    private String value;

    CascadeToEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CascadeToEnum fromValue(String value) {
      for (CascadeToEnum b : CascadeToEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("cascadeTo")
  private CascadeToEnum cascadeTo;

  @JsonProperty("isDutyReset")
  private Boolean isDutyReset;

  public DutyCascadeEventAllOf dutyId(String dutyId) {
    this.dutyId = dutyId;
    return this;
  }

  /**
   * Get dutyId
   * @return dutyId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDutyId() {
    return dutyId;
  }

  public void setDutyId(String dutyId) {
    this.dutyId = dutyId;
  }

  public DutyCascadeEventAllOf cascadeFrom(CascadeFromEnum cascadeFrom) {
    this.cascadeFrom = cascadeFrom;
    return this;
  }

  /**
   * Get cascadeFrom
   * @return cascadeFrom
  */
  @ApiModelProperty(value = "")


  public CascadeFromEnum getCascadeFrom() {
    return cascadeFrom;
  }

  public void setCascadeFrom(CascadeFromEnum cascadeFrom) {
    this.cascadeFrom = cascadeFrom;
  }

  public DutyCascadeEventAllOf cascadeTo(CascadeToEnum cascadeTo) {
    this.cascadeTo = cascadeTo;
    return this;
  }

  /**
   * Get cascadeTo
   * @return cascadeTo
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public CascadeToEnum getCascadeTo() {
    return cascadeTo;
  }

  public void setCascadeTo(CascadeToEnum cascadeTo) {
    this.cascadeTo = cascadeTo;
  }

  public DutyCascadeEventAllOf isDutyReset(Boolean isDutyReset) {
    this.isDutyReset = isDutyReset;
    return this;
  }

  /**
   * Is this a 'reset' ? (I.E Revert)
   * @return isDutyReset
  */
  @ApiModelProperty(value = "Is this a 'reset' ? (I.E Revert)")


  public Boolean getIsDutyReset() {
    return isDutyReset;
  }

  public void setIsDutyReset(Boolean isDutyReset) {
    this.isDutyReset = isDutyReset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyCascadeEventAllOf dutyCascadeEventAllOf = (DutyCascadeEventAllOf) o;
    return Objects.equals(this.dutyId, dutyCascadeEventAllOf.dutyId) &&
        Objects.equals(this.cascadeFrom, dutyCascadeEventAllOf.cascadeFrom) &&
        Objects.equals(this.cascadeTo, dutyCascadeEventAllOf.cascadeTo) &&
        Objects.equals(this.isDutyReset, dutyCascadeEventAllOf.isDutyReset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dutyId, cascadeFrom, cascadeTo, isDutyReset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyCascadeEventAllOf {\n");
    
    sb.append("    dutyId: ").append(toIndentedString(dutyId)).append("\n");
    sb.append("    cascadeFrom: ").append(toIndentedString(cascadeFrom)).append("\n");
    sb.append("    cascadeTo: ").append(toIndentedString(cascadeTo)).append("\n");
    sb.append("    isDutyReset: ").append(toIndentedString(isDutyReset)).append("\n");
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

