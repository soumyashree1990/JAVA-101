package in.co.india.odisha.learnjava.learnArray;

import java.util.Arrays;

/**
 * Created by personal on 06-02-2017.
 */
public class CompareArray {
    public static void main(String[] args) {
        int[] ary={1,2,3,4,5,6};
        int[] ary1={1,2,3,4,5,6};
        int[] ary2={1,2,3,4};
        System.out.println("is array1=array2 ?" + Arrays.equals(ary,ary1));
        System.out.println("is array2=array3 ?" + Arrays.equals(ary1,ary2));
    }
}
