package algorithms.warmup;

import java.util.Scanner;

/**
 *
 * https://www.hackerrank.com/challenges/repeated-string/problem
 *
 */
public class RepeatedString {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);

        scanner.close();
    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        // get occurrence of letter 'a' in s

        long noOfA = 0;

        // n is less than string length
        if(n < s.length()) {
            for(int i = 0; i < n+1; i++) noOfA = s.charAt(i) == 'a' ? noOfA + 1 : noOfA;
            return noOfA;
        }

        // n is more than string length
        for(char c : s.toCharArray()) noOfA = c == 'a' ? noOfA+1 : noOfA;

        noOfA = ( n / s.length() ) * noOfA;

        if(n % s.length() != 0) {
            n = n % s.length();
            for(int i = 0; i < n; i++) {
                noOfA = s.charAt(i) == 'a' ? noOfA + 1 : noOfA;
            }
        }
        return noOfA;
    }
}
