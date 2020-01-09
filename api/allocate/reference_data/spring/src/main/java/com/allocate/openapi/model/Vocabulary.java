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
 * Vocabulary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:47.784750Z[Europe/London]")

public class Vocabulary   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("typeId")
  private String typeId;

  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public Vocabulary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of this vocabulary
   * @return id
  */
  @ApiModelProperty(example = "DA32F546-E049-49DE-BDDD-EA466597E27E", required = true, value = "ID of this vocabulary")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Vocabulary typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * ID of the type of vocabulary that this is an example of
   * @return typeId
  */
  @ApiModelProperty(example = "D1E3B83E-99A3-4AF3-B95B-3DC2913EDDC2", required = true, value = "ID of the type of vocabulary that this is an example of")
  @NotNull


  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public Vocabulary code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for this vocabulary. Unique within the type of vocabulary
   * @return code
  */
  @ApiModelProperty(example = "NCUH", required = true, value = "Code for this vocabulary. Unique within the type of vocabulary")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Vocabulary description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional description of the vocabulary
   * @return description
  */
  @ApiModelProperty(example = "List of grades", value = "Optional description of the vocabulary")


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
    Vocabulary vocabulary = (Vocabulary) o;
    return Objects.equals(this.id, vocabulary.id) &&
        Objects.equals(this.typeId, vocabulary.typeId) &&
        Objects.equals(this.code, vocabulary.code) &&
        Objects.equals(this.description, vocabulary.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, typeId, code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vocabulary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

