package algorithms.arrays;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/crush/problem
 *
 * @author  Manoj Kumar Arram
 */
public class ArrayManipulation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        scanner.close();
    }

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] query) {
        int[][] queries = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1}
        };

        long maxVal = Long.MIN_VALUE;
        int[] cache = new int[n];

        for(int i =0; i < queries.length; i++){
            int lower = queries[i][0] - 1;
            int upper = queries[i][1] ;
            int sum = queries[i][2];

            cache[lower] += sum;
            if(upper<n) cache[upper] -= sum;
        }

        long temp = 0;

        for(int i =0 ; i < cache.length; i++){
            temp += cache[i];
            maxVal = maxVal < temp ? temp : maxVal;
        }

        return maxVal;
    }

}
