package If_Else;

public class MajorityElement {
    public static void main(String[] args) {
        class Solution {
            public int majorityElement(int[] nums) {
                int candidate = 0;
                int count = 0;

                for (int num : nums) {
                    if (count == 0) {
                        candidate = num;
                    }

                    if (num == candidate) {
                        count++;
                    } else {
                        count--;
                    }
                }

                return candidate;
            }
        }
    }
}
