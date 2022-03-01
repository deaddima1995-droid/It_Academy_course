package homework.task5;

import java.util.List;
import homework.task5.util.Reader;

public class Task3 {
	

	public static void main(String[] args) {
		Reader read = new Reader();
		List<Integer> list = read.readInt("стоп");
		Double sum = 0d;
		for(Integer number : list) {
		    sum += number;
		}
		System.out.println(sum / list.size());
	}

}
