package in.co.india.odisha.learnjava.Collections;

import in.co.india.odisha.learnjava.special.Employee;

import java.util.*;



/**
 * Created by personal on 16-02-2017.
 */
public class CompComp1 {
    public static void main(String[] args) {
        Student s1=new Student("RAM",1);
        Student s2=new Student ("SITA",4);
        Student s3=new Student("Lakshman",2);
        Student s4=new Student("Ravan",3);
        TreeSet t1=new TreeSet(new Mycomparator2());
        t1.add(s1);
        t1.add(s2);
        t1.add(s3);
        t1.add(s4);
        System.out.println(t1);
    }
}
class Mycomparator2 implements Comparator {
    public int compare(Object obj1,Object obj2){
        Student st1=(Student)obj1;
        Student st2=(Student)obj2;
        String str1=st1.name;
        String str2=st2.name;
        return str1.compareTo(str2);
    }
}
