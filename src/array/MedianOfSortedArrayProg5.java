package array;

import java.util.Arrays;

public class MedianOfSortedArrayProg5 {


    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        // Merge the two sorted arrays
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) merged[k++] = arr1[i++];
        while (j < n2) merged[k++] = arr2[j++];

        // Find median
        int totalLength = merged.length;
        if (totalLength % 2 == 1) {
            return merged[totalLength / 2];  // odd length → middle element
        } else {
            return (merged[totalLength / 2 - 1] + merged[totalLength / 2]) / 2.0;  // even → average of two middle
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 8};
        int[] arr2 = {10, 12, 14, 16, 18, 20};

        double median = findMedianSortedArrays(arr1, arr2);
        System.out.println("Median: " + median);
    }
}

