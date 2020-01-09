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
 * ID to specify a worker. Either an ID (relative to the receiving system) or universalId (such as National Insurance Number) may be used.
 */
@ApiModel(description = "ID to specify a worker. Either an ID (relative to the receiving system) or universalId (such as National Insurance Number) may be used.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:12.042489Z[Europe/London]")

public class PersonIdentifier   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("universalId")
  private String universalId;

  public PersonIdentifier id(String id) {
    this.id = id;
    return this;
  }

  /**
   * identifier of the person (worker) within the VMS
   * @return id
  */
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", value = "identifier of the person (worker) within the VMS")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PersonIdentifier universalId(String universalId) {
    this.universalId = universalId;
    return this;
  }

  /**
   * Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.
   * @return universalId
  */
  @ApiModelProperty(example = "QQ123456C", value = "Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.")


  public String getUniversalId() {
    return universalId;
  }

  public void setUniversalId(String universalId) {
    this.universalId = universalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonIdentifier personIdentifier = (PersonIdentifier) o;
    return Objects.equals(this.id, personIdentifier.id) &&
        Objects.equals(this.universalId, personIdentifier.universalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, universalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonIdentifier {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    universalId: ").append(toIndentedString(universalId)).append("\n");
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

