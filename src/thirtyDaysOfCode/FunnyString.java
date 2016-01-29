package thirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunnyString {

	public static void main(String[] args) throws IOException {
		System.out.println("h");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while(t > 0){
			
			String s = br.readLine();
			String r = new StringBuilder(s).reverse().toString();
			
			boolean flag = true;
			
			for(int i = 1; i < s.length(); i++){
				if( ( Math.abs(s.charAt(i) - s.charAt(i-1)) != 
						Math.abs(r.charAt(i) - r.charAt(i-1)) ) ){
					flag = false;
					break;
				}
			}
			
			if(flag) System.out.println("Funny");
			else System.out.println("Not Funny");
			t--;
		}
	}
}
