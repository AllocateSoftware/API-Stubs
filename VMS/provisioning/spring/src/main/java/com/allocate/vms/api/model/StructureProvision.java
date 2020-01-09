package com.allocate.vms.api.model;

import java.util.Objects;
import com.allocate.vms.api.model.Unit;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StructureProvision
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-09T13:35:34.643941Z[Europe/London]")

public class StructureProvision   {
  @JsonProperty("customerCode")
  private String customerCode;

  @JsonProperty("units")
  @Valid
  private List<Unit> units = null;

  public StructureProvision customerCode(String customerCode) {
    this.customerCode = customerCode;
    return this;
  }

  /**
   * ID of the Customer (Trust)
   * @return customerCode
  */
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
      this.units = new ArrayList<>();
    }
    this.units.add(unitsItem);
    return this;
  }

  /**
   * List of units present within the customer's system
   * @return units
  */
  @ApiModelProperty(value = "List of units present within the customer's system")

  @Valid

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

