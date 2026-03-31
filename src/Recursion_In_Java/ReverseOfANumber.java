package Recursion_In_Java;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter any number: "+n);
        int result = reverse(n, 0);
        System.out.println("Reversed number: " + result);
    }
    static int reverse(int n, int rev) {
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + (n % 10));
    }
}
