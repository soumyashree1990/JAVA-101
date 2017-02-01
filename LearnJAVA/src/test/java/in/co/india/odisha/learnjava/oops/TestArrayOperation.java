package in.co.india.odisha.learnjava.oops;

import in.co.india.odisha.learnjava.Array;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by personal on 02-02-2017.
 */
public class TestArrayOperation {
    ArrayOperation ao = new ArrayOperation();

    //check reverse array method
    @Test
    public void testReverseArray(){
        int[] input=new int[] {0,1,2,3,5};
        int[] expected = new int[] {5,3,2,1,0};
        int[] actual = new int[5];
        actual = ao.reverse(input);
        assertArrayEquals(expected, actual);


    }
}
