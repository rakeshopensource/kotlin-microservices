package com.rakesh.kotlinmicroservices


import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class Application {

    @Bean
    fun init(productRepository: ProductRepository) = CommandLineRunner {
        productRepository.save(Product("iPhone", "Mobile",60000))
        productRepository.save(Product("Chair", "Furniture",4000))
        productRepository.save(Product("Oven", "Electronics",9000))
    }




}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}



