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
 * ContactLogInformationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class ContactLogInformationDetails   {
  @JsonProperty("successful")
  private Boolean successful;

  @JsonProperty("notes")
  private String notes;

  public ContactLogInformationDetails successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

  /**
   * Was this contact successful? (e.g: Call was answered) 
   * @return successful
  */
  @ApiModelProperty(value = "Was this contact successful? (e.g: Call was answered) ")


  public Boolean getSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public ContactLogInformationDetails notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes on the contact
   * @return notes
  */
  @ApiModelProperty(value = "Notes on the contact")


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactLogInformationDetails contactLogInformationDetails = (ContactLogInformationDetails) o;
    return Objects.equals(this.successful, contactLogInformationDetails.successful) &&
        Objects.equals(this.notes, contactLogInformationDetails.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactLogInformationDetails {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

