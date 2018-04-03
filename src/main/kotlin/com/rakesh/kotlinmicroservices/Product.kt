package com.rakesh.kotlinmicroservices

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Product(
        val name: String ="",
        val category: String="",
        val price : Int=0,
        @Id @GeneratedValue
        val id: Long = -1)