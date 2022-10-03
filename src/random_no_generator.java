import java.util.Random;
import java.util.Scanner;

public class random_no_generator {
    public static void main(String[] args) {
        int y=0,c=0;
        Random rand = new Random();
        System.out.println("Enter 'r' for rock,  'p' for paper and 's' for scissor");


        while ( y<3 && c<3){
            //random no generator and computer turn
            int a = rand.nextInt(31);
            char comp='r';
            if (a>=11&&a<=20) {
                comp='p';
            }
            else if (a>=21&&a<=30) {
                comp='s';
            }


            //Input from user
            Scanner sc = new Scanner(System.in);
            char player = sc.next().charAt(0);
            System.out.println("you choose "+player+" and computer choose "+comp);


            //comparison
            if (player==comp){
                System.out.println("It's a TIE");
            }
            else if (player=='r'&&comp=='s'||(player=='p' && comp=='r')||player=='s'&&comp=='p') {
                System.out.println("You Win this round!");
                y++;
            }
            else if (player == 's' || player == 'r' || player == 'p') {
                System.out.println("You Loose this round!");
                c++;
            }
            else {
                System.out.println("Invalid Input");
            }
            System.out.println("Score:- You = "+y+" Computer = "+c);
        }


//        final comparison
        if (y>c){
            System.out.println("YOU WIN");
        }
        else if (y<c){
            System.out.println("YOU LOOSE");
        }
        else{
            System.out.println("ERROR");
        }

        //String num = number.getText().toString();
        //                int n = Integer.parseInt(num);
        //                result ="";
        //                for (int i=1;i<11;i++){
        //                    result += n+" X "+i+" = "+(i*n)+"\n";
        //                    ans.setText(result);

    }
}
