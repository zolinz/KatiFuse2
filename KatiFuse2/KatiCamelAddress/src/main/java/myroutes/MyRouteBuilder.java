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

        JaxbDataFormat jaxbDataFormatIn = new JaxbDataFormat("kati.addr1");
        JaxbDataFormat jaxbDataFormatOut = new JaxbDataFormat("kati.addr2");


        //from("ftp:
        from("file:KatiCamelAddress/src/main/resources/data/inbox?noop=true")
                .unmarshal(jaxbDataFormatIn)
                //this is to inovke processAddress method on AddressProcessor object
                .bean(addrProcessor, "processAddress")
                //this is a default json marshalling using object properties , second argument is for pretty print
                .marshal(jaxbDataFormatOut)
                //set file name
                .to("file:KatiCamelAddress/src/main/resources/data/outbox");



    }
}
