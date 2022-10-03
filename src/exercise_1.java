import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks in subject 1");
        int a= sc.nextInt();
        System.out.println("enter marks in subject 2");
        int b= sc.nextInt();
        System.out.println("enter marks in subject 3");
        int c= sc.nextInt();
        System.out.println("enter marks in subject 4");
        int d= sc.nextInt();
        System.out.println("enter marks in subject 5");
        int e= sc.nextInt();
        System.out.println("enter maximum marks in a subject");
        int mm= sc.nextInt();
        float per = ((float)(a+b+c+d+e)/mm)*20;
        System.out.println("percentage is:- "+per);
        if (per>=33){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

    }
}
