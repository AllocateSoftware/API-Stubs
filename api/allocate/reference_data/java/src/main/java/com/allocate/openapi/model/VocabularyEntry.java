/*
 * Reference data and Mappings API
 *      ## API for accessing reference data and mapping information 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VocabularyEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:34:49.397524Z[Europe/London]")
public class VocabularyEntry {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;


  public VocabularyEntry code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Code for the element. Should be unique within the vocabulary
   * @return code
  **/
  @ApiModelProperty(example = "ABCD", required = true, value = "Code for the element. Should be unique within the vocabulary")

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
  **/
  @javax.annotation.Nullable
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

