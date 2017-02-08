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

                File file = new File("C:\\file.xml");
                JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
                System.out.println(customer);

            } catch (JAXBException e) {
                e.printStackTrace();
            }

        }
    }


