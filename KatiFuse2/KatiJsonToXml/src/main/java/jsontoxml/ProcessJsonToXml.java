package jsontoxml;

import com.fasterxml.jackson.databind.ObjectMapper;
import kati.addr1.Address1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by Zoli on 21/11/2016.
 */
public class ProcessJsonToXml {


    public static void main(String ... args){
        ObjectMapper mapper = new ObjectMapper();
        try {

            //this is not a good naming both classes are called Address1 but they are in different
            // packages , can be confusing
            katijson.Address1 addr1Json = mapper.readValue(new File("KatiJsonToXml/src/main/resources/data/Address1_in.json"), katijson.Address1.class);


            //
            kati.addr1.Address1 addr1Xml = new  kati.addr1.Address1();

            addr1Xml.setHousenumber(addr1Json.getHousenumber());
            addr1Xml.setStreetname(addr1Json.getStreetname());


            File fileOut = new File("KatiJsonToXml/src/main/resources/data/Address1_out.xml");
            JAXBContext jaxbContextOut = JAXBContext.newInstance(Address1.class);
            Marshaller jaxbMarshaller = jaxbContextOut.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(addr1Xml, fileOut);




        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
