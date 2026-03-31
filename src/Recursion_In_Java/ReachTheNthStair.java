package Recursion_In_Java;

import java.util.Scanner;

public class ReachTheNthStair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();
        System.out.print(cout(n));
    }
    public static int cout(int n){
        if(n<=2) return n;
        return cout(n-1) + cout(n-2);
    }
}
