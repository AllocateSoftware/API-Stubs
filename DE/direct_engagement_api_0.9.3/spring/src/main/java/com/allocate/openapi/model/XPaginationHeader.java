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
 * XPaginationHeader
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:37:09.334042Z[Europe/London]")

public class XPaginationHeader   {
  @JsonProperty("currentPage")
  private Integer currentPage;

  @JsonProperty("pageSize")
  private Integer pageSize;

  @JsonProperty("totalCount")
  private Integer totalCount;

  @JsonProperty("totalPages")
  private Integer totalPages;

  @JsonProperty("previousPageInputParameters")
  private String previousPageInputParameters;

  @JsonProperty("nextPageInputParameters")
  private String nextPageInputParameters;

  public XPaginationHeader currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Current page of the response
   * @return currentPage
  */
  @ApiModelProperty(example = "1", value = "Current page of the response")


  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public XPaginationHeader pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Number of rows per page
   * @return pageSize
  */
  @ApiModelProperty(example = "1", value = "Number of rows per page")


  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public XPaginationHeader totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total number of rows in the response
   * @return totalCount
  */
  @ApiModelProperty(example = "1", value = "Total number of rows in the response")


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public XPaginationHeader totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Total number of pages of the response
   * @return totalPages
  */
  @ApiModelProperty(example = "1", value = "Total number of pages of the response")


  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public XPaginationHeader previousPageInputParameters(String previousPageInputParameters) {
    this.previousPageInputParameters = previousPageInputParameters;
    return this;
  }

  /**
   * Input parameter values for getting the previous page of the response
   * @return previousPageInputParameters
  */
  @ApiModelProperty(value = "Input parameter values for getting the previous page of the response")


  public String getPreviousPageInputParameters() {
    return previousPageInputParameters;
  }

  public void setPreviousPageInputParameters(String previousPageInputParameters) {
    this.previousPageInputParameters = previousPageInputParameters;
  }

  public XPaginationHeader nextPageInputParameters(String nextPageInputParameters) {
    this.nextPageInputParameters = nextPageInputParameters;
    return this;
  }

  /**
   * Input parameter values for calling the next page of the response
   * @return nextPageInputParameters
  */
  @ApiModelProperty(value = "Input parameter values for calling the next page of the response")


  public String getNextPageInputParameters() {
    return nextPageInputParameters;
  }

  public void setNextPageInputParameters(String nextPageInputParameters) {
    this.nextPageInputParameters = nextPageInputParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XPaginationHeader xpaginationHeader = (XPaginationHeader) o;
    return Objects.equals(this.currentPage, xpaginationHeader.currentPage) &&
        Objects.equals(this.pageSize, xpaginationHeader.pageSize) &&
        Objects.equals(this.totalCount, xpaginationHeader.totalCount) &&
        Objects.equals(this.totalPages, xpaginationHeader.totalPages) &&
        Objects.equals(this.previousPageInputParameters, xpaginationHeader.previousPageInputParameters) &&
        Objects.equals(this.nextPageInputParameters, xpaginationHeader.nextPageInputParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, pageSize, totalCount, totalPages, previousPageInputParameters, nextPageInputParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XPaginationHeader {\n");
    
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    previousPageInputParameters: ").append(toIndentedString(previousPageInputParameters)).append("\n");
    sb.append("    nextPageInputParameters: ").append(toIndentedString(nextPageInputParameters)).append("\n");
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

