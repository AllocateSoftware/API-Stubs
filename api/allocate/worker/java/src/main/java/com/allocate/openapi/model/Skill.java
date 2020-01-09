/*
 * Worker API and Events
 *      ## API and events for providing workers. 
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
import com.allocate.openapi.model.DateSpan;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Skill
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:34:21.101948Z[Europe/London]")
public class Skill {
  public static final String SERIALIZED_NAME_SKILL_GROUP = "skillGroup";
  @SerializedName(SERIALIZED_NAME_SKILL_GROUP)
  private String skillGroup;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private String cluster;

  public static final String SERIALIZED_NAME_SKILL = "skill";
  @SerializedName(SERIALIZED_NAME_SKILL)
  private String skill;

  public static final String SERIALIZED_NAME_VALIDITY = "validity";
  @SerializedName(SERIALIZED_NAME_VALIDITY)
  private DateSpan validity;

  public static final String SERIALIZED_NAME_DATE_GAINED = "dateGained";
  @SerializedName(SERIALIZED_NAME_DATE_GAINED)
  private String dateGained;

  public static final String SERIALIZED_NAME_OBTAINED_FROM_REASON = "obtainedFromReason";
  @SerializedName(SERIALIZED_NAME_OBTAINED_FROM_REASON)
  private String obtainedFromReason;

  public static final String SERIALIZED_NAME_CERTIFICATE_NUMBER = "certificateNumber";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_NUMBER)
  private String certificateNumber;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;


  public Skill skillGroup(String skillGroup) {
    
    this.skillGroup = skillGroup;
    return this;
  }

   /**
   * Get skillGroup
   * @return skillGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSkillGroup() {
    return skillGroup;
  }


  public void setSkillGroup(String skillGroup) {
    this.skillGroup = skillGroup;
  }


  public Skill cluster(String cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCluster() {
    return cluster;
  }


  public void setCluster(String cluster) {
    this.cluster = cluster;
  }


  public Skill skill(String skill) {
    
    this.skill = skill;
    return this;
  }

   /**
   * Get skill
   * @return skill
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSkill() {
    return skill;
  }


  public void setSkill(String skill) {
    this.skill = skill;
  }


  public Skill validity(DateSpan validity) {
    
    this.validity = validity;
    return this;
  }

   /**
   * Get validity
   * @return validity
  **/
  @ApiModelProperty(required = true, value = "")

  public DateSpan getValidity() {
    return validity;
  }


  public void setValidity(DateSpan validity) {
    this.validity = validity;
  }


  public Skill dateGained(String dateGained) {
    
    this.dateGained = dateGained;
    return this;
  }

   /**
   * Get dateGained
   * @return dateGained
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateGained() {
    return dateGained;
  }


  public void setDateGained(String dateGained) {
    this.dateGained = dateGained;
  }


  public Skill obtainedFromReason(String obtainedFromReason) {
    
    this.obtainedFromReason = obtainedFromReason;
    return this;
  }

   /**
   * Get obtainedFromReason
   * @return obtainedFromReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObtainedFromReason() {
    return obtainedFromReason;
  }


  public void setObtainedFromReason(String obtainedFromReason) {
    this.obtainedFromReason = obtainedFromReason;
  }


  public Skill certificateNumber(String certificateNumber) {
    
    this.certificateNumber = certificateNumber;
    return this;
  }

   /**
   * Get certificateNumber
   * @return certificateNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificateNumber() {
    return certificateNumber;
  }


  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }


  public Skill notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
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
    Skill skill = (Skill) o;
    return Objects.equals(this.skillGroup, skill.skillGroup) &&
        Objects.equals(this.cluster, skill.cluster) &&
        Objects.equals(this.skill, skill.skill) &&
        Objects.equals(this.validity, skill.validity) &&
        Objects.equals(this.dateGained, skill.dateGained) &&
        Objects.equals(this.obtainedFromReason, skill.obtainedFromReason) &&
        Objects.equals(this.certificateNumber, skill.certificateNumber) &&
        Objects.equals(this.notes, skill.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillGroup, cluster, skill, validity, dateGained, obtainedFromReason, certificateNumber, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Skill {\n");
    sb.append("    skillGroup: ").append(toIndentedString(skillGroup)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    dateGained: ").append(toIndentedString(dateGained)).append("\n");
    sb.append("    obtainedFromReason: ").append(toIndentedString(obtainedFromReason)).append("\n");
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
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

