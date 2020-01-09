package com.allocate.openapi.model;

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
 * ErrorResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class ErrorResponse   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  @JsonProperty("items")
  @Valid
  private List<ErrorResponse> items = null;

  public ErrorResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional identifier for this reponse (for correlation with logging)
   * @return id
  */
  @ApiModelProperty(value = "Optional identifier for this reponse (for correlation with logging)")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ErrorResponse code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Optional error code identifying this particular error
   * @return code
  */
  @ApiModelProperty(value = "Optional error code identifying this particular error")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of this error.
   * @return description
  */
  @ApiModelProperty(required = true, value = "Description of this error.")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorResponse items(List<ErrorResponse> items) {
    this.items = items;
    return this;
  }

  public ErrorResponse addItemsItem(ErrorResponse itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of child errors
   * @return items
  */
  @ApiModelProperty(value = "List of child errors")

  @Valid

  public List<ErrorResponse> getItems() {
    return items;
  }

  public void setItems(List<ErrorResponse> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.id, errorResponse.id) &&
        Objects.equals(this.code, errorResponse.code) &&
        Objects.equals(this.description, errorResponse.description) &&
        Objects.equals(this.items, errorResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, description, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

