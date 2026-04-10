package Strings_In_Java;

public class RemoveDuplicates {
    public static void main(String[] args) {
        class Solution {
            String removeDups(String s) {
                boolean[] seen = new boolean[256];
                StringBuilder result = new StringBuilder();

                for (char ch : s.toCharArray()) {
                    if (!seen[ch]) {
                        seen[ch] = true;
                        result.append(ch);
                    }
                }

                return result.toString();
            }
        }
    }
}
