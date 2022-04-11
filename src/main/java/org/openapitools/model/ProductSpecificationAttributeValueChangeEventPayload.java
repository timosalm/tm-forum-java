package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ProductSpecification;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The event data structure
 */

@Schema(name = "ProductSpecificationAttributeValueChangeEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class ProductSpecificationAttributeValueChangeEventPayload   {

  @JsonProperty("productSpecification")
  private ProductSpecification productSpecification;

  public ProductSpecificationAttributeValueChangeEventPayload productSpecification(ProductSpecification productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

  /**
   * Get productSpecification
   * @return productSpecification
  */
  @Valid 
  @Schema(name = "productSpecification", required = false)
  public ProductSpecification getProductSpecification() {
    return productSpecification;
  }

  public void setProductSpecification(ProductSpecification productSpecification) {
    this.productSpecification = productSpecification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecificationAttributeValueChangeEventPayload productSpecificationAttributeValueChangeEventPayload = (ProductSpecificationAttributeValueChangeEventPayload) o;
    return Objects.equals(this.productSpecification, productSpecificationAttributeValueChangeEventPayload.productSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationAttributeValueChangeEventPayload {\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
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

