package kz.zhami.interview.algorithms.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void merge(int array[], int leftIndex, int midIndex, int rightIndex)
    {
        // Find sizes of subarrays
        int leftLength = midIndex - leftIndex + 1;
        int rightLength = rightIndex - midIndex;
        // Create temporary arrays
        int leftArray[] = new int[leftLength];
        int rightArray[] = new int[rightLength];
        // Copy data to temp arrays to process
        for (int i = 0; i < leftLength; ++i)
            leftArray[i] = array[leftIndex + i];
        for (int j = 0; j < rightLength; ++j)
            rightArray[j] = array[midIndex + 1 + j];
        // Merge temporary arrays
        // Initial indices of first and second subarrays
        int i = 0, j = 0;
        // Initial index of array
        int k = leftIndex;
        // Traverse arrays choosing elements in order
        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            }
            else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements from leftArray and rightArray
        while (i < leftLength) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    // Sorts array[leftIndex..rightIndex] using merge()
    public static void mergeSort(int array[], int leftIndex, int rightIndex)
    {
        if (leftIndex < rightIndex) {
            // Find the middle index
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            // Sort first and second subarrays
            mergeSort(array, leftIndex, midIndex);
            mergeSort(array, midIndex + 1, rightIndex);
            // Merge the sorted subarrays
            merge(array, leftIndex, midIndex, rightIndex);
        }
    }
    public static void sort(int array[])
    {
        mergeSort(array, 0, array.length -1);
    }
}
