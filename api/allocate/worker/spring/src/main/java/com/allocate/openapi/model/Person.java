package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.Attribute;
import com.allocate.openapi.model.Availabilities;
import com.allocate.openapi.model.Contract;
import com.allocate.openapi.model.EmploymentDetails;
import com.allocate.openapi.model.Identification;
import com.allocate.openapi.model.Identifier;
import com.allocate.openapi.model.PersonalInfo;
import com.allocate.openapi.model.PersonalPattern;
import com.allocate.openapi.model.Posting;
import com.allocate.openapi.model.Skill;
import com.allocate.openapi.model.Specialty;
import com.allocate.openapi.model.Visa;
import com.allocate.openapi.model.WorkLocations;
import com.allocate.openapi.model.WorkingRestriction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class Person   {
  @JsonProperty("ids")
  @Valid
  private List<Identifier> ids = null;

  @JsonProperty("identification")
  private Identification identification;

  @JsonProperty("personalInfo")
  private PersonalInfo personalInfo;

  @JsonProperty("employmentDetails")
  private EmploymentDetails employmentDetails;

  @JsonProperty("workLocations")
  private WorkLocations workLocations;

  @JsonProperty("postings")
  @Valid
  private List<Posting> postings = null;

  @JsonProperty("contracts")
  @Valid
  private List<Contract> contracts = null;

  @JsonProperty("skills")
  @Valid
  private List<Skill> skills = null;

  @JsonProperty("specialties")
  @Valid
  private List<Specialty> specialties = null;

  @JsonProperty("attributes")
  @Valid
  private List<Attribute> attributes = null;

  @JsonProperty("visas")
  @Valid
  private List<Visa> visas = null;

  @JsonProperty("workingRestrictions")
  @Valid
  private List<WorkingRestriction> workingRestrictions = null;

  @JsonProperty("availabilities")
  private Availabilities availabilities;

  @JsonProperty("personalPattern")
  private PersonalPattern personalPattern;

  public Person ids(List<Identifier> ids) {
    this.ids = ids;
    return this;
  }

  public Person addIdsItem(Identifier idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   *  Array of identifiers. This should contain as much information as possible in on-boarding in order to facilitate automatic matching where possible. Possible namespaces include - ESR:<trustId>:StaffNumber - The staff number (Where ESR is the system of record, and <trustId> is the Allocate Identifier for the trust) - NI  - the UK National Insurance number - SSN - Social Security  
   * @return ids
  */
  @ApiModelProperty(value = " Array of identifiers. This should contain as much information as possible in on-boarding in order to facilitate automatic matching where possible. Possible namespaces include - ESR:<trustId>:StaffNumber - The staff number (Where ESR is the system of record, and <trustId> is the Allocate Identifier for the trust) - NI  - the UK National Insurance number - SSN - Social Security  ")

  @Valid

  public List<Identifier> getIds() {
    return ids;
  }

  public void setIds(List<Identifier> ids) {
    this.ids = ids;
  }

  public Person identification(Identification identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  */
  @ApiModelProperty(value = "")

  @Valid

  public Identification getIdentification() {
    return identification;
  }

  public void setIdentification(Identification identification) {
    this.identification = identification;
  }

  public Person personalInfo(PersonalInfo personalInfo) {
    this.personalInfo = personalInfo;
    return this;
  }

  /**
   * Get personalInfo
   * @return personalInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public PersonalInfo getPersonalInfo() {
    return personalInfo;
  }

  public void setPersonalInfo(PersonalInfo personalInfo) {
    this.personalInfo = personalInfo;
  }

  public Person employmentDetails(EmploymentDetails employmentDetails) {
    this.employmentDetails = employmentDetails;
    return this;
  }

  /**
   * Get employmentDetails
   * @return employmentDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public EmploymentDetails getEmploymentDetails() {
    return employmentDetails;
  }

  public void setEmploymentDetails(EmploymentDetails employmentDetails) {
    this.employmentDetails = employmentDetails;
  }

  public Person workLocations(WorkLocations workLocations) {
    this.workLocations = workLocations;
    return this;
  }

  /**
   * Get workLocations
   * @return workLocations
  */
  @ApiModelProperty(value = "")

  @Valid

  public WorkLocations getWorkLocations() {
    return workLocations;
  }

  public void setWorkLocations(WorkLocations workLocations) {
    this.workLocations = workLocations;
  }

  public Person postings(List<Posting> postings) {
    this.postings = postings;
    return this;
  }

  public Person addPostingsItem(Posting postingsItem) {
    if (this.postings == null) {
      this.postings = new ArrayList<>();
    }
    this.postings.add(postingsItem);
    return this;
  }

  /**
   * Get postings
   * @return postings
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Posting> getPostings() {
    return postings;
  }

  public void setPostings(List<Posting> postings) {
    this.postings = postings;
  }

  public Person contracts(List<Contract> contracts) {
    this.contracts = contracts;
    return this;
  }

  public Person addContractsItem(Contract contractsItem) {
    if (this.contracts == null) {
      this.contracts = new ArrayList<>();
    }
    this.contracts.add(contractsItem);
    return this;
  }

  /**
   * Get contracts
   * @return contracts
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Contract> getContracts() {
    return contracts;
  }

  public void setContracts(List<Contract> contracts) {
    this.contracts = contracts;
  }

  public Person skills(List<Skill> skills) {
    this.skills = skills;
    return this;
  }

  public Person addSkillsItem(Skill skillsItem) {
    if (this.skills == null) {
      this.skills = new ArrayList<>();
    }
    this.skills.add(skillsItem);
    return this;
  }

  /**
   * Get skills
   * @return skills
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Skill> getSkills() {
    return skills;
  }

  public void setSkills(List<Skill> skills) {
    this.skills = skills;
  }

  public Person specialties(List<Specialty> specialties) {
    this.specialties = specialties;
    return this;
  }

  public Person addSpecialtiesItem(Specialty specialtiesItem) {
    if (this.specialties == null) {
      this.specialties = new ArrayList<>();
    }
    this.specialties.add(specialtiesItem);
    return this;
  }

  /**
   * Get specialties
   * @return specialties
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Specialty> getSpecialties() {
    return specialties;
  }

  public void setSpecialties(List<Specialty> specialties) {
    this.specialties = specialties;
  }

  public Person attributes(List<Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Person addAttributesItem(Attribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  public Person visas(List<Visa> visas) {
    this.visas = visas;
    return this;
  }

  public Person addVisasItem(Visa visasItem) {
    if (this.visas == null) {
      this.visas = new ArrayList<>();
    }
    this.visas.add(visasItem);
    return this;
  }

  /**
   * Get visas
   * @return visas
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Visa> getVisas() {
    return visas;
  }

  public void setVisas(List<Visa> visas) {
    this.visas = visas;
  }

  public Person workingRestrictions(List<WorkingRestriction> workingRestrictions) {
    this.workingRestrictions = workingRestrictions;
    return this;
  }

  public Person addWorkingRestrictionsItem(WorkingRestriction workingRestrictionsItem) {
    if (this.workingRestrictions == null) {
      this.workingRestrictions = new ArrayList<>();
    }
    this.workingRestrictions.add(workingRestrictionsItem);
    return this;
  }

  /**
   * Get workingRestrictions
   * @return workingRestrictions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<WorkingRestriction> getWorkingRestrictions() {
    return workingRestrictions;
  }

  public void setWorkingRestrictions(List<WorkingRestriction> workingRestrictions) {
    this.workingRestrictions = workingRestrictions;
  }

  public Person availabilities(Availabilities availabilities) {
    this.availabilities = availabilities;
    return this;
  }

  /**
   * Get availabilities
   * @return availabilities
  */
  @ApiModelProperty(value = "")

  @Valid

  public Availabilities getAvailabilities() {
    return availabilities;
  }

  public void setAvailabilities(Availabilities availabilities) {
    this.availabilities = availabilities;
  }

  public Person personalPattern(PersonalPattern personalPattern) {
    this.personalPattern = personalPattern;
    return this;
  }

  /**
   * Get personalPattern
   * @return personalPattern
  */
  @ApiModelProperty(value = "")

  @Valid

  public PersonalPattern getPersonalPattern() {
    return personalPattern;
  }

  public void setPersonalPattern(PersonalPattern personalPattern) {
    this.personalPattern = personalPattern;
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
    return Objects.equals(this.ids, person.ids) &&
        Objects.equals(this.identification, person.identification) &&
        Objects.equals(this.personalInfo, person.personalInfo) &&
        Objects.equals(this.employmentDetails, person.employmentDetails) &&
        Objects.equals(this.workLocations, person.workLocations) &&
        Objects.equals(this.postings, person.postings) &&
        Objects.equals(this.contracts, person.contracts) &&
        Objects.equals(this.skills, person.skills) &&
        Objects.equals(this.specialties, person.specialties) &&
        Objects.equals(this.attributes, person.attributes) &&
        Objects.equals(this.visas, person.visas) &&
        Objects.equals(this.workingRestrictions, person.workingRestrictions) &&
        Objects.equals(this.availabilities, person.availabilities) &&
        Objects.equals(this.personalPattern, person.personalPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, identification, personalInfo, employmentDetails, workLocations, postings, contracts, skills, specialties, attributes, visas, workingRestrictions, availabilities, personalPattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    personalInfo: ").append(toIndentedString(personalInfo)).append("\n");
    sb.append("    employmentDetails: ").append(toIndentedString(employmentDetails)).append("\n");
    sb.append("    workLocations: ").append(toIndentedString(workLocations)).append("\n");
    sb.append("    postings: ").append(toIndentedString(postings)).append("\n");
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    specialties: ").append(toIndentedString(specialties)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    visas: ").append(toIndentedString(visas)).append("\n");
    sb.append("    workingRestrictions: ").append(toIndentedString(workingRestrictions)).append("\n");
    sb.append("    availabilities: ").append(toIndentedString(availabilities)).append("\n");
    sb.append("    personalPattern: ").append(toIndentedString(personalPattern)).append("\n");
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

