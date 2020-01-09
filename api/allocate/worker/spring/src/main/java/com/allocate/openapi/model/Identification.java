package com.allocate.openapi.model;

import java.util.Objects;
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
 * Personally Identifiable Information
 */
@ApiModel(description = "Personally Identifiable Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class Identification   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("forenames")
  @Valid
  private List<Object> forenames = new ArrayList<>();

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("middleInitials")
  private String middleInitials;

  @JsonProperty("knownAs")
  private String knownAs;

  /**
   * Gender if known
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

  public Identification title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(example = "Mr", value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Identification forenames(List<Object> forenames) {
    this.forenames = forenames;
    return this;
  }

  public Identification addForenamesItem(Object forenamesItem) {
    this.forenames.add(forenamesItem);
    return this;
  }

  /**
   * List of forenames for the person
   * @return forenames
  */
  @ApiModelProperty(example = "['Fred','Jim']", required = true, value = "List of forenames for the person")
  @NotNull


  public List<Object> getForenames() {
    return forenames;
  }

  public void setForenames(List<Object> forenames) {
    this.forenames = forenames;
  }

  public Identification surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Surname for the person
   * @return surname
  */
  @ApiModelProperty(example = "Smith", required = true, value = "Surname for the person")
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
   * Any middle initials
   * @return middleInitials
  */
  @ApiModelProperty(value = "Any middle initials")


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
   * Any preferred name
   * @return knownAs
  */
  @ApiModelProperty(value = "Any preferred name")


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
   * Gender if known
   * @return gender
  */
  @ApiModelProperty(value = "Gender if known")


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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identification identification = (Identification) o;
    return Objects.equals(this.title, identification.title) &&
        Objects.equals(this.forenames, identification.forenames) &&
        Objects.equals(this.surname, identification.surname) &&
        Objects.equals(this.middleInitials, identification.middleInitials) &&
        Objects.equals(this.knownAs, identification.knownAs) &&
        Objects.equals(this.gender, identification.gender) &&
        Objects.equals(this.dateOfBirth, identification.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, forenames, surname, middleInitials, knownAs, gender, dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identification {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    forenames: ").append(toIndentedString(forenames)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    middleInitials: ").append(toIndentedString(middleInitials)).append("\n");
    sb.append("    knownAs: ").append(toIndentedString(knownAs)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

