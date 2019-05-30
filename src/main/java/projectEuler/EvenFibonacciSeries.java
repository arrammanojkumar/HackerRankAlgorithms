package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Working Super Optimized code
 * 
 * 
 * 		long t1 = System.nanoTime();
		int b = 1;
		int c = 2, d;
		long sum = 0;
		while(c < 4000000) {
		    sum += c;
		    d = b+(c<<0x01);
		    c = d+b+c;
		    b = d;
		}
		long t2 = System.nanoTime();
		System.out.println(sum);
		System.out.println("Total time : "+(t2-t1));


////---> Notice That:: Every third term of this series is even.... and the series of even terms goes like 0,2,8,34,... so any even term E(n)can be expressed as E(n)= 4*E(n-1) + E(n-2)....

 * @author marram
 *
 */

public class EvenFibonacciSeries {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		while(n > 0){
			long N = Integer.parseInt(br.readLine());
			System.out.println(getEvenFibonacciSum(N));
			n--;
		}
		br.close();
	}
	
	public static long getEvenFibonacciSum(long n){
		long sum = 0;
		
		long f1 = 0;
		long f2 = 1;
		
		while((f1+f2) < n){
			
			if((f1+f2)% 2 == 0) sum+= (f1+f2);
			
			long temp = f1;
			f1 = f2;
			f2 = temp+f2; 
		}
		
		return sum;
	}
	
}
