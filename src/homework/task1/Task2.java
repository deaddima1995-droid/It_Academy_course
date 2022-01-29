/*  Задание 2
        Суть задания найти сумму всех четных чисел в последовательности Фибоначи, до
        определенного индекса "n".
            Например:
                Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21
                n = 7
                Сумма всех четных до 7го.  равна 2 + 8 = 10.
https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8

 */
package homework.task1;

public class Task2 {

    public static void main(String[] args) {
        int index = 15;
        int sum = 0;
        int number = 1;
        int nextNumber = 0;

        for (int i = 1; i <= index; i++) {
                int tmp = number + nextNumber;
                number = nextNumber;
                nextNumber = tmp;
                if (number % 2 == 0) {
                    sum += number;
                }
        }
        System.out.println("Сумма = "+sum);
    }

}
