package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The reference object to the schema and type of target product which is described by product specification
 */

@Schema(name = "TargetProductSchema", description = "The reference object to the schema and type of target product which is described by product specification")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class TargetProductSchema   {

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public TargetProductSchema atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * This field provides a link to the schema describing the target product
   * @return atSchemaLocation
  */
  @NotNull @Valid 
  @Schema(name = "@schemaLocation", description = "This field provides a link to the schema describing the target product", required = true)
  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public TargetProductSchema atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Class type of the target product
   * @return atType
  */
  @NotNull 
  @Schema(name = "@type", description = "Class type of the target product", required = true)
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
    TargetProductSchema targetProductSchema = (TargetProductSchema) o;
    return Objects.equals(this.atSchemaLocation, targetProductSchema.atSchemaLocation) &&
        Objects.equals(this.atType, targetProductSchema.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetProductSchema {\n");
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

