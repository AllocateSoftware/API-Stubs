package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.ContactInformation;
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
 * ContactDetailsUpdatedEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class ContactDetailsUpdatedEvent   {
  @JsonProperty("personId")
  private String personId;

  @JsonProperty("contactInformation")
  @Valid
  private Map<String, ContactInformation> contactInformation = new HashMap<>();

  public ContactDetailsUpdatedEvent personId(String personId) {
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

  public ContactDetailsUpdatedEvent contactInformation(Map<String, ContactInformation> contactInformation) {
    this.contactInformation = contactInformation;
    return this;
  }

  public ContactDetailsUpdatedEvent putContactInformationItem(String key, ContactInformation contactInformationItem) {
    this.contactInformation.put(key, contactInformationItem);
    return this;
  }

  /**
   * Get contactInformation
   * @return contactInformation
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Map<String, ContactInformation> getContactInformation() {
    return contactInformation;
  }

  public void setContactInformation(Map<String, ContactInformation> contactInformation) {
    this.contactInformation = contactInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactDetailsUpdatedEvent contactDetailsUpdatedEvent = (ContactDetailsUpdatedEvent) o;
    return Objects.equals(this.personId, contactDetailsUpdatedEvent.personId) &&
        Objects.equals(this.contactInformation, contactDetailsUpdatedEvent.contactInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, contactInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDetailsUpdatedEvent {\n");
    
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
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

