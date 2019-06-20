package algorithms.dictionariesAndHashMaps;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/frequency-queries/problem
 *
 * @author Manoj Kumar Arram
 */
public class FrequencyQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bufferedReader.readLine().trim());
        List<int[]> queries = new ArrayList<>(q);
        Pattern p = Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$");
        for (int i = 0; i < q; i++) {
            int[] query = new int[2];
            Matcher m = p.matcher(bufferedReader.readLine());
            if (m.matches()) {
                query[0] = Integer.parseInt(m.group(1));
                query[1] = Integer.parseInt(m.group(2));
                queries.add(query);
            }
        }
        List<Integer> ans = freqQuery(queries);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        bufferedWriter.write(
                ans.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining("\n"))
                        + "\n");
    }

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<int[]> queries) {
        HashMap<Integer, Integer> counts = new HashMap();
        HashMap<Integer, Set<Integer>> freq = new HashMap();

        List<Integer> result = new ArrayList<>();
        for (int[] item : queries) {
            Integer op = item[0];
            Integer val = item[1];
            switch (op) {
                case 1:
                    int c = counts.getOrDefault(val, 0) + 1;
                    counts.put(val, c);

                    Set<Integer> f = freq.getOrDefault(c, new HashSet<>());
                    f.add(val);
                    freq.put(c, f);

                    break;
                case 2:
                    // check if key
                    if (counts.containsKey(val)) {
                        // remove freq
                        c = counts.get(val);
                        counts.put(val, c - 1);

                        // remove from frequencies
                        if (freq.containsKey(c)) {
                            f = freq.get(c);
                            f.remove(val);
                            System.out.println("removed " + val + " updated list is: " + f);
                            freq.put(c, f);
                        }

                        // add to its respective frequency
                        f = freq.getOrDefault(c - 1, new HashSet<>());
                        f.add(val);
                        freq.put(c - 1, f);
                    }

                    break;

                case 3:
                    if (freq.containsKey(val)) {
                        result.add(1);
                    } else {
                        result.add(0);
                    }

            }
        }

        return result;
    }
}
