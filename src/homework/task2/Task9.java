package homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        String text = "Hello worldworld world ПРИВЕТ";
        String word = "WORLD";
        Pattern searchWord = Pattern.compile("\\b"+word+"\\b",Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);   // или так ("(?i)"+word) , но не работает с русским языком
        Matcher matcher = searchWord.matcher(text);
        while (matcher.find()) {
            System.out.println("Индекс слова "+word+" -\t"+matcher.start());
        }
    }
}
