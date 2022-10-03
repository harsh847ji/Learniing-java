public class recursion {
    static int n1=0,n2=1,n3;
    static void fibonacci(int a){
        if (a>0){
            n3= n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fibonacci(a-1);

        }
    }
    static int factorial(int x){
        int factorial;
        if (x==0 || x==1){
           return 1;
        }
        else
            factorial=x*factorial(x-1);
        return factorial;
    }
    public static void main(String[] args) {
        int a = 10;
        System.out.println(factorial(a));
        System.out.println("fibonacci series :-");
        System.out.print(n1+" "+n2);
        fibonacci(a);
    }
}
