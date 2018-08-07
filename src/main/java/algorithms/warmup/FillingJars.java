package algorithms.warmup;

import java.util.Scanner;

public class FillingJars {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String split[] = scan.nextLine().trim().split(" ");
		
		long n = Long.parseLong(split[0]);
		long m = Long.parseLong(split[1]);
		
		long sum = 0;
		
		while(m > 0)
		{
			String splitted[] = scan.nextLine().trim().split(" ");
			long a = Long.parseLong(splitted[0]);
			long b = Long.parseLong(splitted[1]);
			long k = Long.parseLong(splitted[2]);
			long c = Math.abs(a-b)+1;
			sum += (k*c);
		}
		
		System.out.println(sum/n);
		scan.close();
	}
}
