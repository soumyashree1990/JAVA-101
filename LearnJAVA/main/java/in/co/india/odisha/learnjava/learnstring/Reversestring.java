package in.co.india.odisha.learnjava.learnstring;

/**
 * Created by personal on 25-01-2017.
 */
import java.io.*;

public class Reversestring {

    public static void main(String[] args) {
        String a=("Soumyashree is a good girl");
        String b=reverse(a);
        System.out.print(b);

        }

    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);


    }

}
