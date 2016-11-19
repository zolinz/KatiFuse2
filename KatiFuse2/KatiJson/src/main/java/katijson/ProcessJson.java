package katijson;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Zoli on 19/11/2016.
 */
public class ProcessJson {

    public static void main(String ... args){
        ObjectMapper mapper = new ObjectMapper();

        try {

            // Convert JSON string from file to Object
            Address1 addr1 = mapper.readValue(new File("KatiJson/src/main/resources/data/Address1.json"), Address1.class);
            System.out.println(addr1.getCountry());

            //Pretty print
            String prettyAddr1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(addr1);
            System.out.println(prettyAddr1);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
