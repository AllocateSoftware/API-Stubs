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
import java.math.BigDecimal;

/**
 * DutyCostDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:58.022235Z[Europe/London]")
public class DutyCostDetails {
  /**
   * Whether this cost is estimated, or actual
   */
  @JsonAdapter(CostingTypeEnum.Adapter.class)
  public enum CostingTypeEnum {
    ESTIMATED("estimated"),
    
    ACTUAL("actual");

    private String value;

    CostingTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CostingTypeEnum fromValue(String value) {
      for (CostingTypeEnum b : CostingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CostingTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CostingTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CostingTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CostingTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COSTING_TYPE = "costingType";
  @SerializedName(SERIALIZED_NAME_COSTING_TYPE)
  private CostingTypeEnum costingType;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;


  public DutyCostDetails costingType(CostingTypeEnum costingType) {
    
    this.costingType = costingType;
    return this;
  }

   /**
   * Whether this cost is estimated, or actual
   * @return costingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this cost is estimated, or actual")

  public CostingTypeEnum getCostingType() {
    return costingType;
  }


  public void setCostingType(CostingTypeEnum costingType) {
    this.costingType = costingType;
  }


  public DutyCostDetails amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount (sterling)
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount (sterling)")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyCostDetails dutyCostDetails = (DutyCostDetails) o;
    return Objects.equals(this.costingType, dutyCostDetails.costingType) &&
        Objects.equals(this.amount, dutyCostDetails.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costingType, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyCostDetails {\n");
    sb.append("    costingType: ").append(toIndentedString(costingType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

