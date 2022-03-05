package homework.task5;

import java.util.ArrayList;
import java.util.List;
import homework.task5.util.Reader;

public class Task3 {
	

	public static void main(String[] args) {
		Reader reader = new Reader();
		List<Integer> list = new ArrayList<>();
		Double sum = 0d;
		
		while(true) {
		sum = 0d;
		list.addAll(reader.readIntList("стоп"));
		
		for(Integer number : list) {
		    sum += number;
		}
		if (sum == 0 || list.size() == 0) {
			continue;
		}
		System.out.println(sum / list.size());
		}
	}

}
