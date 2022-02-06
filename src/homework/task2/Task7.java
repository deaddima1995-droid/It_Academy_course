package homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String text = "Вода Анаконда Алла Автобус Аэрограф Africa";
        Pattern pattern = Pattern.compile("[аАaA][а-яА-Яa-zA-Z]+?[аa]\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
