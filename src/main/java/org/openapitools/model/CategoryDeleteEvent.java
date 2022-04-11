package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.CategoryDeleteEventPayload;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The notification data structure
 */

@Schema(name = "CategoryDeleteEvent", description = "The notification data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class CategoryDeleteEvent   {

  @JsonProperty("event")
  private CategoryDeleteEventPayload event;

  @JsonProperty("eventId")
  private String eventId;

  @JsonProperty("eventTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventTime;

  @JsonProperty("eventType")
  private String eventType;

  @JsonProperty("correlationId")
  private String correlationId;

  @JsonProperty("domain")
  private String domain;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("priority")
  private String priority;

  @JsonProperty("timeOcurred")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timeOcurred;

  public CategoryDeleteEvent event(CategoryDeleteEventPayload event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  */
  @Valid 
  @Schema(name = "event", required = false)
  public CategoryDeleteEventPayload getEvent() {
    return event;
  }

  public void setEvent(CategoryDeleteEventPayload event) {
    this.event = event;
  }

  public CategoryDeleteEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The identifier of the notification.
   * @return eventId
  */
  
  @Schema(name = "eventId", description = "The identifier of the notification.", required = false)
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public CategoryDeleteEvent eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time of the event occurrence.
   * @return eventTime
  */
  @Valid 
  @Schema(name = "eventTime", description = "Time of the event occurrence.", required = false)
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public CategoryDeleteEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the notification.
   * @return eventType
  */
  
  @Schema(name = "eventType", description = "The type of the notification.", required = false)
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public CategoryDeleteEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * The correlation id for this event.
   * @return correlationId
  */
  
  @Schema(name = "correlationId", description = "The correlation id for this event.", required = false)
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public CategoryDeleteEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain of the event.
   * @return domain
  */
  
  @Schema(name = "domain", description = "The domain of the event.", required = false)
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public CategoryDeleteEvent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the event.
   * @return title
  */
  
  @Schema(name = "title", description = "The title of the event.", required = false)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CategoryDeleteEvent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explnatory of the event.
   * @return description
  */
  
  @Schema(name = "description", description = "An explnatory of the event.", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CategoryDeleteEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A priority.
   * @return priority
  */
  
  @Schema(name = "priority", description = "A priority.", required = false)
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public CategoryDeleteEvent timeOcurred(OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

  /**
   * The time the event occured.
   * @return timeOcurred
  */
  @Valid 
  @Schema(name = "timeOcurred", description = "The time the event occured.", required = false)
  public OffsetDateTime getTimeOcurred() {
    return timeOcurred;
  }

  public void setTimeOcurred(OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryDeleteEvent categoryDeleteEvent = (CategoryDeleteEvent) o;
    return Objects.equals(this.event, categoryDeleteEvent.event) &&
        Objects.equals(this.eventId, categoryDeleteEvent.eventId) &&
        Objects.equals(this.eventTime, categoryDeleteEvent.eventTime) &&
        Objects.equals(this.eventType, categoryDeleteEvent.eventType) &&
        Objects.equals(this.correlationId, categoryDeleteEvent.correlationId) &&
        Objects.equals(this.domain, categoryDeleteEvent.domain) &&
        Objects.equals(this.title, categoryDeleteEvent.title) &&
        Objects.equals(this.description, categoryDeleteEvent.description) &&
        Objects.equals(this.priority, categoryDeleteEvent.priority) &&
        Objects.equals(this.timeOcurred, categoryDeleteEvent.timeOcurred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryDeleteEvent {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
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

