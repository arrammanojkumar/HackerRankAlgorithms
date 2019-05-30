package thirtyDaysOfCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClosestNumbers {
	/**
	 * -20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854
	 * -520 -470
	 * 
	 * 
	 * 10
	 * 
	 * -20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 
	 * -6461594 266854 
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n > 0) {
			n--;
			list.add(scan.nextInt());
		}
		Collections.sort(list);

		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < list.size() - 1; i++) {
			if(min > Math.abs(list.get(i)-list.get(i+1))){
				min = Math.abs(list.get(i)-list.get(i+1));
			}
		}
		for (int i = 0; i < list.size() - 1; i++) {
			if(min == Math.abs(list.get(i)-list.get(i+1))){
				System.out.print(list.get(i)+" "+list.get(i+1)+" ");
			}
		}
		scan.close();
	}
}