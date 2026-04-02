package Recursion_In_Java;

import java.util.Scanner;

public class CountAndSayPattern {
    public static String countAndSay(int n) {
        if(n == 1) return "1";
        String s = countAndSay(n - 1) + "#";
        String ans = "";
        int i = 0, j = 0;
        while(j < s.length()) {
            if(s.charAt(i) == s.charAt(j)) j++;
            else {
                int freq = j - i;
                ans += freq;
                ans += s.charAt(i);
                i = j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        String result = countAndSay(n);
        System.out.println("Count and Say Output: " + result);
        sc.close();
    }
}