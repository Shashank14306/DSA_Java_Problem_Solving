package Loops;

import java.util.Scanner;

public class CountNoOfDigits {

    // Count digits of a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();
        if(n==0) n=9; // anu number can be assign
        int count = 0;
        while(n!=0){
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
