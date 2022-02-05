package homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String text = "Необходимо Ссспосчитать сссколличество слов в строке в которых буква\n" +
                "\"с\" встречается 3 и более разссс.";
        Pattern pattern = Pattern.compile("[сС]{3,}++\b");
        Matcher matcher = pattern.matcher(text);

        int result = 0;
        while (matcher.find()) {
            result++;
        }
        System.out.println(result);
    }
}
