package Arrays_In_Java;
import java.util.*;
public class CheckEqualArray {
    public static void main(String[] args) {


        class Solution {
            public static boolean checkEqual(int[] a, int[] b) {
                // Take two inputs from scanner
                if (a.length != b.length) return false;

                Arrays.sort(a);
                Arrays.sort(b);

                for (int i = 0; i < a.length; i++) {
                    if (a[i] != b[i]) return false;
                }

                return true;
            }
        }
    }
}
