package in.co.india.odisha.learnjava.learnstring;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by personal on 02-02-2017.
 */
public class TestFirstLetterOutput {
    FirstLetterOutput f=new FirstLetterOutput();
    //check firstLetterOutput method
    @Test
    public void testFirstLetterOutput() {
        f.a = "Kal Ho Na Ho";
        String expected="KHNH";
        String c = f.firstLetterOutput(f.a);
        assertEquals(expected,c);
    }
}
