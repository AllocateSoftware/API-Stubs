package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LeaveClaimWhen
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class LeaveClaimWhen   {
  @JsonProperty("from")
  private LocalDate from;

  @JsonProperty("to")
  private LocalDate to;

  public LeaveClaimWhen from(LocalDate from) {
    this.from = from;
    return this;
  }

  /**
   * 1st day (inclusive) of leave claim
   * @return from
  */
  @ApiModelProperty(value = "1st day (inclusive) of leave claim")

  @Valid

  public LocalDate getFrom() {
    return from;
  }

  public void setFrom(LocalDate from) {
    this.from = from;
  }

  public LeaveClaimWhen to(LocalDate to) {
    this.to = to;
    return this;
  }

  /**
   * Last day (inclusive) of leave claim
   * @return to
  */
  @ApiModelProperty(value = "Last day (inclusive) of leave claim")

  @Valid

  public LocalDate getTo() {
    return to;
  }

  public void setTo(LocalDate to) {
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
    LeaveClaimWhen leaveClaimWhen = (LeaveClaimWhen) o;
    return Objects.equals(this.from, leaveClaimWhen.from) &&
        Objects.equals(this.to, leaveClaimWhen.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveClaimWhen {\n");
    
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

