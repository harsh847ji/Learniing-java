public class arrays {
    public static void main(String[] args) {
        int []marks=new int[5];
        marks[0]=100;
        marks[1]=45;
        marks[2]=67;
        marks[3]=46;
        marks[4]=89;
        System.out.println(marks[4]);

        //another way to create an array
        //declaration memory allocation and initialization together

        int[]no={1,45,67,89,34,55,56};
        for (int i=0; i<7;i++){
            System.out.println(no[i]);
        }
    }
}
