package com.modzo.codenarc

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.ResponseEntity
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import static org.springframework.http.HttpStatus.OK

@ContextConfiguration
@SpringBootTest(webEnvironment = RANDOM_PORT)
class CodenarcApplicationTests extends Specification {

    @Autowired
    TestRestTemplate restTemplate

    void 'should load application context'() {
        when:
            ResponseEntity<String> response = restTemplate.getForEntity('/', String)
        then:
            response.statusCode == OK
            response.body == 'Index page'
    }

}
