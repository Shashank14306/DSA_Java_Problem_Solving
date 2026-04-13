package Strings_In_Java;

public class StringToLowerCase {
    public static void main(String[] args) {
        class Solution {
            static String toLower(String s) {
                StringBuilder sb = new StringBuilder();

                for (char ch : s.toCharArray()) {
                    if (ch >= 'A' && ch <= 'Z') {
                        ch = (char)(ch + 32);
                    }
                    sb.append(ch);
                }

                return sb.toString();
            }
        }
    }
}
