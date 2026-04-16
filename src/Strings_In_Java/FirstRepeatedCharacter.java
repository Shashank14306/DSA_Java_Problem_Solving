package Strings_In_Java;
import java.util.*;
public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        class Solution {
            String firstRepChar(String s) {
                HashSet<Character> seen = new HashSet<>();
                for (char c : s.toCharArray()) {
                    if (seen.contains(c)) {
                        return String.valueOf(c);
                    }
                    seen.add(c);
                }
                return "-1";
            }
        }
    }
}
