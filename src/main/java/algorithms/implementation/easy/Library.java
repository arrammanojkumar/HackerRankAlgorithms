package algorithms.implementation.easy;

import java.util.Calendar;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Calendar submittedDate = Calendar.getInstance();
		Calendar expectedDate = Calendar.getInstance();

		// actual
		int da = scan.nextInt();
		int ma = scan.nextInt();
		int ya = scan.nextInt();
		submittedDate.set(ya, ma-1, da);

		// expected
		int de = scan.nextInt();
		int me = scan.nextInt();
		int ye = scan.nextInt();
		expectedDate.set(ye, me-1, de);

		if (submittedDate.before(expectedDate) || submittedDate.equals(expectedDate)) {
			System.out.println("0");
		} else if (submittedDate.get(Calendar.YEAR) > expectedDate.get(Calendar.YEAR)) {
			System.out.println("10000");
		} else if (submittedDate.get(Calendar.YEAR) == expectedDate.get(Calendar.YEAR) 
				&& submittedDate.get(Calendar.MONTH) > expectedDate.get(Calendar.MONTH)) {
			// 500 hackos
			System.out.println((submittedDate.get(Calendar.MONTH) - expectedDate.get(Calendar.MONTH)) * 500);
		}else if(submittedDate.get(Calendar.YEAR) == expectedDate.get(Calendar.YEAR) 
				&& submittedDate.get(Calendar.MONTH) == expectedDate.get(Calendar.MONTH)){
			// 15 Hackos
			System.out.println((submittedDate.get(Calendar.DATE) - expectedDate.get(Calendar.DATE)) * 15);
		}else{
			System.out.println("0");
		}

		scan.close();
	}
}