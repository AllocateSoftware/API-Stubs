package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.ContactLogInformationDetails;
import com.allocate.openapi.model.Identifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactLogInformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class ContactLogInformation   {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    TELEPHONE("telephone"),
    
    EMAIL("email"),
    
    IM("IM"),
    
    FACETOFACE("faceToFace");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("when")
  private OffsetDateTime when;

  @JsonProperty("who")
  @Valid
  private Map<String, Identifier> who = null;

  @JsonProperty("details")
  private ContactLogInformationDetails details;

  public ContactLogInformation type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ContactLogInformation when(OffsetDateTime when) {
    this.when = when;
    return this;
  }

  /**
   * Get when
   * @return when
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getWhen() {
    return when;
  }

  public void setWhen(OffsetDateTime when) {
    this.when = when;
  }

  public ContactLogInformation who(Map<String, Identifier> who) {
    this.who = who;
    return this;
  }

  public ContactLogInformation putWhoItem(String key, Identifier whoItem) {
    if (this.who == null) {
      this.who = new HashMap<>();
    }
    this.who.put(key, whoItem);
    return this;
  }

  /**
   * Get who
   * @return who
  */
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, Identifier> getWho() {
    return who;
  }

  public void setWho(Map<String, Identifier> who) {
    this.who = who;
  }

  public ContactLogInformation details(ContactLogInformationDetails details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContactLogInformationDetails getDetails() {
    return details;
  }

  public void setDetails(ContactLogInformationDetails details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactLogInformation contactLogInformation = (ContactLogInformation) o;
    return Objects.equals(this.type, contactLogInformation.type) &&
        Objects.equals(this.when, contactLogInformation.when) &&
        Objects.equals(this.who, contactLogInformation.who) &&
        Objects.equals(this.details, contactLogInformation.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, when, who, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactLogInformation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    who: ").append(toIndentedString(who)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

