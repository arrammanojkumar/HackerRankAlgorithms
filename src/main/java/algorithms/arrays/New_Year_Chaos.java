package algorithms.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class New_Year_Chaos {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int t = scanner.nextInt();
        int t = 2;
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
//            int n = scanner.nextInt();
            int n = 5;
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//            int[] q = new int[n];
            int[] q = {2, 1, 5, 3, 4};

//            String[] qItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int qItem = Integer.parseInt(qItems[i]);
//                q[i] = qItem;
//            }

            minimumBribes(q);
            break;
        }

        scanner.close();
    }

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int bribes = 0;
        for(int i = q.length-1; i > -1; i--){
            if(q[i] - (i+1) > 2){
                System.out.println("Too chaotic");
                return;
            }
            for(int j = Math.max(0, q[i]-2); j < i; j++) if(q[j] > q[i] ) bribes++;
        }
        System.out.println(bribes);
    }

}
