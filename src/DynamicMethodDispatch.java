class Super{
    public void meth1(){
        System.out.println("I am method 1");
    }
    public void meth2(){
        System.out.println("I am method 2");
    }
}
class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of sub class");
    }
    public void meth3(){
        System.out.println("I am method 3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        Sub obj = new Super();  // Not Allowed
        Super obj1 = new Sub();// Allowed
        obj1.meth1();
        obj1.meth2();
//        obj1.meth3();  //  Not Allowed

    }
}
