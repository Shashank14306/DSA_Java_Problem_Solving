package Arrays_In_Java;

public class TwoEqualSumSubArray {
    class Solution {
        public boolean canSplit(int arr[]) {
            int totalSum = 0;
            for (int num : arr) {
                totalSum += num;
            }
            if (totalSum % 2 != 0) {
                return false;
            }
            int halfSum = totalSum / 2;
            int currentSum = 0;
            for (int num : arr) {
                currentSum += num;

                if (currentSum == halfSum) {
                    return true;
                }
            }

            return false;
        }
    }
}
