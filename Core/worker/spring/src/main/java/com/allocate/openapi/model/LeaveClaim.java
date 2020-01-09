package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.LeaveClaimWhen;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LeaveClaim
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:42.181912Z[Europe/London]")

public class LeaveClaim   {
  @JsonProperty("when")
  private LeaveClaimWhen when;

  /**
   * The reason for the leave claim
   */
  public enum ReasonEnum {
    ANNUALLEAVE("annualLeave");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("reason")
  private ReasonEnum reason;

  public LeaveClaim when(LeaveClaimWhen when) {
    this.when = when;
    return this;
  }

  /**
   * Get when
   * @return when
  */
  @ApiModelProperty(value = "")

  @Valid

  public LeaveClaimWhen getWhen() {
    return when;
  }

  public void setWhen(LeaveClaimWhen when) {
    this.when = when;
  }

  public LeaveClaim reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason for the leave claim
   * @return reason
  */
  @ApiModelProperty(value = "The reason for the leave claim")


  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveClaim leaveClaim = (LeaveClaim) o;
    return Objects.equals(this.when, leaveClaim.when) &&
        Objects.equals(this.reason, leaveClaim.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(when, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveClaim {\n");
    
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

