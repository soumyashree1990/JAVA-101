package in.co.india.odisha.learnjava.learnArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by personal on 03-02-2017.
 */
public class MergeArray {
    public static void main(String[] args) {
        String a[]={"A","E","I"};
        String b[]={"O","U"};
        List list=new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c=list.toArray();
        System.out.println(Arrays.toString(c));
    }
}
