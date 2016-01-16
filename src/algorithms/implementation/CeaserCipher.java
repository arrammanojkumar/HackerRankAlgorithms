package algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CeaserCipher {

	public static void main(String[] args) {

		try {
			BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
			int stringLength = Integer.parseInt(scan.readLine());

			String text = scan.readLine();
			int k = Integer.parseInt(scan.readLine()) % 26;

			// ASCII values
			// 65 to 90 - Capital english letters
			// 97 to 122 - Small english letters

			for (int i = 0; i < stringLength; i++) {

				int c = (int) text.charAt(i);
				// capital letters
				if (c >= 'A' && c <= 'Z') {
					
					int ck = c + k;
					if (ck > 'Z')
						ck = ('A') + ( ( (ck) % 'Z' ) -1 );
					
					System.out.print((char)ck);
				}
				// small letters
				else if (c >= 'a' && c <= 'z') {

					int ck = c + k;
					if (ck > 'z')
						ck = ('a') + ( ( (ck) % 'z' ) -1 );
					
					System.out.print((char)ck);
					
				} else {
					System.out.print((char) c);
				}
			}
			scan.close();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}