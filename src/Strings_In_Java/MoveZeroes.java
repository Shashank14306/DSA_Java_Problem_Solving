package Strings_In_Java;

public class MoveZeroes {
    public static void main(String[] args) {
        class Solution {
            public void moveZeroes(int[] arr) {
                int j = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != 0) {
                        if (i != j) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                        j++;
                    }
                }
            }
        }
    }
}
