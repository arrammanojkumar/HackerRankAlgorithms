package thirtyDaysOfCode;

import java.util.Scanner;

public class AllAboutScope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Difference D = new Difference(a);

		D.computeDifference();

		System.out.print(D.maximumDifference);
		
		sc.close();
	}
}

class Difference {
	private int[] elements;
	public int maximumDifference;
	
	public Difference(int[] source){
		this.elements = source; 
	}
	
	public void computeDifference(){
		for(int i = 0 ; i < elements.length; i++){
			for(int j = i+1 ; j < elements.length; j++){
				if( maximumDifference < Math.abs(elements[i] - elements[j]) ){
					maximumDifference = Math.abs(elements[i] - elements[j]);
				}
			}
		}
	}
}