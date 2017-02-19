package in.co.india.odisha.learnjava.jax.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by personal on 05-02-2017.
 */
public class Unmarshalling {
        public static void main(String[] args) {

            try {

                File file = new File("C:\\Users\\personal\\Documents\\JAVA-101\\LearnJAVA\\fileexample.xml");
                JAXBContext jaxbContext = JAXBContext.newInstance(Garden.class);

                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Garden garden= (Garden) jaxbUnmarshaller.unmarshal(file);
                garden.printString();

            } catch (JAXBException e) {
                e.printStackTrace();
            }

        }
    }


