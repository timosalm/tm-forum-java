package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CategoryRef;
import org.openapitools.model.ProductOfferingRef;
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
 * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.
 */

@Schema(name = "Category", description = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class Category   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("href")
  private String href;

  @JsonProperty("description")
  private String description;

  @JsonProperty("isRoot")
  private Boolean isRoot;

  @JsonProperty("lastUpdate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdate;

  @JsonProperty("lifecycleStatus")
  private String lifecycleStatus;

  @JsonProperty("name")
  private String name;

  @JsonProperty("parentId")
  private String parentId;

  @JsonProperty("version")
  private String version;

  @JsonProperty("productOffering")
  @Valid
  private List<ProductOfferingRef> productOffering = null;

  @JsonProperty("subCategory")
  @Valid
  private List<CategoryRef> subCategory = null;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public Category id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the category
   * @return id
  */
  
  @Schema(name = "id", description = "Unique identifier of the category", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Category href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the category
   * @return href
  */
  
  @Schema(name = "href", description = "Reference of the category", required = false)
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Category description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the category
   * @return description
  */
  
  @Schema(name = "description", description = "Description of the category", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Category isRoot(Boolean isRoot) {
    this.isRoot = isRoot;
    return this;
  }

  /**
   * If true, this Boolean indicates that the category is a root of categories
   * @return isRoot
  */
  
  @Schema(name = "isRoot", description = "If true, this Boolean indicates that the category is a root of categories", required = false)
  public Boolean getIsRoot() {
    return isRoot;
  }

  public void setIsRoot(Boolean isRoot) {
    this.isRoot = isRoot;
  }

  public Category lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time of the last update
   * @return lastUpdate
  */
  @Valid 
  @Schema(name = "lastUpdate", description = "Date and time of the last update", required = false)
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Category lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * Used to indicate the current lifecycle status
   * @return lifecycleStatus
  */
  
  @Schema(name = "lifecycleStatus", description = "Used to indicate the current lifecycle status", required = false)
  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public Category name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the category
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the category", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Category parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Unique identifier of the parent category
   * @return parentId
  */
  
  @Schema(name = "parentId", description = "Unique identifier of the parent category", required = false)
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Category version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Category version
   * @return version
  */
  
  @Schema(name = "version", description = "Category version", required = false)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Category productOffering(List<ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  public Category addProductOfferingItem(ProductOfferingRef productOfferingItem) {
    if (this.productOffering == null) {
      this.productOffering = new ArrayList<>();
    }
    this.productOffering.add(productOfferingItem);
    return this;
  }

  /**
   * A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information.
   * @return productOffering
  */
  @Valid 
  @Schema(name = "productOffering", description = "A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information.", required = false)
  public List<ProductOfferingRef> getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(List<ProductOfferingRef> productOffering) {
    this.productOffering = productOffering;
  }

  public Category subCategory(List<CategoryRef> subCategory) {
    this.subCategory = subCategory;
    return this;
  }

  public Category addSubCategoryItem(CategoryRef subCategoryItem) {
    if (this.subCategory == null) {
      this.subCategory = new ArrayList<>();
    }
    this.subCategory.add(subCategoryItem);
    return this;
  }

  /**
   * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other (sub-)categories and/or product offerings.
   * @return subCategory
  */
  @Valid 
  @Schema(name = "subCategory", description = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other (sub-)categories and/or product offerings.", required = false)
  public List<CategoryRef> getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(List<CategoryRef> subCategory) {
    this.subCategory = subCategory;
  }

  public Category validFor(TimePeriod validFor) {
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

  public Category atBaseType(String atBaseType) {
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

  public Category atSchemaLocation(URI atSchemaLocation) {
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

  public Category atType(String atType) {
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
    Category category = (Category) o;
    return Objects.equals(this.id, category.id) &&
        Objects.equals(this.href, category.href) &&
        Objects.equals(this.description, category.description) &&
        Objects.equals(this.isRoot, category.isRoot) &&
        Objects.equals(this.lastUpdate, category.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, category.lifecycleStatus) &&
        Objects.equals(this.name, category.name) &&
        Objects.equals(this.parentId, category.parentId) &&
        Objects.equals(this.version, category.version) &&
        Objects.equals(this.productOffering, category.productOffering) &&
        Objects.equals(this.subCategory, category.subCategory) &&
        Objects.equals(this.validFor, category.validFor) &&
        Objects.equals(this.atBaseType, category.atBaseType) &&
        Objects.equals(this.atSchemaLocation, category.atSchemaLocation) &&
        Objects.equals(this.atType, category.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, isRoot, lastUpdate, lifecycleStatus, name, parentId, version, productOffering, subCategory, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isRoot: ").append(toIndentedString(isRoot)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

