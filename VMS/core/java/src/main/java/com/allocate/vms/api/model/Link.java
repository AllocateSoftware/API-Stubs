/*
 * VMS API
 * ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.vms.api.model;

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
 * Link
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:13.806839Z[Europe/London]")
public class Link {
  public static final String SERIALIZED_NAME_REL = "rel";
  @SerializedName(SERIALIZED_NAME_REL)
  private String rel;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;


  public Link rel(String rel) {
    
    this.rel = rel;
    return this;
  }

   /**
   * identifier for the type of link
   * @return rel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "identifier for the type of link")

  public String getRel() {
    return rel;
  }


  public void setRel(String rel) {
    this.rel = rel;
  }


  public Link href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * URL to resolve this link
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to resolve this link")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.rel, link.rel) &&
        Objects.equals(this.href, link.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel, href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

