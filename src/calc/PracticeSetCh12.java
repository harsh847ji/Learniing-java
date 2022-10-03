package calc;

import static java.lang.Math.sin;

class Calculator{
    public void calculate(int a,int b){
        System.out.println(a+b);
    }
}
class ScCalculator{
    public void calculate(int a,int b){
        System.out.println(sin(a+b));
    }
}
class HyCalculator{
    public void calculate(int a,int b){
        System.out.println(a+b);
        System.out.println(sin(a+b));
    }
}

public class PracticeSetCh12 {
    public static void main(String[] args) {

    }
}
