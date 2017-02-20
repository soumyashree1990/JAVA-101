package in.co.india.odisha.learnjava.learnArray;


/**
 * Created by personal on 03-02-2017.
 */
public class ArrayMinMax {
    public static void main(String[] args) {
        int[] numbers=new int[]{8,2,7,1,4,9,5};
        int s=numbers[0];
        int l=numbers[0];
        int len= numbers.length;
        for(int i=1;i<len;i++){
            if(s<numbers[i])
                s=numbers[i];
            else if(l>numbers[i])
                l=numbers[i];
        }
        System.out.println("Min number: "+l);
        System.out.println("Max number: "+s);

    }
}
