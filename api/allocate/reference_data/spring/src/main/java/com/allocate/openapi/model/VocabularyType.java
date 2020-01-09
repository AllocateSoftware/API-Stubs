package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VocabularyType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:47.784750Z[Europe/London]")

public class VocabularyType   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("tags")
  @Valid
  private Map<String, String> tags = null;

  public VocabularyType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of this vocabulary type
   * @return id
  */
  @ApiModelProperty(example = "D1E3B83E-99A3-4AF3-B95B-3DC2913EDDC2", required = true, value = "ID of this vocabulary type")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VocabularyType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the vocabulary. Usually would not contain spaces (as this will be used in URLs).
   * @return name
  */
  @ApiModelProperty(example = "grades", required = true, value = "Name of the vocabulary. Usually would not contain spaces (as this will be used in URLs).")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VocabularyType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the vocabulary
   * @return description
  */
  @ApiModelProperty(example = "List of grades", required = true, value = "Description of the vocabulary")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VocabularyType tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public VocabularyType putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Optional array of tags which may be applied
   * @return tags
  */
  @ApiModelProperty(value = "Optional array of tags which may be applied")


  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VocabularyType vocabularyType = (VocabularyType) o;
    return Objects.equals(this.id, vocabularyType.id) &&
        Objects.equals(this.name, vocabularyType.name) &&
        Objects.equals(this.description, vocabularyType.description) &&
        Objects.equals(this.tags, vocabularyType.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VocabularyType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

