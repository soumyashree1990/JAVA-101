package in.co.india.odisha.learnjava.jax.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by personal on 16-02-2017.
 */

@XmlRootElement(name = "garden")
public class Garden {
    @XmlElement
    ArrayList<Plant> plants ;

     public void printString(){
         System.out.println("Somu has gone mad");
    }
}

