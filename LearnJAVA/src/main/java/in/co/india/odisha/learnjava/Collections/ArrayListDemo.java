package in.co.india.odisha.learnjava.Collections;

/**
 * Created by personal on 16-02-2017.
 */
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.add(2,"M");
        l.add("N");
        System.out.println(l);
    }
}
