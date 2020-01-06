package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.ComponentScan
import spock.lang.Specification

/**
 *
 * @date 2020-01-06
 * @author wangkang
 */
@SpringBootTest(classes = LoadContextTest.class)
@ComponentScan
class LoadContextTest extends Specification {

    @Autowired(required = false)
    private WebController webController

    def "when context is loaded then all expected beans are created"() {
        expect: "the WebController is created"
        webController
    }
}
