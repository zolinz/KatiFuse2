package xmltojava;

import kati.addr1.Address1;
import kati.addr2.Address2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by Zoli on 18/11/2016.
 */
public class ProcessXml {

    public static void main(String ... args){
        try {

            File inputFile = new File("KatiXmlProcessing/src/main/resources/data/Address1_in.xml");

            //generic step
            JAXBContext jaxbContextIn = JAXBContext.newInstance(Address1.class);
            Unmarshaller jaxbUnmarshaller = jaxbContextIn.createUnmarshaller();

            // reading from file
            Address1 addr1 = (Address1) jaxbUnmarshaller.unmarshal(inputFile);

            //transformation

            Address2 addr2 = new Address2();

            addr2.setNameOfStreet(addr1.getStreetname());
            addr2.setNumberOfStreet(addr1.getHousenumber());


            File fileOut = new File("KatiXmlProcessing/src/main/resources/data/Address2_out.xml");
            JAXBContext jaxbContextOut = JAXBContext.newInstance(Address2.class);
            Marshaller jaxbMarshaller = jaxbContextOut.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(addr2, fileOut);




        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
