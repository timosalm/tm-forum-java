package com.vodafone;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ConditionalOnProperty(name = "database", havingValue = "mongo")
@EnableMongoRepositories({"com.vodafone"})
public class MongoRepositoryConfiguration {
}
