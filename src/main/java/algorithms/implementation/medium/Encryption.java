package algorithms.implementation.medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Encryption {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String s = br.readLine();
			
			int length = getLength(s);
			int row = (int) Math.floor(Math.sqrt(length));
			int col = (int) Math.ceil(Math.sqrt(length));
			
			while( (row+col) < length){
				row++;
			}
			
			char array[][] = new char[row][col];

			int k = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (s.length() > k) {
						if (s.charAt(k) == ' ')
							++k;
						array[i][j] = s.charAt(k);
						k++;
					}else{
						array[i][j] = '@';
					}
				}
			}
			
			for (int j = 0; j < col; j++) {
				for (int i = 0; i < row; i++) {
					if (array[i][j] == '@') {
					} else
						System.out.print(array[i][j]);
				}
				System.out.print(" ");
			}

			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int getLength(String s) {
		int len = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				len++;
		}
		return len;
	}
}
