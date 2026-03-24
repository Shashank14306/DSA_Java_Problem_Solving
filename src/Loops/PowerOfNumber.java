package Loops;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // 'a' raise to the power 'b'
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        int pow = 1;
        for (int i = 1; i <=b ; i++) {
            pow = pow * a;
        }
//        System.out.println(pow);
        //OR
        System.out.println(a+" raised to the power "+b+" is " +pow);
    }
}
