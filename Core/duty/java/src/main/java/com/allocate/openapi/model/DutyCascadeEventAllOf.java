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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DutyCascadeEventAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:58.022235Z[Europe/London]")
public class DutyCascadeEventAllOf {
  public static final String SERIALIZED_NAME_DUTY_ID = "dutyId";
  @SerializedName(SERIALIZED_NAME_DUTY_ID)
  private String dutyId;

  /**
   * Gets or Sets cascadeFrom
   */
  @JsonAdapter(CascadeFromEnum.Adapter.class)
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

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CascadeFromEnum fromValue(String value) {
      for (CascadeFromEnum b : CascadeFromEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CascadeFromEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CascadeFromEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CascadeFromEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CascadeFromEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CASCADE_FROM = "cascadeFrom";
  @SerializedName(SERIALIZED_NAME_CASCADE_FROM)
  private CascadeFromEnum cascadeFrom;

  /**
   * Gets or Sets cascadeTo
   */
  @JsonAdapter(CascadeToEnum.Adapter.class)
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

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CascadeToEnum fromValue(String value) {
      for (CascadeToEnum b : CascadeToEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CascadeToEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CascadeToEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CascadeToEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CascadeToEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CASCADE_TO = "cascadeTo";
  @SerializedName(SERIALIZED_NAME_CASCADE_TO)
  private CascadeToEnum cascadeTo;

  public static final String SERIALIZED_NAME_IS_DUTY_RESET = "isDutyReset";
  @SerializedName(SERIALIZED_NAME_IS_DUTY_RESET)
  private Boolean isDutyReset;


  public DutyCascadeEventAllOf dutyId(String dutyId) {
    
    this.dutyId = dutyId;
    return this;
  }

   /**
   * Get dutyId
   * @return dutyId
  **/
  @ApiModelProperty(required = true, value = "")

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
  **/
  @javax.annotation.Nullable
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
  **/
  @ApiModelProperty(required = true, value = "")

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
   * Is this a &#39;reset&#39; ? (I.E Revert)
   * @return isDutyReset
  **/
  @javax.annotation.Nullable
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
