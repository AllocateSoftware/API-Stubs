package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DutyCostDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutyCostDetails   {
  /**
   * Whether this cost is estimated, or actual
   */
  public enum CostingTypeEnum {
    ESTIMATED("estimated"),
    
    ACTUAL("actual");

    private String value;

    CostingTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CostingTypeEnum fromValue(String value) {
      for (CostingTypeEnum b : CostingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("costingType")
  private CostingTypeEnum costingType;

  @JsonProperty("amount")
  private BigDecimal amount;

  public DutyCostDetails costingType(CostingTypeEnum costingType) {
    this.costingType = costingType;
    return this;
  }

  /**
   * Whether this cost is estimated, or actual
   * @return costingType
  */
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
  */
  @ApiModelProperty(value = "The amount (sterling)")

  @Valid

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

