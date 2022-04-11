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
 * Represents a task used to export resources to a file Skipped properties: id,href
 */

@Schema(name = "ExportJob_Create", description = "Represents a task used to export resources to a file Skipped properties: id,href")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class ExportJobCreate   {

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

  @JsonProperty("query")
  private String query;

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

  public ExportJobCreate completionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Data at which the job was completed
   * @return completionDate
  */
  @Valid 
  @Schema(name = "completionDate", description = "Data at which the job was completed", required = false)
  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }

  public ExportJobCreate contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * The format of the exported data
   * @return contentType
  */
  
  @Schema(name = "contentType", description = "The format of the exported data", required = false)
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public ExportJobCreate creationDate(OffsetDateTime creationDate) {
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

  public ExportJobCreate errorLog(String errorLog) {
    this.errorLog = errorLog;
    return this;
  }

  /**
   * Reason for failure
   * @return errorLog
  */
  
  @Schema(name = "errorLog", description = "Reason for failure", required = false)
  public String getErrorLog() {
    return errorLog;
  }

  public void setErrorLog(String errorLog) {
    this.errorLog = errorLog;
  }

  public ExportJobCreate path(String path) {
    this.path = path;
    return this;
  }

  /**
   * URL of the root resource acting as the source for streaming content to the file specified by the export job
   * @return path
  */
  
  @Schema(name = "path", description = "URL of the root resource acting as the source for streaming content to the file specified by the export job", required = false)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ExportJobCreate query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Used to scope the exported data
   * @return query
  */
  
  @Schema(name = "query", description = "Used to scope the exported data", required = false)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ExportJobCreate url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the file containing the data to be exported
   * @return url
  */
  @NotNull @Valid 
  @Schema(name = "url", description = "URL of the file containing the data to be exported", required = true)
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public ExportJobCreate status(JobStateType status) {
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

  public ExportJobCreate atBaseType(String atBaseType) {
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

  public ExportJobCreate atSchemaLocation(URI atSchemaLocation) {
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

  public ExportJobCreate atType(String atType) {
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
    ExportJobCreate exportJobCreate = (ExportJobCreate) o;
    return Objects.equals(this.completionDate, exportJobCreate.completionDate) &&
        Objects.equals(this.contentType, exportJobCreate.contentType) &&
        Objects.equals(this.creationDate, exportJobCreate.creationDate) &&
        Objects.equals(this.errorLog, exportJobCreate.errorLog) &&
        Objects.equals(this.path, exportJobCreate.path) &&
        Objects.equals(this.query, exportJobCreate.query) &&
        Objects.equals(this.url, exportJobCreate.url) &&
        Objects.equals(this.status, exportJobCreate.status) &&
        Objects.equals(this.atBaseType, exportJobCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, exportJobCreate.atSchemaLocation) &&
        Objects.equals(this.atType, exportJobCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionDate, contentType, creationDate, errorLog, path, query, url, status, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportJobCreate {\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

