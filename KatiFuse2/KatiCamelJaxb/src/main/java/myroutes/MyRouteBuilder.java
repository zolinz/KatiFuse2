package myroutes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import processors.AddressProcessor;

/**
 * Created by Zoli on 23/11/2016.
 */
public class MyRouteBuilder extends RouteBuilder {

    AddressProcessor addrProcessor = new AddressProcessor();


    public void configure() throws Exception {

        JaxbDataFormat jaxbDataFormat = new JaxbDataFormat("kati.addr1");


        from("file:KatiCamelJaxb/src/main/resources/data/inbox?noop=true")
                .unmarshal(jaxbDataFormat)
                //this is to inovke processAddress method on AddressProcessor object
                .bean(addrProcessor, "processAddress")
                //this is a default json marshalling using object properties , second argument is for pretty print
                .marshal().json(JsonLibrary.Jackson, true)
                //set file name
                .setHeader("CamelFileName", simple("KatiOut.json"))
                .to("file:KatiCamelJaxb/src/main/resources/data/outbox");



    }
}
