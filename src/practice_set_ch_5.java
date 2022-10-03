import java.util.Scanner;

public class practice_set_ch_5 {
    public static void main(String[] args) {
        //question 1
        //print the following pattern

//        int n=4;
//        for (int i=n;i>=0;i-- ){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print();
//        }


        //question 2
        //program to find sum of first n even no's using while loop
//        int n=5;
//        int i=0,s=0,even;
//        while(i<=n){
//            even=2*i;
//            s=s+even;
//            i++;
//        }
//        System.out.println("the sum of "+n+" even no is "+s);

        //question 3
        //program to print multiplication table of a given no
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a no you want table of :- ");
//        int n=sc.nextInt();
//        for (int i=1;i<=10;i++){
//            System.out.println(n+"X"+i+"="+(n*i));
//        }


        //question 4
        //multiplication table in reverse order
//        int n=10;
//        for (int i=10;i>=1;i--){
//            System.out.println(n+"X"+i+"="+(n*i));
//        }

        //question 5
        //factorial of a no
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int factorial=1;
//        for (int i=2;i<=n;i++){
//            factorial=factorial*i;
//        }
//        System.out.println("The Factorial of "+n+" is "+factorial);


        //question 6
        //repeat question 5 using while loop
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int factorial=1;
//        int i=2;
//        while (i<=n){
//            factorial=factorial*i;
//            i++;
//        }
//        System.out.println("The Factorial of "+n+" is "+factorial);

        //question 7
        //repeat q1 using while loops
//        int n=4,j=n;
//
//        while (j>0){
//            int i=0;
//            while (i<j){
//                System.out.print("*");
//                i++;
//            }
//            System.out.println();
//            j--;
//        }

        //question9
        //sum of all the no's of a multiplication table
                int n=8,s=0;
        for (int i=10;i>=1;i--){
            s=s+(n*i);
        }
        System.out.println(s);

    }

}
