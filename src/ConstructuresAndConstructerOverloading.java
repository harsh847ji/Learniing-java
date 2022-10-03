class MyMainEmployee{
    private int id ;
    private String name;
    public MyMainEmployee(){
        id = 0;
        name = "Not Given";
    }
    public MyMainEmployee(int i,String n){
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
public class ConstructuresAndConstructerOverloading {
    public static void main(String[] args) {
        MyMainEmployee harsh = new MyMainEmployee(1,"Harsh");
        MyMainEmployee kumud = new MyMainEmployee(2,"Kumud");
        System.out.println(harsh.getName());
        System.out.println(kumud.getId());
        System.out.println(kumud.getName());
        System.out.println(harsh.getId());



    }
}
