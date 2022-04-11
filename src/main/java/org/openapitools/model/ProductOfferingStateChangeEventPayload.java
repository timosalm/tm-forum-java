package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ProductOffering;
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

@Schema(name = "ProductOfferingStateChangeEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class ProductOfferingStateChangeEventPayload   {

  @JsonProperty("productOffering")
  private ProductOffering productOffering;

  public ProductOfferingStateChangeEventPayload productOffering(ProductOffering productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  /**
   * Get productOffering
   * @return productOffering
  */
  @Valid 
  @Schema(name = "productOffering", required = false)
  public ProductOffering getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOffering productOffering) {
    this.productOffering = productOffering;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingStateChangeEventPayload productOfferingStateChangeEventPayload = (ProductOfferingStateChangeEventPayload) o;
    return Objects.equals(this.productOffering, productOfferingStateChangeEventPayload.productOffering);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productOffering);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingStateChangeEventPayload {\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
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

