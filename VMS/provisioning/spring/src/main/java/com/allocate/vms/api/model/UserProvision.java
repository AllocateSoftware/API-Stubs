package com.allocate.vms.api.model;

import java.util.Objects;
import com.allocate.vms.api.model.User;
import com.allocate.vms.api.model.UserProvisionItem;
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
 * UserProvision
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:34.643941Z[Europe/London]")

public class UserProvision   {
  @JsonProperty("user")
  private User user;

  @JsonProperty("access")
  @Valid
  private List<UserProvisionItem> access = null;

  public UserProvision user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @ApiModelProperty(value = "")

  @Valid

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public UserProvision access(List<UserProvisionItem> access) {
    this.access = access;
    return this;
  }

  public UserProvision addAccessItem(UserProvisionItem accessItem) {
    if (this.access == null) {
      this.access = new ArrayList<>();
    }
    this.access.add(accessItem);
    return this;
  }

  /**
   * Get access
   * @return access
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<UserProvisionItem> getAccess() {
    return access;
  }

  public void setAccess(List<UserProvisionItem> access) {
    this.access = access;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProvision userProvision = (UserProvision) o;
    return Objects.equals(this.user, userProvision.user) &&
        Objects.equals(this.access, userProvision.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, access);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProvision {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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

