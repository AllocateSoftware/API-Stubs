package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identification
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class Identification   {
  @JsonProperty("staffNumber")
  private String staffNumber;

  @JsonProperty("title")
  private String title;

  @JsonProperty("forenames")
  private String forenames;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("middleInitials")
  private String middleInitials;

  @JsonProperty("knownAs")
  private String knownAs;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("male"),
    
    FEMALE("female"),
    
    OTHER("other");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender;

  @JsonProperty("dateOfBirth")
  private LocalDate dateOfBirth;

  @JsonProperty("ssn")
  private String ssn;

  public Identification staffNumber(String staffNumber) {
    this.staffNumber = staffNumber;
    return this;
  }

  /**
   * Unique and unchanging staff number to use as the constant reference for a Person
   * @return staffNumber
  */
  @ApiModelProperty(required = true, value = "Unique and unchanging staff number to use as the constant reference for a Person")
  @NotNull


  public String getStaffNumber() {
    return staffNumber;
  }

  public void setStaffNumber(String staffNumber) {
    this.staffNumber = staffNumber;
  }

  public Identification title(String title) {
    this.title = title;
    return this;
  }

  /**
   * This value is subject to mapping in the Gateway. If unavailable, provide a constant value e.g. UNKNOWN, which can be mapped to an empty value in HealthRoster Optima
   * @return title
  */
  @ApiModelProperty(value = "This value is subject to mapping in the Gateway. If unavailable, provide a constant value e.g. UNKNOWN, which can be mapped to an empty value in HealthRoster Optima")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Identification forenames(String forenames) {
    this.forenames = forenames;
    return this;
  }

  /**
   * Get forenames
   * @return forenames
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getForenames() {
    return forenames;
  }

  public void setForenames(String forenames) {
    this.forenames = forenames;
  }

  public Identification surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Identification middleInitials(String middleInitials) {
    this.middleInitials = middleInitials;
    return this;
  }

  /**
   * Get middleInitials
   * @return middleInitials
  */
  @ApiModelProperty(value = "")


  public String getMiddleInitials() {
    return middleInitials;
  }

  public void setMiddleInitials(String middleInitials) {
    this.middleInitials = middleInitials;
  }

  public Identification knownAs(String knownAs) {
    this.knownAs = knownAs;
    return this;
  }

  /**
   * Get knownAs
   * @return knownAs
  */
  @ApiModelProperty(value = "")


  public String getKnownAs() {
    return knownAs;
  }

  public void setKnownAs(String knownAs) {
    this.knownAs = knownAs;
  }

  public Identification gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(value = "")


  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Identification dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Identification ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

  /**
   * National Insurance \\ Social Security Number.
   * @return ssn
  */
  @ApiModelProperty(value = "National Insurance \\ Social Security Number.")


  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identification identification = (Identification) o;
    return Objects.equals(this.staffNumber, identification.staffNumber) &&
        Objects.equals(this.title, identification.title) &&
        Objects.equals(this.forenames, identification.forenames) &&
        Objects.equals(this.surname, identification.surname) &&
        Objects.equals(this.middleInitials, identification.middleInitials) &&
        Objects.equals(this.knownAs, identification.knownAs) &&
        Objects.equals(this.gender, identification.gender) &&
        Objects.equals(this.dateOfBirth, identification.dateOfBirth) &&
        Objects.equals(this.ssn, identification.ssn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffNumber, title, forenames, surname, middleInitials, knownAs, gender, dateOfBirth, ssn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identification {\n");
    
    sb.append("    staffNumber: ").append(toIndentedString(staffNumber)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    forenames: ").append(toIndentedString(forenames)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    middleInitials: ").append(toIndentedString(middleInitials)).append("\n");
    sb.append("    knownAs: ").append(toIndentedString(knownAs)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
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

