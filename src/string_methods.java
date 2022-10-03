import java.util.Locale;

public class string_methods {
    public static void main(String[] args) {
        String a = "harsh";
        System.out.println(a);
        int value = a.length();
        System.out.println(value);
        String lstring = a.toLowerCase();
        System.out.println(lstring);
        String ustring = a.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "      Harsh      ";
        System.out.println(nonTrimmedString);
        String trimmed = nonTrimmedString.trim();
        System.out.println(trimmed);

        System.out.println(a.substring(3));
        System.out.println(a.substring(1,5));
        System.out.println(a.replace('a','i'));
        System.out.println(a.replace("h","sp"));
        System.out.println(a.startsWith("hai"));
        System.out.println(a.startsWith("har"));
        System.out.println(a.endsWith("har"));
        System.out.println(a.endsWith("sh"));
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("r"));
        String modified = "harshsh";
        System.out.println(modified.indexOf("sh",4));
        String modified2 = "harshsh";
        //returns -1 if not found
        System.out.println(modified2.indexOf("shdf",4));
        System.out.println(modified2.lastIndexOf("sh"));
        System.out.println(modified2.lastIndexOf("sh",4));
        System.out.println(a.equals("harsh"));
        System.out.println(a.equals("Harsh"));
        System.out.println(a.equalsIgnoreCase("Harsh"));

    }
}
