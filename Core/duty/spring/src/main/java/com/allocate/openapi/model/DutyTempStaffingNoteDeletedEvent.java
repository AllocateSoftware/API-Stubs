package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DutyTempStaffingNoteDeletedEventAllOf;
import com.allocate.openapi.model.Event;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A note previously added to a duty has been deleted.
 */
@ApiModel(description = "A note previously added to a duty has been deleted.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutyTempStaffingNoteDeletedEvent extends Event  {
  @JsonProperty("dutyId")
  private String dutyId;

  @JsonProperty("noteId")
  private String noteId;

  public DutyTempStaffingNoteDeletedEvent dutyId(String dutyId) {
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

  public DutyTempStaffingNoteDeletedEvent noteId(String noteId) {
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
    DutyTempStaffingNoteDeletedEvent dutyTempStaffingNoteDeletedEvent = (DutyTempStaffingNoteDeletedEvent) o;
    return Objects.equals(this.dutyId, dutyTempStaffingNoteDeletedEvent.dutyId) &&
        Objects.equals(this.noteId, dutyTempStaffingNoteDeletedEvent.noteId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dutyId, noteId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyTempStaffingNoteDeletedEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

