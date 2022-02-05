package homework.task2;

import homework.task2.addition.Box;

public class Task2 {
    public static void main(String[] args) {
        Box box1 = new Box(2,2,2);
        Box box2 = new Box(2,3,2);
        Box box3 = new Box(2,2,0);

        System.out.println(box1.getType());
        System.out.println(box2.getType());
        System.out.println(box3.getType());
    }
}
