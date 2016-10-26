package examples;

import static examples.QuickSort.quickSort;

public class TargetSum {

    public static void main (String args[]) {
        int[] values = {2, 34, 5, 3, 6, 10, 8};
        System.out.println(hasSum(values, 18));
    }

    public static boolean hasSum(int[] array, int targetSum){

        int sumVal;
        int startIndex = 0;
        int endIndex = array.length - 1;

        int[] sortedArray = quickSort(array, 0, array.length - 1);

        while(startIndex <= endIndex){
            sumVal = sortedArray[startIndex] + array[endIndex];

            if(sumVal > targetSum)
                endIndex--;
            else if(sumVal < targetSum)
                startIndex++;
            else
                return true;
        }

        return false;
    }



}
