package classwork.strin;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "sfsd555A555gfgt";
        Pattern pattern = Pattern.compile("\\d{3}A\\d{3}");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.find());
    }
}
