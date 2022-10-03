class a{
    public void meth1(){
        System.out.println("I am method 1 of class a");
    }
}
class b{
    public void meth1(){
        System.out.println("I am method 1 of class b");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        a a = new a();
        b b = new b();
        a.meth1();
        b.meth1();


    }
}
