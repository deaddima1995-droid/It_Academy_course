package homework.task2.addition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String text = "Box[12]";
        Pattern pattern = Pattern.compile("Box\\[(\\d+)+,?(\\d+)?,?(\\d+)?\\]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {

            System.out.println(matcher.group(3));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(1));
        }
    }
}
