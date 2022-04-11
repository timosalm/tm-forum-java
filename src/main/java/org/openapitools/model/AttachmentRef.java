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
 * Attachment reference. An attachment complements the description of an element (for instance a product) through video, pictures
 */

@Schema(name = "AttachmentRef", description = "Attachment reference. An attachment complements the description of an element (for instance a product) through video, pictures")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class AttachmentRef   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("href")
  private URI href;

  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("url")
  private URI url;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  @JsonProperty("@referredType")
  private String atReferredType;

  public AttachmentRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique-Identifier for this attachment
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Unique-Identifier for this attachment", required = true)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AttachmentRef href(URI href) {
    this.href = href;
    return this;
  }

  /**
   * URL serving as reference for the attachment resource
   * @return href
  */
  @Valid 
  @Schema(name = "href", description = "URL serving as reference for the attachment resource", required = false)
  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }

  public AttachmentRef description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative text describing the content of the attachment
   * @return description
  */
  
  @Schema(name = "description", description = "A narrative text describing the content of the attachment", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AttachmentRef name(String name) {
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

  public AttachmentRef url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * Link to the attachment media/content
   * @return url
  */
  @Valid 
  @Schema(name = "url", description = "Link to the attachment media/content", required = false)
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public AttachmentRef atBaseType(String atBaseType) {
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

  public AttachmentRef atSchemaLocation(URI atSchemaLocation) {
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

  public AttachmentRef atType(String atType) {
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

  public AttachmentRef atReferredType(String atReferredType) {
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
    AttachmentRef attachmentRef = (AttachmentRef) o;
    return Objects.equals(this.id, attachmentRef.id) &&
        Objects.equals(this.href, attachmentRef.href) &&
        Objects.equals(this.description, attachmentRef.description) &&
        Objects.equals(this.name, attachmentRef.name) &&
        Objects.equals(this.url, attachmentRef.url) &&
        Objects.equals(this.atBaseType, attachmentRef.atBaseType) &&
        Objects.equals(this.atSchemaLocation, attachmentRef.atSchemaLocation) &&
        Objects.equals(this.atType, attachmentRef.atType) &&
        Objects.equals(this.atReferredType, attachmentRef.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, name, url, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentRef {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

