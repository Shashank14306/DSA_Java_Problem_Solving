package Loops;

import java.util.Scanner;

public class AP1hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        // Print the series: 99, 95, 91, 87, ...
        for (int i = 99; i >= 103 - 4 * n; i -= 4) {
            System.out.print(i+" ");
        }
    }
}
