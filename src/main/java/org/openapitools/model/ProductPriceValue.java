package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.model.Money;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for Price Alteration.
 */

@Schema(name = "ProductPriceValue", description = "Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for Price Alteration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class ProductPriceValue   {

  @JsonProperty("percentage")
  private Float percentage;

  @JsonProperty("taxCategory")
  private String taxCategory;

  @JsonProperty("taxRate")
  private Float taxRate;

  @JsonProperty("dutyFreeAmount")
  private Money dutyFreeAmount;

  @JsonProperty("taxIncludedAmount")
  private Money taxIncludedAmount;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public ProductPriceValue percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage to apply for ProdOfferPriceAlteration
   * @return percentage
  */
  
  @Schema(name = "percentage", description = "Percentage to apply for ProdOfferPriceAlteration", required = false)
  public Float getPercentage() {
    return percentage;
  }

  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  public ProductPriceValue taxCategory(String taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

  /**
   * Tax category
   * @return taxCategory
  */
  
  @Schema(name = "taxCategory", description = "Tax category", required = false)
  public String getTaxCategory() {
    return taxCategory;
  }

  public void setTaxCategory(String taxCategory) {
    this.taxCategory = taxCategory;
  }

  public ProductPriceValue taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * Tax rate
   * @return taxRate
  */
  
  @Schema(name = "taxRate", description = "Tax rate", required = false)
  public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public ProductPriceValue dutyFreeAmount(Money dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
    return this;
  }

  /**
   * Get dutyFreeAmount
   * @return dutyFreeAmount
  */
  @Valid 
  @Schema(name = "dutyFreeAmount", required = false)
  public Money getDutyFreeAmount() {
    return dutyFreeAmount;
  }

  public void setDutyFreeAmount(Money dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
  }

  public ProductPriceValue taxIncludedAmount(Money taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
    return this;
  }

  /**
   * Get taxIncludedAmount
   * @return taxIncludedAmount
  */
  @Valid 
  @Schema(name = "taxIncludedAmount", required = false)
  public Money getTaxIncludedAmount() {
    return taxIncludedAmount;
  }

  public void setTaxIncludedAmount(Money taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
  }

  public ProductPriceValue atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", required = false)
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public ProductPriceValue atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  @Valid 
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", required = false)
  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public ProductPriceValue atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
  */
  
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", required = false)
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPriceValue productPriceValue = (ProductPriceValue) o;
    return Objects.equals(this.percentage, productPriceValue.percentage) &&
        Objects.equals(this.taxCategory, productPriceValue.taxCategory) &&
        Objects.equals(this.taxRate, productPriceValue.taxRate) &&
        Objects.equals(this.dutyFreeAmount, productPriceValue.dutyFreeAmount) &&
        Objects.equals(this.taxIncludedAmount, productPriceValue.taxIncludedAmount) &&
        Objects.equals(this.atBaseType, productPriceValue.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productPriceValue.atSchemaLocation) &&
        Objects.equals(this.atType, productPriceValue.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, taxCategory, taxRate, dutyFreeAmount, taxIncludedAmount, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPriceValue {\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    taxCategory: ").append(toIndentedString(taxCategory)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    dutyFreeAmount: ").append(toIndentedString(dutyFreeAmount)).append("\n");
    sb.append("    taxIncludedAmount: ").append(toIndentedString(taxIncludedAmount)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

