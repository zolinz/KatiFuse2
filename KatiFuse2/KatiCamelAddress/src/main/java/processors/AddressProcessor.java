package processors;

import kati.addr1.Address1;
import kati.addr2.Address2;
import org.apache.camel.Exchange;

/**
 * Created by Zoli on 23/11/2016.
 */
public class AddressProcessor {


    public void processAddress(Exchange ex){
        //change file name to have a different output file name
        ex.getIn().setHeader("CamelFileName", "AddressOut.xml");
        //this is just for debugging
        System.out.print("got here");

        //gets the unmarshaled java object from message body
        Address1 addr1 = (Address1) ex.getIn().getBody();

        // create a new empty output object and fill the values from the input object
        Address2 addr2 = new Address2();
        addr2.setNameOfStreet(addr1.getStreetname());
        addr2.setNumberOfStreet(addr1.getHousenumber());
        ex.getIn().setBody(addr2);

    }

}
