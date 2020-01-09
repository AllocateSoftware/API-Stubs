package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Person;
import com.allocate.openapi.model.Rates;
import com.allocate.openapi.model.RequestGender;
import com.allocate.openapi.model.TimeIntervalRates;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Duty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:37:09.334042Z[Europe/London]")

public class Duty   {
  @JsonProperty("dutyId")
  private String dutyId;

  @JsonProperty("slaveDutyId")
  private String slaveDutyId;

  @JsonProperty("blockId")
  private String blockId;

  @JsonProperty("clientDeptId")
  private String clientDeptId;

  @JsonProperty("subDiscipline")
  private String subDiscipline;

  @JsonProperty("requestGender")
  private RequestGender requestGender;

  @JsonProperty("grade")
  private String grade;

  @JsonProperty("fallbackGrade")
  private String fallbackGrade;

  @JsonProperty("vacancyReason")
  private String vacancyReason;

  @JsonProperty("date")
  private LocalDate date;

  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("endTime")
  private String endTime;

  @JsonProperty("breakDuration")
  private Integer breakDuration;

  @JsonProperty("poNumber")
  private Integer poNumber;

  @JsonProperty("uniqueNumber")
  private Integer uniqueNumber;

  @JsonProperty("agency")
  private String agency;

  @JsonProperty("skill")
  private String skill;

  @JsonProperty("specialty")
  private String specialty;

  @JsonProperty("fallbackSkill")
  private String fallbackSkill;

  @JsonProperty("fallbackSpeciality")
  private String fallbackSpeciality;

  /**
   * Will need to understand if duty is no longer required and cancel on DE Provider
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    CANCELLED("cancelled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("rates")
  @Valid
  private List<Rates> rates = null;

  @JsonProperty("timeIntervalRates")
  @Valid
  private List<TimeIntervalRates> timeIntervalRates = null;

  @JsonProperty("person")
  private Person person;

  public Duty dutyId(String dutyId) {
    this.dutyId = dutyId;
    return this;
  }

  /**
   * Trust identifier of the duty
   * @return dutyId
  */
  @ApiModelProperty(example = "TrustA.11667", value = "Trust identifier of the duty")


  public String getDutyId() {
    return dutyId;
  }

  public void setDutyId(String dutyId) {
    this.dutyId = dutyId;
  }

  public Duty slaveDutyId(String slaveDutyId) {
    this.slaveDutyId = slaveDutyId;
    return this;
  }

  /**
   * Identifier of the slave duty if duty is part of consolidated duties
   * @return slaveDutyId
  */
  @ApiModelProperty(example = "TrustA.77569", value = "Identifier of the slave duty if duty is part of consolidated duties")


  public String getSlaveDutyId() {
    return slaveDutyId;
  }

  public void setSlaveDutyId(String slaveDutyId) {
    this.slaveDutyId = slaveDutyId;
  }

  public Duty blockId(String blockId) {
    this.blockId = blockId;
    return this;
  }

  /**
   * Identifier of block duties if duty is part of the block
   * @return blockId
  */
  @ApiModelProperty(example = "TrustA.77569", value = "Identifier of block duties if duty is part of the block")


  public String getBlockId() {
    return blockId;
  }

