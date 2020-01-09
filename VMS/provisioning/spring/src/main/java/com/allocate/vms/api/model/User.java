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
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:34.643941Z[Europe/London]")

public class User   {
  @JsonProperty("uri")
  private String uri;

  @JsonProperty("name")
  private String name;

  @JsonProperty("roles")
  @Valid
  private List<String> roles = null;

  public User uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Identifier of the user within the HealthSuite ecosystem
   * @return uri
  */
  @ApiModelProperty(example = "user@email.com", value = "Identifier of the user within the HealthSuite ecosystem")


  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name for the user
   * @return name
  */
  @ApiModelProperty(value = "Name for the user")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(String rolesItem) {
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
    User user = (User) o;
    return Objects.equals(this.uri, user.uri) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.roles, user.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, name, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

