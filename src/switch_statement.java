import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age= sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("you are adult");
            case 34 -> System.out.println("you are doing job");
            case 60 -> System.out.println("you are old");
            case 80 -> System.out.println("live carefully you are about to die");
            default -> System.out.println("enjoy your life");
        }
    }
}
