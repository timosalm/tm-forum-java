package com.vodafone;

import org.openapitools.model.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoCatalogRepository extends MongoRepository<Catalog, String> {
}
