package za.co.reverside.api;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by personal on 09-02-2017.
 */

public class CalculatorTest {

    CalculatorImpl c=new CalculatorImpl();

    @Test
    public void testAdd() {
    int a=2,b=3;
        int sum=c.Add(a,b);
        int res=5;

        assertEquals(res,sum);

    }
    @Test
    public void testSub() {
        int a=5,b=3;
        int diff=c.Sub(a,b);
        int res=2;
        assertEquals(res,diff);

    }
    @Test
    public void testMul() {
        int a=2,b=4;
        int prod=c.Mul(a,b);
        int res=8;
        assertEquals(res,prod);

    }
    @Test
    public void testDiv() {
        int a=8,b=2;
        int div=c.Div(a,b);
        int res=4;
        assertEquals(res,div);

    }
}
