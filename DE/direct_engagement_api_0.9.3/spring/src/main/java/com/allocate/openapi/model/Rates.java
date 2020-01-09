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
 * Rates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:37:09.334042Z[Europe/London]")

public class Rates   {
  /**
   * Gets or Sets reference
   */
  public enum ReferenceEnum {
    BASIC_WORKER_PAY("basic_worker_pay"),
    
    BASIC_COMMISSION("basic_commission"),
    
    BASIC_NI("basic_ni"),
    
    ENHANCED_WORKER_PAY("enhanced_worker_pay"),
    
    ENHANCED_COMMISSION("enhanced_commission"),
    
    ENHANCED_NI("enhanced_ni"),
    
    FIXED_WORKER_PAY("fixed_worker_pay"),
    
    FIXED_COMMISSION("fixed_commission"),
    
    FIXED_NI("fixed_ni"),
    
    ENHANCED_NIGHT_WORKER_PAY("enhanced_night_worker_pay"),
    
    ENHANCED_NIGHT_COMMISSION("enhanced_night_commission"),
    
    ENHANCED_NIGHT_NI("enhanced_night_ni"),
    
    ENHANCED_SATURDAY_WORKER_PAY("enhanced_saturday_worker_pay"),
    
    ENHANCED_SATURDAY_COMMISSION("enhanced_saturday_commission"),
    
    ENHANCED_SATURDAY_NI("enhanced_saturday_ni"),
    
    ENHANCED_SUNDAY_WORKER_PAY("enhanced_sunday_worker_pay"),
    
    ENHANCED_SUNDAY_COMMISSION("enhanced_sunday_commission"),
    
    ENHANCED_SUNDAY_NI("enhanced_sunday_ni"),
    
    ENHANCED_HOLIDAY_WORKER_PAY("enhanced_holiday_worker_pay"),
    
    ENHANCED_HOLIDAY_COMMISSION("enhanced_holiday_commission"),
    
    ENHANCED_HOLIDAY_NI("enhanced_holiday_ni");

    private String value;

    ReferenceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReferenceEnum fromValue(String value) {
      for (ReferenceEnum b : ReferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("reference")
  private ReferenceEnum reference;

  @JsonProperty("rate")
  private BigDecimal rate;

  public Rates reference(ReferenceEnum reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  @ApiModelProperty(example = "basic_commission", value = "")


  public ReferenceEnum getReference() {
    return reference;
  }

  public void setReference(ReferenceEnum reference) {
    this.reference = reference;
  }

  public Rates rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  */
  @ApiModelProperty(example = "50.00", value = "")

  @Valid

  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rates rates = (Rates) o;
    return Objects.equals(this.reference, rates.reference) &&
        Objects.equals(this.rate, rates.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rates {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

