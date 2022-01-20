package com.example.demo.coap;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        Thread.sleep(500);
        from("coap://localhost:5683/hello")
        .setBody(simple("hello"));
    }

}