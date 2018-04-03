package com.rakesh.kotlinmicroservices

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(private val repository: ProductRepository) {

    @GetMapping("/products")
    fun findAll() = repository.findAll()

    @GetMapping("/products/{name}")
    fun findByName(@PathVariable name:String) = repository.findByName(name)
}