package algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		try {
			String timeIn12 = br.readLine();

			// If we have AM then print as it is
			// If time is 12 AM then print 00:00:00
			if (timeIn12.contains("AM")) {
				if (timeIn12.split(":")[0].contains("12")) {
					String min = timeIn12.split(":")[1];
					String sec = timeIn12.split(":")[2].replace("AM", "");
					System.out.println("00:" + min + ":" + sec);
				} else {
					System.out.println(timeIn12.replaceAll("AM", ""));
				}
			} else if (timeIn12.contains("PM")) {
				if (timeIn12.split(":")[0].contains("12")) {
					String min = timeIn12.split(":")[1];
					String sec = timeIn12.split(":")[2].replace("PM", "");
					System.out.println(timeIn12.split(":")[0]+":" + min + ":" + sec);
				} else {
					int hours = Integer.parseInt(timeIn12.split(":")[0]);
					String min = timeIn12.split(":")[1];
					String sec = timeIn12.split(":")[2].replace("PM", "");
					if (hours + 12 < 24)
						System.out.println((hours + 12) + ":" + min + ":" + sec);
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
