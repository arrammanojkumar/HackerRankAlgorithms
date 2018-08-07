/**
 * 
 * You will be given a list of 32-bits unsigned integers. You are required to output the list of the unsigned integers you get by flipping bits in its binary representation 
 * (i.e. unset bits must be set, and set bits must be unset).
 * 
 * Input Format
 * 
 * The first line of the input contains the list size T. T lines follow each line having an integer from the list.
 * 
 * Constraints
 * 1 <= T <= 100
 *
 * 
 * Sample Input:
 * 3 
 * 2147483647
 * 1 
 * 0
 * 
 * Output :
 * 2147483648 
 * 4294967294 
 * 4294967295
 * 
 */

package algorithms.warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class FlippingBits {
	
	public static void main(String[] args) {
		FlippingBits fb = new FlippingBits();
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i = 0 ; i < t; i++)
			System.out.println(fb.flipBits(scan.nextLong()));
		
		scan.close();
	}
	
	public long flipBits(long n)
	{
		long result = 0;
		ArrayList<Long> list = new ArrayList<Long>();
		while( n > 0)
		{
			list.add(n % 2);
			n = n / 2;
		}
		while(list.size() < 32)
		{
			list.add((long)0);
		}
		for(int i = 0 ; i < list.size(); i++)
		{
			if(list.get(i) == 0)
			{
				result += ( 1 * Math.pow(2,i));
			}
		}
		return result;
	}
}
