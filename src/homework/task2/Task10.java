package homework.task2;

import homework.task2.addition.Box;

public class Task10 {
    public static void main(String[] args) {
        Box cube = new Box("Box[10]");
        cube.discover();
        Box box = new Box("Box[10,10,9]");
        box.discover();
        Box convert = new Box("Box[0,10,10]");
        convert.discover();
        Box un = new Box("Box[]");
        un.discover();
    }
}
