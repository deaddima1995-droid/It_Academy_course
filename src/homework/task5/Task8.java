package homework.task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task8 {
	public static final String INPUT_1 = "src/homework/task5/files/INPUT_1.txt";
	public static final String INPUT_2 = "src/homework/task5/files/INPUT_2.txt";
	public static final String OUTPUT = "src/homework/task5/files/OUTPUT.txt";
	
	
	public static void main(String[] args) {
		try {
			List<String> first = Files.readAllLines(Paths.get(INPUT_1));
			List<String> second = Files.readAllLines(Paths.get(INPUT_2));
			List<String> out = new ArrayList<>();
			for (String stringFirst : first) {
				for (String stringSecond : second) {
					if (stringFirst.equals(stringSecond)) {
						out.add(stringFirst);
					}
				}
			}
			Files.write(Paths.get(OUTPUT), out);
		} catch (IOException e) {
			e.printStackTrace();
          System.err.println("Unexpected error.");
      }	finally {
    	  System.out.println("Well done");
      }
	}

}
