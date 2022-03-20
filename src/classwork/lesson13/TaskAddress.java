package classwork.lesson13;

public class TaskAddress {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Address("BB", "DD", "CC");
		}
		System.out.println(Address.getCounter());
		
		System.out.println(new Address("", "", "").compareAddress(new Address("", "", "")));
	}

}
