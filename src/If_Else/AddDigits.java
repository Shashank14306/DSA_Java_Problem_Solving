package If_Else;

public class AddDigits {
    public static void main(String[] args) {
        class Solution {
            public int addDigits(int num) {
                if (num == 0) return 0;
                return 1 + (num - 1) % 9;
            }
        }
    }
}
