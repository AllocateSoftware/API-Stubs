/*
 * VMS API
 * ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.vms.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.allocate.vms.api.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Details of a Person in the VMS, typically a Worker.
 */
@ApiModel(description = "Details of a Person in the VMS, typically a Worker.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:13.806839Z[Europe/London]")
public class Person {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_UNIVERSAL_ID = "universalId";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_ID)
  private String universalId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_SURNAME = "surname";
  @SerializedName(SERIALIZED_NAME_SURNAME)
  private String surname;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TELEPHONE_NUMBER = "telephoneNumber";
  @SerializedName(SERIALIZED_NAME_TELEPHONE_NUMBER)
  private String telephoneNumber;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public Person id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * identifier of the person (worker) within the VMS
   * @return id
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Array of HATEOAS-style references that may be followed by the client. This may include a &#39;worker.profile&#39; URL, which will return an HTML page representing the worker profile within the VMS.
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of HATEOAS-style references that may be followed by the client. This may include a 'worker.profile' URL, which will return an HTML page representing the worker profile within the VMS.")

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
