import java.util.Locale;

public class practice_set_ch3 {
    public static void main(String[] args) {
        // Q1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);
        //Q2
        String space = "hi my friend my name is harsh";
        space = space.replace(" ","_");
        System.out.println(space);

        //Q3
        String letter= "Dear <|name|> thanks a lot";
        letter= letter.replace("<|name|>","sachin");
        System.out.println(letter);
        //question 4
        String str = "this string contain double  and   triple spaces";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));

        //question 5
        String letter2 = "Dear Harsh,\n\tThis java course is nice.\nThanks.";
        System.out.println(letter2);

    }
}
