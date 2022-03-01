package homework.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homework.task5.util.Reader;

public class Task5 {
	String text;
	Pattern pattern = Pattern.compile("");
	Matcher matcher = pattern.matcher(text);
	
	public static void main(String[] args) {
		
		Reader reader = new Reader();
		System.out.println(reader.readLine());
	}

}
