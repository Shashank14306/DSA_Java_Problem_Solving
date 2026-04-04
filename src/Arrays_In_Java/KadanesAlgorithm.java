package Arrays_In_Java;
import java.util.*;
public class KadanesAlgorithm {

    class Solution {
        int maxSubarraySum(int[] arr) {
            int maxSum = arr[0];
            int currentSum = arr[0];

            for(int i = 1; i < arr.length; i++) {
                currentSum = Math.max(arr[i], currentSum + arr[i]);
                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input size
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            // Input elements
            System.out.println("Enter elements:");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Call function
//            Solution obj = new Solution();
//            int result = obj.maxSubarraySum(arr);

            // Output
//            System.out.println("Maximum Subarray Sum: " + result);
        }
    }
}
