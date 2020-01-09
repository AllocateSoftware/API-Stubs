package com.allocate.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DateSpan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:36:20.724158Z[Europe/London]")

public class DateSpan   {
  @JsonProperty("start")
  private OffsetDateTime start;

  @JsonProperty("end")
  private OffsetDateTime end;

  public DateSpan start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Start date-time
   * @return start
  */
  @ApiModelProperty(value = "Start date-time")

  @Valid

  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public DateSpan end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * End date-time
   * @return end
  */
  @ApiModelProperty(value = "End date-time")

  @Valid

  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateSpan dateSpan = (DateSpan) o;
    return Objects.equals(this.start, dateSpan.start) &&
        Objects.equals(this.end, dateSpan.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateSpan {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

