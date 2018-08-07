package algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * You are given N sticks, where each stick is of positive integral length. A
 * cut operation is performed on the sticks such that all of them are reduced by
 * the length of the smallest stick. Suppose we have 6 sticks of length 5 4 4 2
 * 2 8 then in one cut operation we make a cut of length 2 from each of the 6
 * sticks. For next cut operation 4 sticks are left (of non-zero length), whose
 * length are 3 2 2 6 Above step is repeated till no sticks are left.
 * 
 * Given length of N sticks, print the number of sticks that are cut in
 * subsequent cut operations.
 * 
 * Input Format The first line contains a single integer N. The next line
 * contains N integers: a0, a1,...aN-1 separated by space, where ai represents
 * the length of ith stick.
 * 
 * Output Format For each operation, print the number of sticks that are cut in
 * separate line.
 * 
 * Sample Input #00 6 5 4 4 2 2 8 Sample Output #00 6 4 2 1
 * 
 * Explanation
 * 
 * Sample Case #00 :
 * 
 * sticks-length length-of-cut sticks-cut
 * 
 * 5 4 4 2 2 8 2 6 3 2 2 _ _ 6 2 4 1 _ _ _ _ 4 1 2 _ _ _ _ _ 3 3 1 _ _ _ _ _ _
 * DONE DONE
 * 
 * 
 * https://www.hackerrank.com/challenges/cut-the-sticks
 * 
 * @author Mani
 * 
 */
public class CutTheSticks {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			Integer.parseInt(br.readLine());

			String[] line = br.readLine().split(" ");
			ArrayList<Integer> list = new ArrayList<>();

			for (int i = 0; i < line.length; i++)
				list.add(Integer.parseInt(line[i] + ""));

			while (list.size() > 0) {
				int min = Collections.min(list);
				System.out.print("List is "+list+"    : " );
				System.out.println(list.size());

				for (int i = 0; i < list.size(); i++) {
					int temp = list.get(i);
					if (temp > min) {
						list.remove(i);
						list.add(i, (temp - min));
					}else
						list.remove(i);
				}
				
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}

	}
}
