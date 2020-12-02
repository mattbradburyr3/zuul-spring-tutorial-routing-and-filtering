package com.example.routingandfiltering

import com.example.routingandfiltering.filters.pre.SimpleFilter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Bean

// Follows Routing and Filtering tutorial https://spring.io/guides/gs/routing-and-filtering/ but converts to kotlin + adds a second 'cars' server
// also requires the books and cars repos

@EnableZuulProxy
@SpringBootApplication
class RoutingAndFilteringApplication{

	@Bean
	fun simpleFilter() = SimpleFilter()
}

fun main(args: Array<String>) {
	runApplication<RoutingAndFilteringApplication>(*args)
}
