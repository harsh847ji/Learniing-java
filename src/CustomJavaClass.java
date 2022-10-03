class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}


public class CustomJavaClass {

    public static void main(String[] args) {
        Employee Harsh = new Employee();
        Employee Kumud = new Employee();

        Harsh.id = 1;
        Harsh.name = "Harsh";
        Harsh.salary = 120000;
        Kumud.id = 2;
        Kumud.name = "Kumud";
        Kumud.salary = 100000;


        Harsh.printDetails();
        Kumud.printDetails();
        int salary = Harsh.getSalary();
        System.out.println(salary);
        salary = Kumud.getSalary();
        System.out.println(salary);


    }
}
