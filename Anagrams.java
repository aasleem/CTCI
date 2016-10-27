package examples;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static int numberNeeded(String first, String second) {
        //take note of occurances of chars are in first string then using second string remove occurances of chars
        //then return sum of occurances. if 0 then same string
        int[] frequency = new int[26];

        first = first.toLowerCase();
        for (int currentChar : first.toCharArray())
            frequency[currentChar - 'a']++;

        second = second.toLowerCase();
        for (int currentChar : second.toCharArray())
            frequency[currentChar - 'a']--;

        return  Arrays.stream(frequency).map(Math::abs).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

}
