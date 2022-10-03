class Rectangle{

    private int length;
    private int breadth;
    private int area;
    private int parameter;

    public void setLength(int l){
        length = l;
    }
    public void setBreadth(int b){
        breadth = b;
    }
    public void setArea(int a){
        area = a;
    }
    public void setParameter(int p){
        parameter = p;
    }
    public int getLength(){
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getArea() {
        if (area!=length*breadth){
            System.out.println("entered area is wrong");
            return 0;
        }
        else
            return area;
    }

    public int getParameter() {
        return parameter;
    }
}




public class GetterAndSetter {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setBreadth(5);
        rectangle.setArea(2);
        rectangle.setParameter(18);


        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getBreadth());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getParameter());



    }
}
