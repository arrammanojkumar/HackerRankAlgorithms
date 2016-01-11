package thirtyDaysOfCode;

public class HourGlass {
	public static void main(String[] args) {
		
		int[][] array = { {1,1,1,0,0,0},
						  {0,1,0,0,0,0},
						  {1,1,1,0,0,0},
						  {0,0,0,1,2,3},
						  {0,0,0,0,4,0},
						  {0,0,0,1,2,1}
						};
		
		int noOfIterations = array.length-2;
		int max = -10000000;

		int noOfHourGlass = 0;
		
		for(int i = 0 ; i < noOfIterations; i++){
			int rowIndex = i;
			
			for(int j = 0; j < noOfIterations; j++){
				int sumOfHourGlass = 0;
				
				// first 3 element
				sumOfHourGlass += array[rowIndex][j];
				sumOfHourGlass += array[rowIndex][j+1];
				sumOfHourGlass += array[rowIndex][j+2];
				
				sumOfHourGlass += array[rowIndex+1][j+1];
				
				sumOfHourGlass += array[rowIndex+2][j];
				sumOfHourGlass += array[rowIndex+2][j+1];
				sumOfHourGlass += array[rowIndex+2][j+2];
				
				System.out.println("Hour Glass "+(++noOfHourGlass));
				
				System.out.println(rowIndex+""+j+" "+rowIndex+""+(j+1)+" "+rowIndex+""+(j+2));
				System.out.println(rowIndex+1+""+(j+1));
				System.out.println((rowIndex+2)+""+j+" "+(rowIndex+2)+""+(j+1)+" "+(rowIndex+2)+""+(j+2));
				
				System.out.println("==========");
				
				if(max < sumOfHourGlass)
					max = sumOfHourGlass;
			}
			
		}
		System.out.println(max);
	}
}