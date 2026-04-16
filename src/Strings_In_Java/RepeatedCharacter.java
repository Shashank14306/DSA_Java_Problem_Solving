package Strings_In_Java;

public class RepeatedCharacter {
    public static void main(String[] args) {
        class Solution {
            char firstRep(String S) {
                int[] freq = new int[256];
                for (char c : S.toCharArray()) {
                    freq[c]++;
                }
                for (char c : S.toCharArray()) {
                    if (freq[c] > 1) {
                        return c;
                    }
                }
                return '#';
            }
        }
    }
}
