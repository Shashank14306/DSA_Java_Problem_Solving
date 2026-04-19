package Arrays_In_Java;

public class MajorityElements {
    class Solution {
        int majorityElement(int arr[]) {
            int count = 0;
            int candidate = 0;
            for (int num : arr) {
                if (count == 0) {
                    candidate = num;
                }

                if (num == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
            count = 0;
            for (int num : arr) {
                if (num == candidate) {
                    count++;
                }
            }

            if (count > arr.length / 2) {
                return candidate;
            }

            return -1;
        }
    }
}
