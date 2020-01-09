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
 * Skill
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class Skill   {
  @JsonProperty("skillGroup")
  private String skillGroup;

  @JsonProperty("cluster")
  private String cluster;

  @JsonProperty("skill")
  private String skill;

  @JsonProperty("validity")
  private DateSpan validity;

  @JsonProperty("dateGained")
  private String dateGained;

  @JsonProperty("obtainedFromReason")
  private String obtainedFromReason;

  @JsonProperty("certificateNumber")
  private String certificateNumber;

  @JsonProperty("notes")
  private String notes;

  public Skill skillGroup(String skillGroup) {
    this.skillGroup = skillGroup;
    return this;
  }

  /**
   * Get skillGroup
   * @return skillGroup
  */
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
  */
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
  */
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

  public Skill dateGained(String dateGained) {
    this.dateGained = dateGained;
    return this;
  }

  /**
   * Get dateGained
   * @return dateGained
  */
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
  */
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
  */
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

