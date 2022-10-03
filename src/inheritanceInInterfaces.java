class cellPhone{
    void call(){
        System.out.println("Calling...");
    }
}

interface gps{
    void maps();
    void find();
}
interface camera{
    void front();
    void back();
}

class SmartPhone extends cellPhone implements gps,camera{
    public void maps(){
        System.out.println("opening maps");
    }
    public void find(){
        System.out.println("finding shortest path");
    }
    public void back() {
        System.out.println("opening back camera");
    }
    public void front() {
        System.out.println("opening front camera");
    }
}


public class inheritanceInInterfaces {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone();
        samsung.back();
        samsung.call();
        samsung.find();
        samsung.front();
        samsung.maps();
    }
}
