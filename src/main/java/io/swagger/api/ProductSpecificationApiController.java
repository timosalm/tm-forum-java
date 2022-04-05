package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.ProductSpecification;
import io.swagger.model.ProductSpecificationCreate;
import io.swagger.model.ProductSpecificationUpdate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-09-28T13:08:23.907Z")

@Controller
public class ProductSpecificationApiController implements ProductSpecificationApi {

    private static final Logger log = LoggerFactory.getLogger(ProductSpecificationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductSpecificationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ProductSpecification> createProductSpecification(@ApiParam(value = "The ProductSpecification to be created" ,required=true )  @Valid @RequestBody ProductSpecificationCreate productSpecification) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductSpecification>(objectMapper.readValue("{}", ProductSpecification.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductSpecification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductSpecification>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteProductSpecification(@ApiParam(value = "Identifier of the ProductSpecification",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProductSpecification>> listProductSpecification(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProductSpecification>>(objectMapper.readValue("{}", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProductSpecification>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProductSpecification>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductSpecification> patchProductSpecification(@ApiParam(value = "Identifier of the ProductSpecification",required=true) @PathVariable("id") String id,@ApiParam(value = "The ProductSpecification to be updated" ,required=true )  @Valid @RequestBody ProductSpecificationUpdate productSpecification) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductSpecification>(objectMapper.readValue("{}", ProductSpecification.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductSpecification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductSpecification>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductSpecification> retrieveProductSpecification(@ApiParam(value = "Identifier of the ProductSpecification",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductSpecification>(objectMapper.readValue("{}", ProductSpecification.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductSpecification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductSpecification>(HttpStatus.NOT_IMPLEMENTED);
    }

}
