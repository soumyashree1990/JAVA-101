package in.co.india.odisha.learnjava.learnarray;

/**
 * Created by personal on 31-01-2017.
 */
import java.io.*;
import java.util.StringTokenizer;

public class Firstlettercapital {
    String a;
    String firstLetterCapital(String input){
        StringTokenizer st = new StringTokenizer(input," ");
        String output ="";
        String temp = "";
        String result = "";
        while (st.hasMoreTokens()){
            output = st.nextToken();
            temp = output.substring(0,1).toUpperCase();
            output = temp.concat(output.substring(1,output.length()));
//            System.out.print(output);

            result = result.concat(output.concat(" "));


        }
        return result;
    }
    public static void main(String[] args) {
        Firstlettercapital f = new Firstlettercapital();
        f.a = "soumyashree i love you so mch hottie";
        String res = f.firstLetterCapital(f.a);
        System.out.println(res);
    }
}
