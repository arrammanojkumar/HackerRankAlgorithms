package algorithms.warmup;
/**
 * John has discovered various rocks. Each rock has a composition consisting of various elements, 
 * where each element is represented by small latin letter (‘a’-‘z’). An element can be present multiple times in a rock. 
 * An element is called gem-element if it has at least one occurence in all of the rocks.
 * Given the list of rocks with their compositions, you have to print how many different kinds of gems-elements he has.
 * 
 * Input Format
 * 
 * The first line consists of N, the number of rocks.
 * Each of the next N lines contain rocks’ composition.
 * Each composition consists of small alphabets of English language.
 * 
 * Output Format
 * Print the number of different kinds of gem-elements he has.
 * 
 * Constraints
 * 1<= N <= 100
 * Each composition consists of only small latin letters (‘a’-‘z’).
 * 1 <= Length of each composition <= 100
 * 
 * Sample Input
 * 
 * 3
 * abcdde
 * baccd
 * eeabg
 * 
 * Sample Output
 * 
 * 2
 * Explanation
 * 
 * Only “a”, “b” are the two kind of gem-elements, since these characters occur in each of the rocks’ composition.
 */
import java.util.HashMap;
import java.util.Scanner;

public class GemStones {
	 
	public static void main(String[] args) {
		HashMap<Character, Integer> resultHash = new HashMap<Character,Integer>();
		
		Scanner scan = new Scanner(System.in);
		int noOfCrystals = scan.nextInt();
		int copyOfNoOfCrystals = noOfCrystals;
		
		String mainRock = "";
		
		if(noOfCrystals > 0)
		{
			mainRock = scan.next();
			
			for(int i = 0 ; i < mainRock.length(); i++)
			{
				resultHash.put(mainRock.charAt(i), 1);
			}
			noOfCrystals--;
		}
		
		Object mainRockArray[] = resultHash.keySet().toArray();
		
		while(noOfCrystals > 0)
		{
			String rockString = scan.next().trim();
			HashMap<Character, Integer> tempHash = new HashMap<>();
			for(int i = 0; i < rockString.length(); i++)
			{
				tempHash.put(rockString.charAt(i), 1);
			}
			Object[] rock =  tempHash.keySet().toArray();

			for(int i = 0 ; i < rock.length; i++)
			{
				if(resultHash.containsKey(rock[i]))
				{
					int count = resultHash.get(rock[i]);
					resultHash.put((Character)rock[i], ++count);
				}else{
					resultHash.remove(rock[i]);
				}
			}
			noOfCrystals--;
		}
		
		int count = 0;
		if(mainRock.length() != 0)
		{
			 for(int i = 0; i < mainRockArray.length; i++)
			 {
				 if(resultHash.containsKey(mainRockArray[i]))
				 {
					 if(resultHash.get(mainRockArray[i]) == copyOfNoOfCrystals)
					 {
						 count++; 
					 }
				 }
			 }
		}
		System.out.println(count);
		scan.close();
	}
}
