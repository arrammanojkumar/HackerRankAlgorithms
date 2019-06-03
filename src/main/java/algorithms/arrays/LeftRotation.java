package algorithms.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String[] nd = scanner.nextLine().split(" ");

//        int n = Integer.parseInt(nd[0]);
        int n = 5;

//        int d = Integer.parseInt(nd[1]);
        int d = 4;

//        int[] a = new int[n];
        int[] a = {1, 2, 3, 4, 5};

//        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int aItem = Integer.parseInt(aItems[i]);
//            a[i] = aItem;
//        }

        int[] result = rotLeft(a, d);
        for(int item : result){
            System.out.print(item +" ");
        }
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
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
}
