package homework.task5;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Task7 {
	public static final String READ_FILE_NAME = "src/homework/task5/files/readFile.txt";
	public static final String WRITE_FILE_NAME = "src/homework/task5/files/writeFile.txt";
	

	public static void main(String[] args) {
		try {
			List<String> list = Files.readAllLines(Paths.get(READ_FILE_NAME), StandardCharsets.UTF_8);
			Collections.reverse(list);
            Files.write(Paths.get(WRITE_FILE_NAME), list);
            System.out.println("Well done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
