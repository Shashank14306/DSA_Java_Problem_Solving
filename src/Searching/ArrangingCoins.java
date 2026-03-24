package Searching;

public class ArrangingCoins {
    public static void main(String[] args) {
        class Solution {

            public long mySqrt(long n) {
                long low = 1, high = n;

                while (low <= high) {
                    long mid = low + (high - low) / 2;

                    if (mid == n / mid)
                        return mid;
                    else if (mid > n / mid)
                        high = mid - 1;
                    else
                        low = mid + 1;
                }

                return high;
            }

            public int arrangeCoins(int n) {
                return (int)((mySqrt(8L * n + 1) - 1) / 2);
            }
        }
    }
}
