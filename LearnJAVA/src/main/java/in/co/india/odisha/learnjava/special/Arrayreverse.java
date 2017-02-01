package in.co.india.odisha.learnjava.special;

/**
 * Created by personal on 01-02-2017.
 *
 */
public class Arrayreverse {
    int[] a1=new int[5];
    void reverse(int[] input){
        int l=input.length-1;
        int i;
        int[] a2 = new int[5];
        for(i=0;i<input.length;i++){
            a2[i]=input[l];
            l--;
        }
        System.out.println("Reversed array");
        for(i=0;i<input.length;i++)
            System.out.print(a2[i]);
    }
    public static void main(String[] args) {
       Arrayreverse a=new Arrayreverse();
       a.a1[0]=1;
       a.a1[1]=2;
       a.a1[2]=3;
       a.a1[3]=4;
       a.a1[4]=5;
       a.reverse(a.a1);
    }

}
