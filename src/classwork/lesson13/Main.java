package classwork.lesson13;

import java.util.Random;

public class Main {
	final static Random rnd = new Random();

	public static void main(String[] args) {
		String[] array = { "one", "two", "three", "four", "five", "six" };
		System.out.println(array[0]);

		for (int i = 1; i < array.length; i++) {
			System.out.println(array[i] + array[i - 1]);
		}
/////
		int[] arrayInt = new int[10];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int number : arrayInt) {
			number = rnd.nextInt(100);
			max = Math.max(max, number);
			min = Math.min(min, number);
		}
		System.out.printf("Max: %s, Min: %s",max,min);
/////
	
		int[] arrayThree = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
		int summ = 0;
		for (int i = 0; summ < 1800 ; i++) {
			if (arrayThree.length <= i) {
				i = 0;
				summ = 0;
			}
			arrayThree[i]++;
			summ += arrayThree[i];
			
			if (arrayThree[i] == 100) {
				break;
			}
		}
		System.out.println("\nsumma ="+summ);
		for (int i : arrayThree) {
			System.out.println(i);
		}
		
		
	}

}