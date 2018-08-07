package algorithms.implementation.easy;

import java.util.Scanner;

public class SherlockandTheBeast {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("h");
		int N = scan.nextInt();
		while (N > 0) {
			int target = scan.nextInt();
			// the number of 5's it contains is divisible by 3
			// the number of 3's it contains is divisible by 5
			// 1 == -1
			// 3 == 555
			// 5 == 33333
			// 11 == 555555 33333
			int threes = 0;
			int fives = 0;
			int digits = target;
			while (digits > 0) {
				if (digits % 3 == 0) {
					fives = digits;
					break;
				}
				digits -= 5;
			}
			threes = target - digits;
			if (digits < 0 || threes % 5 != 0) {
				System.out.println("-1");
			}else{
				StringBuilder sb = new StringBuilder(target);
				while (fives-- > 0) {
					sb.append("5");
				}
				while (threes-- > 0) {
					sb.append("3");
				}
				System.out.println(sb.toString());
			}
			N--;
		}
		scan.close();
	}
}
