package com.allocate.vms.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Agency
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

public class Agency   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("contactTelephone")
  private String contactTelephone;

  @JsonProperty("contactEmail")
  private String contactEmail;

  public Agency id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the agency
   * @return id
  */
  @ApiModelProperty(value = "ID of the agency")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Agency name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the agency
   * @return name
  */
  @ApiModelProperty(value = "Name of the agency")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Agency contactTelephone(String contactTelephone) {
    this.contactTelephone = contactTelephone;
    return this;
  }

  /**
   * Telephone number for agency
   * @return contactTelephone
  */
  @ApiModelProperty(value = "Telephone number for agency")


  public String getContactTelephone() {
    return contactTelephone;
  }

  public void setContactTelephone(String contactTelephone) {
    this.contactTelephone = contactTelephone;
  }

  public Agency contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  /**
   * Email address for agency
   * @return contactEmail
  */
  @ApiModelProperty(value = "Email address for agency")


  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agency agency = (Agency) o;
    return Objects.equals(this.id, agency.id) &&
        Objects.equals(this.name, agency.name) &&
        Objects.equals(this.contactTelephone, agency.contactTelephone) &&
        Objects.equals(this.contactEmail, agency.contactEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, contactTelephone, contactEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agency {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contactTelephone: ").append(toIndentedString(contactTelephone)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
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

