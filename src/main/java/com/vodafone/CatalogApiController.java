package com.vodafone;

import org.openapitools.model.Catalog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
@Controller
@RequestMapping("${openapi.productCatalogManagement.base-path:/tmf-api/productCatalogManagement/v4}")
public class CatalogApiController implements CatalogApi {

    private final NativeWebRequest request;
    private final CrudRepository<Catalog, String> repository;

    @Autowired
    public CatalogApiController(NativeWebRequest request, CrudRepository<Catalog, String> repository) {
        this.request = request;
        this.repository = repository;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public Optional<CrudRepository<Catalog, String>> getRepository() {
        return Optional.ofNullable(repository);
    }
}
