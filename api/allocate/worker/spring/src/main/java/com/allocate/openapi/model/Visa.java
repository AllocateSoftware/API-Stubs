package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DateSpan;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Visa
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class Visa   {
  @JsonProperty("number")
  private String number;

  @JsonProperty("country")
  private String country;

  @JsonProperty("issuingOffice")
  private String issuingOffice;

  @JsonProperty("type")
  private String type;

  @JsonProperty("entries")
  private String entries;

  @JsonProperty("validity")
  private DateSpan validity;

  public Visa number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @ApiModelProperty(value = "")


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Visa country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @ApiModelProperty(value = "")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Visa issuingOffice(String issuingOffice) {
    this.issuingOffice = issuingOffice;
    return this;
  }

  /**
   * Get issuingOffice
   * @return issuingOffice
  */
  @ApiModelProperty(value = "")


  public String getIssuingOffice() {
    return issuingOffice;
  }

  public void setIssuingOffice(String issuingOffice) {
    this.issuingOffice = issuingOffice;
  }

  public Visa type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Visa entries(String entries) {
    this.entries = entries;
    return this;
  }

  /**
   * Get entries
   * @return entries
  */
  @ApiModelProperty(value = "")


  public String getEntries() {
    return entries;
  }

  public void setEntries(String entries) {
    this.entries = entries;
  }

  public Visa validity(DateSpan validity) {
    this.validity = validity;
    return this;
  }

  /**
   * Get validity
   * @return validity
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DateSpan getValidity() {
    return validity;
  }

  public void setValidity(DateSpan validity) {
    this.validity = validity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Visa visa = (Visa) o;
    return Objects.equals(this.number, visa.number) &&
        Objects.equals(this.country, visa.country) &&
        Objects.equals(this.issuingOffice, visa.issuingOffice) &&
        Objects.equals(this.type, visa.type) &&
        Objects.equals(this.entries, visa.entries) &&
        Objects.equals(this.validity, visa.validity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, country, issuingOffice, type, entries, validity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Visa {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    issuingOffice: ").append(toIndentedString(issuingOffice)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
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

