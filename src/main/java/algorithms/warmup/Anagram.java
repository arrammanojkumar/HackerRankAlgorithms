package algorithms.warmup;
/**
 * Sid is obsessed about reading short stories. Being a CS student, he is doing some interesting frequency analysis with the books. 
 * From two short story books, he choses strings having length a from the first and strings having length b from the second one. 
 * The strings are such that the difference of length is <= 1
 * 
 * |a-b|<=1, where |x| represents the absolute value function.
 * 
 * He believes that both the strings should be anagrams based on his experiment.
 * Your challenge is to help him find the minimum number of characters of the first string he needs to change to make it an anagram 
 * of the second string.Neither can he add a character nor delete a character from the first string. Only replacement of the 
 * characters with new ones is allowed.
 * 
 * Input Format
 * 
 * First line will contain an integer T representing the number of test cases. Each test case will contain a string having length 
 * (a+b) which will be concatenation of both the strings described in problem. The string will only contain small letters and without any spaces.
 * 
 * Output Format
 * 
 * An integer corresponding to each test case is printed in a different line i.e., the number of changes required for each test case. Print -1 if it is not possible.
 * 
 * Constraints
 * 
 * 1<=T<=100
 * 
 * length of input string i.e. 1<=a+b<=10000
 * 
 * Sample Input
 * 
 * 5
 * 
 * aaabbb
 * ab
 * abc
 * mnop
 * xyyx
 * 
 * Sample Output
 * 
 * 3
 * 1
 * -1
 * 2
 * 0 
 * 
 * Explanation
 * 
 * In fifth test case, first string will be xy while second string will be yx . so a = 2 and b = 2, where a and b are length of strings. As we can see that a and b are following relation
 * 
 * |a-b|<=1
 * 
 * and both strings are anagrams.So number of changes required = 0.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		try
          {
        Scanner scan = new Scanner(System.in);
		int noOfTestCases = scan.nextInt();

		while(noOfTestCases > -1)
		{
			String word = scan.next();

			char aWord[] = word.substring(0, word.length()/2).toString().toCharArray();
			char bWord[] = word.substring(word.length()/2, word.length()).toCharArray();
			
			if(aWord.length != bWord.length)
			{
				if((aWord.length - bWord.length)<0)
					System.out.println(aWord.length - bWord.length);
				else
					System.out.println("-"+(aWord.length - bWord.length));
			}else{
				ArrayList list = new ArrayList();
				for(int i = 0 ; i < bWord.length; i++)
				{
					for(int j = 0 ; j < aWord.length; j++)
					{
						if(aWord[i] == bWord[j]) 
						{
							if(!list.contains(j))
							{
								list.add(j);
								break;
							}
						}
					}
				}
				System.out.println(bWord.length - list.size());
			}
			noOfTestCases--;
		}
		scan.close();
        }
        catch(Exception e){}
	}
}

