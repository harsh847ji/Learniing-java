public class PracticeSetCh7 {
    static void table(int a){
        for (int i = 1;i<=10;i++){
            System.out.println(a+" X "+i+" = "+a*i);
        }
    }

    static void pattern(int a){
        for (int i = 1;i<=a;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumOfNaturalNo(int a){
        if (a==1){
            return 1;
        }
        return a+sumOfNaturalNo(a-1);

    }
    public static void main(String[] args) {
        table(3);
        pattern(8);
        int c = sumOfNaturalNo(4);
        System.out.println(c);
    }
}
