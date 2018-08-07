package algorithms.implementation.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CavityMap {
	public static void main(String[] args) {
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			int array[][] = new int[n][n];
			
			//read array
			for(int i = 0; i < n ; i++){
				String ar = br.readLine();
				for(int j = 0; j < n; j++){
					array[i][j] = Integer.parseInt(ar.charAt(j)+"");
				}
			}
			
			//process
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(i == 0 || i == n-1 || j == 0 || j == n-1){
						System.out.print(array[i][j]);
					}else{
						if(     //up
								array[i-1][j] < array[i][j]
								//down
								&& array[i+1][j] < array[i][j]
								//right
								&& array[i][j-1] < array[i][j]
								//left
								&& array[i][j+1] < array[i][j]
							){
										System.out.print("X");
						}else{
							System.out.print(array[i][j]);	
						}
					}
				}
				System.out.println();
			}
			
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
