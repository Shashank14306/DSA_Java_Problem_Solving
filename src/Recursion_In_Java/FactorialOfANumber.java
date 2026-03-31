package Recursion_In_Java;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }
}