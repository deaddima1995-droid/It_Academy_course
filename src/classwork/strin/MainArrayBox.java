package classwork.strin;

import java.util.Random;

public class MainArrayBox {

    public static void main(String[] args) {

        Boxes boxes = new Boxes();
        for (int i = 0; i < 10; i++) {
            boxes.saveBox(new Box(i,i,i));
        }
        System.out.println(boxes);
        System.out.println(boxes.getBoxByValue(27));
    }
}
