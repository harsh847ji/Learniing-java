import java.util.Scanner;

public class chapter_7_methods {
    int sum (int a,int b){
        return a+b;
    }
    static void tellJoke(){
        System.out.println("hi it's a joke.");
    }
    static int logic(int x,int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z=x-y;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=4,b=5,c=10,d=8;
        //Method invocation using object creation
//        chapter_7_methods obj = new chapter_7_methods();
//        int s;
//        s=obj.logic(a,b);

        int e=logic(a,b);
        int f=logic(c,d);
        System.out.println(e);
        System.out.println(f);
        tellJoke();
        //calling method with objects means method invocation
        chapter_7_methods obj = new chapter_7_methods();
        int g = obj.sum(3,5);
        System.out.println(g);

    }
}
