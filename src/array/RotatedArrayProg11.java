package array;

public class RotatedArrayProg11 {

    // Function to find the minimum in a rotated sorted array
    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        // If the array is not rotated at all
        if (nums[left] <= nums[right]) {
            return nums[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than rightmost, the min is in right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, the min is in the left half including mid
                right = mid;
            }
        }

        return nums[left]; // or nums[right]
    }

    // Main method
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 1, 2, 3, 4};
        int[] arr2 = {2, 3, 4, 5, 6, 1};

        System.out.println("Minimum in arr1: " + findMin(arr1)); // Output: 1
        System.out.println("Minimum in arr2: " + findMin(arr2)); // Output: 1
    }
}
