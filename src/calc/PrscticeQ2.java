package calc;

import java.util.Scanner;

class Say{
    public void say(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}


public class PrscticeQ2 {
    public static void main(String[] args) {
        Say s = new Say();
        s.say();
    }

}
