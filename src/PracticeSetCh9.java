class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceAreaCylinder(){
        return (3.14*getRadius()*getRadius())*2+(2*3.14*getRadius()*getHeight());
    }
    public double volumeOfCylinder(){
        return (3.14*getRadius()*getRadius()*getHeight());
    }
}

public class PracticeSetCh9 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(5);
        myCylinder.setRadius(3);
        System.out.println(myCylinder.surfaceAreaCylinder());
        System.out.println(myCylinder.volumeOfCylinder());


    }
}
