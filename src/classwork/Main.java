package classwork;

public class Main {
    public static void main(String[] args) {
        IntArray num1 = new IntArray();
        for (int i = 0; i < 1000; i++) {
            num1.addNumber(i);
        }
        num1.writeArray();
        num1.deleteNumber();
        System.out.println(" ");
        num1.writeArray();
    }
}
