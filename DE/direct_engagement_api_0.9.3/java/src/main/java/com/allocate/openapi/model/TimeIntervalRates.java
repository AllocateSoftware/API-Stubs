/*
 * DE Provider Direct Engagement API
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.allocate.openapi.model.Rates;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * TimeIntervalRates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:37:11.208292Z[Europe/London]")
public class TimeIntervalRates {
  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_RATES = "rates";
  @SerializedName(SERIALIZED_NAME_RATES)
  private List<Rates> rates = null;


  public TimeIntervalRates startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
      this.rates = new ArrayList<Rates>();
    }
    this.rates.add(ratesItem);
    return this;
  }

   /**
   * Trust Pay Agency &amp; Trust Pays DE provider - split rate between pay to worker and pay to agency
   * @return rates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trust Pay Agency & Trust Pays DE provider - split rate between pay to worker and pay to agency")

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
