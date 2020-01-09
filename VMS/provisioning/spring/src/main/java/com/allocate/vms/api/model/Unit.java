package com.allocate.vms.api.model;

import java.util.Objects;
import com.allocate.vms.api.model.CostCentre;
import com.allocate.vms.api.model.StaffGroup;
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
 * Unit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:34.643941Z[Europe/London]")

public class Unit   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("costCentre")
  private CostCentre costCentre;

  @JsonProperty("staffGroups")
  @Valid
  private List<StaffGroup> staffGroups = null;

  @JsonProperty("children")
  @Valid
  private List<Unit> children = null;

  public Unit id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(example = "12345", required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Unit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "Opal Ward", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Unit costCentre(CostCentre costCentre) {
    this.costCentre = costCentre;
    return this;
  }

  /**
   * Get costCentre
   * @return costCentre
  */
  @ApiModelProperty(value = "")

  @Valid

  public CostCentre getCostCentre() {
    return costCentre;
  }

  public void setCostCentre(CostCentre costCentre) {
    this.costCentre = costCentre;
  }

  public Unit staffGroups(List<StaffGroup> staffGroups) {
    this.staffGroups = staffGroups;
    return this;
  }

  public Unit addStaffGroupsItem(StaffGroup staffGroupsItem) {
    if (this.staffGroups == null) {
      this.staffGroups = new ArrayList<>();
    }
    this.staffGroups.add(staffGroupsItem);
    return this;
  }

  /**
   * Get staffGroups
   * @return staffGroups
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<StaffGroup> getStaffGroups() {
    return staffGroups;
  }

  public void setStaffGroups(List<StaffGroup> staffGroups) {
    this.staffGroups = staffGroups;
  }

  public Unit children(List<Unit> children) {
    this.children = children;
    return this;
  }

  public Unit addChildrenItem(Unit childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Children of this unit. This may be an arbitarily deep tree structure.
   * @return children
  */
  @ApiModelProperty(value = "Children of this unit. This may be an arbitarily deep tree structure.")

  @Valid

  public List<Unit> getChildren() {
    return children;
  }

  public void setChildren(List<Unit> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Unit unit = (Unit) o;
    return Objects.equals(this.id, unit.id) &&
        Objects.equals(this.name, unit.name) &&
        Objects.equals(this.costCentre, unit.costCentre) &&
        Objects.equals(this.staffGroups, unit.staffGroups) &&
        Objects.equals(this.children, unit.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, costCentre, staffGroups, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    costCentre: ").append(toIndentedString(costCentre)).append("\n");
    sb.append("    staffGroups: ").append(toIndentedString(staffGroups)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

