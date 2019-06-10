package algorithms.dictionariesAndHashMaps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * https://www.hackerrank.com/challenges/two-strings/problem
 *
 * @author Manoj Kumar Arram
 */
public class TwoStrings {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int q = scanner.nextInt();

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(qItr + "Result : "+ result);
        }

        scanner.close();
    }

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s1.toCharArray()){
            map.put(c, 1);
        }
        for(char c: s2.toCharArray()){
            if(map.containsKey(c)) return "YES";
        }

        return "NO";
    }

}
