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
 * PersonalInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class PersonalInfo   {
  @JsonProperty("maidenName")
  private String maidenName;

  @JsonProperty("maritalStatus")
  private String maritalStatus;

  @JsonProperty("additionalID")
  private String additionalID;

  @JsonProperty("placeOfBirth")
  private String placeOfBirth;

  @JsonProperty("nationality")
  private String nationality;

  @JsonProperty("ethnicOrigin")
  private String ethnicOrigin;

  @JsonProperty("visaRequired")
  private String visaRequired;

  @JsonProperty("disabledNo")
  private String disabledNo;

  @JsonProperty("disability")
  private String disability;

  public PersonalInfo maidenName(String maidenName) {
    this.maidenName = maidenName;
    return this;
  }

  /**
   * Get maidenName
   * @return maidenName
  */
  @ApiModelProperty(value = "")


  public String getMaidenName() {
    return maidenName;
  }

  public void setMaidenName(String maidenName) {
    this.maidenName = maidenName;
  }

  public PersonalInfo maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Get maritalStatus
   * @return maritalStatus
  */
  @ApiModelProperty(value = "")


  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public PersonalInfo additionalID(String additionalID) {
    this.additionalID = additionalID;
    return this;
  }

  /**
   * Get additionalID
   * @return additionalID
  */
  @ApiModelProperty(value = "")


  public String getAdditionalID() {
    return additionalID;
  }

  public void setAdditionalID(String additionalID) {
    this.additionalID = additionalID;
  }

  public PersonalInfo placeOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
    return this;
  }

  /**
   * Get placeOfBirth
   * @return placeOfBirth
  */
  @ApiModelProperty(value = "")


  public String getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public PersonalInfo nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
  */
  @ApiModelProperty(value = "")


  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public PersonalInfo ethnicOrigin(String ethnicOrigin) {
    this.ethnicOrigin = ethnicOrigin;
    return this;
  }

  /**
   * Get ethnicOrigin
   * @return ethnicOrigin
  */
  @ApiModelProperty(value = "")


  public String getEthnicOrigin() {
    return ethnicOrigin;
  }

  public void setEthnicOrigin(String ethnicOrigin) {
    this.ethnicOrigin = ethnicOrigin;
  }

  public PersonalInfo visaRequired(String visaRequired) {
    this.visaRequired = visaRequired;
    return this;
  }

  /**
   * Get visaRequired
   * @return visaRequired
  */
  @ApiModelProperty(value = "")


  public String getVisaRequired() {
    return visaRequired;
  }

  public void setVisaRequired(String visaRequired) {
    this.visaRequired = visaRequired;
  }

  public PersonalInfo disabledNo(String disabledNo) {
    this.disabledNo = disabledNo;
    return this;
  }

  /**
   * Get disabledNo
   * @return disabledNo
  */
  @ApiModelProperty(value = "")


  public String getDisabledNo() {
    return disabledNo;
  }

  public void setDisabledNo(String disabledNo) {
    this.disabledNo = disabledNo;
  }

  public PersonalInfo disability(String disability) {
    this.disability = disability;
    return this;
  }

  /**
   * Get disability
   * @return disability
  */
  @ApiModelProperty(value = "")


  public String getDisability() {
    return disability;
  }

  public void setDisability(String disability) {
    this.disability = disability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalInfo personalInfo = (PersonalInfo) o;
    return Objects.equals(this.maidenName, personalInfo.maidenName) &&
        Objects.equals(this.maritalStatus, personalInfo.maritalStatus) &&
        Objects.equals(this.additionalID, personalInfo.additionalID) &&
        Objects.equals(this.placeOfBirth, personalInfo.placeOfBirth) &&
        Objects.equals(this.nationality, personalInfo.nationality) &&
        Objects.equals(this.ethnicOrigin, personalInfo.ethnicOrigin) &&
        Objects.equals(this.visaRequired, personalInfo.visaRequired) &&
        Objects.equals(this.disabledNo, personalInfo.disabledNo) &&
        Objects.equals(this.disability, personalInfo.disability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maidenName, maritalStatus, additionalID, placeOfBirth, nationality, ethnicOrigin, visaRequired, disabledNo, disability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalInfo {\n");
    
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    additionalID: ").append(toIndentedString(additionalID)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    ethnicOrigin: ").append(toIndentedString(ethnicOrigin)).append("\n");
    sb.append("    visaRequired: ").append(toIndentedString(visaRequired)).append("\n");
    sb.append("    disabledNo: ").append(toIndentedString(disabledNo)).append("\n");
    sb.append("    disability: ").append(toIndentedString(disability)).append("\n");
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

