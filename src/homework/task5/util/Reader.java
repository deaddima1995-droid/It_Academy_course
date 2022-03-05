package homework.task5.util;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
	BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
	
	public void readLine(String stop) {
		String text;
		try {
			while((text = reader.readLine()) != null ) {
				if (text.equalsIgnoreCase(stop)) {
					break;
				}
				System.out.println(text);
				
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	
	public String readLine() {
		String text = new String();
		try {
			text = reader.readLine();
		} catch (IOException e) {
				e.printStackTrace();
		}
		return text;
	}
	
	public List<Integer> readIntList(String stop) {
		List<Integer> list = new ArrayList<>();
		String text;
		
		try {	
			while((text = reader.readLine()) != null) {			
				if (text.equalsIgnoreCase(stop)) {
					break;
				}
				
				try {
					list.add(Integer.parseInt(text));
					
				} catch (NumberFormatException e) {
					System.out.println("Ввели не число");
				}
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
		return list;
	}
	
	public void close() {
		try {
			reader.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public Double readDouble() {
		Double out = null;
		try {
			while (out == null) {
			out = Double.parseDouble(reader.readLine());
			if (out == null) {
				System.out.println("Вы ввели не число");
			}
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		return out;
	}
}
