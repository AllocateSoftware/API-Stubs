package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VocabularyVariant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:47.784750Z[Europe/London]")

public class VocabularyVariant   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  public VocabularyVariant name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the variant. Usually would not contain spaces (as this will be used in URLs).
   * @return name
  */
  @ApiModelProperty(example = "AHFT", required = true, value = "Name of the variant. Usually would not contain spaces (as this will be used in URLs).")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VocabularyVariant description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the vocabulary
   * @return description
  */
  @ApiModelProperty(example = "Anytown Hospital NHS Foundation Trust", value = "Description of the vocabulary")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VocabularyVariant vocabularyVariant = (VocabularyVariant) o;
    return Objects.equals(this.name, vocabularyVariant.name) &&
        Objects.equals(this.description, vocabularyVariant.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VocabularyVariant {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

