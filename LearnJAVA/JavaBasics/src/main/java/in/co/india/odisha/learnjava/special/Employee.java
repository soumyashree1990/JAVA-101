package in.co.india.odisha.learnjava.special;

/**
 * Created by personal on 01-02-2017.
 * Doubt: Class will be created will subclass name or superclass name ?
 * Ans : Both classes should be in separate files
 */
public class Employee {
    float salary=40000;
}
class Programmer extends Employee{
    int bonus=10000;
    public static void main(String args[]){
        Programmer p=new Programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }

}
