package thirtyDaysOfCode;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		System.out.println("h");
		
		Scanner scan = new Scanner(System.in);
		
		// return date
		int d1 = scan.nextInt();
		int m1 = scan.nextInt();
		int y1 = scan.nextInt();
		
		// expected date
		int d = scan.nextInt();
		int m = scan.nextInt();
		int y = scan.nextInt();

		if(y >= y1 && m1 <= m && d1 < d){
			System.out.println(0);
		}else if(y == y1 && m == m1 && d < d1){
			System.out.println(15 * (d1-d));
		}else if(y == y1 && m < m1 ){
			System.out.println(500 * (m1-m));
		}else if(y < y1 ){
			System.out.println(10000);
		}
		
		scan.close();
	}
}
