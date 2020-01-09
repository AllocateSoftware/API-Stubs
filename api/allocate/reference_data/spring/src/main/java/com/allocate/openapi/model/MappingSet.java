package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.VocabularyType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MappingSet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:47.784750Z[Europe/London]")

public class MappingSet   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("vocabularyType")
  private VocabularyType vocabularyType;

  public MappingSet id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of this mapping set
   * @return id
  */
  @ApiModelProperty(example = "D1E3B83E-99A3-4AF3-B95B-3DC2913EDDC2", required = true, value = "ID of this mapping set")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MappingSet vocabularyType(VocabularyType vocabularyType) {
    this.vocabularyType = vocabularyType;
    return this;
  }

  /**
   * Get vocabularyType
   * @return vocabularyType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public VocabularyType getVocabularyType() {
    return vocabularyType;
  }

  public void setVocabularyType(VocabularyType vocabularyType) {
    this.vocabularyType = vocabularyType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MappingSet mappingSet = (MappingSet) o;
    return Objects.equals(this.id, mappingSet.id) &&
        Objects.equals(this.vocabularyType, mappingSet.vocabularyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vocabularyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MappingSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vocabularyType: ").append(toIndentedString(vocabularyType)).append("\n");
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

