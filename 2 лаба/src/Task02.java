
public class Task02 {

	public static void main(String[] args) {

		int factorial = 7;
		int temp = 1;

		for (int i = factorial; i > 0; i--) {
			temp *= i;

		}
		System.out.println("Факториал числа " + factorial + " = " + temp);
	}

}
