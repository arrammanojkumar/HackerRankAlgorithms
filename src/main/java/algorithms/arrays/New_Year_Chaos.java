package algorithms.arrays;

import java.util.Scanner;

public class New_Year_Chaos {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

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
            /**
             * Anyone who bribed q[i] cannot get to higher than
             * one position in front if q[i]'s original position,
             * so we need to look from one position in front
             * of q[i]'s original position to one in front of q[i]'s
             * current position, and see how many of those
             * positions in q[j] contain a number large than q[i].
             *
             */
            for(int j = Math.max(0, q[i]-2); j < i; j++) if(q[j] > q[i] ) bribes++;
        }
        System.out.println(bribes);
    }
}
