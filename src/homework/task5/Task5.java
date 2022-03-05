package homework.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homework.task5.util.Reader;

public class Task5 {
	
	
	public static void main(String[] args) {
		Reader reader = new Reader();
		while(true) {
			System.out.println("Калькулятор");	
			System.out.println(calculate(reader));
		}
		
	}
	
	public static String calculate(Reader reader) {
		
		Double numberA = reader.readDouble();
		String mathSign = reader.readLine();
		Double numberB = reader.readDouble();
		return switch(mathSign) {
		case "*" -> {
			break "null";
		}
		};
	}

}
