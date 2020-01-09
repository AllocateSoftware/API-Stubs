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
 * VocabularyEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:34:47.784750Z[Europe/London]")

public class VocabularyEntry   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("title")
  private String title;

  public VocabularyEntry code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the element. Should be unique within the vocabulary
   * @return code
  */
  @ApiModelProperty(example = "ABCD", required = true, value = "Code for the element. Should be unique within the vocabulary")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public VocabularyEntry title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title for the element
   * @return title
  */
  @ApiModelProperty(example = "ABCD", value = "Title for the element")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VocabularyEntry vocabularyEntry = (VocabularyEntry) o;
    return Objects.equals(this.code, vocabularyEntry.code) &&
        Objects.equals(this.title, vocabularyEntry.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VocabularyEntry {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

