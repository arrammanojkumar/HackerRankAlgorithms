package thirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		System.out.println("h");

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());

			while (n > 0) {

				boolean flag = true;
				String regex = br.readLine();

				try {
					Pattern.compile(regex);
				} catch (Exception e) {
					flag = false;
				}

				if (flag) {
					System.out.println("Valid");
				} else {
					System.out.println("Invalid");
				}

				n--;
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
