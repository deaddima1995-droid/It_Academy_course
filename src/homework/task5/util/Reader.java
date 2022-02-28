package homework.task5.util;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reader {
	
	public static void read() {
		String text;
		try(BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in))
			) {
			
			while((text = reader.readLine()) != null) {
				System.out.println(text);
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	public static List<Integer> readNumberAndWriteAverage(String stop) {
		List<Integer> list = new ArrayList<>();
		String text;
		
		try(BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in))
			) {
			
			while((text = reader.readLine()) != null) {
				
				if (text.equalsIgnoreCase(stop)) {
					break;
				}
				
				try {
					list.add(Integer.parseInt(text));
					
				} catch (NumberFormatException e) {
					System.out.println("¬вели не число");
				}
				
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
		return list;
	}
}
