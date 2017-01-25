package in.co.india.odisha.learnjava.basics;

/**
 * Created by personal on 25-01-2017.
 */
public class Add {
    int x=5;
    int y=20;
    int sum(){
        int summation=x+y ;
        return summation;

    }
    public static void main(String[] args) {
        Add R=new Add() ;
        System.out.println("Sum is " + R.sum());
    }
}
