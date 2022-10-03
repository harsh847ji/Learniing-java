public class varargs {
//    static int sum(int a,int b){
//        return a+b;
//    }
    static int sum(int ...arr){
        int result=0;
        for (int a:arr) {
            result +=a;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("welcome to varargs tutorial");
        System.out.println("sum of 4 and 5 is "+sum(4,5,1,5,6,4));
    }
}
