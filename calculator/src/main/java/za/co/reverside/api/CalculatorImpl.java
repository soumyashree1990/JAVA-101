package za.co.reverside.api;

/**
 * Created by personal on 09-02-2017.
 */
public class CalculatorImpl implements Calculator{

    public int Add(int a, int b) {
        return a+b;
    }

    public int Sub(int a, int b) {
        return a-b;
    }

    public int Mul(int a, int b) {
        return a*b ;
    }

    public int Div(int a, int b) {
        return a/b ;
    }
}
