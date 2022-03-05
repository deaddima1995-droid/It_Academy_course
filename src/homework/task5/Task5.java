package homework.task5;

import homework.task5.util.Reader;

public class Task5 {
	
	
	public static void main(String[] args) {
		Reader reader = new Reader();
		while(true) {
			System.out.println("Введите выражение:");	
			System.out.println(calculate(reader));
		}
		
	}
	
	public static String calculate(Reader reader) {
		Double numberA = reader.readDouble();
		String mathSign = reader.readLine();
		Double numberB = reader.readDouble();
		
		return switch(mathSign) {
			case "*" -> (numberA * numberB) + "";
			case "/" -> {
				if (numberB == 0) {
				yield "На ноль делить нельзя!";
				}
				yield (numberA / numberB) + "";
			}
			case "+" -> (numberA + numberB) + "";
			case "-" -> (numberA - numberB) + "";
			
			default -> "Ты ввел фигню";
		};
	}

}
