package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {

    public static void main(String[] args) {
        Map<String, Integer> avaliableWords = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String value;

        int magNoteSize = in.nextInt();
        int ransomNoteSize = in.nextInt();

        for(int i = 0; i < magNoteSize; i++) {
            value = in.next();

            if(avaliableWords.containsKey(value))
                avaliableWords.put(value, avaliableWords.get(value) + 1);
            else
                avaliableWords.put(value, 1);
        }

        if (isPossible(ransomNoteSize, avaliableWords, in))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public static boolean isPossible(int ransomNoteSize, Map<String, Integer> avaliableWords, Scanner in) {
        String value;

        for(int i = 0; i < ransomNoteSize; i++) {
            value = in.next();

            if(avaliableWords.containsKey(value) && avaliableWords.get(value) > 0)
                avaliableWords.put(value, avaliableWords.get(value) - 1);
            else
                return false;
        }

        return true;
    }

}
