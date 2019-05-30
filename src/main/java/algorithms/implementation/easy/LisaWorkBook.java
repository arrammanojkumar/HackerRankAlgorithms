package algorithms.implementation.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters.
 * 
 * There are n chapters in Lisa's workbook, numbered from 1 to n. 
 * The i-th chapter has ti problems, numbered from 1 to ti. 
 * Each page can hold up to k problems. 
 * 
 * There are no empty pages or unnecessary spaces, so only the last page of a chapter may contain fewer than k problems. 
 * Each new chapter starts on a new page, so a page will never contain problems from more than one chapter. 
 * The page number indexing starts at 1.
 * 
 * Lisa believes a problem to be special if its index (within a chapter) is the same as the page number where it's located. 
 * Given the details for Lisa's workbook, can you count its number of special problems?
 * 
 * Ref : https://www.hackerrank.com/challenges/bear-and-workbook
 * 
 * @author marram
 *
 */
public class LisaWorkBook {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int specialIndexes = 0;
			String[] line = br.readLine().split(" ");

			int totalChapters = Integer.parseInt(line[0]);
			int problemsThreshold = Integer.parseInt(line[1]);

			String[] problemsInEachChapter = br.readLine().split(" ");
			int pageIndex = 1;

			for (int i = 1; i <= totalChapters; i++) {
				
				int problemsInCurrentChapter = Integer.parseInt(problemsInEachChapter[i - 1]);
				int window = 1;
				int threshold = 0;
				
				while (window <= problemsInCurrentChapter) {
					
					threshold = 0;
					if( (window + (problemsThreshold -1) ) <= problemsInCurrentChapter){
						threshold = (window + problemsThreshold -1 );
					}else{
						threshold = problemsInCurrentChapter;
					}
					
					if(pageIndex >= window && pageIndex <= threshold){
						System.out.println(pageIndex+" "+window+" "+threshold+" "+problemsInCurrentChapter);
						specialIndexes++;
					}
					
					window += problemsThreshold;
					pageIndex++;
				}

			}

			System.out.println(specialIndexes);

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}