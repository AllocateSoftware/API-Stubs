package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Grade;
import com.allocate.openapi.model.GradeType;
import com.allocate.openapi.model.GradeTypeCategory;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HoursAssignmentPerson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:19.518070Z[Europe/London]")

public class HoursAssignmentPerson   {
  @JsonProperty("staffNumber")
  private String staffNumber;

  @JsonProperty("forenames")
  private String forenames;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("mobileNumber")
  private String mobileNumber;

  @JsonProperty("grade")
  private Grade grade;

  @JsonProperty("gradeType")
  private GradeType gradeType;

  @JsonProperty("gradeTypeCategory")
  private GradeTypeCategory gradeTypeCategory;

  @JsonProperty("WTE")
  private BigDecimal WTE;

  public HoursAssignmentPerson staffNumber(String staffNumber) {
    this.staffNumber = staffNumber;
    return this;
  }

  /**
   * Get staffNumber
   * @return staffNumber
  */
  @ApiModelProperty(value = "")


  public String getStaffNumber() {
    return staffNumber;
  }

  public void setStaffNumber(String staffNumber) {
    this.staffNumber = staffNumber;
  }

  public HoursAssignmentPerson forenames(String forenames) {
    this.forenames = forenames;
    return this;
  }

  /**
   * List of forenames for the person
   * @return forenames
  */
  @ApiModelProperty(example = "Fred", value = "List of forenames for the person")


  public String getForenames() {
    return forenames;
  }

  public void setForenames(String forenames) {
    this.forenames = forenames;
  }

  public HoursAssignmentPerson surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Surname for the person
   * @return surname
  */
  @ApiModelProperty(example = "Smith", value = "Surname for the person")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public HoursAssignmentPerson mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Get mobileNumber
   * @return mobileNumber
  */
  @ApiModelProperty(value = "")


  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public HoursAssignmentPerson grade(Grade grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Get grade
   * @return grade
  */
  @ApiModelProperty(value = "")

  @Valid

  public Grade getGrade() {
    return grade;
  }

  public void setGrade(Grade grade) {
    this.grade = grade;
  }

  public HoursAssignmentPerson gradeType(GradeType gradeType) {
    this.gradeType = gradeType;
    return this;
  }

  /**
   * Get gradeType
   * @return gradeType
  */
  @ApiModelProperty(value = "")

  @Valid

  public GradeType getGradeType() {
    return gradeType;
  }

  public void setGradeType(GradeType gradeType) {
    this.gradeType = gradeType;
  }

  public HoursAssignmentPerson gradeTypeCategory(GradeTypeCategory gradeTypeCategory) {
    this.gradeTypeCategory = gradeTypeCategory;
    return this;
  }

  /**
   * Get gradeTypeCategory
   * @return gradeTypeCategory
  */
  @ApiModelProperty(value = "")

  @Valid

  public GradeTypeCategory getGradeTypeCategory() {
    return gradeTypeCategory;
  }

  public void setGradeTypeCategory(GradeTypeCategory gradeTypeCategory) {
    this.gradeTypeCategory = gradeTypeCategory;
  }

  public HoursAssignmentPerson WTE(BigDecimal WTE) {
    this.WTE = WTE;
    return this;
  }

  /**
   * Whole time Equivalent – this is the person’s contracted hours divided by the person’s default grade type value for WTE (if the grade type has no value then use grade type category if neither have a value use system default setting). e.g. 37.5 / (2250/60) = 1.00 NOTE if the grade type default wte is not set this will not be returned 
   * @return WTE
  */
  @ApiModelProperty(example = "0.9125", value = "Whole time Equivalent – this is the person’s contracted hours divided by the person’s default grade type value for WTE (if the grade type has no value then use grade type category if neither have a value use system default setting). e.g. 37.5 / (2250/60) = 1.00 NOTE if the grade type default wte is not set this will not be returned ")

  @Valid

  public BigDecimal getWTE() {
    return WTE;
  }

  public void setWTE(BigDecimal WTE) {
    this.WTE = WTE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoursAssignmentPerson hoursAssignmentPerson = (HoursAssignmentPerson) o;
    return Objects.equals(this.staffNumber, hoursAssignmentPerson.staffNumber) &&
        Objects.equals(this.forenames, hoursAssignmentPerson.forenames) &&
        Objects.equals(this.surname, hoursAssignmentPerson.surname) &&
        Objects.equals(this.mobileNumber, hoursAssignmentPerson.mobileNumber) &&
        Objects.equals(this.grade, hoursAssignmentPerson.grade) &&
        Objects.equals(this.gradeType, hoursAssignmentPerson.gradeType) &&
        Objects.equals(this.gradeTypeCategory, hoursAssignmentPerson.gradeTypeCategory) &&
        Objects.equals(this.WTE, hoursAssignmentPerson.WTE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffNumber, forenames, surname, mobileNumber, grade, gradeType, gradeTypeCategory, WTE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoursAssignmentPerson {\n");
    
    sb.append("    staffNumber: ").append(toIndentedString(staffNumber)).append("\n");
    sb.append("    forenames: ").append(toIndentedString(forenames)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    gradeType: ").append(toIndentedString(gradeType)).append("\n");
    sb.append("    gradeTypeCategory: ").append(toIndentedString(gradeTypeCategory)).append("\n");
    sb.append("    WTE: ").append(toIndentedString(WTE)).append("\n");
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

