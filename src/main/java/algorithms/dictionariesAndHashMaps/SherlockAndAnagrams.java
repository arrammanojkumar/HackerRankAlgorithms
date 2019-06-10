package algorithms.dictionariesAndHashMaps;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem
 *
 * @author Manoj Kumar Arram
 */
public class SherlockAndAnagrams {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);
            System.out.println(result);
        }
        scanner.close();
    }

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> map= new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char[] valC = s.substring(i, j+1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                if(map.containsKey(val)) map.put(val, map.get(val)+1);
                else map.put(val, 1);
            }
        }
        int anagramPairCount = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            /*
            If a string has "n" anagrams.
            Total (n * (n-1))/2 anagrams can be formed
            */
            anagramPairCount += (n * (n-1))/2;
        }
        return anagramPairCount;
    }

}
