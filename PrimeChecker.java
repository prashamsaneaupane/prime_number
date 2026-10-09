
import java.util.Scanner;

public class PrimeChecker {


	static Scanner kbd = new Scanner(System.in);

	public static void main(String[] args){

		System.out.print("Enter a positive integer: ");
		int number = kbd.nextInt();


		boolean isPrime = true;

		if (number < 2) {
			isPrime = false;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		System.out.println("Prime: " + isPrime);

		kbd.close();
	}
}

