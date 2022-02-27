package homework.task5.util;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
}
