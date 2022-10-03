public class array_length {
    public static void main(String[] args) {
        //length of an array
        int[]no={1,45,67,89,34,55,56};
        System.out.println(no.length);


        String[]students={"Harsh","Kumud","Het Ram","Maya Devi"};
        for (int i = 0;i< students.length;i++){
            System.out.println(students[i]);
        }

        //printing reverse array
        System.out.println();
        System.out.println("printing using for loop in reverse order");
        for (int i = students.length-1;i>=0;i--){
            System.out.println(students[i]);
        }
    }
}
