package algorithms.dictionariesAndHashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");
        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length; i++){
            String key = magazine[i];
            if(map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            }
            else map.put(key, 1);
        }

        for(int i = 0; i < note.length; i++){
            if( !map.containsKey(note[i]) ) {
                System.out.println("No");
                return;
            }else{
                if( map.get(note[i]) < 1 ) {
                    System.out.println("No");
                    return;
                }else{
                    map.put(note[i], map.get(note[i])-1);
                }
            }
        }
        System.out.println("Yes");
    }
}
