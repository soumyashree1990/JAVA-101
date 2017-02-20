package in.co.india.odisha.learnjava.jax.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by personal on 05-02-2017.
 */

//@ : annotation

@XmlRootElement
public class Customer {

        String name;
        int age;
        int id;

        public String getName() {
            return name;
        }

        @XmlElement
        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        @XmlElement
        public void setAge(int age) {
            this.age = age;
        }

        public int getId() {
            return id;
        }

        @XmlAttribute
        public void setId(int id) {
            this.id = id;
        }

    }

