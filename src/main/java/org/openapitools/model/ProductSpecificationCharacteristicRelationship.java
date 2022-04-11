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
 * An aggregation, migration, substitution, dependency or exclusivity relationship between/among productSpecificationCharacteristics.
 */

@Schema(name = "ProductSpecificationCharacteristicRelationship", description = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among productSpecificationCharacteristics.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class ProductSpecificationCharacteristicRelationship   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("href")
  private String href;

  @JsonProperty("charSpecSeq")
  private Integer charSpecSeq;

  @JsonProperty("name")
  private String name;

  @JsonProperty("relationshipType")
  private String relationshipType;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public ProductSpecificationCharacteristicRelationship id(String id) {
    this.id = id;
    return this;
  }

  /**
   * the identifier of the associated product specification
   * @return id
  */
  
  @Schema(name = "id", description = "the identifier of the associated product specification", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductSpecificationCharacteristicRelationship href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference to the target product specification
   * @return href
  */
  
  @Schema(name = "href", description = "Hyperlink reference to the target product specification", required = false)
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductSpecificationCharacteristicRelationship charSpecSeq(Integer charSpecSeq) {
    this.charSpecSeq = charSpecSeq;
    return this;
  }

  /**
   * The order in which a CharacteristicSpecification appears within another CharacteristicSpecification that defines a grouping of CharacteristicSpecifications.  For example, a grouping may represent the name of an individual. The given name is first, the middle name is second, and the last name is third.
   * @return charSpecSeq
  */
  
  @Schema(name = "charSpecSeq", description = "The order in which a CharacteristicSpecification appears within another CharacteristicSpecification that defines a grouping of CharacteristicSpecifications.  For example, a grouping may represent the name of an individual. The given name is first, the middle name is second, and the last name is third.", required = false)
  public Integer getCharSpecSeq() {
    return charSpecSeq;
  }

  public void setCharSpecSeq(Integer charSpecSeq) {
    this.charSpecSeq = charSpecSeq;
  }

  public ProductSpecificationCharacteristicRelationship name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the target product specification characteristic
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the target product specification characteristic", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductSpecificationCharacteristicRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of relationship such as aggregation, migration, substitution, dependency, exclusivity
   * @return relationshipType
  */
  
  @Schema(name = "relationshipType", description = "Type of relationship such as aggregation, migration, substitution, dependency, exclusivity", required = false)
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public ProductSpecificationCharacteristicRelationship validFor(TimePeriod validFor) {
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

  public ProductSpecificationCharacteristicRelationship atBaseType(String atBaseType) {
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

  public ProductSpecificationCharacteristicRelationship atSchemaLocation(URI atSchemaLocation) {
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

  public ProductSpecificationCharacteristicRelationship atType(String atType) {
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
    ProductSpecificationCharacteristicRelationship productSpecificationCharacteristicRelationship = (ProductSpecificationCharacteristicRelationship) o;
    return Objects.equals(this.id, productSpecificationCharacteristicRelationship.id) &&
        Objects.equals(this.href, productSpecificationCharacteristicRelationship.href) &&
        Objects.equals(this.charSpecSeq, productSpecificationCharacteristicRelationship.charSpecSeq) &&
        Objects.equals(this.name, productSpecificationCharacteristicRelationship.name) &&
        Objects.equals(this.relationshipType, productSpecificationCharacteristicRelationship.relationshipType) &&
        Objects.equals(this.validFor, productSpecificationCharacteristicRelationship.validFor) &&
        Objects.equals(this.atBaseType, productSpecificationCharacteristicRelationship.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productSpecificationCharacteristicRelationship.atSchemaLocation) &&
        Objects.equals(this.atType, productSpecificationCharacteristicRelationship.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, charSpecSeq, name, relationshipType, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationCharacteristicRelationship {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    charSpecSeq: ").append(toIndentedString(charSpecSeq)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
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

