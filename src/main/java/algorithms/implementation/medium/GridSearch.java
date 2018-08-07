package algorithms.implementation.medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GridSearch {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int T = Integer.parseInt(br.readLine());

			while (T > 0) {

				// read input grid
				String[] dim = br.readLine().split(" ");
				int m = Integer.parseInt(dim[0]);
				int n = Integer.parseInt(dim[1]);

				int[][] grid = new int[m][n];
				for (int i = 0; i < m; i++) {
					String row = br.readLine();
					for (int j = 0; j < row.length(); j++) {
						grid[i][j] = Integer.parseInt(row.charAt(j) + "");
					}
				}

				// read patterns input
				dim = br.readLine().split(" ");
				int p = Integer.parseInt(dim[0]);
				int q = Integer.parseInt(dim[1]);

				int[][] pattern = new int[p][q];
				for (int i = 0; i < p; i++) {
					String row = br.readLine();
					for (int j = 0; j < row.length(); j++) {
						pattern[i][j] = Integer.parseInt(row.charAt(j) + "");
					}
				}

				int match = pattern[0][0];

				boolean flag = false;

				outer: 
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						if (grid[i][j] == match) {

							if (i + p <= m && j + q <= n){
								flag = getMatch(grid, m, n, pattern, p, q, i, j);

								if (flag) {
									System.out.println("YES");
									break outer;
								}
							}
						}
					}
				}

				if (!flag)
					System.out.println("NO");
				T--;
			}

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean getMatch(int[][] grid, int m, int n, int[][] pattern, int p, int q, int i, int j) {
		boolean result = false;

		int k = i;
		int l = j;

		outer:
		for (int r = 0; r < p; r++) {
			for (int s = 0; s < q; s++) {
				if(pattern[r][s] == grid[k][l]){
					result = true;
				}else{
					result = false;
					break outer;
				}
				l++;
			}
			l = j;
			k++;
		}
		return result;
	}
}
