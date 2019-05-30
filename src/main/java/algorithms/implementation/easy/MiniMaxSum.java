package algorithms.implementation.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by marram on 8/7/18.
 */
public class MiniMaxSum {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] line = br.readLine().split(" ");

            Integer[] array = new Integer[5];
            for (int i = 0; i < line.length; i++)
                array[i] = Integer.parseInt(line[i]);

            long sum = 0;
            long min = Long.MAX_VALUE;
            long max = 0;

            for (int i = 0; i < array.length; i++) {
                if (min > array[i])
                    min = array[i];
                if (max < array[i])
                    max = array[i];

                sum += array[i];

            }
            System.out.println((sum - max) + " " + (sum - min));

        } catch (Exception e) {

        }
    }

}
