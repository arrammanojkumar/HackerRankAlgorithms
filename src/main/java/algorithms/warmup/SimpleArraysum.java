package algorithms.warmup;

import java.util.Scanner;

/**
 * You are given an array of integers of size N. Can you find the sum of the
 * elements in the array?
 * 
 * The first line of input consists of an integer N. The next line contains N
 * space-separated integers representing the array elements.
 * 
 * @author Mano
 *
 */

public class SimpleArraysum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		long sum = 0;
		
		for ( int i = 0; i < size; i++)
			sum += scan.nextLong();
		
		System.out.println(sum);
		scan.close();
	}
}
