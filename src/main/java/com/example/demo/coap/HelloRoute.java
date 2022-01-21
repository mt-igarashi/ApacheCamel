package com.example.demo.coap;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute extends RouteBuilder {

    @Autowired
    private HelloProcessor processor;

    @Override
    public void configure() throws Exception {

        from("coap://localhost:5683/hello")
        .process(processor);
    }

}