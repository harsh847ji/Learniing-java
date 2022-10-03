public class break_and_continue {
    public static void main(String[] args) {
        //break and continue statement
        for (int i=0;i<5;i++){

            if (i==2){
                System.out.println("exit loop");
                break;
            }
            System.out.println("java is great");
        }

        System.out.println("\n\n");

        //continue statement
        for (int i=0;i<5;i++){

            if (i==2){
                System.out.println("continue the loop");
                continue;
            }
            System.out.println("java is great");
        }
    }
}
