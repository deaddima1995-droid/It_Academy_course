package homework.task5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import classwork.lesson9.Car;
import homework.task5.util.Box;

public class Task10 {
	public static final String OUTPUT_BOX = "src/homework/task5/files/OUTPUT_BOX.txt";
	
	
	public static void main(String[] args) {
Map<Integer, List<Box>> mapBox = new TreeMap<>(Collections.reverseOrder());
		
        try (ObjectInputStream streamBox = new ObjectInputStream(
                new FileInputStream(OUTPUT_BOX))) {
        	
            int countBox = 0;
            while (countBox++ < 5) {
            	Box box = (Box) streamBox.readObject();
            	List<Box> list = mapBox.computeIfAbsent(
                		box.getValue(), 
                		value -> new ArrayList<>()
                );
                list.add(box);
            }
            for (Entry<Integer, List<Box>> entry : mapBox.entrySet()) {
                System.out.println(
                    entry.getKey() + ":" + entry.getValue()
                );
            }
            String maxBox = mapBox.values().stream().findFirst().get().toString();
            try {
                Files.write(Paths.get(OUTPUT_BOX), maxBox.getBytes(), StandardOpenOption.APPEND);
            }
            catch (IOException e) {
                System.out.println(e);
            }
            
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage() + Arrays.toString(e.getStackTrace()));
        }
        
	}

}

