package examples;


public class MaxSubArray {

    public static void main (String args[]){

        int[] normalArray = {1, -3, 5, -2, 9, -8, -6, 4};
        int[] maxArray = getMaximalSubarray(normalArray);

        for(int val : maxArray)
            System.out.print(val + " ");
    }

    public static int[] getMaximalSubarray(int[] array){
        int largestSum, sum;
        int[] largestSubArray = new int[3];

        largestSum = array[0] + array[1] + array[2];

        for(int i = 1; i < array.length - 3; i++){

            sum = array[i] + array[i+1] + array[i+2];

            if(largestSum < sum){
                largestSum = sum;

                largestSubArray[0] = array[i];
                largestSubArray[1] = array[i+1];
                largestSubArray[2] = array[i+2];
            }

        }

        return largestSubArray;
    }

}
