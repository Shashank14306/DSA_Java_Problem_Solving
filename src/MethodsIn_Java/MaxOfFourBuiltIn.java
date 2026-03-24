package MethodsIn_Java;

import java.util.Scanner;

public class MaxOfFourBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        System.out.print("Enter the number c : ");
        int c = sc.nextInt();
        System.out.print("Enter the number d : ");
        int d = sc.nextInt();

        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
    }
}
