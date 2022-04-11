package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import org.openapitools.model.JobStateType;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a task used to import resources from a file
 */

@Schema(name = "ImportJob", description = "Represents a task used to import resources from a file")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class ImportJob   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("href")
  private URI href;

  @JsonProperty("completionDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completionDate;

  @JsonProperty("contentType")
  private String contentType;

  @JsonProperty("creationDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDate;

  @JsonProperty("errorLog")
  private String errorLog;

  @JsonProperty("path")
  private String path;

  @JsonProperty("url")
  private URI url;

  @JsonProperty("status")
  private JobStateType status;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public ImportJob id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the import job
   * @return id
  */
  
  @Schema(name = "id", description = "Identifier of the import job", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ImportJob href(URI href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the import job
   * @return href
  */
  @Valid 
  @Schema(name = "href", description = "Reference of the import job", required = false)
  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }

  public ImportJob completionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Date at which the job was completed
   * @return completionDate
  */
  @Valid 
  @Schema(name = "completionDate", description = "Date at which the job was completed", required = false)
  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }

  public ImportJob contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Indicates the format of the imported data
   * @return contentType
  */
  
  @Schema(name = "contentType", description = "Indicates the format of the imported data", required = false)
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public ImportJob creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date at which the job was created
   * @return creationDate
  */
  @Valid 
  @Schema(name = "creationDate", description = "Date at which the job was created", required = false)
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ImportJob errorLog(String errorLog) {
    this.errorLog = errorLog;
    return this;
  }

  /**
   * Reason for failure if status is failed
   * @return errorLog
  */
  
  @Schema(name = "errorLog", description = "Reason for failure if status is failed", required = false)
  public String getErrorLog() {
    return errorLog;
  }

  public void setErrorLog(String errorLog) {
    this.errorLog = errorLog;
  }

  public ImportJob path(String path) {
    this.path = path;
    return this;
  }

  /**
   * URL of the root resource where the content of the file specified by the import job must be applied
   * @return path
  */
  
  @Schema(name = "path", description = "URL of the root resource where the content of the file specified by the import job must be applied", required = false)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ImportJob url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the file containing the data to be imported
   * @return url
  */
  @Valid 
  @Schema(name = "url", description = "URL of the file containing the data to be imported", required = false)
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public ImportJob status(JobStateType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", required = false)
  public JobStateType getStatus() {
    return status;
  }

  public void setStatus(JobStateType status) {
    this.status = status;
  }

  public ImportJob atBaseType(String atBaseType) {
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

  public ImportJob atSchemaLocation(URI atSchemaLocation) {
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

  public ImportJob atType(String atType) {
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
    ImportJob importJob = (ImportJob) o;
    return Objects.equals(this.id, importJob.id) &&
        Objects.equals(this.href, importJob.href) &&
        Objects.equals(this.completionDate, importJob.completionDate) &&
        Objects.equals(this.contentType, importJob.contentType) &&
        Objects.equals(this.creationDate, importJob.creationDate) &&
        Objects.equals(this.errorLog, importJob.errorLog) &&
        Objects.equals(this.path, importJob.path) &&
        Objects.equals(this.url, importJob.url) &&
        Objects.equals(this.status, importJob.status) &&
        Objects.equals(this.atBaseType, importJob.atBaseType) &&
        Objects.equals(this.atSchemaLocation, importJob.atSchemaLocation) &&
        Objects.equals(this.atType, importJob.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, completionDate, contentType, creationDate, errorLog, path, url, status, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportJob {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

