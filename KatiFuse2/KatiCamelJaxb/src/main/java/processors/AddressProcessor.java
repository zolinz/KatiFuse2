package processors;

import kati.addr1.Address1;
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
        //manipulates the message body
        addr1.setHousenumber("89");
        //sets the manipulated object back to body
        ex.getIn().setBody(addr1);

    }

}
