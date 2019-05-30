package thirtyDaysOfCode;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		while(N > 0){
			int a = scan.nextInt();	
			int b = scan.nextInt();
			int n = scan.nextInt();
			
			int total = a + b;
			System.out.print(total+" ");
			for(int i = 1 ; i < n ; i++){
				total += (Math.pow(2, i)*b);
				System.out.print(total+" ");
			}
			N--;
			System.out.println();
		}
		scan.close();
	}
}
