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
 * specification of a value (number or text or an object) that can be assigned to a Characteristic.
 */

@Schema(name = "CharacteristicValueSpecification", description = "specification of a value (number or text or an object) that can be assigned to a Characteristic.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class CharacteristicValueSpecification   {

  @JsonProperty("isDefault")
  private Boolean isDefault;

  @JsonProperty("rangeInterval")
  private String rangeInterval;

  @JsonProperty("regex")
  private String regex;

  @JsonProperty("unitOfMeasure")
  private String unitOfMeasure;

  @JsonProperty("valueFrom")
  private Integer valueFrom;

  @JsonProperty("valueTo")
  private Integer valueTo;

  @JsonProperty("valueType")
  private String valueType;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("value")
  private Object value;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public CharacteristicValueSpecification isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * If true, the Boolean Indicates if the value is the default value for a characteristic
   * @return isDefault
  */
  
  @Schema(name = "isDefault", description = "If true, the Boolean Indicates if the value is the default value for a characteristic", required = false)
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public CharacteristicValueSpecification rangeInterval(String rangeInterval) {
    this.rangeInterval = rangeInterval;
    return this;
  }

  /**
   * An indicator that specifies the inclusion or exclusion of the valueFrom and valueTo attributes. If applicable, possible values are \"open\", \"closed\", \"closedBottom\" and \"closedTop\".
   * @return rangeInterval
  */
  
  @Schema(name = "rangeInterval", description = "An indicator that specifies the inclusion or exclusion of the valueFrom and valueTo attributes. If applicable, possible values are \"open\", \"closed\", \"closedBottom\" and \"closedTop\".", required = false)
  public String getRangeInterval() {
    return rangeInterval;
  }

  public void setRangeInterval(String rangeInterval) {
    this.rangeInterval = rangeInterval;
  }

  public CharacteristicValueSpecification regex(String regex) {
    this.regex = regex;
    return this;
  }

  /**
   * A regular expression constraint for given value
   * @return regex
  */
  
  @Schema(name = "regex", description = "A regular expression constraint for given value", required = false)
  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public CharacteristicValueSpecification unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * A length, surface, volume, dry measure, liquid measure, money, weight, time, and the like. In general, a determinate quantity or magnitude of the kind designated, taken as a standard of comparison for others of the same kind, in assigning to them numerical values, as 1 foot, 1 yard, 1 mile, 1 square foot.
   * @return unitOfMeasure
  */
  
  @Schema(name = "unitOfMeasure", description = "A length, surface, volume, dry measure, liquid measure, money, weight, time, and the like. In general, a determinate quantity or magnitude of the kind designated, taken as a standard of comparison for others of the same kind, in assigning to them numerical values, as 1 foot, 1 yard, 1 mile, 1 square foot.", required = false)
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public CharacteristicValueSpecification valueFrom(Integer valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

  /**
   * The low range value that a characteristic can take on
   * @return valueFrom
  */
  
  @Schema(name = "valueFrom", description = "The low range value that a characteristic can take on", required = false)
  public Integer getValueFrom() {
    return valueFrom;
  }

  public void setValueFrom(Integer valueFrom) {
    this.valueFrom = valueFrom;
  }

  public CharacteristicValueSpecification valueTo(Integer valueTo) {
    this.valueTo = valueTo;
    return this;
  }

  /**
   * The upper range value that a characteristic can take on
   * @return valueTo
  */
  
  @Schema(name = "valueTo", description = "The upper range value that a characteristic can take on", required = false)
  public Integer getValueTo() {
    return valueTo;
  }

  public void setValueTo(Integer valueTo) {
    this.valueTo = valueTo;
  }

  public CharacteristicValueSpecification valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * A kind of value that the characteristic value can take on, such as numeric, text and so forth
   * @return valueType
  */
  
  @Schema(name = "valueType", description = "A kind of value that the characteristic value can take on, such as numeric, text and so forth", required = false)
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public CharacteristicValueSpecification validFor(TimePeriod validFor) {
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

  public CharacteristicValueSpecification value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", required = false)
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public CharacteristicValueSpecification atBaseType(String atBaseType) {
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

  public CharacteristicValueSpecification atSchemaLocation(URI atSchemaLocation) {
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

  public CharacteristicValueSpecification atType(String atType) {
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
    CharacteristicValueSpecification characteristicValueSpecification = (CharacteristicValueSpecification) o;
    return Objects.equals(this.isDefault, characteristicValueSpecification.isDefault) &&
        Objects.equals(this.rangeInterval, characteristicValueSpecification.rangeInterval) &&
        Objects.equals(this.regex, characteristicValueSpecification.regex) &&
        Objects.equals(this.unitOfMeasure, characteristicValueSpecification.unitOfMeasure) &&
        Objects.equals(this.valueFrom, characteristicValueSpecification.valueFrom) &&
        Objects.equals(this.valueTo, characteristicValueSpecification.valueTo) &&
        Objects.equals(this.valueType, characteristicValueSpecification.valueType) &&
        Objects.equals(this.validFor, characteristicValueSpecification.validFor) &&
        Objects.equals(this.value, characteristicValueSpecification.value) &&
        Objects.equals(this.atBaseType, characteristicValueSpecification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, characteristicValueSpecification.atSchemaLocation) &&
        Objects.equals(this.atType, characteristicValueSpecification.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, rangeInterval, regex, unitOfMeasure, valueFrom, valueTo, valueType, validFor, value, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicValueSpecification {\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    rangeInterval: ").append(toIndentedString(rangeInterval)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
    sb.append("    valueTo: ").append(toIndentedString(valueTo)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

