package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.ContactLogInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Denote a contact with a worker
 */
@ApiModel(description = "Denote a contact with a worker")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class ContactLogEvent   {
  @JsonProperty("personId")
  private String personId;

  @JsonProperty("contactLogInformation")
  @Valid
  private Map<String, ContactLogInformation> contactLogInformation = new HashMap<>();

  public ContactLogEvent personId(String personId) {
    this.personId = personId;
    return this;
  }

  /**
   * ASWid of the person
   * @return personId
  */
  @ApiModelProperty(required = true, value = "ASWid of the person")
  @NotNull


  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public ContactLogEvent contactLogInformation(Map<String, ContactLogInformation> contactLogInformation) {
    this.contactLogInformation = contactLogInformation;
    return this;
  }

  public ContactLogEvent putContactLogInformationItem(String key, ContactLogInformation contactLogInformationItem) {
    this.contactLogInformation.put(key, contactLogInformationItem);
    return this;
  }

  /**
   * Get contactLogInformation
   * @return contactLogInformation
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Map<String, ContactLogInformation> getContactLogInformation() {
    return contactLogInformation;
  }

  public void setContactLogInformation(Map<String, ContactLogInformation> contactLogInformation) {
    this.contactLogInformation = contactLogInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactLogEvent contactLogEvent = (ContactLogEvent) o;
    return Objects.equals(this.personId, contactLogEvent.personId) &&
        Objects.equals(this.contactLogInformation, contactLogEvent.contactLogInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, contactLogInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactLogEvent {\n");
    
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    contactLogInformation: ").append(toIndentedString(contactLogInformation)).append("\n");
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

