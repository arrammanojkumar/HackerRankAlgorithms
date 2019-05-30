package algorithms.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }

    static int countingValleys(int n, String s) {
        boolean isNeg = false;
        int level = 0;
        int valley = 0;

        for (char step : s.toCharArray()) {
            if (step == 'U') level++;
            if (step == 'D') level--;
            if (level < 0) isNeg = true;
            if (isNeg && level == 0) {
                valley++;
                isNeg = false;
            }
        }
        return valley;
    }
}
