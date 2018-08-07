package algorithms.implementation.medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			BigInteger a = new BigInteger("1");
			
			for(int i = n; i > 0; i--){
				a = a.multiply(BigInteger.valueOf(i));
			}
			
			System.out.println(a);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
