package com.example.demo.coap;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class HelloProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Thread.sleep(500);
        exchange.getIn().setBody("hello");
    }

}