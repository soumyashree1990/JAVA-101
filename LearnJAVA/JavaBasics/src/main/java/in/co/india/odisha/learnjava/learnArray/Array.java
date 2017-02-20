package in.co.india.odisha.learnjava.learnArray;

/**
 * Created by personal on 25-01-2017.
 */
public class Array {

    // Alt+ enter = shows error resolutions
    // ctrl + space = auto completes code
    //tab is for some shortcuts , e.g. psvm + tab, sout+ tab
    // press ctrl + click on the class to go to class definition

    String  str;
    public static void main(String[] args) {
        System.out.println("yippeee");
        Array array= new Array();
        array.str = "soumyashree";
        String reverseString = array.reverse("soumya");
        System.out.println(reverseString);

    }

    public String reverse(String input) {
        String output = "aymous";
        return output;
    }
}
