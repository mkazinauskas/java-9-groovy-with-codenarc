package com.modzo.codenarc

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT

@ContextConfiguration
@SpringBootTest(webEnvironment = RANDOM_PORT)
class CodenarcApplicationTests extends Specification {

    def 'should load application context'() {
        expect:
            true
    }

}
