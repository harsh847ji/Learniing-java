package calc;
import com.harsh.AccessModifiers;
class addition{
    int a = 9;
    protected int b = 99;
    private int c=45;
    public void add(){
        System.out.println("I am adding.");
    }
}
class subs extends AccessModifiers{
    public void pri(){
//        System.out.println(a); // not allowed as 'a' is default
        System.out.println(b);
    }

}


public class PracticeQ4 {
    public static void main(String[] args) {

    }
}
