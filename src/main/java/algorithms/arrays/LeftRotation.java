package algorithms.arrays;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * https://www.hackerrank.com/challenges/2d-array/problem
 *
 * @author  Manoj Kumar Arram
 */
public class LeftRotation {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int newLocation = (i + (n - d)) % n;
            a[newLocation] = Integer.parseInt(aItems[i]);
        }

        int[] result = rotLeft(a, d);
        for(int item : result){
            System.out.print(item +" ");
        }

        scanner.close();
    }

    // Complete the rotLeft function below.
    static int[] solution2(int[] a, int d) {
        int initIndex = 0;
        int[] b = new int[a.length];
        for(int i = 0; i < b.length ; i++){
            if(d < a.length){
                b[i] = a[d];
                d++;
            }else{
                b[i] = a[initIndex];
                initIndex++;
            }

        }
        return b;
    }

    // Solution Type 2
    static int[] rotLeft(int[] a, int d) {
        return a;
    }
}
