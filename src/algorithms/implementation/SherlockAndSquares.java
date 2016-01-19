package algorithms.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SherlockAndSquares {

	/**
	 * 
	 * Explanation for that formulae :
	 * 
	 * 
	 * Suppose you want to calculate all the square integers between 3 and 14. 
	 * calculate the square roots of the end points..that will be around 1.73 and 3.74. 
	 * Now the integers between 1.73 and 3.74 are 2 and 3 which is what we want. 
	 * To get this we use the ceil function on 1.73 which becomes 2 and we use the floor function on 3.74 which becomes 3. 
	 * Their difference is 1. 
	 * We add 1 to the difference because we rounded off 1.73 to 2 and since 2 is an integer we need to consider it also.
	 * 
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());

			while (n > 0) {
				
				int k = 0;
				String s[] = br.readLine().split(" ");
				int start = Integer.parseInt(s[0]);
				int end = Integer.parseInt(s[1]);

				//Best solution
				System.out.println( (int)( Math.floor(Math.sqrt(end)) - Math.ceil(Math.sqrt(start)) + 1) );
				
				// Other solution
				for(int i = 1; ; i++){
					if(i*i > end) break;
					if( i*i <= end || i*i >= start) k++;
				}
				System.out.println(k);
				n--;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}