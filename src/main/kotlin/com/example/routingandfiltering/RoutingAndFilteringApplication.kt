package com.example.routingandfiltering

import com.example.routingandfiltering.filters.pre.SimpleFilter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Bean

@EnableZuulProxy
@SpringBootApplication
class RoutingAndFilteringApplication{

	@Bean
	fun simpleFilter() = SimpleFilter()
}

fun main(args: Array<String>) {
	runApplication<RoutingAndFilteringApplication>(*args)
}
