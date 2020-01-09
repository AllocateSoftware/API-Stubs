package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.DateSpan;
import com.allocate.openapi.model.WorkingRestrictionDefaultLeaveHours;
import com.allocate.openapi.model.WorkingRestrictionHoursOfWork;
import com.allocate.openapi.model.WorkingRestrictionRestrictions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WorkingRestriction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class WorkingRestriction   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("validity")
  private DateSpan validity;

  @JsonProperty("hoursOfWork")
  private WorkingRestrictionHoursOfWork hoursOfWork;

  @JsonProperty("defaultLeaveHours")
  private WorkingRestrictionDefaultLeaveHours defaultLeaveHours;

  @JsonProperty("restrictions")
  private WorkingRestrictionRestrictions restrictions;

  public WorkingRestriction title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public WorkingRestriction validity(DateSpan validity) {
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

  public WorkingRestriction hoursOfWork(WorkingRestrictionHoursOfWork hoursOfWork) {
    this.hoursOfWork = hoursOfWork;
    return this;
  }

  /**
   * Get hoursOfWork
   * @return hoursOfWork
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public WorkingRestrictionHoursOfWork getHoursOfWork() {
    return hoursOfWork;
  }

  public void setHoursOfWork(WorkingRestrictionHoursOfWork hoursOfWork) {
    this.hoursOfWork = hoursOfWork;
  }

  public WorkingRestriction defaultLeaveHours(WorkingRestrictionDefaultLeaveHours defaultLeaveHours) {
    this.defaultLeaveHours = defaultLeaveHours;
    return this;
  }

  /**
   * Get defaultLeaveHours
   * @return defaultLeaveHours
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public WorkingRestrictionDefaultLeaveHours getDefaultLeaveHours() {
    return defaultLeaveHours;
  }

  public void setDefaultLeaveHours(WorkingRestrictionDefaultLeaveHours defaultLeaveHours) {
    this.defaultLeaveHours = defaultLeaveHours;
  }

  public WorkingRestriction restrictions(WorkingRestrictionRestrictions restrictions) {
    this.restrictions = restrictions;
    return this;
  }

  /**
   * Get restrictions
   * @return restrictions
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public WorkingRestrictionRestrictions getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(WorkingRestrictionRestrictions restrictions) {
    this.restrictions = restrictions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkingRestriction workingRestriction = (WorkingRestriction) o;
    return Objects.equals(this.title, workingRestriction.title) &&
        Objects.equals(this.validity, workingRestriction.validity) &&
        Objects.equals(this.hoursOfWork, workingRestriction.hoursOfWork) &&
        Objects.equals(this.defaultLeaveHours, workingRestriction.defaultLeaveHours) &&
        Objects.equals(this.restrictions, workingRestriction.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, validity, hoursOfWork, defaultLeaveHours, restrictions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkingRestriction {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    hoursOfWork: ").append(toIndentedString(hoursOfWork)).append("\n");
    sb.append("    defaultLeaveHours: ").append(toIndentedString(defaultLeaveHours)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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

