package in.co.india.odisha.learnjava.Collections;

import java.util.Stack;

/**
 * Created by personal on 16-02-2017.
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));
    }
}
