public class methodOverloading {
    void change(int x){
        x=78;
    }
    static void change2(int [] arr){

        arr[0]=80;
    }
    public static void main(String[] args) {

        //changing an integer
        int x = 8;
        methodOverloading obj = new methodOverloading();
        obj.change(x);
        System.out.println(x);
        //changing an array
        int [] arr= {4,56,89,3,67,89,56,55,34};
        change2(arr);
        System.out.println(arr[0]);
    }
}
