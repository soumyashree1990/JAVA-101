package in.co.india.odisha.learnjava.Collections;


import java.util.TreeSet;

/**
 * Created by personal on 16-02-2017.
 */
public class CompComp {
    public static void main(String[] args) {
        Student e1=new Student("Nag",100);
        Student e2=new Student("sini",102);
        Student e3=new Student("bini",200);
        Student e4=new Student("kalia",230);
        TreeSet t=new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        System.out.println(t);
    }
}
