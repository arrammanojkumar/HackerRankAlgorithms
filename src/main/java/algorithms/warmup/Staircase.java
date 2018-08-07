package algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {
	public static void main(String[] args) {
		try {

			int n;
			n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

			for (int i = n; i > 0; i--) {
				int j = 0;
				for (; j < i - 1; j++) {
					System.out.print(" ");
				}
				for (int k = i; k <= n; k++) {
					System.out.print("#");
				}
				System.out.println();
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}