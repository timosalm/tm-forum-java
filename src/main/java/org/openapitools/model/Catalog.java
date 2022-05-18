package org.openapitools.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import nonapi.io.github.classgraph.json.Id;
import org.openapitools.model.CategoryRef;
import org.openapitools.model.RelatedParty;
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
 * A collection of Product Offerings, intended for a specific DistributionChannel, enhanced with additional information such as SLA parameters, invoicing and shipping details
 */

@Schema(name = "Catalog", description = "A collection of Product Offerings, intended for a specific DistributionChannel, enhanced with additional information such as SLA parameters, invoicing and shipping details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class Catalog {

    public Catalog() {
    }

    public Catalog(String baseUri, String catalogType, String description, OffsetDateTime lastUpdate, String lifecycleStatus, String name, String version, List<CategoryRef> category, List<RelatedParty> relatedParty, TimePeriod validFor, String atBaseType, URI atSchemaLocation, String atType) {
        this.id = UUID.randomUUID().toString();
        this.href = String.format("%s/%s", baseUri, id);
        this.catalogType = catalogType;
        this.description = description;
        this.lastUpdate = lastUpdate;
        this.lifecycleStatus = lifecycleStatus;
        this.name = name;
        this.version = version;
        this.category = category;
        this.relatedParty = relatedParty;
        this.validFor = validFor;
        this.atBaseType = atBaseType;
        this.atSchemaLocation = atSchemaLocation;
        this.atType = atType;
    }

    public Catalog(String id, String baseUri, String catalogType, String description, OffsetDateTime lastUpdate, String lifecycleStatus, String name, String version, List<CategoryRef> category, List<RelatedParty> relatedParty, TimePeriod validFor, String atBaseType, URI atSchemaLocation, String atType) {
        this.id = id;
        this.href = String.format("%s/%s", baseUri, id);
        this.catalogType = catalogType;
        this.description = description;
        this.lastUpdate = lastUpdate;
        this.lifecycleStatus = lifecycleStatus;
        this.name = name;
        this.version = version;
        this.category = category;
        this.relatedParty = relatedParty;
        this.validFor = validFor;
        this.atBaseType = atBaseType;
        this.atSchemaLocation = atSchemaLocation;
        this.atType = atType;
    }

    public void update(CatalogUpdate catalogUdate) {
        this.catalogType = Optional.ofNullable(catalogUdate.getCatalogType()).orElse(catalogType);
        this.description = Optional.ofNullable(catalogUdate.getDescription()).orElse(description);
        this.lastUpdate = OffsetDateTime.now();
        this.lifecycleStatus = Optional.ofNullable(catalogUdate.getLifecycleStatus()).orElse(lifecycleStatus);
        this.name = Optional.ofNullable(catalogUdate.getName()).orElse(name);
        this.version = Optional.ofNullable(catalogUdate.getVersion()).orElse(version);
        this.category = Optional.ofNullable(catalogUdate.getCategory()).orElse(category);
        this.relatedParty = Optional.ofNullable(catalogUdate.getRelatedParty()).orElse(relatedParty);
        this.validFor = Optional.ofNullable(catalogUdate.getValidFor()).orElse(validFor);
        this.atSchemaLocation = Optional.ofNullable(catalogUdate.getAtSchemaLocation()).orElse(atSchemaLocation);
    }

    @Id
    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("catalogType")
    private String catalogType;

    @JsonProperty("description")
    private String description;

    @JsonProperty("lastUpdate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastUpdate;

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

    @JsonProperty("@baseType")
    private String atBaseType;

    @JsonProperty("@schemaLocation")
    private URI atSchemaLocation;

    @JsonProperty("@type")
    private String atType;

    public Catalog id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the Catalog
     *
     * @return id
     */

    @Schema(name = "id", description = "Unique identifier of the Catalog", required = false)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Catalog href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Unique reference of the catalog
     *
     * @return href
     */

    @Schema(name = "href", description = "Unique reference of the catalog", required = false)
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Catalog catalogType(String catalogType) {
        this.catalogType = catalogType;
        return this;
    }

    /**
     * Indicates if the catalog is a product, service or resource catalog
     *
     * @return catalogType
     */

    @Schema(name = "catalogType", description = "Indicates if the catalog is a product, service or resource catalog", required = false)
    public String getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(String catalogType) {
        this.catalogType = catalogType;
    }

    public Catalog description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of this catalog
     *
     * @return description
     */

    @Schema(name = "description", description = "Description of this catalog", required = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Catalog lastUpdate(OffsetDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    /**
     * Date and time of the last update
     *
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

    public Catalog lifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
        return this;
    }

    /**
     * Used to indicate the current lifecycle status
     *
     * @return lifecycleStatus
     */

    @Schema(name = "lifecycleStatus", description = "Used to indicate the current lifecycle status", required = false)
    public String getLifecycleStatus() {
        return lifecycleStatus;
    }

    public void setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
    }

    public Catalog name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the catalog
     *
     * @return name
     */

    @Schema(name = "name", description = "Name of the catalog", required = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Catalog version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Catalog version
     *
     * @return version
     */

    @Schema(name = "version", description = "Catalog version", required = false)
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Catalog category(List<CategoryRef> category) {
        this.category = category;
        return this;
    }

    public Catalog addCategoryItem(CategoryRef categoryItem) {
        if (this.category == null) {
            this.category = new ArrayList<>();
        }
        this.category.add(categoryItem);
        return this;
    }

    /**
     * List of root categories contained in this catalog
     *
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

    public Catalog relatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
        return this;
    }

    public Catalog addRelatedPartyItem(RelatedParty relatedPartyItem) {
        if (this.relatedParty == null) {
            this.relatedParty = new ArrayList<>();
        }
        this.relatedParty.add(relatedPartyItem);
        return this;
    }

    /**
     * List of parties involved in this catalog
     *
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

    public Catalog validFor(TimePeriod validFor) {
        this.validFor = validFor;
        return this;
    }

    /**
     * Get validFor
     *
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

    public Catalog atBaseType(String atBaseType) {
        this.atBaseType = atBaseType;
        return this;
    }

    /**
     * When sub-classing, this defines the super-class
     *
     * @return atBaseType
     */

    @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", required = false)
    public String getAtBaseType() {
        return atBaseType;
    }

    public void setAtBaseType(String atBaseType) {
        this.atBaseType = atBaseType;
    }

    public Catalog atSchemaLocation(URI atSchemaLocation) {
        this.atSchemaLocation = atSchemaLocation;
        return this;
    }

    /**
     * A URI to a JSON-Schema file that defines additional attributes and relationships
     *
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

    public Catalog atType(String atType) {
        this.atType = atType;
        return this;
    }

    /**
     * When sub-classing, this defines the sub-class Extensible name
     *
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
        Catalog catalog = (Catalog) o;
        return Objects.equals(this.id, catalog.id) &&
                Objects.equals(this.href, catalog.href) &&
                Objects.equals(this.catalogType, catalog.catalogType) &&
                Objects.equals(this.description, catalog.description) &&
                Objects.equals(this.lastUpdate, catalog.lastUpdate) &&
                Objects.equals(this.lifecycleStatus, catalog.lifecycleStatus) &&
                Objects.equals(this.name, catalog.name) &&
                Objects.equals(this.version, catalog.version) &&
                Objects.equals(this.category, catalog.category) &&
                Objects.equals(this.relatedParty, catalog.relatedParty) &&
                Objects.equals(this.validFor, catalog.validFor) &&
                Objects.equals(this.atBaseType, catalog.atBaseType) &&
                Objects.equals(this.atSchemaLocation, catalog.atSchemaLocation) &&
                Objects.equals(this.atType, catalog.atType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, href, catalogType, description, lastUpdate, lifecycleStatus, name, version, category, relatedParty, validFor, atBaseType, atSchemaLocation, atType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Catalog {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
        sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

