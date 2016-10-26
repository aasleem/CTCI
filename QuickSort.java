package examples;

public class QuickSort {

    public QuickSort(){}
    //DIVIDE AND CONQUER ALGO
    public static void main(String args[]){
        int sampleArray[] = {5,2,1,7,42,12};
        for (int value : sampleArray)
            System.out.println(value);

        int sortedArray[] = quickSort(sampleArray, 0, sampleArray.length-1);

        for (int value : sortedArray)
            System.out.println(value);

    }

    public static int[] quickSort(int arr[], int left, int right){
        int index =  partition(arr, left, right);

        if(left < index - 1){ //sort left half
            quickSort(arr, left, index - 1);
        }
        if(index < right){ //sort right half
            quickSort(arr, index, right);
        }
        return arr;
    }

    public static int partition(int arr[], int left, int right){
        int pivot = arr[(left + right) / 2]; //pick middle pivot

        while(left <= right){
            //Find element on left that should be on right
            while(arr[left] < pivot) left++;

            //Find element on right that should be on left
            while(arr[right] > pivot) right--;

            //Swap elements and move left and right indcies
            if(left <= right){
                swap(arr, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

/*
    //DIVIDE AND CONQUER ALGO
    public static void main(String ars[]){
        int sampleArray[] = {5,2,1,7,42,12};
        for (int value : sampleArray)
            System.out.println(value);

        int sortedArray[] = quicksortSimple(sampleArray);

        for (int value : sortedArray)
            System.out.println(value);
    }

    public static int[] quicksortSimple(int[] data){

        if(data.length < 2)
            return data;

        int pivotIndex = data.length/2;
        int pivatValue = data[pivotIndex];

        // Count how many are less than the pivot
        int leftCount = 0;

        for(int i = 0; i < data.length; ++i){
            if(data[i] < pivatValue)
                ++leftCount;
        }

        //Allocate the arrays and create subsets
        int[] left = new int[leftCount];
        int[] right = new int[data.length - leftCount - 1];

        int l = 0;
        int r = 0;

        for(int i = 0; i < data.length; ++i){
            if( i == pivotIndex) continue;

            int val = data[i];

            if(val < pivatValue)
                left[l++] = val;
            else
                right[r++] = val;
        }

        //Sort the subsets
        left = quicksortSimple(left);
        right = quicksortSimple(right);

        //Combine sorted array and pivot back into original array
        System.arraycopy(left, 0, data, 0, left.length);
        data[left.length] = pivatValue;
        System.arraycopy(right, 0, data, left.length + 1, right.length);

        return data;
    }
    */
}
