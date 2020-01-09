package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.PersonGender;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:37:09.334042Z[Europe/London]")

public class Person   {
  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("dateOfBirth")
  private LocalDate dateOfBirth;

  @JsonProperty("personGender")
  private PersonGender personGender;

  @JsonProperty("matchId")
  private String matchId;

  @JsonProperty("allocatePersonId")
  private String allocatePersonId;

  @JsonProperty("email")
  private String email;

  @JsonProperty("telephoneNumber")
  private String telephoneNumber;

  @JsonProperty("extSystemId")
  private String extSystemId;

  public Person firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(example = "Doe", value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Person surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Get surname
   * @return surname
  */
  @ApiModelProperty(example = "John", value = "")


  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Person dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Date of birth
   * @return dateOfBirth
  */
  @ApiModelProperty(value = "Date of birth")

  @Valid

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Person personGender(PersonGender personGender) {
    this.personGender = personGender;
    return this;
  }

  /**
   * Get personGender
   * @return personGender
  */
  @ApiModelProperty(value = "")

  @Valid

  public PersonGender getPersonGender() {
    return personGender;
  }

  public void setPersonGender(PersonGender personGender) {
    this.personGender = personGender;
  }

  public Person matchId(String matchId) {
    this.matchId = matchId;
    return this;
  }

  /**
   * NINumber.e-mail 
   * @return matchId
  */
  @ApiModelProperty(example = "E124RT562.john.doe@mail.com", value = "NINumber.e-mail ")


  public String getMatchId() {
    return matchId;
  }

  public void setMatchId(String matchId) {
    this.matchId = matchId;
  }

  public Person allocatePersonId(String allocatePersonId) {
    this.allocatePersonId = allocatePersonId;
    return this;
  }

  /**
   * Business Key
   * @return allocatePersonId
  */
  @ApiModelProperty(example = "TrustA.1123", value = "Business Key")


  public String getAllocatePersonId() {
    return allocatePersonId;
  }

  public void setAllocatePersonId(String allocatePersonId) {
    this.allocatePersonId = allocatePersonId;
  }

  public Person email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(example = "john.doe@mail.com", value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Person telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * Get telephoneNumber
   * @return telephoneNumber
  */
  @ApiModelProperty(example = "+223504938839", value = "")


  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public Person extSystemId(String extSystemId) {
    this.extSystemId = extSystemId;
    return this;
  }

  /**
   * Get extSystemId
   * @return extSystemId
  */
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", value = "")


  public String getExtSystemId() {
    return extSystemId;
  }

  public void setExtSystemId(String extSystemId) {
    this.extSystemId = extSystemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.firstName, person.firstName) &&
        Objects.equals(this.surname, person.surname) &&
        Objects.equals(this.dateOfBirth, person.dateOfBirth) &&
        Objects.equals(this.personGender, person.personGender) &&
        Objects.equals(this.matchId, person.matchId) &&
        Objects.equals(this.allocatePersonId, person.allocatePersonId) &&
        Objects.equals(this.email, person.email) &&
        Objects.equals(this.telephoneNumber, person.telephoneNumber) &&
        Objects.equals(this.extSystemId, person.extSystemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, surname, dateOfBirth, personGender, matchId, allocatePersonId, email, telephoneNumber, extSystemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    personGender: ").append(toIndentedString(personGender)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    allocatePersonId: ").append(toIndentedString(allocatePersonId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    extSystemId: ").append(toIndentedString(extSystemId)).append("\n");
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

