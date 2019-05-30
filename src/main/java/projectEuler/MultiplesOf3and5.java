package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplesOf3and5 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(br.readLine());

			while (n-- > 0) {
				long number = Long.parseLong(br.readLine());
				System.out.println(sum(number));
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

	public static long sum(long number) {
		long answer = 0;

		number--;

		// For 3 multiples
		long rem = number % 3;
		long quotient = (number - rem) / 3;

		answer += (3 * (quotient * (quotient + 1) / 2));

		// For 5 Multiples
		rem = number % 5;
		quotient = (number - rem) / 5;
		answer += (5 * (quotient * (quotient + 1) / 2));

		// Remove common mulitples like 15,30, 45
		rem = number % 15;
		quotient = (number - rem) / 15;
		answer -= (15 * (quotient * (quotient + 1) / 2));
		return answer;
	}
}