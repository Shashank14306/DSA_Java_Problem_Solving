package Recursion_In_Java;

public class BSThroughRecursion {
    public static void main(String[] args) {
        class Solution {
            public int binarySearch(int[] arr, int low, int high, int target) {
                if (low > high) return -1; // base case (not found)

                int mid = low + (high - low) / 2;

                if (arr[mid] == target) return mid;

                else if (target < arr[mid])
                    return binarySearch(arr, low, mid - 1, target);

                else
                    return binarySearch(arr, mid + 1, high, target);
            }
        }
    }
}



//import java.util.*;
//
//public class RecursiveBinarySearch {
//
//    // Recursive Binary Search Function
//    public static int binarySearch(int[] arr, int target, int left, int right) {
//
//        // Base case: element not found
//        if (left > right) return -1;
//
//        int mid = left + (right - left) / 2;
//
//        // Element found
//        if (arr[mid] == target) return mid;
//
//        // Search left half
//        if (target < arr[mid]) {
//            return binarySearch(arr, target, left, mid - 1);
//        }
//
//        // Search right half
//        return binarySearch(arr, target, mid + 1, right);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Input array size
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        // Input sorted array
//        System.out.println("Enter sorted array elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Input target
//        System.out.print("Enter element to search: ");
//        int target = sc.nextInt();
//
//        int result = binarySearch(arr, target, 0, n - 1);
//
//        // Output result
//        if (result == -1) {
//            System.out.println("Element not found");
//        } else {
//            System.out.println("Element found at index: " + result);
//        }
//
//        sc.close();
//    }
//}
