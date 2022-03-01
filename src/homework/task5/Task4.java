package homework.task5;

import java.util.Collections;
import java.util.List;
import homework.task5.util.Reader;

public class Task4 {

	public static void main(String[] args) {
		Reader read = new Reader();
		List<Integer> list = read.readInt("стоп"); 
		read.readLine("статус");
		read.close();
		Collections.sort(list);
		System.out.println(list);
	}

}
