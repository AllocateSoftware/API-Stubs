package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Person;
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
 * BookingInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:37:09.334042Z[Europe/London]")

public class BookingInfo   {
  @JsonProperty("contractId")
  private String contractId;

  @JsonProperty("agency")
  private Integer agency;

  @JsonProperty("person")
  private Person person;

  @JsonProperty("grade")
  private String grade;

  @JsonProperty("rates")
  @Valid
  private List<Rates> rates = null;

  public BookingInfo contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Id of the contract in DE Provider system
   * @return contractId
  */
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", value = "Id of the contract in DE Provider system")


  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public BookingInfo agency(Integer agency) {
    this.agency = agency;
    return this;
  }

  /**
   * Id of the booked agency
   * @return agency
  */
  @ApiModelProperty(example = "1135", value = "Id of the booked agency")


  public Integer getAgency() {
    return agency;
  }

  public void setAgency(Integer agency) {
    this.agency = agency;
  }

  public BookingInfo person(Person person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
  */
  @ApiModelProperty(value = "")

  @Valid

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public BookingInfo grade(String grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Booking grade trust identifier.
   * @return grade
  */
  @ApiModelProperty(example = "TrustA.234", value = "Booking grade trust identifier.")


  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public BookingInfo rates(List<Rates> rates) {
    this.rates = rates;
    return this;
  }

  public BookingInfo addRatesItem(Rates ratesItem) {
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
    BookingInfo bookingInfo = (BookingInfo) o;
    return Objects.equals(this.contractId, bookingInfo.contractId) &&
        Objects.equals(this.agency, bookingInfo.agency) &&
        Objects.equals(this.person, bookingInfo.person) &&
        Objects.equals(this.grade, bookingInfo.grade) &&
        Objects.equals(this.rates, bookingInfo.rates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, agency, person, grade, rates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingInfo {\n");
    
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
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

