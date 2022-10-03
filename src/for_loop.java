import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {

//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//        }


        // Print odd natural no upto n
//        int n;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i =0;i<n;i++){
//            System.out.println(2*i+1);
//        }

//        printing n natural no in reverse order

        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (;n>0;n--){
            System.out.println(2*n+1);
        }
    }
}
