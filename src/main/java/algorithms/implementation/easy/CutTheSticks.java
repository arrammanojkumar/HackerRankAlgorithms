package algorithms.implementation.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class CutTheSticks {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Integer> list = new ArrayList<Integer>();

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(scan.readLine());

		String[] array = scan.readLine().split(" ");

		for (int i = 0; i < n; i++)
			list.add(Integer.parseInt(array[i]));

		while (list.size() > 0) {
			int min = Collections.min(list);
			System.out.println(list.size());
			
			for (int i = 0; i < list.size(); i++) {
				if (min == list.get(i)){
					list.remove(i);i--;
				}
				else
					list.set(i, list.get(i) - min);
			}
		}
		scan.close();
	}
}