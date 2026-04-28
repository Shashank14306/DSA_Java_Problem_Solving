package Strings_In_Java;

public class DuplicateRemoval {

    class Solution {
        String removeDuplicates(String s) {
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
