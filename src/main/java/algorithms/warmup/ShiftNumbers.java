package algorithms.warmup;

import java.util.Arrays;

/**
 * Given an array with 1 and 0's
 * shift all 1's to left and 0's to right
 * 
 * @author marram
 *
 */
public class ShiftNumbers {
	public static void main(String[] args) {
//		int []input = {0,0,1,0,0,0,1,1,1,1};
		int []input = {1,1,0,0,0,0,1,1,1,1};
		System.out.println("input length "+input.length);
		
		int j = 0;
		
		for(int i = 1 ; i < input.length; i++){
			if(input[i] == 1 && input[j] == 0){
				int k = input[i];
				input[i] = input[j];
				input[j] = k;
				j++;
			}else if(input[i] == 0 && input[j] == 1){
				int k = input[i];
				input[i] = input[j];
				input[j] = k;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(input));
	}
}