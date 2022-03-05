package homework.task5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import homework.task5.util.Box;

public class Task9 {
	
	public static final String OUTPUT_BOX = "src/homework/task5/files/OUTPUT_BOX.txt";

	public static void main(String[] args) {
		List<Box> listBox = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			listBox.add(new Box());
		}
		System.out.println(listBox);
		serializeListBoxToFile(listBox, OUTPUT_BOX);
	}
	
	public static void serializeListBoxToFile(List<Box> list, String file) {
		try (ObjectOutputStream streamBox = new ObjectOutputStream(
                new FileOutputStream(file)
        )) {
			for (Object o : list) {
              streamBox.writeObject(o);
          }

            
        } catch (IOException e) {
            //System.err.println(e.getMessage() + Arrays.toString(e.getStackTrace()));
        }
	}

}
