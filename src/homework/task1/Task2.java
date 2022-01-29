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
        int num = 100;
        int sum = funOfFibonachi(10,0,0);
        System.out.println(sum);
    }
    public static int funOfFibonachi(int index, int number,int tmp) {
        if (index <= 0) {
            return number;
        }

        number += tmp;

        if (number == 0) {
            number++;
        }
        else {
            tmp += number;
        }
        return number += funOfFibonachi(--index,number,tmp);

    }
}
