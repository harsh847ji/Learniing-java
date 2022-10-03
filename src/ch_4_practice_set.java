
import java.util.Scanner;
public class ch_4_practice_set {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks in physics");
        m1= sc.nextByte();
        System.out.println("enter marks in chemistry");
        m2= sc.nextByte();
        System.out.println("enter marks in mathematics");
        m3= sc.nextByte();

        float total=(m1+m2+m3)/3.0f;
        System.out.println("your overall percentage is "+total);
        if(m1>=33 && m2>=33 & m3>=33 & total>=40){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }


    }
}
