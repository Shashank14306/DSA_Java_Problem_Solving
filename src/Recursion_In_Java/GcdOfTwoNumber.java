package Recursion_In_Java;

import java.util.Scanner;

public class GcdOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second number: ");
        int y = sc.nextInt();
        System.out.println("GCD is: " + gcd(x, y));
    }
    public static int gcd(int x , int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }
}
