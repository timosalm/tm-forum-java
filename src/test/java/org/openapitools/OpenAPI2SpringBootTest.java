package org.openapitools;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableAutoConfiguration(exclude= JpaRepositoriesAutoConfiguration.class)
class OpenAPI2SpringBootTest {

    @Test
    void contextLoads() {
    }

}
