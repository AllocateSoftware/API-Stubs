package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DutyTempStaffingNoteCreatedEventAllOf;
import com.allocate.openapi.model.Event;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DutyTempStaffingNoteCreatedEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:56.228501Z[Europe/London]")

public class DutyTempStaffingNoteCreatedEvent extends Event  {
  @JsonProperty("dutyId")
  private String dutyId;

  @JsonProperty("noteId")
  private String noteId;

  @JsonProperty("content")
  private String content;

  public DutyTempStaffingNoteCreatedEvent dutyId(String dutyId) {
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

  public DutyTempStaffingNoteCreatedEvent noteId(String noteId) {
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

  public DutyTempStaffingNoteCreatedEvent content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Content for the note
   * @return content
  */
  @ApiModelProperty(value = "Content for the note")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyTempStaffingNoteCreatedEvent dutyTempStaffingNoteCreatedEvent = (DutyTempStaffingNoteCreatedEvent) o;
    return Objects.equals(this.dutyId, dutyTempStaffingNoteCreatedEvent.dutyId) &&
        Objects.equals(this.noteId, dutyTempStaffingNoteCreatedEvent.noteId) &&
        Objects.equals(this.content, dutyTempStaffingNoteCreatedEvent.content) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dutyId, noteId, content, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyTempStaffingNoteCreatedEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dutyId: ").append(toIndentedString(dutyId)).append("\n");
    sb.append("    noteId: ").append(toIndentedString(noteId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

