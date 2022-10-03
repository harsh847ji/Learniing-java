import java.util.Scanner;

class Employe{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
}

class Cellphone{
    public void ringing(){
        System.out.println("Ringing....");
    }
    public void vibrating(){
        System.out.println("Vibrating....");
    }
}


class Square{
    int side;
    public int parameter(){
        int parameter = 4*side;
        return parameter;

    }
    public int area(){
        int area = side*side;
        return area;

    }
}

public class PracticeSetCh8 {
    public static void main(String[] args) {
        Employe Harsh = new Employe();
        Employe Kumud = new Employe();
        Harsh.name = "Harsh";
        Harsh.salary = 120000;
        Kumud.name = "Kumud";
        Kumud.salary = 100000;
        System.out.println(Harsh.getName());
        System.out.println(Harsh.getSalary());
//        Harsh.name = "harsh";
        Harsh.setName("harsh");
        System.out.println(Harsh.name);
        Cellphone cell = new Cellphone();
        cell.vibrating();
        cell.ringing();


        Square square = new Square();
        square.side = 5;
        System.out.println(square.parameter());
        System.out.println(square.area());


    }
}
