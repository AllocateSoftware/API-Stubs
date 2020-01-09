package com.allocate.vms.api.model;

import java.util.Objects;
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
 * UserProvisionItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:34.643941Z[Europe/London]")

public class UserProvisionItem   {
  @JsonProperty("unitId")
  private String unitId;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  public UserProvisionItem unitId(String unitId) {
    this.unitId = unitId;
    return this;
  }

  /**
   * Identifier of the unit within the HealthSuite ecosystem
   * @return unitId
  */
  @ApiModelProperty(example = "NCUH.1121", value = "Identifier of the unit within the HealthSuite ecosystem")


  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }

  public UserProvisionItem roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public UserProvisionItem addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Optional list of textual roles that the user has in relation to the unit
   * @return roles
  */
  @ApiModelProperty(value = "Optional list of textual roles that the user has in relation to the unit")


  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProvisionItem userProvisionItem = (UserProvisionItem) o;
    return Objects.equals(this.unitId, userProvisionItem.unitId) &&
        Objects.equals(this.roles, userProvisionItem.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitId, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProvisionItem {\n");
    
    sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

