package algorithms.dictionariesAndHashMaps;

import java.io.*;
import java.util.*;

/**
 * @author Manoj Kumar Arram
 */
public class CountTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr.add(arrItem);
        }

        long ans = countTriplets(arr, r);
        System.out.println(ans);

    }

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        int tripletCounts = 0;

        Map<Long, Long> doublet = new HashMap<>();
        Map<Long, Long> triplet = new HashMap<>();

        for(Long a : arr) {
            tripletCounts += triplet.getOrDefault(a, 0L);
            if (doublet.containsKey(a)){
                triplet.put(a*r, triplet.getOrDefault(a*r, 0L) + doublet.get(a));
            }
            doublet.put(a*r, doublet.getOrDefault(a*r, 0L) + 1);
        }
        return tripletCounts;
    }
}
