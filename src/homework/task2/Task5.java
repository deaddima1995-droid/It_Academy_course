package homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String text = "Необходимо посссчитать колличессство ссслов в строке в которых буква встречается 3 и ссс более раза.";
        Pattern pattern = Pattern.compile("\\b[а-я]*с{3}[а-я]*\\b");
        Matcher matcher = pattern.matcher(text);

        int result = 0;
        while (matcher.find()) {
            result++;
        }

        System.out.println("Найдено:"+result+out(result));
    }
    public static String out(int result) {
        if (result == 1) {
            return "\tслово";
        }
        if (result >=2 && result <= 4) {
            return "\tслова";
        }
        return "\tслов";
    }
}
