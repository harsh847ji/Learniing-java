import java.util.Scanner;

public class tax_calculator {
    public static void main(String[] args) {
        float tax=0;
        float income;
        Scanner sc = new Scanner(System.in);
        income = sc.nextFloat();
        if (income>250000&&income<=500000){
            tax=tax+(income-250000)/20;

        }
        if (income>500000&&income<=1000000){
            tax = 12500+(income-500000)/5;
        }
        if (income>1000000){
            tax=112500+((income-1000000)/100)*30;
        }
        System.out.println("tax to be paid is "+tax);
    }
}
