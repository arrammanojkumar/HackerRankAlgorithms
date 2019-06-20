package algorithms.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Manoj Kumar Arram
 *
 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
 *
 */
public class MakingAnagrams {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int[] counts = new int[26];
        for(char c : a.toCharArray()){
            counts[c-'a']++;
        }

        for(char c : b.toCharArray()){
            counts[c-'a']--;
        }

        int res = 0;
        for(int i : counts){
            res += Math.abs(i);
        }
        return res;
    }
}
