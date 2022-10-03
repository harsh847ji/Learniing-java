import javax.swing.text.DefaultEditorKit;

class Circle{
    public Circle(int r){
        radius = r;
    }
    public Circle(){

    }
    public int radius;
    public double area(){

        return Math.PI*this.radius*this.radius;
    }
}
class MyCylinder extends Circle{
    public int height;
    public MyCylinder(int r, int h){
        super(r);
        this.height = h;

    }
    public double volume(){
        return area()*this.height;
    }
}
public class PracticeSetCh10 {
    public static void main(String[] args) {
        Circle cir = new Circle(7);
        MyCylinder cyl = new MyCylinder(7,8);
        System.out.println(cir.area());
        System.out.println(cyl.volume());

    }
}
