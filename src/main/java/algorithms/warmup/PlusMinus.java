package algorithms.warmup;

import java.util.Scanner;

/**
 * You're given an array of integers. Can you find what fraction of the elements are positive numbers, negative numbers and zeroes? Print the value of the fractions in decimal form with 3 decimal places.
 * 
 * @author Mano
 *
 */

/**
 *	Input : 6
			-4 3 -9 0 4 1   
 * Output : 0.500
			0.333
			0.167
*
*	There are 3 positive numbers, 2 negative numbers and 1 zero in the array. 
*	The fraction of the positive numbers, negative numbers and zeroes are 3/6=0.500,2/6=0.333 and 1/6=0.167 respectively.
*/
public class PlusMinus {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noOfElements = scan.nextInt();
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		for( int i = 0 ; i < noOfElements; i++){
			int no = scan.nextInt();
			if( no < 0)
				negative++;
			if ( no > 0)
				positive++;
			if( no == 0)
				zero++;
		}
		
		System.out.printf("%.6f",positive/(float)(noOfElements));
		System.out.println();
		System.out.printf("%.6f",negative/(float)(noOfElements));
		System.out.println();
		System.out.printf("%.6f",zero/(float)(noOfElements));
		
		scan.close();
	}
}
