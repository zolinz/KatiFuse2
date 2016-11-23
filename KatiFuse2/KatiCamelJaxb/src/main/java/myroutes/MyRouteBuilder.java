package myroutes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import processors.AddressProcessor;

/**
 * Created by Zoli on 23/11/2016.
 */
public class MyRouteBuilder extends RouteBuilder {

    AddressProcessor addrProcessor = new AddressProcessor();


    public void configure() throws Exception {

        JaxbDataFormat jaxbDataFormat = new JaxbDataFormat("kati.addr1");


        from("file:KatiCamelJaxb/data/inbox?noop=true")
                .unmarshal(jaxbDataFormat)
                //this is to inovke processAddress method on AddressProcessor object
                .bean(addrProcessor, "processAddress")
                .to("file:KatiCamelJaxb/data/outbox");

    }
}
