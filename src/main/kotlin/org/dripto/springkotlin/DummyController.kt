package org.dripto.springkotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class DummyController {
    @GetMapping("/{name}")
    fun hello(@PathVariable("name") name: String) = "Hello $name"
}
