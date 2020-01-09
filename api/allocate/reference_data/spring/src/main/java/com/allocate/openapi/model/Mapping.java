package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.VocabularyEntry;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mapping
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:47.784750Z[Europe/London]")

public class Mapping   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("mappingSetId")
  private String mappingSetId;

  @JsonProperty("from")
  private VocabularyEntry from;

  @JsonProperty("to")
  private VocabularyEntry to;

  public Mapping id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id of this mapping
   * @return id
  */
  @ApiModelProperty(value = "Id of this mapping")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Mapping mappingSetId(String mappingSetId) {
    this.mappingSetId = mappingSetId;
    return this;
  }

  /**
   * Get mappingSetId
   * @return mappingSetId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getMappingSetId() {
    return mappingSetId;
  }

  public void setMappingSetId(String mappingSetId) {
    this.mappingSetId = mappingSetId;
  }

  public Mapping from(VocabularyEntry from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public VocabularyEntry getFrom() {
    return from;
  }

  public void setFrom(VocabularyEntry from) {
    this.from = from;
  }

  public Mapping to(VocabularyEntry to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public VocabularyEntry getTo() {
    return to;
  }

  public void setTo(VocabularyEntry to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mapping mapping = (Mapping) o;
    return Objects.equals(this.id, mapping.id) &&
        Objects.equals(this.mappingSetId, mapping.mappingSetId) &&
        Objects.equals(this.from, mapping.from) &&
        Objects.equals(this.to, mapping.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mappingSetId, from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mapping {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mappingSetId: ").append(toIndentedString(mappingSetId)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

