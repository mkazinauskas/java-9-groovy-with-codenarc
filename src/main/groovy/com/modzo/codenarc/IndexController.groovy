package com.modzo.codenarc

import groovy.transform.CompileStatic
import groovy.transform.PackageScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@PackageScope
@CompileStatic
class IndexController {

    @GetMapping('/')
    String index() {
        'Index page'
    }
}
