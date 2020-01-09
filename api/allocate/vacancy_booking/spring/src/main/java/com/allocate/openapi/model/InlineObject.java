package com.allocate.openapi.model;

import java.util.Objects;
import com.allocate.openapi.model.TimeSpan;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:33:50.718767Z[Europe/London]")

public class InlineObject   {
  @JsonProperty("proposalId")
  private String proposalId;

  @JsonProperty("times")
  private TimeSpan times;

  @JsonProperty("break")
  private Integer _break;

  public InlineObject proposalId(String proposalId) {
    this.proposalId = proposalId;
    return this;
  }

  /**
   * The ID of the orignal proposal (booking)
   * @return proposalId
  */
  @ApiModelProperty(example = "950FE6D1-D658-4B11-BCB0-CD68756BF047", value = "The ID of the orignal proposal (booking)")


  public String getProposalId() {
    return proposalId;
  }

  public void setProposalId(String proposalId) {
    this.proposalId = proposalId;
  }

  public InlineObject times(TimeSpan times) {
    this.times = times;
    return this;
  }

  /**
   * Get times
   * @return times
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeSpan getTimes() {
    return times;
  }

  public void setTimes(TimeSpan times) {
    this.times = times;
  }

  public InlineObject _break(Integer _break) {
    this._break = _break;
    return this;
  }

  /**
   * Break time in minutes
   * @return _break
  */
  @ApiModelProperty(example = "60", value = "Break time in minutes")


  public Integer getBreak() {
    return _break;
  }

  public void setBreak(Integer _break) {
    this._break = _break;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.proposalId, inlineObject.proposalId) &&
        Objects.equals(this.times, inlineObject.times) &&
        Objects.equals(this._break, inlineObject._break);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposalId, times, _break);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    
    sb.append("    proposalId: ").append(toIndentedString(proposalId)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    _break: ").append(toIndentedString(_break)).append("\n");
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

