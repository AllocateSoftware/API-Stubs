/*
 * Duties and Events
 * ## Duties and Events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DutyTempStaffingNoteDeletedEventAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:58.022235Z[Europe/London]")
public class DutyTempStaffingNoteDeletedEventAllOf {
  public static final String SERIALIZED_NAME_DUTY_ID = "dutyId";
  @SerializedName(SERIALIZED_NAME_DUTY_ID)
  private String dutyId;

  public static final String SERIALIZED_NAME_NOTE_ID = "noteId";
  @SerializedName(SERIALIZED_NAME_NOTE_ID)
  private String noteId;


  public DutyTempStaffingNoteDeletedEventAllOf dutyId(String dutyId) {
    
    this.dutyId = dutyId;
    return this;
  }

   /**
   * Get dutyId
   * @return dutyId
  **/
  @javax.annotation.Nullable
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
  **/
  @javax.annotation.Nullable
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

