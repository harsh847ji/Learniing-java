abstract class base{
    abstract public void greet();

}

class child extends base{
    @Override
    public void greet() {
        System.out.println("hello");
    }
}
public class AbstractClasses
{
    public static void main(String[] args) {
        child n = new child();
//        base b = new base(); --> error
//        ek abstract class ka object nahi bana sakte use toh sirf extend karke dusri class mein use kar sakte hain
    }
}
