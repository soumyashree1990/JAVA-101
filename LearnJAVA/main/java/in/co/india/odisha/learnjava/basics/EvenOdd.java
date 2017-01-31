package in.co.india.odisha.learnjava.basics;

/**
 * Created by personal on 31-01-2017.
 */
public class EvenOdd {
    int i;
    void checkEvenOdd(int input){
        if(input%2==0)
            System.out.println(input +" is even");
        else
            System.out.println(input +" is odd");
    }

    public static void main(String[] args) {
        EvenOdd a=new EvenOdd();
        EvenOdd b=new EvenOdd();
        a.i= 45;
        b.i= 24;
        a.checkEvenOdd(a.i);
        b.checkEvenOdd(b.i);

    }
}
