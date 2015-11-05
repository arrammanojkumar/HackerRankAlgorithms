package algorithms.warmup;
/*
 * Little Bob loves chocolates and goes to the store with a $N bill with $C being the price of each chocolate. 
 * In addition, the store offers a discount: for every M wrappers he gives the store, he’ll get one chocolate for free. How many chocolates does Bob get to eat?

Input Format:
The first line contains the number of test cases T (<=1000). 
Each of the next T lines contains three integers N, C and M

Output Format:
Print the total number of chocolates Bob eats.

Constraints:
2 <= N <= 100000
1 <= C <= N
2 <= M <= N

Sample input

3
10 2 5
12 4 4
6 2 2
Sample Output

6
3
5

Explanation 
In the first case, he can buy 5 chocolates with $10 and exchange the 5 wrappers
to get one more chocolate thus making the total number of chocolates he can eat as 6

In the second case, he can buy 3 chocolates for $12. However, it takes 4 wrappers to get one more chocolate. 
He can’t avail the offer and hence the total number of chocolates remains 3.

In the third case, he can buy 3 chocolates for $6. Now he can give 2 of this 3 wrappers and get 1 chocolate. 
Again, he can use his 1 unused wrapper and 1 wrapper of new chocolate to get one more chocolate. Total is 5.
 */
import java.util.Scanner;

 public class ChocolateFeast {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
		}
		in.close();
	}

	private static long Solve(int n, int c, int m) {
		// N is Bill
		// C is Price of chocolate
		// M is no of wrappers
/*
		int chocolates = n / c;
		int extra = chocolates / m;
		int rem = 0;
		int remainingChocolates = n % c;
		while( (extra+remainingChocolates) >= m) {
			rem = chocolates % m;
			if ((rem + extra) / m != 0) {
				rem = (rem + extra) / m;
			}else
			rem = 0;
		}
		return chocolates + extra + rem;*/
		int chocolates = n/c;
		int extra = chocolates / m;
		int remain = chocolates % m;

		int total = chocolates + extra;
		
		while((remain+extra)>=m)
		{
			int choco = (remain + extra);
			extra = choco / m;
			remain = choco % m;
			total += choco + extra;
		}
				
		return total;
		// Write code to solve each of the test over here
	}
}
