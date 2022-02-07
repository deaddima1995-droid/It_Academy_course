package homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        String text = "Hello world";
        String word = "worlD";
        String string = "i";
        Pattern searchWord = Pattern.compile(word.toLowerCase());   // или так ("(?i)"+word) , но не работает с русским языком
        Matcher matcher = searchWord.matcher(text.toLowerCase());
        while (matcher.find()) {
            System.out.println("Индекс слова "+word+" -\t"+matcher.start());
        }
    }
}
