package classwork.lesson12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		try {
			Box box = new Box(1, 2, 3);
			
			Class <?> boxClass = Box.class;
			Method method = boxClass.getMethod("printNameWithPrefix", String.class);
			
			method.invoke(box, "MyPrefix ");
			
			Method print = boxClass.getMethod("print");
			print.invoke(box);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
