package Recursion_In_Java;

public class NextSmallestPalindrome {
    public static void main(String[] args) {
        class Solution {
            static int[] nextPalindrome(int[] num) {
                int n = num.length;
                boolean all9 = true;
                for (int x : num) {
                    if (x != 9) {
                        all9 = false;
                        break;
                    }
                }

                if (all9) {
                    int[] res = new int[n + 1];
                    res[0] = 1;
                    res[n] = 1;
                    return res;
                }

                int[] res = num.clone();
                int i = 0, j = n - 1;
                while (i < j) {
                    res[j] = res[i];
                    i++;
                    j--;
                }
                boolean greater = false;
                for (int k = 0; k < n; k++) {
                    if (res[k] > num[k]) {
                        greater = true;
                        break;
                    } else if (res[k] < num[k]) {
                        break;
                    }
                }

                if (greater) return res;
                int mid = (n - 1) / 2;
                int carry = 1;

                while (mid >= 0 && carry > 0) {
                    int sum = res[mid] + carry;
                    res[mid] = sum % 10;
                    carry = sum / 10;
                    mid--;
                }
                i = 0;
                j = n - 1;
                while (i < j) {
                    res[j] = res[i];
                    i++;
                    j--;
                }

                return res;
            }
        }
    }
}
