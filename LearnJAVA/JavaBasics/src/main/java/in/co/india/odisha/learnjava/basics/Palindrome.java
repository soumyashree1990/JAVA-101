package in.co.india.odisha.learnjava.basics;

/**
 * Created by personal on 31-01-2017.
 */
public class Palindrome {
    int i;
    void checkPalindrome(int input){
        int l,sum=0,a=input;
        while (a>0){
            l=a%10;
            sum=(sum*10)+l;
            a=a/10;
        }
        if(input==sum)
            System.out.println(input+" is palindrome");
        else
            System.out.println(input+" is not palindrome");
    }

    public static void main(String[] args) {
        Palindrome p=new Palindrome();
        Palindrome s=new Palindrome();
        p.i=454;
        s.i=123;
        p.checkPalindrome(p.i);
        s.checkPalindrome(s.i);

    }
}
