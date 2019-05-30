package thirtyDaysOfCode;

import java.util.Scanner;

public class ConvertToBinaryNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		while(N > 0){
			int n = scan.nextInt();
			StringBuffer ans = new StringBuffer();
			while(n > 0){
				ans.append(n%2+"");
				n = n/2;
			}
			System.out.println(ans.reverse());
			N--;
		}
		scan.close();
		
	}
}
