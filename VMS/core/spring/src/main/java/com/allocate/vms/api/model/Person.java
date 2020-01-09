package com.allocate.vms.api.model;

import java.util.Objects;
import com.allocate.vms.api.model.Link;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details of a Person in the VMS, typically a Worker.
 */
@ApiModel(description = "Details of a Person in the VMS, typically a Worker.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

public class Person   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("universalId")
  private String universalId;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("surname")
  private String surname;

  @JsonProperty("email")
  private String email;

  @JsonProperty("telephoneNumber")
  private String telephoneNumber;

  @JsonProperty("links")
  @Valid
  private List<Link> links = null;

  public Person id(String id) {
    this.id = id;
    return this;
  }

  /**
   * identifier of the person (worker) within the VMS
   * @return id
  */
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", value = "identifier of the person (worker) within the VMS")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Person universalId(String universalId) {
    this.universalId = universalId;
    return this;
  }

  /**
   * Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.
   * @return universalId
  */
  @ApiModelProperty(example = "QQ123456C", value = "Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.")


  public String getUniversalId() {
    return universalId;
  }

  public void setUniversalId(String universalId) {
    this.universalId = universalId;
  }

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

  public Person links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Person addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Array of HATEOAS-style references that may be followed by the client. This may include a 'worker.profile' URL, which will return an HTML page representing the worker profile within the VMS.
   * @return links
  */
  @ApiModelProperty(value = "Array of HATEOAS-style references that may be followed by the client. This may include a 'worker.profile' URL, which will return an HTML page representing the worker profile within the VMS.")

  @Valid

  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
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
    return Objects.equals(this.id, person.id) &&
        Objects.equals(this.universalId, person.universalId) &&
        Objects.equals(this.firstName, person.firstName) &&
        Objects.equals(this.surname, person.surname) &&
        Objects.equals(this.email, person.email) &&
        Objects.equals(this.telephoneNumber, person.telephoneNumber) &&
        Objects.equals(this.links, person.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, universalId, firstName, surname, email, telephoneNumber, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    universalId: ").append(toIndentedString(universalId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

