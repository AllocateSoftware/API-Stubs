/*
 * Vacancy Booking API and Events
 *      ## Duty Booking API and events and Events 
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
import org.threeten.bp.OffsetDateTime;

/**
 * CancellationCost
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:33:52.482992Z[Europe/London]")
public class CancellationCost {
  public static final String SERIALIZED_NAME_AFTER_DATE = "afterDate";
  @SerializedName(SERIALIZED_NAME_AFTER_DATE)
  private OffsetDateTime afterDate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;


  public CancellationCost afterDate(OffsetDateTime afterDate) {
    
    this.afterDate = afterDate;
    return this;
  }

   /**
   * The date/time after which this cost becomes valid
   * @return afterDate
  **/
  @ApiModelProperty(required = true, value = "The date/time after which this cost becomes valid")

  public OffsetDateTime getAfterDate() {
    return afterDate;
  }


  public void setAfterDate(OffsetDateTime afterDate) {
    this.afterDate = afterDate;
  }


  public CancellationCost amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The cost of cancellation
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The cost of cancellation")

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
    CancellationCost cancellationCost = (CancellationCost) o;
    return Objects.equals(this.afterDate, cancellationCost.afterDate) &&
        Objects.equals(this.amount, cancellationCost.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterDate, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationCost {\n");
    sb.append("    afterDate: ").append(toIndentedString(afterDate)).append("\n");
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