  public void setBlockId(String blockId) {
    this.blockId = blockId;
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

  public Duty requestGender(RequestGender requestGender) {
    this.requestGender = requestGender;
    return this;
  }

  /**
   * Get requestGender
   * @return requestGender
  */
  @ApiModelProperty(value = "")

  @Valid

  public RequestGender getRequestGender() {
    return requestGender;
  }

  public void setRequestGender(RequestGender requestGender) {
    this.requestGender = requestGender;
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

  public Duty date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Date of the duty
   * @return date
  */
  @ApiModelProperty(value = "Date of the duty")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Duty startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Start time of the shift
   * @return startTime
  */
  @ApiModelProperty(example = "22:00", value = "Start time of the shift")


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public Duty endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * End time of the shift
   * @return endTime
  */
  @ApiModelProperty(example = "01:25", value = "End time of the shift")


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public Duty breakDuration(Integer breakDuration) {
    this.breakDuration = breakDuration;
    return this;
  }

  /**
   * Duration of break in minutes
   * @return breakDuration
  */
  @ApiModelProperty(example = "30", value = "Duration of break in minutes")


  public Integer getBreakDuration() {
    return breakDuration;
  }

  public void setBreakDuration(Integer breakDuration) {
    this.breakDuration = breakDuration;
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
   * Supplying agency trust identifier
   * @return agency
  */
  @ApiModelProperty(example = "TrustA.2209", value = "Supplying agency trust identifier")


  public String getAgency() {
    return agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  public Duty skill(String skill) {
    this.skill = skill;
    return this;
  }

  /**
   * Stored as free text in DE Provider
   * @return skill
  */
  @ApiModelProperty(example = "Skill", value = "Stored as free text in DE Provider")


  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public Duty specialty(String specialty) {
    this.specialty = specialty;
    return this;
  }

  /**
   * Stored as free text in DE Provider
   * @return specialty
  */
  @ApiModelProperty(example = "Speciality", value = "Stored as free text in DE Provider")


  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  public Duty fallbackSkill(String fallbackSkill) {
    this.fallbackSkill = fallbackSkill;
    return this;
  }

  /**
   * Stored as free text in DE Provider
   * @return fallbackSkill
  */
  @ApiModelProperty(example = "Fallback skill", value = "Stored as free text in DE Provider")


  public String getFallbackSkill() {
    return fallbackSkill;
  }

  public void setFallbackSkill(String fallbackSkill) {
    this.fallbackSkill = fallbackSkill;
  }

  public Duty fallbackSpeciality(String fallbackSpeciality) {
    this.fallbackSpeciality = fallbackSpeciality;
    return this;
  }

  /**
   * Stored as free text in DE Provider
   * @return fallbackSpeciality
  */
  @ApiModelProperty(example = "Fallback speciality", value = "Stored as free text in DE Provider")


  public String getFallbackSpeciality() {
    return fallbackSpeciality;
  }

  public void setFallbackSpeciality(String fallbackSpeciality) {
    this.fallbackSpeciality = fallbackSpeciality;
  }

  public Duty status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Will need to understand if duty is no longer required and cancel on DE Provider
   * @return status
  */
  @ApiModelProperty(example = "active", value = "Will need to understand if duty is no longer required and cancel on DE Provider")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Duty rates(List<Rates> rates) {
    this.rates = rates;
    return this;
  }

  public Duty addRatesItem(Rates ratesItem) {
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

  public Duty timeIntervalRates(List<TimeIntervalRates> timeIntervalRates) {
    this.timeIntervalRates = timeIntervalRates;
    return this;
  }

  public Duty addTimeIntervalRatesItem(TimeIntervalRates timeIntervalRatesItem) {
    if (this.timeIntervalRates == null) {
      this.timeIntervalRates = new ArrayList<>();
    }
    this.timeIntervalRates.add(timeIntervalRatesItem);
    return this;
  }

  /**
   * Array of rates and intervals for which the rate is applied
   * @return timeIntervalRates
  */
  @ApiModelProperty(value = "Array of rates and intervals for which the rate is applied")

  @Valid

  public List<TimeIntervalRates> getTimeIntervalRates() {
    return timeIntervalRates;
  }

  public void setTimeIntervalRates(List<TimeIntervalRates> timeIntervalRates) {
    this.timeIntervalRates = timeIntervalRates;
  }

  public Duty person(Person person) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Duty duty = (Duty) o;
    return Objects.equals(this.dutyId, duty.dutyId) &&
        Objects.equals(this.slaveDutyId, duty.slaveDutyId) &&
        Objects.equals(this.blockId, duty.blockId) &&
        Objects.equals(this.clientDeptId, duty.clientDeptId) &&
        Objects.equals(this.subDiscipline, duty.subDiscipline) &&
        Objects.equals(this.requestGender, duty.requestGender) &&
        Objects.equals(this.grade, duty.grade) &&
        Objects.equals(this.fallbackGrade, duty.fallbackGrade) &&
        Objects.equals(this.vacancyReason, duty.vacancyReason) &&
        Objects.equals(this.date, duty.date) &&
        Objects.equals(this.startTime, duty.startTime) &&
        Objects.equals(this.endTime, duty.endTime) &&
        Objects.equals(this.breakDuration, duty.breakDuration) &&
        Objects.equals(this.poNumber, duty.poNumber) &&
        Objects.equals(this.uniqueNumber, duty.uniqueNumber) &&
        Objects.equals(this.agency, duty.agency) &&
        Objects.equals(this.skill, duty.skill) &&
        Objects.equals(this.specialty, duty.specialty) &&
        Objects.equals(this.fallbackSkill, duty.fallbackSkill) &&
        Objects.equals(this.fallbackSpeciality, duty.fallbackSpeciality) &&
        Objects.equals(this.status, duty.status) &&
        Objects.equals(this.rates, duty.rates) &&
        Objects.equals(this.timeIntervalRates, duty.timeIntervalRates) &&
        Objects.equals(this.person, duty.person);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dutyId, slaveDutyId, blockId, clientDeptId, subDiscipline, requestGender, grade, fallbackGrade, vacancyReason, date, startTime, endTime, breakDuration, poNumber, uniqueNumber, agency, skill, specialty, fallbackSkill, fallbackSpeciality, status, rates, timeIntervalRates, person);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Duty {\n");
    
    sb.append("    dutyId: ").append(toIndentedString(dutyId)).append("\n");
    sb.append("    slaveDutyId: ").append(toIndentedString(slaveDutyId)).append("\n");
    sb.append("    blockId: ").append(toIndentedString(blockId)).append("\n");
    sb.append("    clientDeptId: ").append(toIndentedString(clientDeptId)).append("\n");
    sb.append("    subDiscipline: ").append(toIndentedString(subDiscipline)).append("\n");
    sb.append("    requestGender: ").append(toIndentedString(requestGender)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    fallbackGrade: ").append(toIndentedString(fallbackGrade)).append("\n");
    sb.append("    vacancyReason: ").append(toIndentedString(vacancyReason)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    breakDuration: ").append(toIndentedString(breakDuration)).append("\n");
    sb.append("    poNumber: ").append(toIndentedString(poNumber)).append("\n");
    sb.append("    uniqueNumber: ").append(toIndentedString(uniqueNumber)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    specialty: ").append(toIndentedString(specialty)).append("\n");
    sb.append("    fallbackSkill: ").append(toIndentedString(fallbackSkill)).append("\n");
    sb.append("    fallbackSpeciality: ").append(toIndentedString(fallbackSpeciality)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
    sb.append("    timeIntervalRates: ").append(toIndentedString(timeIntervalRates)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
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

