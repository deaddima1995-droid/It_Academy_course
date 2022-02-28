package homework.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import homework.task5.util.Reader;

public class Task3 {
	

	public static void main(String[] args) {
		List<Integer> list = Reader.readNumberAndWriteAverage("стоп");
		Double sum = 0d;
		for(Integer number : list) {
		    sum += number;
		}
		System.out.println(sum / list.size());
	}

}
