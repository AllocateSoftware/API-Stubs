package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets ContractStatus
 */
public enum ContractStatus {
  
  NOT_INITIATED("not_initiated"),
  
  IN_PROGRESS("in_progress"),
  
  PENDING("pending"),
  
  ACTIVE("active"),
  
  NONACTIVE("nonactive");

  private String value;

  ContractStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ContractStatus fromValue(String value) {
    for (ContractStatus b : ContractStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

