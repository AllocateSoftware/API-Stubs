package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Rates;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TimeIntervalRates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:37:09.334042Z[Europe/London]")

public class TimeIntervalRates   {
  @JsonProperty("startTime")
  private OffsetDateTime startTime;

  @JsonProperty("endTime")
  private OffsetDateTime endTime;

  @JsonProperty("rates")
  @Valid
  private List<Rates> rates = null;

  public TimeIntervalRates startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public TimeIntervalRates endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public TimeIntervalRates rates(List<Rates> rates) {
    this.rates = rates;
    return this;
  }

  public TimeIntervalRates addRatesItem(Rates ratesItem) {
    if (this.rates == null) {
      this.rates = new ArrayList<>();
    }
    this.rates.add(ratesItem);
    return this;
  }

  /**
   * Trust Pay Agency & Trust Pays DE provider - split rate between pay to worker and pay to agency
   * @return rates
  */
  @ApiModelProperty(value = "Trust Pay Agency & Trust Pays DE provider - split rate between pay to worker and pay to agency")

  @Valid

  public List<Rates> getRates() {
    return rates;
  }

  public void setRates(List<Rates> rates) {
    this.rates = rates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeIntervalRates timeIntervalRates = (TimeIntervalRates) o;
    return Objects.equals(this.startTime, timeIntervalRates.startTime) &&
        Objects.equals(this.endTime, timeIntervalRates.endTime) &&
        Objects.equals(this.rates, timeIntervalRates.rates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, rates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeIntervalRates {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
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

