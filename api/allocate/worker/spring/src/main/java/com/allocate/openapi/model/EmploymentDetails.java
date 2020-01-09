package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EmploymentDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class EmploymentDetails   {
  @JsonProperty("employmentStatus")
  private String employmentStatus;

  @JsonProperty("employeeType")
  private String employeeType;

  @JsonProperty("hireDetails")
  private String hireDetails;

  @JsonProperty("dateJoinedNHS")
  private String dateJoinedNHS;

  @JsonProperty("alAccrualPlan")
  private String alAccrualPlan;

  @JsonProperty("prevEmployer")
  private String prevEmployer;

  @JsonProperty("agencies")
  private String agencies;

  public EmploymentDetails employmentStatus(String employmentStatus) {
    this.employmentStatus = employmentStatus;
    return this;
  }

  /**
   * Get employmentStatus
   * @return employmentStatus
  */
  @ApiModelProperty(value = "")


  public String getEmploymentStatus() {
    return employmentStatus;
  }

  public void setEmploymentStatus(String employmentStatus) {
    this.employmentStatus = employmentStatus;
  }

  public EmploymentDetails employeeType(String employeeType) {
    this.employeeType = employeeType;
    return this;
  }

  /**
   * Get employeeType
   * @return employeeType
  */
  @ApiModelProperty(value = "")


  public String getEmployeeType() {
    return employeeType;
  }

  public void setEmployeeType(String employeeType) {
    this.employeeType = employeeType;
  }

  public EmploymentDetails hireDetails(String hireDetails) {
    this.hireDetails = hireDetails;
    return this;
  }

  /**
   * Get hireDetails
   * @return hireDetails
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getHireDetails() {
    return hireDetails;
  }

  public void setHireDetails(String hireDetails) {
    this.hireDetails = hireDetails;
  }

  public EmploymentDetails dateJoinedNHS(String dateJoinedNHS) {
    this.dateJoinedNHS = dateJoinedNHS;
    return this;
  }

  /**
   * Get dateJoinedNHS
   * @return dateJoinedNHS
  */
  @ApiModelProperty(value = "")


  public String getDateJoinedNHS() {
    return dateJoinedNHS;
  }

  public void setDateJoinedNHS(String dateJoinedNHS) {
    this.dateJoinedNHS = dateJoinedNHS;
  }

  public EmploymentDetails alAccrualPlan(String alAccrualPlan) {
    this.alAccrualPlan = alAccrualPlan;
    return this;
  }

  /**
   * Get alAccrualPlan
   * @return alAccrualPlan
  */
  @ApiModelProperty(value = "")


  public String getAlAccrualPlan() {
    return alAccrualPlan;
  }

  public void setAlAccrualPlan(String alAccrualPlan) {
    this.alAccrualPlan = alAccrualPlan;
  }

  public EmploymentDetails prevEmployer(String prevEmployer) {
    this.prevEmployer = prevEmployer;
    return this;
  }

  /**
   * Get prevEmployer
   * @return prevEmployer
  */
  @ApiModelProperty(value = "")


  public String getPrevEmployer() {
    return prevEmployer;
  }

  public void setPrevEmployer(String prevEmployer) {
    this.prevEmployer = prevEmployer;
  }

  public EmploymentDetails agencies(String agencies) {
    this.agencies = agencies;
    return this;
  }

  /**
   * Get agencies
   * @return agencies
  */
  @ApiModelProperty(value = "")


  public String getAgencies() {
    return agencies;
  }

  public void setAgencies(String agencies) {
    this.agencies = agencies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentDetails employmentDetails = (EmploymentDetails) o;
    return Objects.equals(this.employmentStatus, employmentDetails.employmentStatus) &&
        Objects.equals(this.employeeType, employmentDetails.employeeType) &&
        Objects.equals(this.hireDetails, employmentDetails.hireDetails) &&
        Objects.equals(this.dateJoinedNHS, employmentDetails.dateJoinedNHS) &&
        Objects.equals(this.alAccrualPlan, employmentDetails.alAccrualPlan) &&
        Objects.equals(this.prevEmployer, employmentDetails.prevEmployer) &&
        Objects.equals(this.agencies, employmentDetails.agencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employmentStatus, employeeType, hireDetails, dateJoinedNHS, alAccrualPlan, prevEmployer, agencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentDetails {\n");
    
    sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
    sb.append("    hireDetails: ").append(toIndentedString(hireDetails)).append("\n");
    sb.append("    dateJoinedNHS: ").append(toIndentedString(dateJoinedNHS)).append("\n");
    sb.append("    alAccrualPlan: ").append(toIndentedString(alAccrualPlan)).append("\n");
    sb.append("    prevEmployer: ").append(toIndentedString(prevEmployer)).append("\n");
    sb.append("    agencies: ").append(toIndentedString(agencies)).append("\n");
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

