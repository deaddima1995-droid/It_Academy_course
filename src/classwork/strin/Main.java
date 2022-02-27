package classwork.strin;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();
    private static final String FILE_NAME = "FILE_NAME";

    public static void main(String[] args) throws FileNotFoundException {
        List<Box> boxList = new ArrayList<>();
        while (boxList.size() < 5) {
            boxList.add(createBox());
        }
        System.out.println(boxList);
        serializeListOfObjects(boxList,FILE_NAME);
        System.out.println(deserializeObjectsFromFile(FILE_NAME));
    }

    private static Box createBox() {
        int x = 10;
        return new Box(RANDOM.nextInt(x),RANDOM.nextInt(x),RANDOM.nextInt(x));
    }
    private static void serializeListOfObjects(List<?> list, String filename) throws FileNotFoundException {

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            for (Object o : list) {
                oos.writeObject(o);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage() + Arrays.toString(e.getStackTrace()));
        }
    }

    private static <T> List<T> deserializeObjectsFromFile(String filename) {
        List<T> list = new ArrayList<>();
        try (ObjectInputStream oos = new ObjectInputStream(
                new FileInputStream(filename))) {
            while (oos.available() > 0) {
                list.add((T) oos.readObject());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage() + Arrays.toString(e.getStackTrace()));
        }
        return list;
    }
}
