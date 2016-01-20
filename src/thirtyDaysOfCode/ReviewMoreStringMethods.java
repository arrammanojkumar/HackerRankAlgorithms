package thirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReviewMoreStringMethods {

	public static void main(String[] args) {
		
		System.out.println("h");
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			StringTokenizer tokens = new StringTokenizer(s, "![,?./\\/_'@+] ");
			
			System.out.println(tokens.countTokens());
			while(tokens.hasMoreTokens()){
				System.out.println(tokens.nextToken());
			}
					
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}