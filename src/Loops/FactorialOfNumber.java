package Loops;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {

        // Factorial of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
