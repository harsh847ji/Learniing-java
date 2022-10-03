import java.util.Scanner;

public class practiceSetCh6 {
    public static void main(String[] args) {
        //question 1
//        float []marks = {3.45f,7.98f,4.67f,9.86f,5.80f};
//        float sum=0;
//        for (int i=0;i< marks.length;i++){
//            sum=sum + marks[i];
//        }
//        System.out.println("sum = "+sum);

        //question 2
        //finding a no in array
//        int []no={3,8,5,0,33,7,9,2,1};
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int i=0;
//        boolean ans = false;
//        for (;i<no.length;i++){
//            if (no[i]==n){
//                ans=true;
//                break;
//            }
//
//        }
//        if (ans){
//            System.out.println("Element found at "+(i+1)+" position.");
//        }
//        else {
//            System.out.println("Element not found!");
//        }


        //question 3

//        float []marks = {3.45f,7.98f,4.67f,9.86f,5.80f};
//        float sum=0;
//        for (float mark : marks) {
//            sum = sum + mark;
//        }
//        System.out.println("Average marks = "+(sum / marks.length));

        //Question 4
//        int [][]no1={{1,2,3},
//                    {4,5,6}};
//        int [][]no2={{7,8,9},
//                     {10,11,12}};
//
//        for (int i=0;i< 2;i++){
//            for (int j=0;j< 3;j++){
//                no2[i][j]=no1[i][j] + no2[i][j];
//            }
//        }
//
//        for (int i=0;i< 2;i++){
//            for (int j=0;j< 3;j++){
//                System.out.print(no2[i][j]+" ");
//            }
//            System.out.println();
//        }


        //question 5

//        int []arr={1,2,3,4,5,6,7,8,9};
//        for (int i=0;i<(arr.length/2);i++){
//            int temp;
//            temp = arr[i];
//            arr[i]=arr[(arr.length-i-1)];
//            arr[(arr.length-i-1)]=temp;
//        }
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }


        //question 6

//        int []arr={1,2,3,4,12,6,7,8,9};
//        int max=0;
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//
//        System.out.println(max);

        //Question 7
//        int []arr={34,26,35,43,12,68,77,89,9};
//        int min=Integer.MAX_VALUE;
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println("minimum value is "+min);

        //Question 8
        int []arr={1,2,3,4,5,6,7,8,9};
        boolean sorted = true;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        if (sorted){
            System.out.println("sorted");
        }
        else {
            System.out.println("not sorted");
        }



    }
}
