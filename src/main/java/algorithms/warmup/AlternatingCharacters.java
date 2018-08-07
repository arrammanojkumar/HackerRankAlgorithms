/**
 * Shashank likes strings in which consecutive characters are different. For example, he likes ABABA, while he doesn't like ABAA. Given a string containing characters A and B only, he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.
 * Your task is to find the minimum number of required deletions.
 * 
 * Input : 
 * 5
 * AAAA
 * BBBBB
 * ABABABAB
 * BABABA
 * AAABBB
 * 
 * Output :
 * 3
 * 4
 * 0
 * 0
 * 4
 * 
 * Explanation:
 * AAAA -- A, 3 deletions
 * BBBBB -- B, 4 deletions
 * ABABABAB -- ABABABAB, 0 deletions
 * BABABA -- BABABA, 0 deletions
 * AAABBB -- AB, 4 deletions
 * 
 */

package algorithms.warmup;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n > 0)
		{
			System.out.println(getResult(scan.next()));
			n--;
		}
		scan.close();
	}
	
	public static int getResult(String input)
	{
		int result = 0;
		for(int i = 0 ; i < input.length()-1; i = i + 1)
		{
			if (!((input.charAt(i) == 'A' && input.charAt(i+1) == 'B') || (input.charAt(i) == 'B' && input.charAt(i+1) == 'A')))
			{
				result++;
			}
		}
		return result;
	}
}
