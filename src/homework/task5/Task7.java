package homework.task5;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Task7 {
	public static final String READ_FILE_NAME = "readFile.txt";
	public static final String WRITE_FILE_NAME = "writeFile.txt";
	

	public static void main(String[] args) {
		
		List<String> list = null;
		try {
			list = Files.readAllLines(Paths.get(READ_FILE_NAME), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        for(String line: list) {
            System.out.println(line);
        }

	}

}
