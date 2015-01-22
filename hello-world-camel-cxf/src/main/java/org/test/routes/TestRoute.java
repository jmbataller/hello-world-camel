package org.test.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by jmbataller on 22/01/15.
 */
public class TestRoute extends RouteBuilder {


    @Override
    public void configure() throws Exception {

        // Defines the starting endpoint as the Spring bean jxRsServer (in applicationContext.xml)
        from("cxfrs:bean:rsServer")
                .process(new Processor() {
                    // Anonymous processor
                    public void process(Exchange exchange) throws Exception {
                        System.out.println(exchange.getIn().toString());
                    }
                })
                .setBody(constant("['SUCCESS']"));
    }
}
