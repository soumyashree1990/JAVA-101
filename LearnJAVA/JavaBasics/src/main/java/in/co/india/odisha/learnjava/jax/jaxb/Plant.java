package in.co.india.odisha.learnjava.jax.jaxb;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * Created by personal on 16-02-2017.
 */
@XmlRootElement(name = "plant")
public class Plant {
    @XmlAttribute
    String category = "";
}
