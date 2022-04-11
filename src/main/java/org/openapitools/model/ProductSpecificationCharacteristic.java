package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CharacteristicValueSpecification;
import org.openapitools.model.ProductSpecificationCharacteristicRelationship;
import org.openapitools.model.TimePeriod;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) &#x3D; 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.
 */

@Schema(name = "ProductSpecificationCharacteristic", description = "A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class ProductSpecificationCharacteristic   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("configurable")
  private Boolean configurable;

  @JsonProperty("description")
  private String description;

  @JsonProperty("extensible")
  private Boolean extensible;

  @JsonProperty("isUnique")
  private Boolean isUnique;

  @JsonProperty("maxCardinality")
  private Integer maxCardinality;

  @JsonProperty("minCardinality")
  private Integer minCardinality;

  @JsonProperty("name")
  private String name;

  @JsonProperty("regex")
  private String regex;

  @JsonProperty("valueType")
  private String valueType;

  @JsonProperty("productSpecCharRelationship")
  @Valid
  private List<ProductSpecificationCharacteristicRelationship> productSpecCharRelationship = null;

  @JsonProperty("productSpecCharacteristicValue")
  @Valid
  private List<CharacteristicValueSpecification> productSpecCharacteristicValue = null;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  @JsonProperty("@valueSchemaLocation")
  private String atValueSchemaLocation;

  public ProductSpecificationCharacteristic id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID for the characteristic
   * @return id
  */
  
  @Schema(name = "id", description = "Unique ID for the characteristic", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductSpecificationCharacteristic configurable(Boolean configurable) {
    this.configurable = configurable;
    return this;
  }

  /**
   * If true, the Boolean indicates that the target Characteristic is configurable
   * @return configurable
  */
  
  @Schema(name = "configurable", description = "If true, the Boolean indicates that the target Characteristic is configurable", required = false)
  public Boolean getConfigurable() {
    return configurable;
  }

  public void setConfigurable(Boolean configurable) {
    this.configurable = configurable;
  }

  public ProductSpecificationCharacteristic description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains the CharacteristicSpecification.
   * @return description
  */
  
  @Schema(name = "description", description = "A narrative that explains the CharacteristicSpecification.", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductSpecificationCharacteristic extensible(Boolean extensible) {
    this.extensible = extensible;
    return this;
  }

  /**
   * An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.
   * @return extensible
  */
  
  @Schema(name = "extensible", description = "An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.", required = false)
  public Boolean getExtensible() {
    return extensible;
  }

  public void setExtensible(Boolean extensible) {
    this.extensible = extensible;
  }

  public ProductSpecificationCharacteristic isUnique(Boolean isUnique) {
    this.isUnique = isUnique;
    return this;
  }

  /**
   * An indicator that specifies if a value is unique for the specification. Possible values are; \"unique while value is in effect\" and \"unique whether value is in effect or not\"
   * @return isUnique
  */
  
  @Schema(name = "isUnique", description = "An indicator that specifies if a value is unique for the specification. Possible values are; \"unique while value is in effect\" and \"unique whether value is in effect or not\"", required = false)
  public Boolean getIsUnique() {
    return isUnique;
  }

  public void setIsUnique(Boolean isUnique) {
    this.isUnique = isUnique;
  }

  public ProductSpecificationCharacteristic maxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
    return this;
  }

  /**
   * The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.
   * @return maxCardinality
  */
  
  @Schema(name = "maxCardinality", description = "The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.", required = false)
  public Integer getMaxCardinality() {
    return maxCardinality;
  }

  public void setMaxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
  }

  public ProductSpecificationCharacteristic minCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
    return this;
  }

  /**
   * The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.
   * @return minCardinality
  */
  
  @Schema(name = "minCardinality", description = "The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.", required = false)
  public Integer getMinCardinality() {
    return minCardinality;
  }

  public void setMinCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
  }

  public ProductSpecificationCharacteristic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.
   * @return name
  */
  
  @Schema(name = "name", description = "A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductSpecificationCharacteristic regex(String regex) {
    this.regex = regex;
    return this;
  }

  /**
   * A rule or principle represented in regular expression used to derive the value of a characteristic value.
   * @return regex
  */
  
  @Schema(name = "regex", description = "A rule or principle represented in regular expression used to derive the value of a characteristic value.", required = false)
  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public ProductSpecificationCharacteristic valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * A kind of value that the characteristic can take on, such as numeric, text and so forth
   * @return valueType
  */
  
  @Schema(name = "valueType", description = "A kind of value that the characteristic can take on, such as numeric, text and so forth", required = false)
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public ProductSpecificationCharacteristic productSpecCharRelationship(List<ProductSpecificationCharacteristicRelationship> productSpecCharRelationship) {
    this.productSpecCharRelationship = productSpecCharRelationship;
    return this;
  }

  public ProductSpecificationCharacteristic addProductSpecCharRelationshipItem(ProductSpecificationCharacteristicRelationship productSpecCharRelationshipItem) {
    if (this.productSpecCharRelationship == null) {
      this.productSpecCharRelationship = new ArrayList<>();
    }
    this.productSpecCharRelationship.add(productSpecCharRelationshipItem);
    return this;
  }

  /**
   * An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.
   * @return productSpecCharRelationship
  */
  @Valid 
  @Schema(name = "productSpecCharRelationship", description = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.", required = false)
  public List<ProductSpecificationCharacteristicRelationship> getProductSpecCharRelationship() {
    return productSpecCharRelationship;
  }

  public void setProductSpecCharRelationship(List<ProductSpecificationCharacteristicRelationship> productSpecCharRelationship) {
    this.productSpecCharRelationship = productSpecCharRelationship;
  }

  public ProductSpecificationCharacteristic productSpecCharacteristicValue(List<CharacteristicValueSpecification> productSpecCharacteristicValue) {
    this.productSpecCharacteristicValue = productSpecCharacteristicValue;
    return this;
  }

  public ProductSpecificationCharacteristic addProductSpecCharacteristicValueItem(CharacteristicValueSpecification productSpecCharacteristicValueItem) {
    if (this.productSpecCharacteristicValue == null) {
      this.productSpecCharacteristicValue = new ArrayList<>();
    }
    this.productSpecCharacteristicValue.add(productSpecCharacteristicValueItem);
    return this;
  }

  /**
   * A ProductSpecificationCharacteristicValue object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a ProductSpecificationCharacteristic object. The values of the attributes in the ProductSpecificationCharacteristicValue object describe the values of the attributes that a corresponding ProductSpecificationCharacteristic object can take on.
   * @return productSpecCharacteristicValue
  */
  @Valid 
  @Schema(name = "productSpecCharacteristicValue", description = "A ProductSpecificationCharacteristicValue object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a ProductSpecificationCharacteristic object. The values of the attributes in the ProductSpecificationCharacteristicValue object describe the values of the attributes that a corresponding ProductSpecificationCharacteristic object can take on.", required = false)
  public List<CharacteristicValueSpecification> getProductSpecCharacteristicValue() {
    return productSpecCharacteristicValue;
  }

  public void setProductSpecCharacteristicValue(List<CharacteristicValueSpecification> productSpecCharacteristicValue) {
    this.productSpecCharacteristicValue = productSpecCharacteristicValue;
  }

  public ProductSpecificationCharacteristic validFor(TimePeriod validFor) {
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

  public ProductSpecificationCharacteristic atBaseType(String atBaseType) {
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

  public ProductSpecificationCharacteristic atSchemaLocation(URI atSchemaLocation) {
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

  public ProductSpecificationCharacteristic atType(String atType) {
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

  public ProductSpecificationCharacteristic atValueSchemaLocation(String atValueSchemaLocation) {
    this.atValueSchemaLocation = atValueSchemaLocation;
    return this;
  }

  /**
   * This (optional) field provides a link to the schema describing the value type.
   * @return atValueSchemaLocation
  */
  
  @Schema(name = "@valueSchemaLocation", description = "This (optional) field provides a link to the schema describing the value type.", required = false)
  public String getAtValueSchemaLocation() {
    return atValueSchemaLocation;
  }

  public void setAtValueSchemaLocation(String atValueSchemaLocation) {
    this.atValueSchemaLocation = atValueSchemaLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecificationCharacteristic productSpecificationCharacteristic = (ProductSpecificationCharacteristic) o;
    return Objects.equals(this.id, productSpecificationCharacteristic.id) &&
        Objects.equals(this.configurable, productSpecificationCharacteristic.configurable) &&
        Objects.equals(this.description, productSpecificationCharacteristic.description) &&
        Objects.equals(this.extensible, productSpecificationCharacteristic.extensible) &&
        Objects.equals(this.isUnique, productSpecificationCharacteristic.isUnique) &&
        Objects.equals(this.maxCardinality, productSpecificationCharacteristic.maxCardinality) &&
        Objects.equals(this.minCardinality, productSpecificationCharacteristic.minCardinality) &&
        Objects.equals(this.name, productSpecificationCharacteristic.name) &&
        Objects.equals(this.regex, productSpecificationCharacteristic.regex) &&
        Objects.equals(this.valueType, productSpecificationCharacteristic.valueType) &&
        Objects.equals(this.productSpecCharRelationship, productSpecificationCharacteristic.productSpecCharRelationship) &&
        Objects.equals(this.productSpecCharacteristicValue, productSpecificationCharacteristic.productSpecCharacteristicValue) &&
        Objects.equals(this.validFor, productSpecificationCharacteristic.validFor) &&
        Objects.equals(this.atBaseType, productSpecificationCharacteristic.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productSpecificationCharacteristic.atSchemaLocation) &&
        Objects.equals(this.atType, productSpecificationCharacteristic.atType) &&
        Objects.equals(this.atValueSchemaLocation, productSpecificationCharacteristic.atValueSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configurable, description, extensible, isUnique, maxCardinality, minCardinality, name, regex, valueType, productSpecCharRelationship, productSpecCharacteristicValue, validFor, atBaseType, atSchemaLocation, atType, atValueSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationCharacteristic {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extensible: ").append(toIndentedString(extensible)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    maxCardinality: ").append(toIndentedString(maxCardinality)).append("\n");
    sb.append("    minCardinality: ").append(toIndentedString(minCardinality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    productSpecCharRelationship: ").append(toIndentedString(productSpecCharRelationship)).append("\n");
    sb.append("    productSpecCharacteristicValue: ").append(toIndentedString(productSpecCharacteristicValue)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atValueSchemaLocation: ").append(toIndentedString(atValueSchemaLocation)).append("\n");
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

