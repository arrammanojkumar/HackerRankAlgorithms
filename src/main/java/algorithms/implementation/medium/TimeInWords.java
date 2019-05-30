package algorithms.implementation.medium;

import java.util.Scanner;

public class TimeInWords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int iHour = scan.nextInt();
		String hour = numbers.values()[iHour].toString();
		
		int iMin = scan.nextInt();
		
		if(iMin == 0){
			System.out.println(hour+" o' clock");
		}
		else if(iMin == 15 || iMin ==30){
			System.out.println(getQuadrants(iMin)+" past "+hour);
		}
		// below half n hour
		else if(iMin < 30){
			printMin(iMin, hour, true);
		}
		// above half n hour
		else{
			if(iHour +1 > 12){
				hour = numbers.values()[iHour+1 - 12].toString();
			}else{
				hour = numbers.values()[iHour+1].toString();	
			}
			
			int lMin = 60 - iMin;
			if(lMin == 15){
				System.out.println(getQuadrants(lMin)+" to "+hour);
			}else{
				printMin(lMin, hour, false);	
			}
		}
		
		scan.close();
	}

	public static void printMin(int iMin, String hour, boolean below){
		
		String connector = null;
		
		if(below) connector = " minutes past ";
		else connector = " minutes to ";
		
		//if min 20
		if(iMin == 20) System.out.println(tens.twenty.toString()+connector+hour);
		
		// below 20
		else if(iMin < 20){
			System.out.println(getMin(iMin)+connector+hour);
		}
		
		// between 20 to 30
		else if( iMin < 30){
			System.out.println(tens.twenty.toString()+" "+getMin(iMin-20)+connector+hour);
		}
		
	}
	/**
	 * Gives only quarters
	 *  
	 * @param min
	 * @return
	 */
	public static String getQuadrants(int min) {
		for(Quadrants type : Quadrants.values()){
			if(type.getValue() == min) return type.toString();
		}
		return null;
	}
	
	public static String getMin(int min){
		for(numbers type : numbers.values()){
			if(type.ordinal() == min) return type.toString();
		}
		return null;
	}
}

enum numbers {
	zero, one, two, three, four, five, six, seven, eight, nine, ten, 
	eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventenn, eighteen, nineteen,
}

enum tens {
	ten(10), twenty(20), thirty(30), fourty(40), fifty(50), sixty(60);

	private int val;

	private tens(int val) {
		this.val = val;
	}

	public int getValue() {
		return this.val;
	}
}

enum Quadrants {
	quarter(15), half(30);
	
	private int val;

	private Quadrants(int val) {
		this.val = val;
	}

	public int getValue() {
		return this.val;
	}
}