package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class Contract   {
  @JsonProperty("staffGroup")
  private String staffGroup;

  @JsonProperty("grade")
  private String grade;

  @JsonProperty("contract")
  private String contract;

  @JsonProperty("payscale")
  private String payscale;

  @JsonProperty("contractType")
  private String contractType;

  @JsonProperty("contractedTime")
  private String contractedTime;

  @JsonProperty("defaultUnavailabilityHours")
  private String defaultUnavailabilityHours;

  @JsonProperty("wtdOptOut")
  private Boolean wtdOptOut;

  @JsonProperty("salaryFrequency")
  private String salaryFrequency;

  @JsonProperty("salaryAmount")
  private BigDecimal salaryAmount;

  public Contract staffGroup(String staffGroup) {
    this.staffGroup = staffGroup;
    return this;
  }

  /**
   * Get staffGroup
   * @return staffGroup
  */
  @ApiModelProperty(value = "")


  public String getStaffGroup() {
    return staffGroup;
  }

  public void setStaffGroup(String staffGroup) {
    this.staffGroup = staffGroup;
  }

  public Contract grade(String grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Get grade
   * @return grade
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public Contract contract(String contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public Contract payscale(String payscale) {
    this.payscale = payscale;
    return this;
  }

  /**
   * Get payscale
   * @return payscale
  */
  @ApiModelProperty(value = "")


  public String getPayscale() {
    return payscale;
  }

  public void setPayscale(String payscale) {
    this.payscale = payscale;
  }

  public Contract contractType(String contractType) {
    this.contractType = contractType;
    return this;
  }

  /**
   * Get contractType
   * @return contractType
  */
  @ApiModelProperty(value = "")


  public String getContractType() {
    return contractType;
  }

  public void setContractType(String contractType) {
    this.contractType = contractType;
  }

  public Contract contractedTime(String contractedTime) {
    this.contractedTime = contractedTime;
    return this;
  }

  /**
   * Get contractedTime
   * @return contractedTime
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getContractedTime() {
    return contractedTime;
  }

  public void setContractedTime(String contractedTime) {
    this.contractedTime = contractedTime;
  }

  public Contract defaultUnavailabilityHours(String defaultUnavailabilityHours) {
    this.defaultUnavailabilityHours = defaultUnavailabilityHours;
    return this;
  }

  /**
   * Get defaultUnavailabilityHours
   * @return defaultUnavailabilityHours
  */
  @ApiModelProperty(value = "")


  public String getDefaultUnavailabilityHours() {
    return defaultUnavailabilityHours;
  }

  public void setDefaultUnavailabilityHours(String defaultUnavailabilityHours) {
    this.defaultUnavailabilityHours = defaultUnavailabilityHours;
  }

  public Contract wtdOptOut(Boolean wtdOptOut) {
    this.wtdOptOut = wtdOptOut;
    return this;
  }

  /**
   * Get wtdOptOut
   * @return wtdOptOut
  */
  @ApiModelProperty(value = "")


  public Boolean getWtdOptOut() {
    return wtdOptOut;
  }

  public void setWtdOptOut(Boolean wtdOptOut) {
    this.wtdOptOut = wtdOptOut;
  }

  public Contract salaryFrequency(String salaryFrequency) {
    this.salaryFrequency = salaryFrequency;
    return this;
  }

  /**
   * Get salaryFrequency
   * @return salaryFrequency
  */
  @ApiModelProperty(value = "")


  public String getSalaryFrequency() {
    return salaryFrequency;
  }

  public void setSalaryFrequency(String salaryFrequency) {
    this.salaryFrequency = salaryFrequency;
  }

  public Contract salaryAmount(BigDecimal salaryAmount) {
    this.salaryAmount = salaryAmount;
    return this;
  }

  /**
   * Get salaryAmount
   * @return salaryAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getSalaryAmount() {
    return salaryAmount;
  }

  public void setSalaryAmount(BigDecimal salaryAmount) {
    this.salaryAmount = salaryAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contract contract = (Contract) o;
    return Objects.equals(this.staffGroup, contract.staffGroup) &&
        Objects.equals(this.grade, contract.grade) &&
        Objects.equals(this.contract, contract.contract) &&
        Objects.equals(this.payscale, contract.payscale) &&
        Objects.equals(this.contractType, contract.contractType) &&
        Objects.equals(this.contractedTime, contract.contractedTime) &&
        Objects.equals(this.defaultUnavailabilityHours, contract.defaultUnavailabilityHours) &&
        Objects.equals(this.wtdOptOut, contract.wtdOptOut) &&
        Objects.equals(this.salaryFrequency, contract.salaryFrequency) &&
        Objects.equals(this.salaryAmount, contract.salaryAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffGroup, grade, contract, payscale, contractType, contractedTime, defaultUnavailabilityHours, wtdOptOut, salaryFrequency, salaryAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contract {\n");
    
    sb.append("    staffGroup: ").append(toIndentedString(staffGroup)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    payscale: ").append(toIndentedString(payscale)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    contractedTime: ").append(toIndentedString(contractedTime)).append("\n");
    sb.append("    defaultUnavailabilityHours: ").append(toIndentedString(defaultUnavailabilityHours)).append("\n");
    sb.append("    wtdOptOut: ").append(toIndentedString(wtdOptOut)).append("\n");
    sb.append("    salaryFrequency: ").append(toIndentedString(salaryFrequency)).append("\n");
    sb.append("    salaryAmount: ").append(toIndentedString(salaryAmount)).append("\n");
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

