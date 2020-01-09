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
 * Attribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:19.384766Z[Europe/London]")

public class Attribute   {
  @JsonProperty("validity")
  private DateSpan validity;

  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  public Attribute validity(DateSpan validity) {
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

  public Attribute name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Attribute value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attribute attribute = (Attribute) o;
    return Objects.equals(this.validity, attribute.validity) &&
        Objects.equals(this.name, attribute.name) &&
        Objects.equals(this.value, attribute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validity, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attribute {\n");
    
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

