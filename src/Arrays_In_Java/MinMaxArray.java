package Arrays_In_Java;
import java.util.*;
public class MinMaxArray {
    public static void main(String[] args) {


        class Solution {
            public ArrayList<Integer> getMinMax(int[] arr) {
                ArrayList<Integer> result = new ArrayList<>();

                int min = arr[0];
                int max = arr[0];

                for (int num : arr) {
                    if (num < min) min = num;
                    if (num > max) max = num;
                }

                result.add(min);
                result.add(max);

                return result;
            }
        }
    }
}
