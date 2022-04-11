package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.model.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A relationship between two product Offerings.
 */

@Schema(name = "ProductOfferingRelationship", description = "A relationship between two product Offerings.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class ProductOfferingRelationship   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("href")
  private URI href;

  @JsonProperty("name")
  private String name;

  @JsonProperty("relationshipType")
  private String relationshipType;

  @JsonProperty("role")
  private String role;

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

  public ProductOfferingRelationship id(String id) {
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

  public ProductOfferingRelationship href(URI href) {
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

  public ProductOfferingRelationship name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the related entity.
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the related entity.", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductOfferingRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of relationship between product offerings such as requires, exchangableTo, optionalFor
   * @return relationshipType
  */
  
  @Schema(name = "relationshipType", description = "Type of relationship between product offerings such as requires, exchangableTo, optionalFor", required = false)
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public ProductOfferingRelationship role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The association role for the source product offering
   * @return role
  */
  
  @Schema(name = "role", description = "The association role for the source product offering", required = false)
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public ProductOfferingRelationship validFor(TimePeriod validFor) {
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

  public ProductOfferingRelationship atBaseType(String atBaseType) {
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

  public ProductOfferingRelationship atSchemaLocation(URI atSchemaLocation) {
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

  public ProductOfferingRelationship atType(String atType) {
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

  public ProductOfferingRelationship atReferredType(String atReferredType) {
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
    ProductOfferingRelationship productOfferingRelationship = (ProductOfferingRelationship) o;
    return Objects.equals(this.id, productOfferingRelationship.id) &&
        Objects.equals(this.href, productOfferingRelationship.href) &&
        Objects.equals(this.name, productOfferingRelationship.name) &&
        Objects.equals(this.relationshipType, productOfferingRelationship.relationshipType) &&
        Objects.equals(this.role, productOfferingRelationship.role) &&
        Objects.equals(this.validFor, productOfferingRelationship.validFor) &&
        Objects.equals(this.atBaseType, productOfferingRelationship.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productOfferingRelationship.atSchemaLocation) &&
        Objects.equals(this.atType, productOfferingRelationship.atType) &&
        Objects.equals(this.atReferredType, productOfferingRelationship.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, relationshipType, role, validFor, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingRelationship {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

