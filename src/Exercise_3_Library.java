import java.util.Objects;
import java.util.Scanner;

class Liberary {
    int books = 0;
    int issuedBooks = 0;

    String[] availableBooks = new String[10];
    String[] arrIssuedBooks = new String[10];

    public void addBook() {
        System.out.println("Add Book.");
        System.out.print("Enter the book name :-");
        Scanner sc = new Scanner(System.in);
        String add = sc.next();
        availableBooks[books] = add;
        System.out.println(add + " Book added.");
        books++;
    }

    public void returnBook() {
        System.out.println("Return book");
        System.out.print("Enter the book name :-");
        Scanner sc = new Scanner(System.in);
        String ret = sc.next();
        for (int i = 0; i < arrIssuedBooks.length; i++) {
            if (Objects.equals(ret, arrIssuedBooks[i])) {
                availableBooks[books] = arrIssuedBooks[i];
                arrIssuedBooks[i] = null;
                System.out.println(ret + " book is returned");
                return;
            }

        }
        System.out.println(ret + " Book is not issued");

    }

    public void issueBook() {
        System.out.println("Issue Book.");
        System.out.print("Enter the book name :-");
        Scanner sc = new Scanner(System.in);
        String issue = sc.next();
        for (int i = 0; i < availableBooks.length; i++) {
            if (Objects.equals(issue, availableBooks[i])) {
                arrIssuedBooks[issuedBooks] = availableBooks[i];
                issuedBooks++;
                System.out.println(arrIssuedBooks[i] + " Book is issued.");
                availableBooks[i] = null;
                return;
            }

        }
        System.out.println(issue + " Book is not available.");
    }

    public void showAvailableBooks() {
        System.out.println("Available Books :--");
        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i] != null) {
                System.out.println("* " + availableBooks[i]);
            }
        }
    }

    public void showIssuedBooks() {
        System.out.println("Issued Books :--");
        for (int i = 0; i < arrIssuedBooks.length; i++) {
            if (arrIssuedBooks[i] != null) {
                System.out.println("* " + arrIssuedBooks[i]);
            }

        }
    }

}


public class Exercise_3_Library {
    public static void main(String[] args) {

        System.out.println("Welcome to the library");
        System.out.format("User Guid\n add --> add book\n issue --> issue book\n return --> return book\n available --> to see available books\n issued --> to see issued books\n exit000 --> to exit library\n");
        Liberary lib = new Liberary();
        String happen = "run";

        for (int i = 0; !Objects.equals(happen, "exit000"); i++) {
            Scanner sc = new Scanner(System.in);
            happen = sc.next();

            if (Objects.equals(happen, "add")) {
                lib.addBook();
            } else if (Objects.equals(happen, "issue")) {
                lib.issueBook();
            } else if (Objects.equals(happen, "return")) {
                lib.returnBook();
            } else if (Objects.equals(happen, "available")) {
                lib.showAvailableBooks();
            } else if (Objects.equals(happen, "issued")) {
                lib.showIssuedBooks();
            } else if (Objects.equals(happen, "exit000")) {
            } else {
                System.out.println("No such commands available");
                System.out.format("User Guid\n add --> add book\n issue --> issue book\n return --> return book\n available --> to see available books\n issued --> to see issued books\n exit000 --> to exit library\n");
            }
        }


    }
}

//code without formatting
/*import java.util.Objects;
import java.util.Scanner;

class Liberary{
    int books = 0;
    int issuedBooks = 0;

    String [] availableBooks = new String[10];
    String [] arrIssuedBooks = new String[10];
    public void addBook(){
        System.out.println("Add Book.");
        System.out.print("Enter the book name :-");
        Scanner sc = new Scanner(System.in);
        String add = sc.next();
        availableBooks[books] = add;
        System.out.println(add+" Book added.");
        books++;
    }
    public void returnBook(){
        System.out.println("Return book");
        System.out.print("Enter the book name :-");
        Scanner sc = new Scanner(System.in);
        String ret = sc.next();
        for (int i = 0 ; i<arrIssuedBooks.length;i++){
            if (Objects.equals(ret, arrIssuedBooks[i])) {
                availableBooks[books] = arrIssuedBooks[i];
                arrIssuedBooks[i] = null;
                System.out.println(ret+" book is returned");
                return;
            }

        }
        System.out.println(ret+" Book is not issued");

    }
    public void issueBook(){
        System.out.println("Issue Book.");
        System.out.print("Enter the book name :-");
        Scanner sc = new Scanner(System.in);
        String issue = sc.next();
            for (int i = 0;i< availableBooks.length;i++){
                if (Objects.equals(issue, availableBooks[i])){
                    arrIssuedBooks[issuedBooks] = availableBooks[i];
                    issuedBooks++;
                    System.out.println(arrIssuedBooks[i]+" Book is issued.");
                    availableBooks[i] = null;
                    return;
                }

            }
            System.out.println(issue+" Book is not available.");
    }
    public void showAvailableBooks(){
        System.out.println("Available Books :--");
        for (int i = 0;i<availableBooks.length;i++)
        {
            if (availableBooks[i]!=null){
                System.out.println("* "+availableBooks[i]);
            }
        }
    }
    public void showIssuedBooks(){
        System.out.println("Issued Books :--");
        for (int i = 0;i<arrIssuedBooks.length;i++)
        {
            if (arrIssuedBooks[i]!=null){
                System.out.println("* "+arrIssuedBooks[i]);
            }

        }
    }

}



public class Exercise_3_Library {
    public static void main(String[] args) {

        System.out.println("Welcome to the library");
        System.out.format("User Guid\n add --> add book\n issue --> issue book\n return --> return book\n available --> to see available books\n issued --> to see issued books\n exit000 --> to exit library\n");
        Liberary lib = new Liberary();
        String happen = "run";

        for (int i = 0; !Objects.equals(happen, "exit000");i++){
            Scanner sc = new Scanner(System.in);
            happen = sc.next();

            if(Objects.equals(happen, "add")){
                lib.addBook();
            }
            else if(Objects.equals(happen, "issue")){
                lib.issueBook();
            }
            else if(Objects.equals(happen, "return")){
                lib.returnBook();
            }
            else if(Objects.equals(happen, "available")){
                lib.showAvailableBooks();
            }
            else if(Objects.equals(happen, "issued")){
                lib.showIssuedBooks();
            }
            else if(Objects.equals(happen, "exit000")){
            }
            else {
                System.out.println("No such commands available");
                System.out.format("User Guid\n add --> add book\n issue --> issue book\n return --> return book\n available --> to see available books\n issued --> to see issued books\n exit000 --> to exit library\n");
            }
        }





    }
}
*/
