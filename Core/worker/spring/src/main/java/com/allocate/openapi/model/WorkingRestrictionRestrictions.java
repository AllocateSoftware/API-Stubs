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
 * WorkingRestrictionRestrictions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class WorkingRestrictionRestrictions   {
  @JsonProperty("effectiveFrom")
  private String effectiveFrom;

  @JsonProperty("daysPerWeek")
  private String daysPerWeek;

  @JsonProperty("maxDaysPerWeek")
  private String maxDaysPerWeek;

  @JsonProperty("maxShiftsPerWeek")
  private String maxShiftsPerWeek;

  @JsonProperty("maxConsecutiveDays")
  private String maxConsecutiveDays;

  @JsonProperty("maxConsecutiveDaysRequested")
  private String maxConsecutiveDaysRequested;

  @JsonProperty("maxWorkTimePerDay")
  private String maxWorkTimePerDay;

  @JsonProperty("maxDurationPerShift")
  private String maxDurationPerShift;

  @JsonProperty("additionalHoursPerWeek")
  private String additionalHoursPerWeek;

  @JsonProperty("maxOvertimePerDay")
  private String maxOvertimePerDay;

  @JsonProperty("maxOvertimePerWeek")
  private String maxOvertimePerWeek;

  @JsonProperty("maxOvertimePerCalendarMonth")
  private String maxOvertimePerCalendarMonth;

  @JsonProperty("wtdDayStart")
  private String wtdDayStart;

  @JsonProperty("wtdWeekDayStart")
  private String wtdWeekDayStart;

  @JsonProperty("wtdWeekTimeStart")
  private String wtdWeekTimeStart;

  @JsonProperty("minBreakBetweenShifts")
  private BigDecimal minBreakBetweenShifts;

  @JsonProperty("notes")
  private String notes;

  public WorkingRestrictionRestrictions effectiveFrom(String effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

  /**
   * Get effectiveFrom
   * @return effectiveFrom
  */
  @ApiModelProperty(value = "")


  public String getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(String effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  public WorkingRestrictionRestrictions daysPerWeek(String daysPerWeek) {
    this.daysPerWeek = daysPerWeek;
    return this;
  }

  /**
   * Get daysPerWeek
   * @return daysPerWeek
  */
  @ApiModelProperty(value = "")


  public String getDaysPerWeek() {
    return daysPerWeek;
  }

  public void setDaysPerWeek(String daysPerWeek) {
    this.daysPerWeek = daysPerWeek;
  }

  public WorkingRestrictionRestrictions maxDaysPerWeek(String maxDaysPerWeek) {
    this.maxDaysPerWeek = maxDaysPerWeek;
    return this;
  }

  /**
   * Get maxDaysPerWeek
   * @return maxDaysPerWeek
  */
  @ApiModelProperty(value = "")


  public String getMaxDaysPerWeek() {
    return maxDaysPerWeek;
  }

  public void setMaxDaysPerWeek(String maxDaysPerWeek) {
    this.maxDaysPerWeek = maxDaysPerWeek;
  }

  public WorkingRestrictionRestrictions maxShiftsPerWeek(String maxShiftsPerWeek) {
    this.maxShiftsPerWeek = maxShiftsPerWeek;
    return this;
  }

  /**
   * Get maxShiftsPerWeek
   * @return maxShiftsPerWeek
  */
  @ApiModelProperty(value = "")


  public String getMaxShiftsPerWeek() {
    return maxShiftsPerWeek;
  }

  public void setMaxShiftsPerWeek(String maxShiftsPerWeek) {
    this.maxShiftsPerWeek = maxShiftsPerWeek;
  }

  public WorkingRestrictionRestrictions maxConsecutiveDays(String maxConsecutiveDays) {
    this.maxConsecutiveDays = maxConsecutiveDays;
    return this;
  }

  /**
   * Get maxConsecutiveDays
   * @return maxConsecutiveDays
  */
  @ApiModelProperty(value = "")


  public String getMaxConsecutiveDays() {
    return maxConsecutiveDays;
  }

  public void setMaxConsecutiveDays(String maxConsecutiveDays) {
    this.maxConsecutiveDays = maxConsecutiveDays;
  }

  public WorkingRestrictionRestrictions maxConsecutiveDaysRequested(String maxConsecutiveDaysRequested) {
    this.maxConsecutiveDaysRequested = maxConsecutiveDaysRequested;
    return this;
  }

  /**
   * Get maxConsecutiveDaysRequested
   * @return maxConsecutiveDaysRequested
  */
  @ApiModelProperty(value = "")


  public String getMaxConsecutiveDaysRequested() {
    return maxConsecutiveDaysRequested;
  }

  public void setMaxConsecutiveDaysRequested(String maxConsecutiveDaysRequested) {
    this.maxConsecutiveDaysRequested = maxConsecutiveDaysRequested;
  }

  public WorkingRestrictionRestrictions maxWorkTimePerDay(String maxWorkTimePerDay) {
    this.maxWorkTimePerDay = maxWorkTimePerDay;
    return this;
  }

  /**
   * Get maxWorkTimePerDay
   * @return maxWorkTimePerDay
  */
  @ApiModelProperty(value = "")


  public String getMaxWorkTimePerDay() {
    return maxWorkTimePerDay;
  }

  public void setMaxWorkTimePerDay(String maxWorkTimePerDay) {
    this.maxWorkTimePerDay = maxWorkTimePerDay;
  }

  public WorkingRestrictionRestrictions maxDurationPerShift(String maxDurationPerShift) {
    this.maxDurationPerShift = maxDurationPerShift;
    return this;
  }

  /**
   * Get maxDurationPerShift
   * @return maxDurationPerShift
  */
  @ApiModelProperty(value = "")


  public String getMaxDurationPerShift() {
    return maxDurationPerShift;
  }

  public void setMaxDurationPerShift(String maxDurationPerShift) {
    this.maxDurationPerShift = maxDurationPerShift;
  }

  public WorkingRestrictionRestrictions additionalHoursPerWeek(String additionalHoursPerWeek) {
    this.additionalHoursPerWeek = additionalHoursPerWeek;
    return this;
  }

  /**
   * Get additionalHoursPerWeek
   * @return additionalHoursPerWeek
  */
  @ApiModelProperty(value = "")


  public String getAdditionalHoursPerWeek() {
    return additionalHoursPerWeek;
  }

  public void setAdditionalHoursPerWeek(String additionalHoursPerWeek) {
    this.additionalHoursPerWeek = additionalHoursPerWeek;
  }

  public WorkingRestrictionRestrictions maxOvertimePerDay(String maxOvertimePerDay) {
    this.maxOvertimePerDay = maxOvertimePerDay;
    return this;
  }

  /**
   * Get maxOvertimePerDay
   * @return maxOvertimePerDay
  */
  @ApiModelProperty(value = "")


  public String getMaxOvertimePerDay() {
    return maxOvertimePerDay;
  }

  public void setMaxOvertimePerDay(String maxOvertimePerDay) {
    this.maxOvertimePerDay = maxOvertimePerDay;
  }

  public WorkingRestrictionRestrictions maxOvertimePerWeek(String maxOvertimePerWeek) {
    this.maxOvertimePerWeek = maxOvertimePerWeek;
    return this;
  }

  /**
   * Get maxOvertimePerWeek
   * @return maxOvertimePerWeek
  */
  @ApiModelProperty(value = "")


  public String getMaxOvertimePerWeek() {
    return maxOvertimePerWeek;
  }

  public void setMaxOvertimePerWeek(String maxOvertimePerWeek) {
    this.maxOvertimePerWeek = maxOvertimePerWeek;
  }

  public WorkingRestrictionRestrictions maxOvertimePerCalendarMonth(String maxOvertimePerCalendarMonth) {
    this.maxOvertimePerCalendarMonth = maxOvertimePerCalendarMonth;
    return this;
  }

  /**
   * Get maxOvertimePerCalendarMonth
   * @return maxOvertimePerCalendarMonth
  */
  @ApiModelProperty(value = "")


  public String getMaxOvertimePerCalendarMonth() {
    return maxOvertimePerCalendarMonth;
  }

  public void setMaxOvertimePerCalendarMonth(String maxOvertimePerCalendarMonth) {
    this.maxOvertimePerCalendarMonth = maxOvertimePerCalendarMonth;
  }

  public WorkingRestrictionRestrictions wtdDayStart(String wtdDayStart) {
    this.wtdDayStart = wtdDayStart;
    return this;
  }

  /**
   * Get wtdDayStart
   * @return wtdDayStart
  */
  @ApiModelProperty(value = "")


  public String getWtdDayStart() {
    return wtdDayStart;
  }

  public void setWtdDayStart(String wtdDayStart) {
    this.wtdDayStart = wtdDayStart;
  }

  public WorkingRestrictionRestrictions wtdWeekDayStart(String wtdWeekDayStart) {
    this.wtdWeekDayStart = wtdWeekDayStart;
    return this;
  }

  /**
   * Get wtdWeekDayStart
   * @return wtdWeekDayStart
  */
  @ApiModelProperty(value = "")


  public String getWtdWeekDayStart() {
    return wtdWeekDayStart;
  }

  public void setWtdWeekDayStart(String wtdWeekDayStart) {
    this.wtdWeekDayStart = wtdWeekDayStart;
  }

  public WorkingRestrictionRestrictions wtdWeekTimeStart(String wtdWeekTimeStart) {
    this.wtdWeekTimeStart = wtdWeekTimeStart;
    return this;
  }

  /**
   * Get wtdWeekTimeStart
   * @return wtdWeekTimeStart
  */
  @ApiModelProperty(value = "")


  public String getWtdWeekTimeStart() {
    return wtdWeekTimeStart;
  }

  public void setWtdWeekTimeStart(String wtdWeekTimeStart) {
    this.wtdWeekTimeStart = wtdWeekTimeStart;
  }

  public WorkingRestrictionRestrictions minBreakBetweenShifts(BigDecimal minBreakBetweenShifts) {
    this.minBreakBetweenShifts = minBreakBetweenShifts;
    return this;
  }

  /**
   * Get minBreakBetweenShifts
   * @return minBreakBetweenShifts
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getMinBreakBetweenShifts() {
    return minBreakBetweenShifts;
  }

  public void setMinBreakBetweenShifts(BigDecimal minBreakBetweenShifts) {
    this.minBreakBetweenShifts = minBreakBetweenShifts;
  }

  public WorkingRestrictionRestrictions notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  @ApiModelProperty(value = "")


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkingRestrictionRestrictions workingRestrictionRestrictions = (WorkingRestrictionRestrictions) o;
    return Objects.equals(this.effectiveFrom, workingRestrictionRestrictions.effectiveFrom) &&
        Objects.equals(this.daysPerWeek, workingRestrictionRestrictions.daysPerWeek) &&
        Objects.equals(this.maxDaysPerWeek, workingRestrictionRestrictions.maxDaysPerWeek) &&
        Objects.equals(this.maxShiftsPerWeek, workingRestrictionRestrictions.maxShiftsPerWeek) &&
        Objects.equals(this.maxConsecutiveDays, workingRestrictionRestrictions.maxConsecutiveDays) &&
        Objects.equals(this.maxConsecutiveDaysRequested, workingRestrictionRestrictions.maxConsecutiveDaysRequested) &&
        Objects.equals(this.maxWorkTimePerDay, workingRestrictionRestrictions.maxWorkTimePerDay) &&
        Objects.equals(this.maxDurationPerShift, workingRestrictionRestrictions.maxDurationPerShift) &&
        Objects.equals(this.additionalHoursPerWeek, workingRestrictionRestrictions.additionalHoursPerWeek) &&
        Objects.equals(this.maxOvertimePerDay, workingRestrictionRestrictions.maxOvertimePerDay) &&
        Objects.equals(this.maxOvertimePerWeek, workingRestrictionRestrictions.maxOvertimePerWeek) &&
        Objects.equals(this.maxOvertimePerCalendarMonth, workingRestrictionRestrictions.maxOvertimePerCalendarMonth) &&
        Objects.equals(this.wtdDayStart, workingRestrictionRestrictions.wtdDayStart) &&
        Objects.equals(this.wtdWeekDayStart, workingRestrictionRestrictions.wtdWeekDayStart) &&
        Objects.equals(this.wtdWeekTimeStart, workingRestrictionRestrictions.wtdWeekTimeStart) &&
        Objects.equals(this.minBreakBetweenShifts, workingRestrictionRestrictions.minBreakBetweenShifts) &&
        Objects.equals(this.notes, workingRestrictionRestrictions.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveFrom, daysPerWeek, maxDaysPerWeek, maxShiftsPerWeek, maxConsecutiveDays, maxConsecutiveDaysRequested, maxWorkTimePerDay, maxDurationPerShift, additionalHoursPerWeek, maxOvertimePerDay, maxOvertimePerWeek, maxOvertimePerCalendarMonth, wtdDayStart, wtdWeekDayStart, wtdWeekTimeStart, minBreakBetweenShifts, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkingRestrictionRestrictions {\n");
    
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    daysPerWeek: ").append(toIndentedString(daysPerWeek)).append("\n");
    sb.append("    maxDaysPerWeek: ").append(toIndentedString(maxDaysPerWeek)).append("\n");
    sb.append("    maxShiftsPerWeek: ").append(toIndentedString(maxShiftsPerWeek)).append("\n");
    sb.append("    maxConsecutiveDays: ").append(toIndentedString(maxConsecutiveDays)).append("\n");
    sb.append("    maxConsecutiveDaysRequested: ").append(toIndentedString(maxConsecutiveDaysRequested)).append("\n");
    sb.append("    maxWorkTimePerDay: ").append(toIndentedString(maxWorkTimePerDay)).append("\n");
    sb.append("    maxDurationPerShift: ").append(toIndentedString(maxDurationPerShift)).append("\n");
    sb.append("    additionalHoursPerWeek: ").append(toIndentedString(additionalHoursPerWeek)).append("\n");
    sb.append("    maxOvertimePerDay: ").append(toIndentedString(maxOvertimePerDay)).append("\n");
    sb.append("    maxOvertimePerWeek: ").append(toIndentedString(maxOvertimePerWeek)).append("\n");
    sb.append("    maxOvertimePerCalendarMonth: ").append(toIndentedString(maxOvertimePerCalendarMonth)).append("\n");
    sb.append("    wtdDayStart: ").append(toIndentedString(wtdDayStart)).append("\n");
    sb.append("    wtdWeekDayStart: ").append(toIndentedString(wtdWeekDayStart)).append("\n");
    sb.append("    wtdWeekTimeStart: ").append(toIndentedString(wtdWeekTimeStart)).append("\n");
    sb.append("    minBreakBetweenShifts: ").append(toIndentedString(minBreakBetweenShifts)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

