package in.co.india.odisha.learnjava.learnArray;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by personal on 02-02-2017.
 */
public class ReverseArray {
    public static void main(String[] args) {
        ArrayList arraylist=new ArrayList();
        arraylist.add("A");
        arraylist.add("B");
        arraylist.add("C");
        arraylist.add("D");
        arraylist.add("E");
        System.out.println("Before reverse order:"+arraylist);
        Collections.reverse(arraylist);
        System.out.println("After reverse order :"+arraylist);
    }
}
