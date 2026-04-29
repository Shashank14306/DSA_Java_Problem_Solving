package If_Else;

public class MinSwapstoGroup1s {
    class Solution {
        public int minSwaps(int[] arr) {
            int n = arr.length;

            // Count total 1s
            int ones = 0;
            for (int num : arr) {
                if (num == 1) ones++;
            }

            // Edge cases
            if (ones == 0) return -1;
            if (ones == 1) return 0;

            // Count 0s in first window
            int zeros = 0;
            for (int i = 0; i < ones; i++) {
                if (arr[i] == 0) zeros++;
            }

            int minSwaps = zeros;

            // Sliding window
            for (int i = ones; i < n; i++) {
                if (arr[i - ones] == 0) zeros--;
                if (arr[i] == 0) zeros++;

                minSwaps = Math.min(minSwaps, zeros);
            }

            return minSwaps;
        }
    }
}
