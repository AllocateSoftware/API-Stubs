/*
 * VMS Provisioning API
 * ## Description  API to be impemented by 247Time (and, potentially, partners) to enable provisioning of accounts and the org structure 
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
import com.allocate.vms.api.model.Unit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StructureProvision
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T13:35:36.006010Z[Europe/London]")
public class StructureProvision {
  public static final String SERIALIZED_NAME_CUSTOMER_CODE = "customerCode";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_CODE)
  private String customerCode;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private List<Unit> units = null;


  public StructureProvision customerCode(String customerCode) {
    
    this.customerCode = customerCode;
    return this;
  }

   /**
   * ID of the Customer (Trust)
   * @return customerCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NCUH", value = "ID of the Customer (Trust)")

  public String getCustomerCode() {
    return customerCode;
  }


  public void setCustomerCode(String customerCode) {
    this.customerCode = customerCode;
  }


  public StructureProvision units(List<Unit> units) {
    
    this.units = units;
    return this;
  }

  public StructureProvision addUnitsItem(Unit unitsItem) {
    if (this.units == null) {
      this.units = new ArrayList<Unit>();
    }
    this.units.add(unitsItem);
    return this;
  }

   /**
   * List of units present within the customer&#39;s system
   * @return units
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of units present within the customer's system")

  public List<Unit> getUnits() {
    return units;
  }


  public void setUnits(List<Unit> units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructureProvision structureProvision = (StructureProvision) o;
    return Objects.equals(this.customerCode, structureProvision.customerCode) &&
        Objects.equals(this.units, structureProvision.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCode, units);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructureProvision {\n");
    sb.append("    customerCode: ").append(toIndentedString(customerCode)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

