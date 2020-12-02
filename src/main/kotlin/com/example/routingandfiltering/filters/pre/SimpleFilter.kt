package com.example.routingandfiltering.filters.pre

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.servlet.http.HttpServletRequest

class SimpleFilter: ZuulFilter() {

    private val log: Logger = LoggerFactory.getLogger(SimpleFilter::class.java)

    override fun filterType(): String {
        return "pre"
    }

    override fun filterOrder(): Int {
        return 1
    }

    override fun shouldFilter(): Boolean {
        return true
    }

    override fun run(): Any? {
        val ctx: RequestContext = RequestContext.getCurrentContext()
        val request: HttpServletRequest = ctx.request
        log.info(("${request.getMethod()} request to ${request.getRequestURL().toString()}"))

        return null
    }


}