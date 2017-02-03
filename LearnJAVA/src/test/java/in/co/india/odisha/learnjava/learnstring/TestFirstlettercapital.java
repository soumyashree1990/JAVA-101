package in.co.india.odisha.learnjava.learnstring;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by personal on 03-02-2017.
 */
public class TestFirstlettercapital {
    Firstlettercapital f=new Firstlettercapital();

    //check firstLetterCapital method
    @Test

    public void firstLetterCapital(){
        f.a = "soumyashree i love you so mch hottie";
        String res = f.firstLetterCapital(f.a);
        String expected="Soumyashree I Love You So Mch Hottie";
        assertSame(expected,res);
    }


}
