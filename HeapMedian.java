package examples;

import java.util.*;

public class HeapMedian {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int temp;

        for (int i = 0; i < size; i++) {
            //read, find location, add, getMedian()
            temp = in.nextInt();
            int position = Collections.binarySearch(elements, temp);
            if (position < 0)
                position = Math.abs(position) - 1;

            elements.add(position, temp);
            System.out.println(getMedian(elements));
        }
    }

    public static double getMedian(List<Integer> elements) {
        if (elements.size() % 2 == 0)
            return (elements.get(elements.size() / 2) + elements.get((elements.size() / 2) - 1)) / 2.0;

        return elements.get(elements.size() / 2);
    }

}