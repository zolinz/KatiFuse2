package xmltojava;

import kati.addr1.Address1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by Zoli on 18/11/2016.
 */
public class ProcessXml {

    public static void main(String ... args){
        try {

            File file = new File("KatiXmlProcessing/" +
                    "src/main/resources/data/Address1.xml");


            JAXBContext jaxbContext = JAXBContext.newInstance(Address1.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Address1 addr1 = (Address1) jaxbUnmarshaller.unmarshal(file);
            System.out.println(addr1.getCountry());
            System.out.println(addr1.getStreetname());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
