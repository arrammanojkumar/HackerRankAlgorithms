/**
 * Problem Statement
 * 
 * You are given an integer N. Find the digits in this number that exactly divide N and display their count. For N = 24, there are 2 digits - 2 & 4. Both of these digits exactly divide 24. So our answer is 2.
 * 
 * Note
 * 
 * If the same number is repeated twice at different positions, it should be counted twice, e.g., For N=122, 2 divides 122 exactly and occurs at ones' and tens' position. So it should be counted twice. So for this case, our answer is 3.
 * 
 * Division by 0 is undefined.
 * 
 * Input Format
 * 
 * The first line contains T (number of test cases) followed by T lines (each containing an integer N).
 * 
 * Constraints
 * 
 * 1 <=T <= 15 
 * 0 < N < 10^10
 * 
 * Output Format
 * 
 * For each test case, display the count of digits in N that exactly divide N in separate line.
 * 
 * Sample Input
 * 
 * 2
 * 12
 * 1012
 * 
 * Sample Output
 * 2
 * 3
 */
package algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDigits {
	public static void main(String[] args) {
		
		try {
			FindDigits fd = new FindDigits();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			
			while(n > 0)
			{
				int count = fd.divideCount(Integer.parseInt(br.readLine()));
				System.out.println(count);
				n--;
			}
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public int divideCount(int number)
	{
		int count = 0;
		int mainNumber = number;
		while(number > 0)
		{
			int rem = number % 10;
			if( rem != 0 && ( mainNumber % rem ) == 0)
			{
				count++;
			}
			number = number / 10;
		}
		
		return count;
	}
}
