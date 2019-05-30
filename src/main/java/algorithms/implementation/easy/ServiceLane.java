package algorithms.implementation.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ServiceLane {

	public static void main(String[] args) {
		
		System.out.println("h");
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String []array = br.readLine().split(" ");
			int T = Integer.parseInt(array[1]);
			
			String width[] = br.readLine().split(" ");
			
			while(T>0){
				
				String []testCases = br.readLine().split(" ");
				int start = Integer.parseInt(testCases[0]);
				int end = Integer.parseInt(testCases[1]);
				
				int min = Integer.MAX_VALUE;
				
				for(int i = start; i <=end ; i++){
					if(min > Integer.parseInt(width[i])) min = Integer.parseInt(width[i]);
				}
				
				System.out.println(min);
				
				T--;
			}
			
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
