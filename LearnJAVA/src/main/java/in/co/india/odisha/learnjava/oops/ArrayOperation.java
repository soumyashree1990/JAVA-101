package in.co.india.odisha.learnjava.oops;

/**
 * Created by personal on 01-02-2017.
 *
 */


public class ArrayOperation implements IArrayOperation {
    int[] a1=new int[5];
    public int[] reverse(int[] input){
        int l=input.length-1;
        int i;
        int[] a2 = new int[5];
        for(i=0;i<input.length;i++){
            a2[i]=input[l];
            l--;
        }
        System.out.println("Reversed array");

        return a2;
    }


}
