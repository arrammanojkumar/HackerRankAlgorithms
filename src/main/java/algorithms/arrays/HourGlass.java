package algorithms.arrays;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * https://www.hackerrank.com/challenges/2d-array/problem
 *
 * @author  Manoj Kumar Arram
 *
 */
public class HourGlass {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0},
        };

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);

        scanner.close();
    }

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (i + 1 > arr.length - 1 || i + 2 > arr.length - 1 ||
                        j + 1 > arr.length - 1 || j + 2 > arr.length - 1) continue;
                int sum = 0;
                sum += (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
                maxSum = maxSum < sum ? sum : maxSum;
            }
        }
        return maxSum;
    }
}
