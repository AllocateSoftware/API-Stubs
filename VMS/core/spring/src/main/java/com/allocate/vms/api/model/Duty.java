package com.allocate.vms.api.model;

import java.util.Objects;
import com.allocate.vms.api.model.DutyLocation;
import com.allocate.vms.api.model.DutyRequirements;
import com.allocate.vms.api.model.DutyTiming;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Duty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

public class Duty   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("when")
  private DutyTiming when;

  @JsonProperty("where")
  private DutyLocation where;

  @JsonProperty("requirements")
  private DutyRequirements requirements;

  @JsonProperty("clientDeptId")
  private String clientDeptId;

  @JsonProperty("subDiscipline")
  private String subDiscipline;

  @JsonProperty("grade")
  private String grade;

  @JsonProperty("fallbackGrade")
  private String fallbackGrade;

  @JsonProperty("vacancyReason")
  private String vacancyReason;

  @JsonProperty("poNumber")
  private Integer poNumber;

  @JsonProperty("uniqueNumber")
  private Integer uniqueNumber;

  @JsonProperty("agency")
  private String agency;

  public Duty id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the duty (from the source system)
   * @return id
  */
  @ApiModelProperty(example = "ABD.1210", value = "ID of the duty (from the source system)")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Duty when(DutyTiming when) {
    this.when = when;
    return this;
  }

  /**
   * Get when
   * @return when
  */
  @ApiModelProperty(value = "")

  @Valid

  public DutyTiming getWhen() {
    return when;
  }

  public void setWhen(DutyTiming when) {
    this.when = when;
  }

  public Duty where(DutyLocation where) {
    this.where = where;
    return this;
  }

  /**
   * Get where
   * @return where
  */
  @ApiModelProperty(value = "")

  @Valid

  public DutyLocation getWhere() {
    return where;
  }

  public void setWhere(DutyLocation where) {
    this.where = where;
  }

  public Duty requirements(DutyRequirements requirements) {
    this.requirements = requirements;
    return this;
  }

  /**
   * Get requirements
   * @return requirements
  */
  @ApiModelProperty(value = "")

  @Valid

  public DutyRequirements getRequirements() {
    return requirements;
  }

  public void setRequirements(DutyRequirements requirements) {
    this.requirements = requirements;
  }

  public Duty clientDeptId(String clientDeptId) {
    this.clientDeptId = clientDeptId;
    return this;
  }

  /**
   * BankStaff ward trust identifier
   * @return clientDeptId
  */
  @ApiModelProperty(example = "TrustA.667899", value = "BankStaff ward trust identifier")


  public String getClientDeptId() {
    return clientDeptId;
  }

  public void setClientDeptId(String clientDeptId) {
    this.clientDeptId = clientDeptId;
  }

  public Duty subDiscipline(String subDiscipline) {
    this.subDiscipline = subDiscipline;
    return this;
  }

  /**
   * Staff group trust identifier
   * @return subDiscipline
  */
  @ApiModelProperty(example = "TrustA.1323", value = "Staff group trust identifier")


  public String getSubDiscipline() {
    return subDiscipline;
  }

  public void setSubDiscipline(String subDiscipline) {
    this.subDiscipline = subDiscipline;
  }

  public Duty grade(String grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Grade trust identifier of the request
   * @return grade
  */
  @ApiModelProperty(example = "TrustA.77889", value = "Grade trust identifier of the request")


  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public Duty fallbackGrade(String fallbackGrade) {
    this.fallbackGrade = fallbackGrade;
    return this;
  }

  /**
   * Get fallbackGrade
   * @return fallbackGrade
  */
  @ApiModelProperty(example = "TrustA.9989", value = "")


  public String getFallbackGrade() {
    return fallbackGrade;
  }

  public void setFallbackGrade(String fallbackGrade) {
    this.fallbackGrade = fallbackGrade;
  }

  public Duty vacancyReason(String vacancyReason) {
    this.vacancyReason = vacancyReason;
    return this;
  }

  /**
   * Get vacancyReason
   * @return vacancyReason
  */
  @ApiModelProperty(example = "TrustA.12", value = "")


  public String getVacancyReason() {
    return vacancyReason;
  }

  public void setVacancyReason(String vacancyReason) {
    this.vacancyReason = vacancyReason;
  }

  public Duty poNumber(Integer poNumber) {
    this.poNumber = poNumber;
    return this;
  }

  /**
   * Need to understand if needed from Trust/Agency
   * @return poNumber
  */
  @ApiModelProperty(value = "Need to understand if needed from Trust/Agency")


  public Integer getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(Integer poNumber) {
    this.poNumber = poNumber;
  }

  public Duty uniqueNumber(Integer uniqueNumber) {
    this.uniqueNumber = uniqueNumber;
    return this;
  }

  /**
   * BRN / Unique number
   * @return uniqueNumber
  */
  @ApiModelProperty(example = "112233", value = "BRN / Unique number")


  public Integer getUniqueNumber() {
    return uniqueNumber;
  }

  public void setUniqueNumber(Integer uniqueNumber) {
    this.uniqueNumber = uniqueNumber;
  }

  public Duty agency(String agency) {
    this.agency = agency;
    return this;
  }

  /**
   * Supplying agency for the duty
   * @return agency
  */
  @ApiModelProperty(example = "Liberty Resourcing Admin", value = "Supplying agency for the duty")


  public String getAgency() {
    return agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Duty duty = (Duty) o;
    return Objects.equals(this.id, duty.id) &&
        Objects.equals(this.when, duty.when) &&
        Objects.equals(this.where, duty.where) &&
        Objects.equals(this.requirements, duty.requirements) &&
        Objects.equals(this.clientDeptId, duty.clientDeptId) &&
        Objects.equals(this.subDiscipline, duty.subDiscipline) &&
        Objects.equals(this.grade, duty.grade) &&
        Objects.equals(this.fallbackGrade, duty.fallbackGrade) &&
        Objects.equals(this.vacancyReason, duty.vacancyReason) &&
        Objects.equals(this.poNumber, duty.poNumber) &&
        Objects.equals(this.uniqueNumber, duty.uniqueNumber) &&
        Objects.equals(this.agency, duty.agency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, when, where, requirements, clientDeptId, subDiscipline, grade, fallbackGrade, vacancyReason, poNumber, uniqueNumber, agency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Duty {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    where: ").append(toIndentedString(where)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    clientDeptId: ").append(toIndentedString(clientDeptId)).append("\n");
    sb.append("    subDiscipline: ").append(toIndentedString(subDiscipline)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    fallbackGrade: ").append(toIndentedString(fallbackGrade)).append("\n");
    sb.append("    vacancyReason: ").append(toIndentedString(vacancyReason)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    uniqueNumber: ").append(toIndentedString(uniqueNumber)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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

