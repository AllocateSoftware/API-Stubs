package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CancellationCost
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

public class CancellationCost   {
  @JsonProperty("afterDate")
  private OffsetDateTime afterDate;

  @JsonProperty("amount")
  private BigDecimal amount;

  public CancellationCost afterDate(OffsetDateTime afterDate) {
    this.afterDate = afterDate;
    return this;
  }

  /**
   * The date/time after which this cost becomes valid
   * @return afterDate
  */
  @ApiModelProperty(required = true, value = "The date/time after which this cost becomes valid")
  @NotNull

  @Valid

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
  */
  @ApiModelProperty(required = true, value = "The cost of cancellation")
  @NotNull

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

