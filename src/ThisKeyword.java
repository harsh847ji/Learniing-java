class Pen{
    String name;
    String color;
    public void tell(){
        System.out.println("my colour is "+this.color);
    }

}

public class ThisKeyword {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        Pen pen2 = new Pen();
        pen2.color = "green";
        pen1.tell();
        pen2.tell();
    }
}
