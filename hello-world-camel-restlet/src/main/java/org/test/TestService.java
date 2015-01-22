package org.test;

import org.apache.camel.Exchange;


public class TestService {

    public void get(Exchange exchange) throws Exception {
        exchange.getOut().setBody("GET - Hello world!!!");
    }

}
