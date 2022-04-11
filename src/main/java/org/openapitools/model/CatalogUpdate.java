package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CategoryRef;
import org.openapitools.model.RelatedParty;
import org.openapitools.model.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A collection of Product Offerings, intended for a specific DistributionChannel, enhanced with additional information such as SLA parameters, invoicing and shipping details Skipped properties: id,href,lastUpdate,@type,@baseType
 */

@Schema(name = "Catalog_Update", description = "A collection of Product Offerings, intended for a specific DistributionChannel, enhanced with additional information such as SLA parameters, invoicing and shipping details Skipped properties: id,href,lastUpdate,@type,@baseType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class CatalogUpdate   {

  @JsonProperty("catalogType")
  private String catalogType;

  @JsonProperty("description")
  private String description;

  @JsonProperty("lifecycleStatus")
  private String lifecycleStatus;

  @JsonProperty("name")
  private String name;

  @JsonProperty("version")
  private String version;

  @JsonProperty("category")
  @Valid
  private List<CategoryRef> category = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  public CatalogUpdate catalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Indicates if the catalog is a product, service or resource catalog
   * @return catalogType
  */
  
  @Schema(name = "catalogType", description = "Indicates if the catalog is a product, service or resource catalog", required = false)
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of this catalog
   * @return description
  */
  
  @Schema(name = "description", description = "Description of this catalog", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogUpdate lifecycleStatus(String lifecycleStatus) {
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

  public CatalogUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the catalog
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the catalog", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogUpdate version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Catalog version
   * @return version
  */
  
  @Schema(name = "version", description = "Catalog version", required = false)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public CatalogUpdate category(List<CategoryRef> category) {
    this.category = category;
    return this;
  }

  public CatalogUpdate addCategoryItem(CategoryRef categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * List of root categories contained in this catalog
   * @return category
  */
  @Valid 
  @Schema(name = "category", description = "List of root categories contained in this catalog", required = false)
  public List<CategoryRef> getCategory() {
    return category;
  }

  public void setCategory(List<CategoryRef> category) {
    this.category = category;
  }

  public CatalogUpdate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public CatalogUpdate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * List of parties involved in this catalog
   * @return relatedParty
  */
  @Valid 
  @Schema(name = "relatedParty", description = "List of parties involved in this catalog", required = false)
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public CatalogUpdate validFor(TimePeriod validFor) {
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

  public CatalogUpdate atSchemaLocation(URI atSchemaLocation) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogUpdate catalogUpdate = (CatalogUpdate) o;
    return Objects.equals(this.catalogType, catalogUpdate.catalogType) &&
        Objects.equals(this.description, catalogUpdate.description) &&
        Objects.equals(this.lifecycleStatus, catalogUpdate.lifecycleStatus) &&
        Objects.equals(this.name, catalogUpdate.name) &&
        Objects.equals(this.version, catalogUpdate.version) &&
        Objects.equals(this.category, catalogUpdate.category) &&
        Objects.equals(this.relatedParty, catalogUpdate.relatedParty) &&
        Objects.equals(this.validFor, catalogUpdate.validFor) &&
        Objects.equals(this.atSchemaLocation, catalogUpdate.atSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, description, lifecycleStatus, name, version, category, relatedParty, validFor, atSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogUpdate {\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
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

