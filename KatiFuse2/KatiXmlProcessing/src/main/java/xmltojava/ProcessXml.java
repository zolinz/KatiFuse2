package xmltojava;

import kati.addr1.Address1;

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

            File inputFile = new File("KatiXmlProcessing/src/main/resources/data/Address1.xml");

            //generic step
            JAXBContext jaxbContext = JAXBContext.newInstance(Address1.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            // reading from file
            Address1 addr1 = (Address1) jaxbUnmarshaller.unmarshal(inputFile);
            System.out.println(addr1.getCountry());
            System.out.println(addr1.getStreetname());

            addr1.setCountry("Nz");


            File fileOut = new File("KatiXmlProcessing/src/main/resources/data/Address1_new.xml");
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(addr1, fileOut);




        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
