package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ConstraintRef;
import org.openapitools.model.POPAlteration;
import org.openapitools.model.ProductPriceValue;
import org.openapitools.model.Quantity;
import org.openapitools.model.TimePeriod;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A new product offering price being created by value or a reference to an existing product offering price that alreasy created. The polymorphic attributes @type, @schemaLocation &amp; @referredType are related to the product offering price and not to this ReforValue structure
 */

@Schema(name = "ProductOfferingPriceRefOrValue", description = "A new product offering price being created by value or a reference to an existing product offering price that alreasy created. The polymorphic attributes @type, @schemaLocation & @referredType are related to the product offering price and not to this ReforValue structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class ProductOfferingPriceRefOrValue   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("href")
  private URI href;

  @JsonProperty("description")
  private String description;

  @JsonProperty("lastUpdate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdate;

  @JsonProperty("lifecycleStatus")
  private String lifecycleStatus;

  @JsonProperty("name")
  private String name;

  @JsonProperty("priceType")
  private String priceType;

  @JsonProperty("recurringChargePeriod")
  private String recurringChargePeriod;

  @JsonProperty("recurringChargePeriodLength")
  private Integer recurringChargePeriodLength;

  @JsonProperty("version")
  private String version;

  @JsonProperty("constraint")
  @Valid
  private List<ConstraintRef> constraint = null;

  @JsonProperty("price")
  private ProductPriceValue price;

  @JsonProperty("priceAlteration")
  @Valid
  private List<POPAlteration> priceAlteration = null;

  @JsonProperty("unitOfMeasure")
  private Quantity unitOfMeasure;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  @JsonProperty("@referredType")
  private String atReferredType;

  public ProductOfferingPriceRefOrValue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
  */
  
  @Schema(name = "id", description = "unique identifier", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductOfferingPriceRefOrValue href(URI href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
  */
  @Valid 
  @Schema(name = "href", description = "Hyperlink reference", required = false)
  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }

  public ProductOfferingPriceRefOrValue description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the productOfferingPrice
   * @return description
  */
  
  @Schema(name = "description", description = "Description of the productOfferingPrice", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductOfferingPriceRefOrValue lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * the last update time of this ProductOfferingPrice
   * @return lastUpdate
  */
  @Valid 
  @Schema(name = "lastUpdate", description = "the last update time of this ProductOfferingPrice", required = false)
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public ProductOfferingPriceRefOrValue lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * the lifecycle status of this ProductOfferingPrice
   * @return lifecycleStatus
  */
  
  @Schema(name = "lifecycleStatus", description = "the lifecycle status of this ProductOfferingPrice", required = false)
  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public ProductOfferingPriceRefOrValue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the productOfferingPrice
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the productOfferingPrice", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductOfferingPriceRefOrValue priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * A category that describes the price charge, such as recurring, penalty, One time fee and so forth.
   * @return priceType
  */
  
  @Schema(name = "priceType", description = "A category that describes the price charge, such as recurring, penalty, One time fee and so forth.", required = false)
  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public ProductOfferingPriceRefOrValue recurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }

  /**
   * The period type to repeat the application of the price Could be month, week...
   * @return recurringChargePeriod
  */
  
  @Schema(name = "recurringChargePeriod", description = "The period type to repeat the application of the price Could be month, week...", required = false)
  public String getRecurringChargePeriod() {
    return recurringChargePeriod;
  }

  public void setRecurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  public ProductOfferingPriceRefOrValue recurringChargePeriodLength(Integer recurringChargePeriodLength) {
    this.recurringChargePeriodLength = recurringChargePeriodLength;
    return this;
  }

  /**
   * the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable
   * @return recurringChargePeriodLength
  */
  
  @Schema(name = "recurringChargePeriodLength", description = "the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable", required = false)
  public Integer getRecurringChargePeriodLength() {
    return recurringChargePeriodLength;
  }

  public void setRecurringChargePeriodLength(Integer recurringChargePeriodLength) {
    this.recurringChargePeriodLength = recurringChargePeriodLength;
  }

  public ProductOfferingPriceRefOrValue version(String version) {
    this.version = version;
    return this;
  }

  /**
   * ProductOffering version
   * @return version
  */
  
  @Schema(name = "version", description = "ProductOffering version", required = false)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ProductOfferingPriceRefOrValue constraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
    return this;
  }

  public ProductOfferingPriceRefOrValue addConstraintItem(ConstraintRef constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<>();
    }
    this.constraint.add(constraintItem);
    return this;
  }

  /**
   * The Constraint resource represents a policy/rule applied to ProductOfferingPrice.
   * @return constraint
  */
  @Valid 
  @Schema(name = "constraint", description = "The Constraint resource represents a policy/rule applied to ProductOfferingPrice.", required = false)
  public List<ConstraintRef> getConstraint() {
    return constraint;
  }

  public void setConstraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
  }

  public ProductOfferingPriceRefOrValue price(ProductPriceValue price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @Valid 
  @Schema(name = "price", required = false)
  public ProductPriceValue getPrice() {
    return price;
  }

  public void setPrice(ProductPriceValue price) {
    this.price = price;
  }

  public ProductOfferingPriceRefOrValue priceAlteration(List<POPAlteration> priceAlteration) {
    this.priceAlteration = priceAlteration;
    return this;
  }

  public ProductOfferingPriceRefOrValue addPriceAlterationItem(POPAlteration priceAlterationItem) {
    if (this.priceAlteration == null) {
      this.priceAlteration = new ArrayList<>();
    }
    this.priceAlteration.add(priceAlterationItem);
    return this;
  }

  /**
   * Get priceAlteration
   * @return priceAlteration
  */
  @Valid 
  @Schema(name = "priceAlteration", required = false)
  public List<POPAlteration> getPriceAlteration() {
    return priceAlteration;
  }

  public void setPriceAlteration(List<POPAlteration> priceAlteration) {
    this.priceAlteration = priceAlteration;
  }

  public ProductOfferingPriceRefOrValue unitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * Get unitOfMeasure
   * @return unitOfMeasure
  */
  @Valid 
  @Schema(name = "unitOfMeasure", required = false)
  public Quantity getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public ProductOfferingPriceRefOrValue validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
  */
  @Valid 
  @Schema(name = "validFor", required = false)
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ProductOfferingPriceRefOrValue atBaseType(String atBaseType) {
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

  public ProductOfferingPriceRefOrValue atSchemaLocation(URI atSchemaLocation) {
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

  public ProductOfferingPriceRefOrValue atType(String atType) {
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

  public ProductOfferingPriceRefOrValue atReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return atReferredType
  */
  
  @Schema(name = "@referredType", description = "The actual type of the target instance when needed for disambiguation.", required = false)
  public String getAtReferredType() {
    return atReferredType;
  }

  public void setAtReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingPriceRefOrValue productOfferingPriceRefOrValue = (ProductOfferingPriceRefOrValue) o;
    return Objects.equals(this.id, productOfferingPriceRefOrValue.id) &&
        Objects.equals(this.href, productOfferingPriceRefOrValue.href) &&
        Objects.equals(this.description, productOfferingPriceRefOrValue.description) &&
        Objects.equals(this.lastUpdate, productOfferingPriceRefOrValue.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, productOfferingPriceRefOrValue.lifecycleStatus) &&
        Objects.equals(this.name, productOfferingPriceRefOrValue.name) &&
        Objects.equals(this.priceType, productOfferingPriceRefOrValue.priceType) &&
        Objects.equals(this.recurringChargePeriod, productOfferingPriceRefOrValue.recurringChargePeriod) &&
        Objects.equals(this.recurringChargePeriodLength, productOfferingPriceRefOrValue.recurringChargePeriodLength) &&
        Objects.equals(this.version, productOfferingPriceRefOrValue.version) &&
        Objects.equals(this.constraint, productOfferingPriceRefOrValue.constraint) &&
        Objects.equals(this.price, productOfferingPriceRefOrValue.price) &&
        Objects.equals(this.priceAlteration, productOfferingPriceRefOrValue.priceAlteration) &&
        Objects.equals(this.unitOfMeasure, productOfferingPriceRefOrValue.unitOfMeasure) &&
        Objects.equals(this.validFor, productOfferingPriceRefOrValue.validFor) &&
        Objects.equals(this.atBaseType, productOfferingPriceRefOrValue.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productOfferingPriceRefOrValue.atSchemaLocation) &&
        Objects.equals(this.atType, productOfferingPriceRefOrValue.atType) &&
        Objects.equals(this.atReferredType, productOfferingPriceRefOrValue.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, lastUpdate, lifecycleStatus, name, priceType, recurringChargePeriod, recurringChargePeriodLength, version, constraint, price, priceAlteration, unitOfMeasure, validFor, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingPriceRefOrValue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    recurringChargePeriodLength: ").append(toIndentedString(recurringChargePeriodLength)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceAlteration: ").append(toIndentedString(priceAlteration)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
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

