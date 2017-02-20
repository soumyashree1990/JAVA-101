package in.co.india.odisha.learnjava.Collections;

/**
 * Created by personal on 16-02-2017.
 */
public class Student implements Comparable {

    String name;
    int rno;
    Student(String name,int rno){
        this.name=name;
        this.rno=rno;
    }
    public String toString(){
        return rno+"__"+name;
    }

    public int compareTo(Object o) {
        int rno1=this.rno;
        Student s=(Student)o;
        int rno2=s.rno;
        if(rno1<rno2)
            return -1;
        else if (rno1>rno2)
            return +1;
        else
        return 0;
    }
}
