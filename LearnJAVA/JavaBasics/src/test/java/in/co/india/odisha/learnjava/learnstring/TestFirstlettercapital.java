package in.co.india.odisha.learnjava.learnstring;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by personal on 03-02-2017.
 */
public class TestFirstlettercapital {
    Firstlettercapital f=new Firstlettercapital();

    //check firstLetterCapital method
    @Test

    public void firstLetterCapital(){
        f.a = "hello world";
        String res = f.firstLetterCapital(f.a);
        String expected="Hello World ";
        Assert.assertEquals(expected,res);
    }


}
