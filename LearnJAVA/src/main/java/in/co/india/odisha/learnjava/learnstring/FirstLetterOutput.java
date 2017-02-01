package in.co.india.odisha.learnjava.learnstring;

import java.util.StringTokenizer;

/**
 * Created by personal on 31-01-2017.
 */
public class FirstLetterOutput {
    String a;
     String firstLetterOutput(String input){
        StringTokenizer m= new StringTokenizer(input," ");
        String output="";
        String temp="";
        String result="";
        while(m.hasMoreTokens()){
            output=m.nextToken();
            temp=output.substring(0,1).toUpperCase();
            result=result.concat(temp);
        }
        return result;

    }

    public static void main(String[] args) {
        FirstLetterOutput f=new FirstLetterOutput();
        f.a="Kal Ho Na Ho";
        String c= f.firstLetterOutput(f.a);
        System.out.println(c);
    }
}
