package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Rates;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:37:09.334042Z[Europe/London]")

public class InlineObject   {
  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("endTime")
  private String endTime;

  @JsonProperty("break")
  private Integer _break;

  @JsonProperty("status")
  private String status;

  @JsonProperty("rates")
  @Valid
  private List<Rates> rates = null;

  public InlineObject startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  @ApiModelProperty(example = "07:30", value = "")


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public InlineObject endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  */
  @ApiModelProperty(example = "16:00", value = "")


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public InlineObject _break(Integer _break) {
    this._break = _break;
    return this;
  }

  /**
   * Break Duration
   * @return _break
  */
  @ApiModelProperty(example = "60", value = "Break Duration")


  public Integer getBreak() {
    return _break;
  }

  public void setBreak(Integer _break) {
    this._break = _break;
  }

  public InlineObject status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the timesheet
   * @return status
  */
  @ApiModelProperty(example = "approved", value = "Status of the timesheet")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineObject rates(List<Rates> rates) {
    this.rates = rates;
    return this;
  }

  public InlineObject addRatesItem(Rates ratesItem) {
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
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.startTime, inlineObject.startTime) &&
        Objects.equals(this.endTime, inlineObject.endTime) &&
        Objects.equals(this._break, inlineObject._break) &&
        Objects.equals(this.status, inlineObject.status) &&
        Objects.equals(this.rates, inlineObject.rates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, _break, status, rates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    _break: ").append(toIndentedString(_break)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

