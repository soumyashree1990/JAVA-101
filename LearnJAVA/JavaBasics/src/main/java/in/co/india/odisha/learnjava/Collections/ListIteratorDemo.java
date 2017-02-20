package in.co.india.odisha.learnjava.Collections;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by personal on 16-02-2017.
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("Bala");
        l.add("Chiru");
        l.add("Venky");
        l.add("Nag");
        System.out.println(l);
        ListIterator ltr=l.listIterator();
        while(ltr.hasNext()){
            String s=(String)ltr.next();
            if(s.equals("Venky"))
                ltr.remove();
            else if(s.equals("Nag"))
                ltr.add("Chaitu");
            else if(s.equals("Chinu"))
                ltr.set("Charan");
        }
        System.out.println(l);
    }
}
