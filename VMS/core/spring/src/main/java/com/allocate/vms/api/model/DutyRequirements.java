package com.allocate.vms.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DutyRequirements
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

public class DutyRequirements   {
  @JsonProperty("skill")
  private String skill;

  @JsonProperty("specialty")
  private String specialty;

  @JsonProperty("fallbackSkill")
  private String fallbackSkill;

  @JsonProperty("fallbackSpeciality")
  private String fallbackSpeciality;

  public DutyRequirements skill(String skill) {
    this.skill = skill;
    return this;
  }

  /**
   * Text description
   * @return skill
  */
  @ApiModelProperty(example = "Skill", value = "Text description")


  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public DutyRequirements specialty(String specialty) {
    this.specialty = specialty;
    return this;
  }

  /**
   * Text description
   * @return specialty
  */
  @ApiModelProperty(example = "Speciality", value = "Text description")


  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  public DutyRequirements fallbackSkill(String fallbackSkill) {
    this.fallbackSkill = fallbackSkill;
    return this;
  }

  /**
   * Text description
   * @return fallbackSkill
  */
  @ApiModelProperty(example = "Fallback skill", value = "Text description")


  public String getFallbackSkill() {
    return fallbackSkill;
  }

  public void setFallbackSkill(String fallbackSkill) {
    this.fallbackSkill = fallbackSkill;
  }

  public DutyRequirements fallbackSpeciality(String fallbackSpeciality) {
    this.fallbackSpeciality = fallbackSpeciality;
    return this;
  }

  /**
   * Text description
   * @return fallbackSpeciality
  */
  @ApiModelProperty(example = "Fallback speciality", value = "Text description")


  public String getFallbackSpeciality() {
    return fallbackSpeciality;
  }

  public void setFallbackSpeciality(String fallbackSpeciality) {
    this.fallbackSpeciality = fallbackSpeciality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DutyRequirements dutyRequirements = (DutyRequirements) o;
    return Objects.equals(this.skill, dutyRequirements.skill) &&
        Objects.equals(this.specialty, dutyRequirements.specialty) &&
        Objects.equals(this.fallbackSkill, dutyRequirements.fallbackSkill) &&
        Objects.equals(this.fallbackSpeciality, dutyRequirements.fallbackSpeciality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skill, specialty, fallbackSkill, fallbackSpeciality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DutyRequirements {\n");
    
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    specialty: ").append(toIndentedString(specialty)).append("\n");
    sb.append("    fallbackSkill: ").append(toIndentedString(fallbackSkill)).append("\n");
    sb.append("    fallbackSpeciality: ").append(toIndentedString(fallbackSpeciality)).append("\n");
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

