package homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String text = "Необходимо найти самое длинное слово в строке.";
        //   \b[а-яА-Я[a-zA-Z]*]*\b  // "\\b\\B?\\b
        Pattern pattern = Pattern.compile("[а-яА-Яa-zA-Z*]*\\b");
        Matcher matcher = pattern.matcher(text);
        int max = 0;
        String theLongsword = "";
        while ((matcher.find())) {
            if (max < matcher.end() - matcher.start()) {
                max = matcher.end() - matcher.start();
                theLongsword = text.substring(matcher.start(),matcher.end());
            }
        }
        System.out.println("Самое длинное слово в строке это - \t"+theLongsword);
    }
}
