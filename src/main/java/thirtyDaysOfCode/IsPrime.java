package thirtyDaysOfCode;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		while (t > 0) {
			boolean flag = true;
			int number = scan.nextInt();
			if (number == 1) {
				System.out.println("Not prime");
			} else if (number == 2) {
				System.out.println("Prime");
			} else {
				int sqrt = (int) Math.sqrt(number) + 1;
				for (int i = 2; i < sqrt; i++) {
					if (number % i == 0) {
						flag = false;
					}
				}
				if (flag)
					System.out.println("Prime");
				else
					System.out.println("Not prime");
			}
			t--;
		}
		scan.close();
	}

	public static boolean isPrime(int number) {
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) {
				// number is perfectly divisible - no prime
				return false;
			}
		}
		System.out.println();
		return true;
	}
}
