package in.co.india.odisha.learnjava.basics;

/**
 * Created by personal on 31-01-2017.
 */
public class Prime {
    int i;
    void checkPrime(int input){
        int counter=2;
        while(counter<input){
            if(input%counter==0) {
                System.out.println(input + " is not prime");
                break;
            }
            else
                counter++;

        }
        if(counter==input)
            System.out.println(input+ " is prime");
    }

    public static void main(String[] args) {
        Prime p=new Prime();
        Prime r=new Prime();
        p.i=7;
        r.i=9;
        p.checkPrime(p.i);
        r.checkPrime(r.i);
    }
}
