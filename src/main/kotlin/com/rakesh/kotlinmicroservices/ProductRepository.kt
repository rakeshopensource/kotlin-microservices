package com.rakesh.kotlinmicroservices

import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Long> {
    fun findByName(name: String): Iterable<Product>
}


