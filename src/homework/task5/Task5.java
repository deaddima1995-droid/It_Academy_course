package homework.task5;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homework.task5.util.Reader;

public class Task5 {
	String text;
	Pattern pattern = Pattern.compile("");
	Matcher matcher = pattern.matcher(text);
	
	public static void main(String[] args) {
		Reader reader = new Reader();
		while(true) {
			System.out.println("Калькулятор");	
			System.out.println(calculate(reader));
		}
		
	}
	
	public static Double calculate(Reader reader) {
		
		Double numberA = reader.readDouble();
		String mathSign = reader.readLine();
		Double numberB = reader.readDouble();
		
		return switch(mathSign) {
			case "*" -> numberA * numberB;
			case "/" -> numberA / numberB;
			case "+" -> numberA + numberB;
			case "-" -> numberA - numberB;
		default -> throw new IllegalArgumentException("Ты ввел фигню: "+numberA + mathSign + numberB);
		};
	}

}
