package classwork;


public class Lesson4 {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(1,5);
        Fraction fr2 = new Fraction(2,5);

        Student student1 = new Student("Dima","Zhurauliou","Minsk city");
        Student student2 = new Student("Dima","Zhurauliou","Minsk city");

        student1.compareStudent(student2);

    }
}
