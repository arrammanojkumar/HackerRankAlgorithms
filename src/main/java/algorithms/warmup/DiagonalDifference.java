package algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiagonalDifference {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		try {
			// take input
			int N = Integer.parseInt(br.readLine());
			int matrix[][] = takeInput(N);
			int primaryDiagonalSum = 0, secondaryDiagonalSum = 0; 
			for(int i = 0; i < N; i++){
				primaryDiagonalSum += matrix[i][i];
			}
			int j = N-1;
			for(int i= 0 ; i < N; i++){
				secondaryDiagonalSum += matrix[i][j];
				j--;
			}
			System.out.println(Math.abs(primaryDiagonalSum-secondaryDiagonalSum) );
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int[][] takeInput(int N) throws IOException{
		int matrix[][] = new int[N][N];
		
		for(int i = 0 ; i < N; i++){
			String line[] = br.readLine().split(" ");
			for(int j = 0; j < line.length; j++){
				matrix[i][j] = Integer.parseInt(line[j].trim());
			}
		}
		
		return matrix;
	}
}
