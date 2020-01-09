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
 * DutyTempStaffingNoteDeletedEventAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutyTempStaffingNoteDeletedEventAllOf   {
  @JsonProperty("dutyId")
  private String dutyId;

  @JsonProperty("noteId")
  private String noteId;

  public DutyTempStaffingNoteDeletedEventAllOf dutyId(String dutyId) {
    this.dutyId = dutyId;
    return this;
  }

  /**
   * Get dutyId
   * @return dutyId
  */
  @ApiModelProperty(value = "")


  public String getDutyId() {
    return dutyId;
  }

  public void setDutyId(String dutyId) {
    this.dutyId = dutyId;
  }

  public DutyTempStaffingNoteDeletedEventAllOf noteId(String noteId) {
    this.noteId = noteId;
    return this;
  }

  /**
   * Identifier for the note
   * @return noteId
  */
  @ApiModelProperty(value = "Identifier for the note")


  public String getNoteId() {
    return noteId;
  }

  public void setNoteId(String noteId) {
    this.noteId = noteId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyTempStaffingNoteDeletedEventAllOf dutyTempStaffingNoteDeletedEventAllOf = (DutyTempStaffingNoteDeletedEventAllOf) o;
    return Objects.equals(this.dutyId, dutyTempStaffingNoteDeletedEventAllOf.dutyId) &&
        Objects.equals(this.noteId, dutyTempStaffingNoteDeletedEventAllOf.noteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dutyId, noteId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyTempStaffingNoteDeletedEventAllOf {\n");
    
    sb.append("    dutyId: ").append(toIndentedString(dutyId)).append("\n");
    sb.append("    noteId: ").append(toIndentedString(noteId)).append("\n");
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

