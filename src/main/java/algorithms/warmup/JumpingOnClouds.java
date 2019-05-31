package algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnClouds {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println("result is: " + result);
        scanner.close();
    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for(int index = 0; index < c.length; index += 2){
            if(c[index] == 1) {
                index -= 1;
                jumps++;
            }
            else if(index != c.length-1)
                jumps++;
        }
        return jumps;
    }
}
