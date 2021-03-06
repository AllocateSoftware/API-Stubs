/*
 * DE Provider Direct Engagement API
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.allocate.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Person gender, potenially could be a broader set
 */
@JsonAdapter(PersonGender.Adapter.class)
public enum PersonGender {
  
  MALE("male"),
  
  FEMALE("female");

  private String value;

  PersonGender(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PersonGender fromValue(String value) {
    for (PersonGender b : PersonGender.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PersonGender> {
    @Override
    public void write(final JsonWriter jsonWriter, final PersonGender enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PersonGender read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PersonGender.fromValue(value);
    }
  }
}

