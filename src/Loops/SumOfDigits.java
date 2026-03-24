package Loops;

import java.util.Scanner;

public class SumOfDigits {
    // Print sum of digits of a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();
        if(n<0) n = -n;
        int sum = 0;
        while(n!=0){
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
