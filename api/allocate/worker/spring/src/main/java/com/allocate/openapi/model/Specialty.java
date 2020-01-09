package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DateSpan;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specialty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class Specialty   {
  @JsonProperty("tempStaffSpeciality")
  private String tempStaffSpeciality;

  @JsonProperty("validity")
  private DateSpan validity;

  @JsonProperty("notes")
  private String notes;

  public Specialty tempStaffSpeciality(String tempStaffSpeciality) {
    this.tempStaffSpeciality = tempStaffSpeciality;
    return this;
  }

  /**
   * Get tempStaffSpeciality
   * @return tempStaffSpeciality
  */
  @ApiModelProperty(value = "")


  public String getTempStaffSpeciality() {
    return tempStaffSpeciality;
  }

  public void setTempStaffSpeciality(String tempStaffSpeciality) {
    this.tempStaffSpeciality = tempStaffSpeciality;
  }

  public Specialty validity(DateSpan validity) {
    this.validity = validity;
    return this;
  }

  /**
   * Get validity
   * @return validity
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DateSpan getValidity() {
    return validity;
  }

  public void setValidity(DateSpan validity) {
    this.validity = validity;
  }

  public Specialty notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  @ApiModelProperty(value = "")


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
    Specialty specialty = (Specialty) o;
    return Objects.equals(this.tempStaffSpeciality, specialty.tempStaffSpeciality) &&
        Objects.equals(this.validity, specialty.validity) &&
        Objects.equals(this.notes, specialty.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tempStaffSpeciality, validity, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Specialty {\n");
    
    sb.append("    tempStaffSpeciality: ").append(toIndentedString(tempStaffSpeciality)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
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

