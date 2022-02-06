package homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        String text = "У меня есть карточка 1234-4321-1234-4321";
        Pattern Card = Pattern.compile("(\\d{4}-){3}\\d{4}");
        Matcher matcher = Card.matcher(text);
        while (matcher.find()) {
            System.out.println("Карточка с номером "+text.substring(matcher.start(),matcher.end()));
        }

    }
}
